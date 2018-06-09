package prompto.type;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import prompto.expression.IExpression;
import prompto.intrinsic.PromptoRange;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class RangeType extends ContainerType {
	
	public RangeType(IType itemType) {
		super(Family.RANGE, itemType, itemType.getTypeName()+"[..]");
	}
	
	static Map<IType,Class<?>> rangeClassMap = createRangeClassMap();
	
	private static Map<IType, Class<?>> createRangeClassMap() {
		Map<IType,Class<?>> map = new HashMap<>();
		map.put(CharacterType.instance(), PromptoRange.Character.class);
		map.put(IntegerType.instance(), PromptoRange.Long.class);
		map.put(DateType.instance(), PromptoRange.Date.class);
		map.put(TimeType.instance(), PromptoRange.Time.class);
		return map;
	}
	
	@Override
	public Type getJavaType(Context context) {
		return rangeClassMap.get(itemType); 
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof RangeType))
			return false;
		RangeType other = (RangeType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
	}

	@Override
	public void declareContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    transpiler.require("StrictSet");
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".has(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareContainsAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    transpiler.require("StrictSet");
	    container.declare(transpiler);
	    items.declare(transpiler);
	}
	
	@Override
	public void transpileContainsAll(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileContainsAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAny(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
}
