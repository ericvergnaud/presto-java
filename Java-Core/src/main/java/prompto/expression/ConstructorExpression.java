package prompto.expression;

import prompto.declaration.CategoryDeclaration;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;

public class ConstructorExpression implements IExpression {
	
	CategoryType type;
	boolean mutable;
	IExpression copyFrom;
	ArgumentAssignmentList assignments;
	
	public ConstructorExpression(CategoryType type, boolean mutable, ArgumentAssignmentList assignments) {
		this.type = type;
		this.mutable = mutable;
		setAssignments(assignments);
	}
	
	public CategoryType getType() {
		return type;
	}
	
	public void setAssignments(ArgumentAssignmentList assignments) {
		this.assignments = assignments;
		// in O and P, first anonymous argument is copyFrom
		if(assignments!=null && assignments.size()>0 && assignments.get(0).getArgument()==null) {
			copyFrom = assignments.get(0).getExpression();
			this.assignments.remove(0);
		}
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	public void setCopyFrom(IExpression copyFrom) {
		this.copyFrom = copyFrom;
	}

	public IExpression getCopyFrom() {
		return copyFrom;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toPDialect(writer);
			break;
		}
	}
	
	private void toPDialect(CodeWriter writer) {
		toODialect(writer);
	}

	private void toODialect(CodeWriter writer) {
		if(this.mutable)
			writer.append("mutable ");
		writer.append(type.getId());
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		if (copyFrom != null)
			assignments.add(new ArgumentAssignment(null, copyFrom));
		if(this.assignments!=null)
			assignments.addAll(this.assignments);
		assignments.toDialect(writer);
	}

	private void toEDialect(CodeWriter writer) {
		if(this.mutable)
			writer.append("mutable ");
		writer.append(type.getId());
		if (copyFrom != null) {
			writer.append(" from ");
			writer.append(copyFrom.toString());
			if (assignments != null && assignments.size()>0)
				writer.append(",");
		}
		if (assignments != null)
			assignments.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getId());
		type = cd.getType(context);
		cd.checkConstructorContext(context);
		if(copyFrom!=null) {
			IType cft = copyFrom.check(context);
			if(!(cft instanceof CategoryType))
				throw new SyntaxError("Cannot copy from " + cft.getId());
		}
		if(assignments!=null) {
			for(ArgumentAssignment assignment : assignments) {
				if(!cd.hasAttribute(context, assignment.getName()))
					throw new SyntaxError("\"" + assignment.getName() + 
						"\" is not an attribute of " + type.getId());	
				assignment.check(context);
			}
		}
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IInstance instance = type.newInstance(context);
		instance.setMutable(true);
		try {
			if(copyFrom!=null) {
				Object copyObj = copyFrom.interpret(context);
				if(copyObj instanceof IInstance) {
					IInstance copyFrom = (IInstance)copyObj;
					CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
					for(Identifier name : copyFrom.getMemberNames()) {
						if(cd.hasAttribute(context, name)) {
							IValue value = copyFrom.getMember(context, name, false);
							if(value!=null && value.isMutable() && !this.mutable)
								throw new NotMutableError();
							instance.setMember(context, name, value);
						}
					}
				}
			}
			if(assignments!=null) {
				for(ArgumentAssignment assignment : assignments) {
					IValue value = assignment.getExpression().interpret(context);
					if(value!=null && value.isMutable() && !this.mutable)
						throw new NotMutableError();
					instance.setMember(context, assignment.getName(), value);
				}
			}
			return instance;
		} finally {
			instance.setMutable(this.mutable);
		}
	}

}
