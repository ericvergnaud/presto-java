package prompto.type;

import prompto.runtime.Context;
import prompto.store.Family;

public abstract class IterableType extends NativeType {

	IType itemType;
	String typeName;
	
	protected IterableType(Family family, IType itemType, String typeName) {
		super(family);
		this.itemType = itemType;
		this.typeName = typeName;
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}
	
	public IType getItemType() {
		return itemType;
	}
	
	public void setItemType(IType itemType) {
		this.itemType = itemType;
	}
	
	@Override
	public void checkExists(Context context) {
		itemType.checkExists(context);
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return other instanceof IterableType
			&& itemType.isMoreSpecificThan(context, ((IterableType)other).itemType);
	}
	
}
