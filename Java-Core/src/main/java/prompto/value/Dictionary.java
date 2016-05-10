package prompto.value;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLengths;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.type.ContainerType;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;

public class Dictionary extends BaseValue implements IContainer<IValue> {

	PromptoDict<Text, IValue> dict;

	public Dictionary(IType itemType) {
		super(new DictType(itemType));
		dict = new PromptoDict<>();
	}

	public Dictionary(Dictionary from) {
		this(((ContainerType) from.type).getItemType(), from.dict);
	}

	public Dictionary(IType itemType, PromptoDict<Text, IValue> dict) {
		super(new DictType(itemType));
		this.dict = dict;
	}
	
	@Override
	public PromptoDict<Text, IValue> getStorableData() {
		return dict;
	}

	public static Dictionary merge(Dictionary dict1, Dictionary dict2) {
		PromptoDict<Text, IValue> dict = new PromptoDict<>();
		dict.putAll(dict1.dict);
		dict.putAll(dict2.dict);
		// TODO check type fungibility		
		return new Dictionary(((ContainerType) dict1.type).getItemType(), dict); 
	}

	@Override
	public long getLength() {
		return dict.size();
	}

	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof Dictionary)
			return merge(this, (Dictionary) value);
		else
			throw new SyntaxError("Illegal: Dict + "
					+ value.getClass().getSimpleName());
	}
	
	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return right if left is empty (or left if right is empty)
		// create result
		ResultInfo info = CompilerUtils.compileNewInstance(method, PromptoDict.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return info;
	}

	public boolean hasItem(Context context, IValue value) {
		if (value instanceof Text)
			return this.dict.containsKey((Text) value);
		else
			throw new SyntaxError("Only Text key instanceof supported by "
					+ this.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(this.dict.size());
		else if ("keys".equals(name)) {
			@SuppressWarnings("unchecked")
			PromptoSet<IValue> values = (PromptoSet<IValue>)(Object)new PromptoSet<Text>(this.dict.keySet());
			return new SetValue(TextType.instance(), values);
		} else if ("values".equals(name)) {
			IType itemType = ((ContainerType) this.type).getItemType();
			Collection<IValue> values = this.dict.values();
			return new ListValue(itemType, values);
		} else
			return super.getMember(context, id, autoCreate);
	}

	public IValue getItem(Context context, IValue index) throws PromptoError {
		return getItem(index);
	}
	
	
	public IValue getItem(IValue index) throws PromptoError {
		if (index instanceof Text)
			return dict.get((Text) index);
		else
			throw new SyntaxError("No such item:" + index.toString());
	}


	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags.withPrimitive(true));
		IOperand oper = new MethodConstant(PromptoDict.class, "get", 
				Object.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class);
	}
	
	@Override
	public Object convertTo(Class<?> type) {
		Class<?> itemType = Object.class; // TODO (Class<?>)((ParameterizedType)(Object)type).getActualTypeArguments()[1];
		PromptoDict<String, Object> dict = new PromptoDict<>();
		for(Map.Entry<Text, IValue> entry : this.dict.entrySet()) {
			String key = entry.getKey().toString();
			Object value = entry.getValue().convertTo(itemType);
			dict.put(key, value);
		}
		return dict;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dictionary))
			return false;
		return dict.equals(((Dictionary) obj).dict);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDict.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	@Override
	public String toString() {
		return dict.toString();
	}

	@Override
	public IterableWithLengths<IValue> getIterable(Context context) {
		return new KVPIterable(context);
	}

	class KVPIterable implements IterableWithLengths<IValue> {

		Context context;

		public KVPIterable(Context context) {
			this.context = context;
		}

		@Override
		public Long getLength() {
			return (long)dict.size();
		}
		
		@Override
		public Long getTotalLength() {
			return (long)dict.size();
		}
		
		@Override
		public Iterator<IValue> iterator() {
			return new Iterator<IValue>() {

				Iterator<Entry<Text, IValue>> iterator = dict.entrySet().iterator();
				
				@Override
				public boolean hasNext() {
					return iterator.hasNext();
				}
	
				@Override
				public KVPValue next() {
					return new KVPValue(iterator.next());
				}
	
				@Override
				public void remove() {
					iterator.remove();
				}
			};

		}

	}

	static class KVPValue extends BaseValue {
		Entry<Text, IValue> kvp;

		public KVPValue(Entry<Text, IValue> kvp) {
			super(null); // TODO, check that this is not a problem
			this.kvp = kvp;
		}

		@Override
		public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
			String name = id.toString();
			if ("key".equals(name))
				return kvp.getKey();
			else if ("value".equals(name))
				return kvp.getValue();
			else
				throw new SyntaxError("No such member:" + name);
		}
		
	}
}
