package presto.utils;

import presto.parser.Assertion;

@SuppressWarnings("serial")
public class AssertionList extends ObjectList<Assertion>{

	public AssertionList() {
	}
	
	public AssertionList(Assertion item) {
		this.add(item);
	}

	public void toDialect(CodeWriter writer) {
		for(Assertion exp : this) {
			exp.toDialect(writer);
			switch(writer.getDialect()) {
			case O:
				writer.append(";\n");
				break;
			default:
				writer.append("\n");
			}
		}
	}

}
