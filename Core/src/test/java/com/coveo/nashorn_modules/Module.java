package com.coveo.nashorn_modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.openjdk.nashorn.api.scripting.NashornScriptEngine;
import org.openjdk.nashorn.api.scripting.ScriptObjectMirror;
import org.openjdk.nashorn.internal.runtime.ECMAException;

public class Module extends SimpleBindings implements RequireFunction {
  private NashornScriptEngine engine;
  private ScriptObjectMirror objectConstructor;
  private ScriptObjectMirror jsonConstructor;
  private ScriptObjectMirror errorConstructor;

  private Folder folder;
  private ModuleCache cache;

  private Module main;
  private Bindings module;
  private List<Bindings> children = new ArrayList<>();
  private Object exports;
  private static ThreadLocal<Map<String, Bindings>> refCache = new ThreadLocal<>();

  public Module(
      NashornScriptEngine engine,
      Folder folder,
      ModuleCache cache,
      String filename,
      Bindings module,
      Bindings exports,
      Module parent,
      Module main)
      throws ScriptException {

    this.engine = engine;

    if (parent != null) {
      this.objectConstructor = parent.objectConstructor;
      this.jsonConstructor = parent.jsonConstructor;
      this.errorConstructor = parent.errorConstructor;
    } else {
      this.objectConstructor = (ScriptObjectMirror) engine.eval("Object");
      this.jsonConstructor = (ScriptObjectMirror) engine.eval("JSON");
      this.errorConstructor = (ScriptObjectMirror) engine.eval("Error");
    }

    this.folder = folder;
    this.cache = cache;
    this.main = main != null ? main : this;
    this.module = module;
    this.exports = exports;

    put("main", this.main.module);

    module.put("exports", exports);
    module.put("children", children);
    module.put("filename", filename);
    module.put("id", filename);
    module.put("loaded", false);
    module.put("parent", parent != null ? parent.module : null);
  }

  void setLoaded() {
    module.put("loaded", true);
  }

  @Override
  public Object require(String module) throws ScriptException {
    if (module == null) {
      throwModuleNotFoundException("<null>");
    }

    String[] parts = Paths.splitPath(module);
    if (parts.length == 0) {
      throwModuleNotFoundException(module);
    }

    String[] folderParts = Arrays.copyOfRange(parts, 0, parts.length - 1);

    String filename = parts[parts.length - 1];

    Module found = null;

    Folder resolvedFolder = resolveFolder(folder, folderParts);

    // Let's make sure each thread gets its own refCache
    if (refCache.get() == null) {
      refCache.set(new HashMap<>());
    }

    String requestedFullPath = null;
    if (resolvedFolder != null) {
      requestedFullPath = resolvedFolder.getPath() + filename;
      Bindings cachedExports = refCache.get().get(requestedFullPath);
      if (cachedExports != null) {
        return cachedExports;
      } else {
        // We must store a reference to currently loading module to avoid circular requires
        refCache.get().put(requestedFullPath, createSafeBindings());
      }
    }

    try {
      // If not cached, we try to resolve the module from the current folder, ignoring node_modules
      if (isPrefixedModuleName(module)) {
        found = attemptToLoadFromThisFolder(resolvedFolder, filename);
      }

      // Then, if not successful, we'll look at node_modules in the current folder and then
      // in all parent folders until we reach the top.
      if (found == null) {
        found = searchForModuleInNodeModules(folder, folderParts, filename);
      }

      if (found == null) {
        throwModuleNotFoundException(module);
      }

      assert found != null;
      children.add(found.module);

      return found.exports;

    } finally {
      // Finally, we remove the successful resolved module from the refCache
      if (requestedFullPath != null) {
        refCache.get().remove(requestedFullPath);
      }
    }
  }

