package prompto.jsx;

import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.literal.Literal;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;

public class JsxExpression implements IJsxValue, IJsxExpression {

	IExpression expression;
	
	public JsxExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public boolean isLiteral() {
		return expression instanceof Literal<?>;
	}
	
	@Override
	public String toString() {
		return expression.toString();
	}
	
	@Override
	public IType check(Context context) {
		return expression.check(context);
	}
	
	@Override
	public IType checkProto(Context context, MethodType expected) {
		if(expression instanceof ArrowExpression)
			return expected.checkArrowExpression(context, (ArrowExpression)expression);
		else
			return expression.check(context);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("{");
		expression.toDialect(writer);
		writer.append("}");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		this.expression.declare(transpiler);
	}
	
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		this.expression.transpile(transpiler);
		return false;
	}

}
