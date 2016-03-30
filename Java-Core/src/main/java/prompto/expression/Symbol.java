package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.value.IInstance;
import prompto.value.ISliceable;
import prompto.value.IValue;

import com.fasterxml.jackson.core.JsonGenerator;

public abstract class Symbol extends Section implements IExpression, INamed, IValue, ISection {

	Identifier symbol;
	IType type;

	protected Symbol(Identifier symbol) {
		this.symbol = symbol;
	}

	@Override
	public String getStorableData() {
		return symbol.toString();
	}

	@Override
	public boolean isMutable() {
		return false;
	}
	
	public String getSymbol() {
		return symbol.toString();
	}
	
	@Override
	public Identifier getId() {
		return symbol;
	}
	
	@Override
	public IType getType() {
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	public void setType(IType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return symbol.toString();
	}
	
	public void register(Context context) {
		context.registerValue(this);
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Add not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Subtract not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Multiply not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public IValue divide(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Divide not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public IValue intDivide(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Integer divide not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public IValue modulo(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Integer divide not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Compare not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public void setMember(Context context, Identifier name, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier name, boolean autoCreate) throws PromptoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}
	
	@Override
	public Object convertTo(Class<?> type) {
		return this;
	}
	
	@Override
	public boolean roughly(Context context, IValue value) throws PromptoError {
		return this.equals(value);
	}
	
	@Override
	public ISliceable<IValue> asSliceable(Context context) throws PromptoError {
		return null;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		throw new UnsupportedOperationException("toJson not supported by " + this.getClass().getSimpleName());
	}

}
