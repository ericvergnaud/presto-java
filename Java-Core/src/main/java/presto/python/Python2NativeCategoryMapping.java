package presto.python;

import presto.utils.CodeWriter;


public class Python2NativeCategoryMapping extends PythonNativeCategoryMapping {

	public Python2NativeCategoryMapping(PythonNativeCategoryMapping mapping) {
		super(mapping);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Python2: ");
		super.toDialect(writer);
	}
}
