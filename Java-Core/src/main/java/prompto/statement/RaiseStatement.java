package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.error.UserError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class RaiseStatement extends SimpleStatement {
	
	IExpression expression;
	
	public RaiseStatement(IExpression expression) {
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case S:
			writer.append("raise ");
			break;
		case O:
			writer.append("throw ");
			break;
		}
		expression.toDialect(writer);
	}
	
	@Override
	public String toString() {
		return "raise " + expression.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof RaiseStatement))
			return false;
		RaiseStatement other = (RaiseStatement)obj;
		return this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public IType check(Context context) {
		IType type = expression.check(context);
		if(!type.isAssignableTo(context, new CategoryType(new Identifier("Error"))))
			throw new SyntaxError(type.getTypeName() + " does not extend Error");
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		throw new UserError(expression);
	}

}
