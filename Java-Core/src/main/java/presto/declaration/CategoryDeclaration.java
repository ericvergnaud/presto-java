package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.CategoryMethodDeclarationList;
import presto.grammar.IdentifierList;
import presto.runtime.Context;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IInstance;

public abstract class CategoryDeclaration extends BaseDeclaration {
	
	IdentifierList attributes;
	
	public CategoryDeclaration(String name) {
		super(name);
	}

	public CategoryDeclaration(String name, IdentifierList attributes) {
		super(name);
		this.attributes = attributes;
	}

	public void setAttributes(IdentifierList attributes) {
		this.attributes = attributes;
	}
	
	public IdentifierList getAttributes() {
		return attributes;
	}
		
	@Override
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		if(attributes!=null) for(String attribute : attributes) {
			AttributeDeclaration ad = context.getRegisteredDeclaration(AttributeDeclaration.class, attribute);
			if(ad==null)
				throw new SyntaxError("Unknown attribute: \"" + attribute + "\"");
		}
		return new CategoryType(this.getName());
	}
	
	@Override
	public CategoryType getType(Context context) {
		return new CategoryType(name);
	}

	public boolean hasAttribute(Context context, String name) {
		 return attributes!=null && attributes.contains(name);
	}

	public boolean hasMethod(Context context, String key, Object object) {
		return false;
	}

	public boolean isDerivedFrom(Context context, CategoryType categoryType) {
		return false;
	}

	public IdentifierList getDerivedFrom() {
		return null;
	}

	public abstract IInstance newInstance() throws PrestoError;

	public void checkConstructorContext(Context context) throws SyntaxError {
		// nothing to do
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
		case P:
			toPDialect(writer);
			break;
		}
	}

	protected abstract void toEDialect(CodeWriter writer);

	protected void protoToEDialect(CodeWriter writer, boolean hasMethods, boolean hasMappings) {
		boolean hasAttributes = attributes!=null && attributes.size()>0;
		writer.append("define ");
		writer.append(name);
		writer.append(" as: ");
		categoryTypeToEDialect(writer);
		if(hasAttributes) {
			if(attributes.size()==1)
				writer.append(" with attribute: ");
			else
				writer.append(" with attributes: ");
			attributes.toDialect(writer, true);
		}
		if(hasMethods) {
			if(hasAttributes)
				writer.append(", and methods:");
			else 
				writer.append(" with methods:");
		} else if (hasMappings) {
			if(hasAttributes)
				writer.append(", and mappings:");
			else 
				writer.append(" with mappings:");
		}
		writer.newLine();	
	}
	
	protected void methodsToEDialect(CodeWriter writer, CategoryMethodDeclarationList methods) {
		writer.indent();
		for(IDeclaration decl : methods) {
			writer.newLine();
			decl.toDialect(writer);
		}
		writer.dedent();
	}


	protected abstract void categoryTypeToEDialect(CodeWriter writer);

	protected abstract void toODialect(CodeWriter writer);
	
	protected void toODialect(CodeWriter writer, boolean hasBody) {
		categoryTypeToODialect(writer);
		writer.append(" ");
		writer.append(name);
		if(attributes!=null) {
			writer.append('(');
			attributes.toDialect(writer, true);
			writer.append(')');
		}	
		categoryExtensionToODialect(writer);
		if(hasBody) {
			writer.append(" {\n");
			writer.newLine();
			writer.indent();
			bodyToODialect(writer);
			writer.dedent();
			writer.append('}');
			writer.newLine();
		} else
			writer.append(';');
	}

	protected abstract void categoryTypeToODialect(CodeWriter writer);

	protected void categoryExtensionToODialect(CodeWriter writer) {
		// by default no extension
	}

	protected abstract void bodyToODialect(CodeWriter writer);

	protected abstract void toPDialect(CodeWriter writer);

	protected void protoToPDialect(CodeWriter writer, IdentifierList derivedFrom) {
		categoryTypeToPDialect(writer);
		writer.append(" ");
		writer.append(name);
		writer.append("(");
		if(derivedFrom!=null) {
			derivedFrom.toDialect(writer, false);
			if(attributes!=null)
				writer.append(", ");
		}
		if(attributes!=null)
			attributes.toDialect(writer, false);
		writer.append("):\n");
		writer.newLine();
	}

	protected abstract void categoryTypeToPDialect(CodeWriter writer);
	
	




}
