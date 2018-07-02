package prompto.css;

import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class CssField {

	String name;
	ICssValue value;
	
	public CssField(String name, ICssValue value) {
		this.name = name;
		this.value = value;
	}

	public void toDialect(CodeWriter writer) {
		writer.append(name).append(":");
		value.toDialect(writer);
		writer.append(";");
	}

	public void declare(Transpiler transpiler) {
		// TODO 
	}

	public void transpile(Transpiler transpiler) {
		// TODO Auto-generated method stub
	}

}
