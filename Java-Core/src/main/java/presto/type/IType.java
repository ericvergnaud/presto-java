package presto.type;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.Range;

public interface IType {
	
	Identifier getName();
	IValue getMember(Context context, Identifier name) throws PrestoError;
	String toString(Object value);
	void toDialect(CodeWriter writer);
	
	IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError;
	IType checkSubstract(Context context, IType other) throws SyntaxError;
	IType checkDivide(Context context, IType other) throws SyntaxError;
	IType checkIntDivide(Context context, IType other) throws SyntaxError;
	IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError;
	IType checkModulo(Context context, IType rt) throws SyntaxError;
	IType checkCompare(Context context, IType other) throws SyntaxError;
	IType checkItem(Context context, IType itemType)  throws SyntaxError;
	IType checkRange(Context context, IType other) throws SyntaxError;
	IType checkContains(Context context, IType other) throws SyntaxError;
	IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError;
	IType checkIterator(Context context) throws SyntaxError;
	IType checkSlice(Context context) throws SyntaxError;
	IType checkMember(Context context, Identifier name) throws SyntaxError;
	
	void checkUnique(Context context) throws SyntaxError;
	void checkExists(Context context) throws SyntaxError;

	void checkAssignableTo(Context context, IType other) throws SyntaxError;
	boolean isAssignableTo(Context context, IType other);
	boolean isMoreSpecificThan(Context context, IType other);
	
	Range<?> newRange(Object first,Object last) throws SyntaxError;
	IValue sort(Context context,ICollection<IValue> values) throws PrestoError;
	
	IValue convertJavaValueToPrestoValue(Object value);
	Class<?> toJavaClass();

}
 