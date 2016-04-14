package prompto.literal;

import java.util.List;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IOperand;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.type.CharacterType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.MissingType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.Utils;
import prompto.value.Character;
import prompto.value.Decimal;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;

public class ListLiteral extends Literal<ListValue> {

	IType itemType = null;
	ExpressionList expressions = null;
	
	public ListLiteral() {
		super("[]",new ListValue(MissingType.instance()));
	}
	
	public ListLiteral(ExpressionList expressions) {
		super("[" + expressions.toString() + "]",new ListValue(MissingType.instance()));
		this.expressions = expressions;
	}

	@Override
	public IType check(Context context) {
		if(itemType==null) {
			if(expressions!=null)
				itemType = Utils.inferElementType(context, expressions);
			else
				itemType = Utils.inferElementType(context, value.getItems());
		}
		return new ListType(itemType); 
	}

	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(expressions!=null) {
			check(context); // force computation of itemType
			List<IValue> list = new PromptoList<IValue>();
			for(IExpression exp : expressions) {
				IValue item = exp.interpret(context);
				item = interpretPromotion(item);
				list.add(item);
			}
			return new ListValue(itemType, list);
			// don't dispose of expressions, they are required by translation 
		} else
			return value;
	}

	private IValue interpretPromotion(IValue item) {
		if(item==null)
			return item;
		if(DecimalType.instance()==itemType && item.getType()==IntegerType.instance())
			return new Decimal(((Integer)item).doubleValue());
		else if(TextType.instance()==itemType && item.getType()==CharacterType.instance())
			return ((Character)item).asText();
		else
			return item;
	}

	public ExpressionList getExpressions() {
		return expressions;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(expressions!=null) {
			writer.append('[');
			expressions.toDialect(writer);
			writer.append(']');
		} else
			writer.append("[]");
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo info = CompilerUtils.compileNewInstance(method, PromptoList.class);
		if(expressions!=null)
			compileItems(context, method);
		return info;
	}

	private void compileItems(Context context, MethodInfo method) {
		Flags flags = new Flags();
		flags.withPrimitive(true);
		for(IExpression e : expressions) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the list on top of stack
			ResultInfo info = e.compile(context, method, flags);
			compilePromotion(method, info);
			IOperand c = new MethodConstant(PromptoList.class, "add", 
					Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			method.addInstruction(Opcode.POP); // consume the returned boolean
		}
	}
	
	private ResultInfo compilePromotion(MethodInfo method, ResultInfo info) {
		if(DecimalType.instance()==itemType && Long.class==info.getType())
			return CompilerUtils.LongToDouble(method);
		else if(TextType.instance()==itemType) {
			if(char.class==info.getType())
				return CompilerUtils.charToString(method);
			else if(java.lang.Character.class==info.getType())
				return CompilerUtils.CharacterToString(method);
		}
		return info;
	}
}
