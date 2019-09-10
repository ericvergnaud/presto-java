package prompto.jsx;

import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public class JsxProperty extends Section {

	Identifier id;
	IJsxValue value;
	String suite;
	
	public JsxProperty(Identifier id, IJsxValue value, String suite) {
		this.id = id;
		this.value = value;
		this.suite = (suite!=null && !suite.isEmpty()) ? suite : null;
	}
	
	public Identifier getId() {
		return id;
	}

	public String getName() {
		return id.toString();
	}
	
	public IJsxValue getValue() {
		return value;
	}

	public IType check(Context context) {
		if(value!=null)
			return value.check(context);
		else
			return BooleanType.instance(); // a value-less property is treated as a boolean flag
	}


	public void toDialect(CodeWriter writer) {
		writer.append(id.toString());
		if(value!=null) {
			writer.append("=");
			value.toDialect(writer);
		}
		if(suite!=null)
			writer.appendRaw(suite);
		else
			writer.append(" ");
	}


	public void declare(Transpiler transpiler) {
	    if(this.value!=null)
	        this.value.declare(transpiler);
	}


	public void transpile(Transpiler transpiler) {
		String name = this.id.toString();
		if(name.contains("-"))
			name = "\"" + name + "\"";
	    transpiler.append(name);
	    transpiler.append(": ");
	    if(this.value!=null)
	        this.value.transpile(transpiler);
	    else
	        transpiler.append("true");
	}


}
