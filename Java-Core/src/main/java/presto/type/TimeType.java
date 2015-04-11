package presto.type;

import org.joda.time.LocalTime;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.ListValue;
import presto.value.Range;
import presto.value.Time;
import presto.value.TimeRange;


public class TimeType extends NativeType {

	static TimeType instance = new TimeType();

	public static TimeType instance() {
		return instance;
	}

	private TimeType() {
		super("Time");
	}

	@Override
	public Class<?> toJavaClass() {
		return LocalTime.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof TimeType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if (other instanceof PeriodType)
			return DateTimeType.instance();
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		if (other instanceof TimeType)
			return PeriodType.instance();
		if (other instanceof PeriodType)
			return DateTimeType.instance();
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if (other instanceof TimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
	}

	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		if (other instanceof TimeType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}

	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
		if ("hour".equals(name))
			return IntegerType.instance();
		else if ("minute".equals(name))
			return IntegerType.instance();
		else if ("second".equals(name))
			return IntegerType.instance();
		else if ("millis".equals(name))
			return IntegerType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public Range<?> newRange(Object left, Object right) throws SyntaxError {
		if (left instanceof Time && right instanceof Time)
			return new TimeRange((Time) left, (Time) right);
		return super.newRange(left, right);
	}

	@Override
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		return this.doSort(context, list);
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}

}
