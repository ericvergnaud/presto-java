package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.expression.IExpression;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.Decimal;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;


public class DecimalType extends NativeType implements INumberType {

	static DecimalType instance = new DecimalType();
	
	public static DecimalType instance() {
		return instance;
	}
	
	private DecimalType() {
		super(Family.DECIMAL);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return Double.class;
	}
	

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==IntegerType.instance();
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}

	@Override
	public IType checkDivide(Context context, IType other) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkDivide(context, other);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other) {
		if(other instanceof IntegerType)
			return other;
		return super.checkIntDivide(context, other);
	}
	
	@Override
	public IType checkModulo(Context context, IType other) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkModulo(context, other);
	}

	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if(other instanceof IntegerType)
			return BooleanType.instance();
		if(other instanceof DecimalType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}

	@Override
	public Comparator<Decimal> getComparator(boolean descending) {
		return descending ? 
				new Comparator<Decimal>() {
					@Override
					public int compare(Decimal o1, Decimal o2) {
						return java.lang.Double.compare(o2.doubleValue(), o1.doubleValue());
					}
				} :
				new Comparator<Decimal>() {
					@Override
					public int compare(Decimal o1, Decimal o2) {
						return java.lang.Double.compare(o1.doubleValue(), o2.doubleValue());
					}
				};
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof Number)
            return new Decimal(((Number)value).doubleValue());
        else
            return (IValue)value; // TODO for now
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return new Decimal(value.asDouble());
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
		if(other==IntegerType.instance() || other==DecimalType.instance()) {
			left.declare(transpiler);
			right.declare(transpiler);
		} else
			super.declareAdd(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public boolean transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
		if(other==IntegerType.instance() || other==DecimalType.instance()) {
		    left.transpile(transpiler);
		    transpiler.append(" + ");
		    right.transpile(transpiler);
		    return false;
		} else
			return super.transpileAdd(transpiler, other, tryReverse, left, right);
	}

}
