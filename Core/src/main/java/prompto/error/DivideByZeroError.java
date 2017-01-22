package prompto.error;

import prompto.expression.CategorySymbol;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;


public class DivideByZeroError extends ExecutionError {

	private static final long serialVersionUID = 1L;

	@Override
	public IExpression getExpression(Context context) {
		return context.getRegisteredValue(CategorySymbol.class, new Identifier("DIVIDE_BY_ZERO"));
	}
}