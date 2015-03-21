package presto.type;

import presto.error.SyntaxError;
import presto.runtime.Context;

public class EntryType extends BaseType {

	IType itemType;

	public EntryType(IType itemType) {
		super(itemType.getName() + "{}[]");
		this.itemType = itemType;
	}

	public IType getItemType() {
		return itemType;
	}

	@Override
	public Class<?> toJavaClass() {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public void checkUnique(Context context) throws SyntaxError {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public void checkExists(Context context) throws SyntaxError {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public IType checkMember(Context context, String name) throws SyntaxError {
		if ("key".equals(name))
			return TextType.instance();
		else if ("value".equals(name))
			return itemType;
		else
			return super.checkMember(context, name);
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		throw new RuntimeException("Should never get there!");
	}

}