  private Module searchForModuleInNodeModules(
      Folder resolvedFolder, String[] folderParts, String filename) throws ScriptException {
    Folder current = resolvedFolder;
    while (current != null) {
      Folder nodeModules = current.getFolder("node_modules");

      if (nodeModules != null) {
        Module found =
            attemptToLoadFromThisFolder(resolveFolder(nodeModules, folderParts), filename);
        if (found != null) {
          return found;
        }
      }

      current = current.getParent();
    }

    return null;
  }

  private Module attemptToLoadFromThisFolder(Folder resolvedFolder, String filename)
      throws ScriptException {

    if (resolvedFolder == null) {
      return null;
    }

    String requestedFullPath = resolvedFolder.getPath() + filename;

    Module found = cache.get(requestedFullPath);
    if (found != null) {
      return found;
    }

    // First we try to load as a file, trying out various variations on the path
    found = loadModuleAsFile(resolvedFolder, filename);

    // Then we try to load as a directory
    if (found == null) {
      found = loadModuleAsFolder(resolvedFolder, filename);
    }

    if (found != null) {
      // We keep a cache entry for the requested path even though the code that
      // compiles the module also adds it to the cache with the potentially different
      // effective path. This avoids having to load package.json every time, etc.
      cache.put(requestedFullPath, found);
    }

    return found;
  }

  private Module loadModuleAsFile(Folder parent, String filename) throws ScriptException {

    String[] filenamesToAttempt = getFilenamesToAttempt(filename);
    for (String tentativeFilename : filenamesToAttempt) {

      String code = parent.getFile(tentativeFilename);
      if (code != null) {
        String fullPath = parent.getPath() + tentativeFilename;
        return compileModuleAndPutInCache(parent, fullPath, code);
      }
    }

    return null;
  }

  private Module loadModuleAsFolder(Folder parent, String name) throws ScriptException {
    Folder fileAsFolder = parent.getFolder(name);
    if (fileAsFolder == null) {
      return null;
    }

    Module found = loadModuleThroughPackageJson(fileAsFolder);

    if (found == null) {
      found = loadModuleThroughIndexJs(fileAsFolder);
    }

    if (found == null) {
      found = loadModuleThroughIndexJson(fileAsFolder);
    }

    return found;
  }

  private Module loadModuleThroughPackageJson(Folder parent) throws ScriptException {
    String packageJson = parent.getFile("package.json");
    if (packageJson == null) {
      return null;
    }

    String mainFile = getMainFileFromPackageJson(packageJson);
    if (mainFile == null) {
      return null;
    }

    String[] parts = Paths.splitPath(mainFile);
    String[] folders = Arrays.copyOfRange(parts, 0, parts.length - 1);
    String filename = parts[parts.length - 1];
    Folder folder = resolveFolder(parent, folders);
    if (folder == null) {
      return null;
    }

    Module module = loadModuleAsFile(folder, filename);

    if (module == null) {
      folder = resolveFolder(parent, parts);
      if (folder != null) {
        module = loadModuleThroughIndexJs(folder);
      }
    }

    return module;
  }

  private String getMainFileFromPackageJson(String packageJson) throws ScriptException {
    Bindings parsed = parseJson(packageJson);
    return (String) parsed.get("main");
  }

  private Module loadModuleThroughIndexJs(Folder parent) throws ScriptException {
    String code = parent.getFile("index.js");
    if (code == null) {
      return null;
    }

    return compileModuleAndPutInCache(parent, parent.getPath() + "index.js", code);
  }

  private Module loadModuleThroughIndexJson(Folder parent) throws ScriptException {
    String code = parent.getFile("index.json");
    if (code == null) {
      return null;
    }

    return compileModuleAndPutInCache(parent, parent.getPath() + "index.json", code);
  }

  private Module compileModuleAndPutInCache(Folder parent, String fullPath, String code)
      throws ScriptException {

    Module created;
    String lowercaseFullPath = fullPath.toLowerCase();
    if (lowercaseFullPath.endsWith(".js")) {
      created = compileJavaScriptModule(parent, fullPath, code);
    } else if (lowercaseFullPath.endsWith(".json")) {
      created = compileJsonModule(parent, fullPath, code);
    } else {
      // Unsupported module type
      return null;
    }

    // We keep a cache entry for the compiled module using it's effective path, to avoid
    // recompiling even if module is requested through a different initial path.
    cache.put(fullPath, created);

    return created;
  }

