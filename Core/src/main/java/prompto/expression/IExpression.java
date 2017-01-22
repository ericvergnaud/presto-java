package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

/* an IExpression is the result of parsing a piece of Prompto code
 * every expression requires :
 *  - to be checked for syntax verification purpose
 *  - to be interpreted at runtime, which results in a value
 * 	- to be translated into any dialect
 */
public interface IExpression {
	
	IType check(Context context);
	IValue interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer);

	default ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		System.err.println("Need to implement compile for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}
	
}