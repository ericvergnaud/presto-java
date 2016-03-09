package prompto.value;

import java.io.IOException;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.error.DivideByZeroError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoChar;
import prompto.intrinsic.PromptoString;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.CharacterType;
import prompto.type.DecimalType;
import prompto.type.INumberType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.TextType;

import com.fasterxml.jackson.core.JsonGenerator;

public class Integer extends BaseValue implements INumber, Comparable<INumber>, IMultiplyable {
	
	public static Integer Parse(String text) {
		return new Integer(Long.parseLong(text));
	}

	long value;

	public Integer(long value) {
		super(IntegerType.instance());
		this.value = value;
	}

	public long longValue() {
		return value;
	}

	public double doubleValue() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return new Integer(this.longValue() + ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(((Decimal) value).doubleValue() + this.value);
		else
			throw new SyntaxError("Illegal: Integer + " + value.getClass().getSimpleName());
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToNative(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, isDecimal);
		if(isDecimal) {
			method.addInstruction(Opcode.DADD);
			if(toNative)
				return new ResultInfo(double.class, false);
			else
				return CompilerUtils.doubleToDouble(method);
		} else {
			method.addInstruction(Opcode.LADD);
			if(toNative)
				return new ResultInfo(long.class, false);
			else
				return CompilerUtils.longToLong(method);
		}
	}

	private static boolean isDecimal(Context context, IExpression exp) throws SyntaxError {
		return exp.check(context)==DecimalType.instance();
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return new Integer(this.longValue() - ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(this.doubleValue() - ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Integer - " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToNative(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, isDecimal);
		if(isDecimal) {
			method.addInstruction(Opcode.DSUB);
			if(toNative)
				return new ResultInfo(double.class, false);
			else
				return CompilerUtils.doubleToDouble(method);
		} else {
			method.addInstruction(Opcode.LSUB);
			if(toNative)
				return new ResultInfo(long.class, false);
			else
				return CompilerUtils.longToLong(method);
		}
	}

	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return new Integer(this.longValue() * ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(((Decimal) value).doubleValue() * this.longValue());
		else if (value instanceof IMultiplyable)
			return value.multiply(context, this);
		else
			throw new SyntaxError("Illegal: Integer * " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		IType type = exp.check(context);
		if(type instanceof INumberType)
			return compileMultiplyNumber(context, method, left, exp, toNative);
		else if(type==CharacterType.instance())
			return compileMultiplyCharacter(context, method, left, exp);
		else if(type==TextType.instance())
			return compileMultiplyText(context, method, left, exp);
		else if(IMultiplyable.class.isAssignableFrom(type.toJavaClass()))
			return compileMultiplyMultiplyable(context, method, left, exp);
		else
			throw new SyntaxError("Illegal: Integer * " + type.getClass().getSimpleName());
	}

	private static ResultInfo compileMultiplyCharacter(Context context, MethodInfo method, 
			ResultInfo left, IExpression exp) throws SyntaxError {
		if(Long.class==left.getType())
			CompilerUtils.LongToint(method);
		else
			CompilerUtils.longToint(method);
		exp.compile(context, method, false);
		CompilerUtils.CharacterTochar(method);
		// stack is int, char, need char, int
		method.addInstruction(Opcode.SWAP);
		MethodConstant oper = new MethodConstant(PromptoChar.class, 
				"multiply", 
				char.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class, true);
	}
	
	private static ResultInfo compileMultiplyText(Context context, MethodInfo method, 
			ResultInfo left, IExpression exp) throws SyntaxError {
		if(Long.class==left.getType())
			CompilerUtils.LongToint(method);
		else
			CompilerUtils.longToint(method);
		exp.compile(context, method, false);
		// stack is int, String, need String int
		method.addInstruction(Opcode.SWAP);
		MethodConstant oper = new MethodConstant(PromptoString.class, 
				"multiply", 
				String.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class, true);
	}

	private static ResultInfo compileMultiplyMultiplyable(Context context, MethodInfo method, 
			ResultInfo left, IExpression exp) throws SyntaxError {
		if(Long.class==left.getType())
			CompilerUtils.LongToint(method);
		else
			CompilerUtils.longToint(method);
		ResultInfo rval = exp.compile(context, method, false);
		method.addInstruction(Opcode.SWAP);
		try {
			Class<?> resultType = rval.getType().getMethod("multiply", int.class).getReturnType();
			Operand oper = new MethodConstant(rval.getType(), "multiply", 
					int.class, resultType);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(resultType, true);
		} catch(NoSuchMethodException e) {
			throw new SyntaxError(e.getMessage());
		}
	}

	private static ResultInfo compileMultiplyNumber(Context context, MethodInfo method, 
			ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToNative(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, isDecimal);
		if(isDecimal) {
			method.addInstruction(Opcode.DMUL);
			if(toNative)
				return new ResultInfo(double.class, false);
			else
				return CompilerUtils.doubleToDouble(method);
		} else {
			method.addInstruction(Opcode.LMUL);
			if(toNative)
				return new ResultInfo(long.class, false);
			else
				return CompilerUtils.longToLong(method);
		}
	}

	@Override
	public IValue divide(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new Decimal(this.doubleValue() / ((INumber) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Integer / " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileDivide(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		CompilerUtils.numberToNative(method, left, true);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, true);
		method.addInstruction(Opcode.DDIV);
		if(toNative)
			return new ResultInfo(double.class, false);
		else
			return CompilerUtils.doubleToDouble(method);
	}

	@Override
	public IValue intDivide(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			if (((Integer) value).longValue() == 0)
				throw new DivideByZeroError();
			else
				return new Integer(this.longValue() / ((Integer) value).longValue());
		} else
			throw new SyntaxError("Illegal: Integer \\ " + value.getClass().getSimpleName());
	}
	
	public static ResultInfo compileIntDivide(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		CompilerUtils.numberToNative(method, left, false);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, false);
		method.addInstruction(Opcode.LDIV);
		if(toNative)
			return new ResultInfo(long.class, false);
		else
			return CompilerUtils.longToLong(method);
	}

	@Override
	public IValue modulo(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			long mod = ((Integer) value).longValue();
			if (mod == 0)
				throw new DivideByZeroError();
			return new Integer(this.longValue() % mod);
		} else
			throw new SyntaxError("Illegal: Integer % " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileModulo(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		CompilerUtils.numberToNative(method, left, false);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, false);
		method.addInstruction(Opcode.LREM);
		if(toNative)
			return new ResultInfo(long.class, false);
		else
			return CompilerUtils.longToLong(method);
	}

	public int compareTo(INumber obj) {
		return Long.compare(value, obj.longValue());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return Long.compare(this.value, ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return Double.compare(this.doubleValue(), ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal comparison: Integer and " + value.getClass().getSimpleName());

	}

	@Override
	public Object convertTo(Class<?> type) {
		return value;
	}

	@Override
	public String toString() {
		return Long.toString(value);
	}
	
	@Override
	public int hashCode() {
		return Long.valueOf(value).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Integer)
			return value == ((Integer) obj).value;
		else if (obj instanceof Decimal)
			return value == ((Decimal) obj).value;
		else
			return false;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeNumber(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
	}

	public IValue negate() {
		return new Integer(-value);
	}
	
	public static ResultInfo compileNegate(Context context, MethodInfo method, ResultInfo value, boolean toNative) throws SyntaxError {
		CompilerUtils.numberToNative(method, value, false);
		method.addInstruction(Opcode.LNEG);
		if(toNative)
			return new ResultInfo(long.class, false);
		else
			return CompilerUtils.longToLong(method);
	}

}
