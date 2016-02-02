package prompto.declaration;

import java.util.Collection;
import java.util.stream.Collectors;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.IAttributeConstraint;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class AttributeDeclaration extends BaseDeclaration {
	
	IType type;
	IAttributeConstraint constraint;
	IdentifierList indexTypes;
	boolean storable = false;
	
	public AttributeDeclaration(Identifier name, IType type) {
		this(name, type, null, null);
	}

	public AttributeDeclaration(Identifier name, IType type, IAttributeConstraint constraint) {
		this(name, type, constraint, null);
	}
	
	public AttributeDeclaration(Identifier name, IType type, IdentifierList indexTypes) {
		this(name, type, null, indexTypes);
	}
	
	public AttributeDeclaration(Identifier name, IType type, IAttributeConstraint constraint, IdentifierList indexTypes) {
		super(name);
		this.type = type;
		this.constraint = constraint;
		this.indexTypes = indexTypes;
	}

	@Override
	public Type getDeclarationType() {
		return Type.ATTRIBUTE;
	}
	
	@Override
	public String toString() {
		return this.type.toString() + " " + this.getName();
	}
	
	public Collection<String> getIndexTypes() {
		return indexTypes==null ? null : indexTypes.stream().map((id) -> id.getName()).collect(Collectors.toList());
	}
	
	public IType getType() {
		return type;
	}
	
	public IAttributeConstraint getConstraint() {
		return constraint;
	}
	
	public void setStorable(boolean storable) {
		this.storable = storable;
	}
	
	public boolean isStorable() {
		return storable;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("define ");
			writer.append(getIdentifier());
			writer.append(" as ");
			if(storable)
				writer.append("storable ");
			type.toDialect(writer);
			writer.append(" attribute");
			if(constraint!=null)
				constraint.toDialect(writer);
			break;
		case O:
			if(storable)
				writer.append("storable ");
			writer.append("attribute ");
			writer.append(getIdentifier());
			writer.append(" : ");
			type.toDialect(writer);
			if(constraint!=null)
				constraint.toDialect(writer);
			writer.append(';');
			break;
		case S:
			if(storable)
				writer.append("storable ");
			writer.append("attr ");
			writer.append(getIdentifier());
			writer.append(" ( ");
			type.toDialect(writer);
			writer.append(" ):\n");
			writer.indent();
			if(constraint!=null)
				constraint.toDialect(writer);
			else
				writer.append("pass");
			writer.dedent();
			break;
		}
	}
	
	@Override
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		type.checkExists(context);
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		IValue value = expression.interpret(context);
		if(constraint==null)
			return value;
		constraint.checkValue(context, value);
		return value;
	}



}
