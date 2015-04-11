package presto.type;

import org.joda.time.DateTime;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.ListValue;


public class DateTimeType extends NativeType {

	static DateTimeType instance = new DateTimeType();

	public static DateTimeType instance() {
		return instance;
	}

	private DateTimeType() {
		super("DateTime");
	}

	@Override
	public Class<?> toJavaClass() {
		return DateTime.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DateTimeType) || (other instanceof DateType) || (other instanceof TimeType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if (other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		if (other instanceof DateTimeType)
			return PeriodType.instance();
		if (other instanceof DateType)
			return PeriodType.instance();
		if (other instanceof TimeType)
			return PeriodType.instance();
		if (other instanceof PeriodType)
			return this;
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if (other instanceof DateType)
			return BooleanType.instance();
		if (other instanceof DateTimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
	}

	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
		if ("year".equals(name))
			return IntegerType.instance();
		else if ("month".equals(name))
			return IntegerType.instance();
		else if ("dayOfMonth".equals(name))
			return IntegerType.instance();
		else if ("dayOfYear".equals(name))
			return IntegerType.instance();
		else if ("hour".equals(name))
			return IntegerType.instance();
		else if ("minute".equals(name))
			return IntegerType.instance();
		else if ("second".equals(name))
			return IntegerType.instance();
		else if ("millis".equals(name))
			return IntegerType.instance();
		else if ("tzOffset".equals(name))
			return IntegerType.instance();
		else if ("tzName".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
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
