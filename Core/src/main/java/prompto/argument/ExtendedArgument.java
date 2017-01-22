package prompto.argument;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoProxy;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.ObjectUtils;

public class ExtendedArgument extends CategoryArgument {
	
	IdentifierList attributes;
	
	public ExtendedArgument(IType type, Identifier id, IdentifierList attributes) {
		super(type, id);
		this.attributes = attributes;
	}

	public IdentifierList getAttributes() {
		return attributes;
	}
	
	@Override
	public String getProto() {
		return type.getTypeNameId().toString() + '(' + attributes.toString() + ')';
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(mutable)
			writer.append("mutable ");
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case M:
			toMDialect(writer);
			break;
		}
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		type.toDialect(writer);
		writer.append(' ');
		writer.append(id);
		switch(attributes.size()) {
		case 0:
			break;
		case 1:
			writer.append(" with attribute ");
			attributes.toDialect(writer, false);
			break;
		default:
			writer.append(" with attributes ");
			attributes.toDialect(writer, true);
			break;
		}
	}

	private void toODialect(CodeWriter writer) {
		type.toDialect(writer);
		writer.append('(');
		attributes.toDialect(writer, false);
		writer.append(')');
		writer.append(' ');
		writer.append(id);
	}

	private void toMDialect(CodeWriter writer) {
		writer.append(id);
		writer.append(':');
		type.toDialect(writer);
		writer.append('(');
		attributes.toDialect(writer, false);
		writer.append(')');
	}

	@Override
	public String toString() {
		return id.toString() + ':' + getProto();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof ExtendedArgument))
			return false;
		ExtendedArgument other = (ExtendedArgument)obj;
		return ObjectUtils.areEqual(this.getType(),other.getType())
				&& ObjectUtils.areEqual(this.getId(),other.getId())
				&& ObjectUtils.areEqual(this.getAttributes(),other.getAttributes());
	}

	@Override
	public void register(Context context) {
		INamed actual = context.getRegisteredValue(INamed.class, id);
		if(actual!=null)
			throw new SyntaxError("Duplicate argument: \"" + id + "\"");
		ConcreteCategoryDeclaration declaration = 
				new ConcreteCategoryDeclaration(id, attributes,
						new IdentifierList(type.getTypeNameId()), null);
		context.registerDeclaration(declaration);
		context.registerValue(this);
		if(defaultExpression!=null) try {
			context.setValue(id, defaultExpression.interpret(context));
		} catch(PromptoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + id);
		}
	}
	
	@Override
	public void check(Context context) {
		type.checkExists(context);
		for(Identifier attribute : attributes) {
			AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class, attribute);
			if(actual==null)
				throw new SyntaxError("Unknown attribute: \"" + attribute + "\"");
		}
	}
	
	@Override
	public IType getType(Context context) {
		return context.getRegisteredDeclaration(IDeclaration.class, id).getType(context);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return CompilerUtils.getExtendedInterfaceType(type.getTypeNameId(), attributes);
	}

	@Override
	public void compileAssignment(Context context, MethodInfo method, Flags flags, ArgumentAssignmentList assignments, boolean isFirst) {
		// create a proxy to the required java type
		ClassConstant c = new ClassConstant(getJavaType(context));
		method.addInstruction(Opcode.LDC, c);
		super.compileAssignment(context, method, flags, assignments, isFirst);
		MethodConstant m = new MethodConstant(PromptoProxy.class, "newProxy", Class.class, Object.class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.CHECKCAST, c);
	}

}