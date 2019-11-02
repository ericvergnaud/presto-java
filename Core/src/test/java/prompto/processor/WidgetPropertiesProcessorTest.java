package prompto.processor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Set;

import org.junit.Test;

import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.parser.o.BaseOParserTest;
import prompto.problem.ProblemListener;
import prompto.transpiler.Nashorn8Engine;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.Instance;

public class WidgetPropertiesProcessorTest extends BaseOParserTest {

	@Test
	public void transpiles() throws Exception {
		loadResource("annotations/WidgetProps1.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("some stuff"));
	}
	
	@Test
	public void transpilesWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/WidgetProps2.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("123.54"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}
	
	@Test
	public void transpilesStruct() throws Exception {
		loadResource("annotations/WidgetProps3.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("some stuff"));
	}
	
	@Test
	public void transpilesStructWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/WidgetProps4.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("123.54"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}
	
	@Test
	public void transpilesChild() throws Exception {
		loadResource("annotations/WidgetChildProps1.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("some stuff"));
	}
	
	@Test
	public void transpilesReactProps() throws Exception {
		loadResource("annotations/ReactWidgetProps1.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("1961-02-25"));
	}

	@Test
	public void transpilesReactPropsWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportUnknownMember(ISection section, String name) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/ReactWidgetProps2.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("some stuff"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}
	
	@Test
	public void transpilesRequired() throws Exception {
		loadResource("annotations/WidgetProps5.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("Hello"));
	}
	
	@Test
	public void transpilesRequiredWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportMissingProperty(ISection section, String missingl) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/WidgetProps6.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("stuff"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}
	
	@Test
	public void transpilesTypeSet() throws Exception {
		loadResource("annotations/WidgetProps7.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("Hello"));
	}
	
	@Test
	public void transpilesTypeSetWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportIllegalAssignment(ISection section, Set<IType> expected, IType actual) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/WidgetProps8.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("stuff"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}
	
	@Test
	public void transpilesValueSet() throws Exception {
		loadResource("annotations/WidgetProps9.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("John"));
	}

	@Test
	public void transpilesValueSetWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportIllegalValue(ISection section, String message) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/WidgetProps10.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("stuff"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}
	
	@Test
	public void transpilesCallback() throws Exception {
		loadResource("annotations/WidgetProps11.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("stuff"));
		assertTrue(js.contains("function(click)"));
		assertTrue(js.contains("this.props.callback(7)"));
	}

	@Test
	public void transpilesArrow() throws Exception {
		loadResource("annotations/WidgetProps12.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("stuff"));
		assertTrue(js.contains("function(v)"));
		assertTrue(js.contains("this.selected.bind(this)()"));
	}


}
