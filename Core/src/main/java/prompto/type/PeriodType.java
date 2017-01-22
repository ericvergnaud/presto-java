package prompto.type;

import java.lang.reflect.Type;

import prompto.intrinsic.PromptoPeriod;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;



public class PeriodType extends NativeType {

	static PeriodType instance = new PeriodType();
	
	public static PeriodType instance() {
		return instance;
	}
	
	private PeriodType() {
		super(Family.PERIOD);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoPeriod.class;
	}
	

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) {
		if(other instanceof PeriodType)
			return this;
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}

	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if(other instanceof PeriodType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}
}