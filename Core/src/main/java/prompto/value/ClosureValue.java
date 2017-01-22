package prompto.value;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;

public class ClosureValue extends BaseValue {
	
	Context context;
	
	public ClosureValue(Context context, MethodType type) {
		super(type);
		this.context = context;
	}
	
	private IMethodDeclaration getMethod() {
		return ((MethodType)type).getMethod();
	}
	
	public IValue interpret(Context context) throws PromptoError {
		Context parentMost = this.context.getParentMostContext();
		parentMost.setParentContext(context);
		IValue result = getMethod().interpret(this.context);
		parentMost.setParentContext(null);
		return result;
	}

	public Identifier getName() {
		return getMethod().getId();
	}

	public ArgumentList getArguments() {
		return getMethod().getArguments();
	}

	public IType getReturnType() {
		return getMethod().getReturnType();
	}

}