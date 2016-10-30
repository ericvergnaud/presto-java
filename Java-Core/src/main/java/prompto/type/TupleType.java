package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoTuple;
import prompto.runtime.Context;
import prompto.store.Family;

public class TupleType extends ContainerType {

	static TupleType instance = new TupleType();
	
	public static TupleType instance() {
		return instance;
	}
	
	private TupleType() {
		super(Family.TUPLE, AnyType.instance(), "any");
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoTuple.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other instanceof ListType ||
				other instanceof SetType;
	}

	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return AnyType.instance();
		else
			return super.checkItem(context,other);
	}
	

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        if ("count".equals(name))
            return IntegerType.instance();
        else
            return super.checkMember(context, id);
}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof TupleType || other instanceof ListType || other instanceof SetType)
			return this; 
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkContains(Context context, IType other) {
		return BooleanType.instance(); 
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance(); 
	}
	
}
