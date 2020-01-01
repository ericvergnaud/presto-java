package prompto.problem;

import prompto.parser.ISection;

public class UnknownCategoryError extends SyntaxProblemBase {

	String name;
	
	public UnknownCategoryError(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Unknown category: " + name;
	}

}