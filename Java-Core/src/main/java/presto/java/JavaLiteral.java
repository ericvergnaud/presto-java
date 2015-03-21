package presto.java;

import presto.utils.CodeWriter;

public abstract class JavaLiteral implements JavaExpression {
	
	String text;
	
	protected JavaLiteral(String text) {
		this.text = text;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}
}
