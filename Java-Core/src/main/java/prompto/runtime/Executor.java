package prompto.runtime;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.PromptoClassLoader;
import prompto.error.InternalError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.utils.CmdLineParser;

public abstract class Executor {

	public static void executeTests(Context context) {
		// TODO Auto-generated method stub
		
	}

	public static void executeMainNoArgs(Context context) throws PromptoError {
		executeMainMethod(context, new Identifier("main"), "", null);
	}

	public static void executeMainNoArgs(Context context, File promptoDir) throws PromptoError {
		executeMainMethod(context, new Identifier("main"), "-test=true", promptoDir);
	}
	
	public static void executeMainMethod(Context context, Identifier methodName, String cmdLineArgs, File promptoDir) throws PromptoError {
		PromptoDict<String, String> options = parseCmdLineArgs(cmdLineArgs);
		boolean testMode = options.containsKey("test");
		Type classType = CompilerUtils.getGlobalMethodType(methodName);
		try(PromptoClassLoader loader = PromptoClassLoader.initialize(context, promptoDir, testMode)) {
			Class<?> klass = loader.loadClass(classType.getTypeName());
			Method method = locateMainMethod(klass, cmdLineArgs);
			method.invoke(null, options);
		} catch(ClassNotFoundException | NoSuchMethodException e) {
			throw new SyntaxError("Could not find a compatible \"" + methodName + "\" method.");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | IOException e) {
			throw new InternalError(e);
		} finally {
			context.terminated();
		}
	}

	private static PromptoDict<String, String> parseCmdLineArgs(String cmdLineArgs) {
		PromptoDict<String, String> result = new PromptoDict<>();
		try {
			Map<String, String> args = CmdLineParser.parse(cmdLineArgs);
			result.putAll(args);
		} catch(Exception e) {
			e.printStackTrace(System.err); 
		}
		return result;
	}

	private static Method locateMainMethod(Class<?> klass, String cmdLineArgs) throws NoSuchMethodException {
		if(cmdLineArgs==null)
			return locateMainMethod(klass);
		else
			return locateMainMethod(klass, PromptoDict.class);
	}

	private static Method locateMainMethod(Class<?> klass, Class<?> ... argTypes) throws NoSuchMethodException {
		// try exact match first
		for(Method method : klass.getDeclaredMethods()) {
			if(identicalArguments(method.getParameterTypes(), argTypes))
				return method;
		}
		// match Text{} argument, will pass null argument
		if(argTypes.length==0) {
			argTypes = new Class<?>[] { Map.class };
			for(Method method : klass.getDeclaredMethods()) {
				if(identicalArguments(method.getParameterTypes(), argTypes))
					return method;
			}
		}
		// match no argument, will ignore options
		for(Method method : klass.getDeclaredMethods()) {
			if(method.getParameterTypes().length==0)
				return method;
		}
		throw new NoSuchMethodException(klass.getSimpleName() + argTypes.toString());
	}

	private static boolean identicalArguments(Class<?>[] expected, Class<?>[] provided) {
		if(expected.length!=provided.length)
			return false;
		for(int i=0;i<expected.length;i++) {
			if(expected[i]!=provided[i])
				return false;
		}
		return true;
	}

}
