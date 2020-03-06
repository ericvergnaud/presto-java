package prompto.problem;

import prompto.parser.ISection;

public class DuplicatePropertyProblem extends SyntaxProblemBase {

	String name;
	
	public DuplicatePropertyProblem(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Duplicate property:" + name;
	}

}