package prompto.type;

import java.lang.reflect.Type;

import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;


public class SetType extends ContainerType {

	public SetType(IType itemType) {
		super(Family.SET, itemType, itemType.getTypeName()+"<>");
	}
	
	@Override
	public Type getJavaType(Context context) {
		return PromptoSet.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
			(other instanceof SetType && 
			((SetType)other).getItemType().isAssignableFrom(context, itemType));
	}

	@Override
	public IType checkIterator(Context context) {
		return itemType;
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
		if(	(other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType()) )
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}

	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof SetType || other instanceof ListType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public boolean transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof SetType || other instanceof ListType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".addAll(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	        return false;
	    } else {
	        return super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }	
    }
	
	

}