  private Module compileJavaScriptModule(Folder parent, String fullPath, String code)
      throws ScriptException {

    Bindings engineScope = engine.getBindings(ScriptContext.ENGINE_SCOPE);
    Bindings module = createSafeBindings();
    module.putAll(engineScope);

    // If we have cached bindings, use them to rebind exports instead of creating new ones
    Bindings exports = refCache.get().get(fullPath);
    if (exports == null) {
      exports = createSafeBindings();
    }

    Module created = new Module(engine, parent, cache, fullPath, module, exports, this, this.main);

    String[] split = Paths.splitPath(fullPath);
    String filename = split[split.length - 1];
    String dirname = fullPath.substring(0, Math.max(fullPath.length() - filename.length() - 1, 0));

    String previousFilename = (String) engine.get(ScriptEngine.FILENAME);
    // set filename before eval so file names/lines in
    // exceptions are accurate
    engine.put(ScriptEngine.FILENAME, fullPath);

    try {
      // This mimics how Node wraps module in a function. I used to pass a 2nd parameter
      // to eval to override global context, but it caused problems Object.create.
      //
      // The \n at the end is to take care of files ending with a comment
      ScriptObjectMirror function =
          (ScriptObjectMirror)
              engine.eval(
                  "(function (exports, require, module, __filename, __dirname) {" + code + "\n})");
      function.call(created, created.exports, created, created.module, filename, dirname);
    } finally {
      engine.put(ScriptEngine.FILENAME, previousFilename);
    }

    // Scripts are free to replace the global exports symbol with their own, so we
    // reload it from the module object after compiling the code.
    created.exports = created.module.get("exports");

    created.setLoaded();
    return created;
  }

  private Module compileJsonModule(Folder parent, String fullPath, String code)
      throws ScriptException {
    Bindings module = createSafeBindings();
    Bindings exports = createSafeBindings();
    Module created = new Module(engine, parent, cache, fullPath, module, exports, this, this.main);
    created.exports = parseJson(code);
    created.setLoaded();
    return created;
  }

  private ScriptObjectMirror parseJson(String json) throws ScriptException {
    // Pretty lame way to parse JSON but hey...
    return (ScriptObjectMirror) jsonConstructor.callMember("parse", json);
  }

  private void throwModuleNotFoundException(String module) throws ScriptException {
    Bindings error = (Bindings) errorConstructor.newObject("Module not found: " + module);
    error.put("code", "MODULE_NOT_FOUND");
    throw new ECMAException(error, null);
  }

  private Folder resolveFolder(Folder from, String[] folders) {
    Folder current = from;
    for (String name : folders) {
      switch (name) {
        case "":
          throw new IllegalArgumentException();
        case ".":
          continue;
        case "..":
          current = current.getParent();
          break;
        default:
          current = current.getFolder(name);
          break;
      }

      // Whenever we get stuck we bail out
      if (current == null) {
        return null;
      }
    }

    return current;
  }

  private Bindings createSafeBindings() throws ScriptException {
    // As explained in https://github.com/coveo/nashorn-commonjs-modules/pull/16/files a plain
    // SimpleBindings has quite a few limitations in Nashorn compared to a ScriptObject, so
    // whenever we need an instance of those (for `exports` etc.) we create a real JS object.
    return (ScriptObjectMirror) objectConstructor.newObject();
  }

  private static boolean isPrefixedModuleName(String module) {
    return module.startsWith("/") || module.startsWith("../") || module.startsWith("./");
  }

  private static String[] getFilenamesToAttempt(String filename) {
    return new String[] {filename, filename + ".js", filename + ".json"};
  }
}
