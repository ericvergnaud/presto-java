package prompto.problem;

import prompto.parser.ISection;

public class UnknowAnnotationProblem extends SyntaxProblemBase {

	String name;
	
	public UnknowAnnotationProblem(ISection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Unknown annotation:" + name;
	}

}
