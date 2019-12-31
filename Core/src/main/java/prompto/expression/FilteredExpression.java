package prompto.expression;

import java.lang.reflect.Type;
import java.util.function.Predicate;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.NamedType;
import prompto.compiler.ResultInfo;
import prompto.compiler.Tags;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.Filterable;
import prompto.intrinsic.IterableWithCounts;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.type.IterableType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IFilterable;
import prompto.value.IValue;

public class FilteredExpression extends Section implements IExpression {

	Identifier itemId;
	IExpression source;
	IExpression predicate;
	
	public FilteredExpression(Identifier itemName, IExpression source, IExpression predicate) {
		this.itemId = itemName;
		this.source = source;
		this.predicate = predicate;
	}
	
	public void setSource(IExpression source) {
		this.source = source;
	}
	
	@Override
	public String toString() {
		return source.toString() + 
				" filtered with " + 
				itemId + 
				" where " +
				predicate.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(itemId!=null)
			toDialectExplicit(writer);
		else if(predicate instanceof ArrowExpression)
			((ArrowExpression)predicate).filterToDialect(writer, source);
		else
			throw new SyntaxError("Expecting an arrow expression!");
	}
	
	private void toDialectExplicit(CodeWriter writer) {
		writer = writer.newChildWriter();
		IType sourceType = source.check(writer.getContext());
		IType itemType = ((IterableType)sourceType).getItemType();
		writer.getContext().registerValue(new Variable(itemId, itemType));
		switch(writer.getDialect()) {
		case E:
		case M:
			source.toDialect(writer);
			writer.append(" filtered with ");
			writer.append(itemId);
			writer.append(" where ");
			predicate.toDialect(writer);
			break;
		case O:
			writer.append("filtered (");
			source.toDialect(writer);
			writer.append(") with (");
			writer.append(itemId);
			writer.append(") where (");
			predicate.toDialect(writer);
			writer.append(")");
			break;
		}
	}
	
	@Override
	public IType check(Context context) {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof IterableType))
			throw new SyntaxError("Expecting a cursor, list, set or tuple as data source!");
		IType itemType = ((IterableType)sourceType).getItemType();
		if(itemId!=null) {
			Context child = context.newChildContext();
			child.registerValue(new Variable(itemId, itemType));
			IType filterType = predicate.check(child);
			if(filterType!=BooleanType.instance())
				throw new SyntaxError("Filtering expression must return a boolean!");
		} else if(predicate instanceof ArrowExpression) {
			// TODO
		} else
			throw new SyntaxError("Expecting a filtering expression!");
		return new ListType(itemType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		// prepare context for expression evaluation
		IType sourceType = source.check(context);
		if(!(sourceType instanceof IterableType))
			throw new InternalError("Illegal source type: " + sourceType.getTypeName());
		IType itemType = ((IterableType)sourceType).getItemType();
		// fetch and check source
		IValue src = source.interpret(context);
		if(src==null)
			throw new NullReferenceError();
		if(!(src instanceof IFilterable))
			throw new InternalError("Illegal fetch source: " + source);
		Filterable<IValue,IValue> filterable = ((IFilterable)src).getFilterable(context);
		ArrowExpression arrow = toArrowExpression();
		Predicate<IValue> filter = arrow.getFilter(context, itemType);
		try {
			return filterable.filter(filter);
		} catch (InternalError e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}
	
	private ArrowExpression toArrowExpression() {
		if(itemId!=null) {
			ArrowExpression arrow = new ArrowExpression(new IdentifierList(itemId), null, null);
			arrow.setExpression(predicate);
			return arrow;
		} else if(predicate instanceof ArrowExpression)
			return (ArrowExpression)predicate;
		else
			throw new SyntaxError("Not a valid filter!");
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		// create inner class for filter
		String innerClassName = compileInnerFilterClass(context, method.getClassFile());
		// get iterable
		ResultInfo srcInfo = source.compile(context, method, flags);
		// instantiate filter
		ClassConstant innerClass = new ClassConstant(new NamedType(innerClassName));
		method.addInstruction(Opcode.NEW, innerClass);
		method.addInstruction(Opcode.DUP);
		// call filter constructor
		Descriptor.Method proto = new Descriptor.Method(void.class);
		MethodConstant m = new MethodConstant(innerClass, "<init>", proto);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// adjust return type
		Type resultType = srcInfo.getType();
		if(resultType==IterableWithCounts.class)
			resultType = Iterable.class;
		// invoke filter on source
		Descriptor.Method desc = new Descriptor.Method(Predicate.class, resultType);
		if(srcInfo.isInterface()) {
			InterfaceConstant i = new InterfaceConstant(new ClassConstant(srcInfo.getType()), "filter",  desc);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		} else {
			m = new MethodConstant(new ClassConstant(srcInfo.getType()), "filter",  desc);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		}
		return new ResultInfo(srcInfo.getType());
	}


	private String compileInnerFilterClass(Context context, ClassFile parentClass) {
		int innerClassIndex = 1 + parentClass.getInnerClasses().size();
		String innerClassName = parentClass.getThisClass().getType().getTypeName() + '$' + innerClassIndex;
		ClassFile classFile = new ClassFile(new NamedType(innerClassName));
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.addInterface(new ClassConstant(Predicate.class));
		CompilerUtils.compileEmptyConstructor(classFile);
		compileInnerClassExpression(context, classFile);
		parentClass.addInnerClass(classFile);;
		return innerClassName;
	}

	private void compileInnerClassExpression(Context context, ClassFile classFile) {
		IType paramIType = source.check(context).checkIterator(context);
		Type paramType = paramIType.getJavaType(context);
		compileInnerClassBridgeMethod(classFile, paramType);
		ArrowExpression arrow = toArrowExpression();
		arrow.compileFilter(context, classFile, paramIType, paramType);
	}

	private void compileInnerClassBridgeMethod(ClassFile classFile, Type paramType) {
		// create a bridge "apply" method to convert Object -> paramType
		Descriptor.Method proto = new Descriptor.Method(Object.class, boolean.class);
		MethodInfo method = classFile.newMethod("test", proto);
		method.addModifier(Tags.ACC_BRIDGE | Tags.ACC_SYNTHETIC);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		Identifier arg = itemId != null ? itemId : ((ArrowExpression)predicate).getArgs().getFirst();
		method.registerLocal(arg.toString(), VerifierType.ITEM_Object, new ClassConstant(Object.class));
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
		proto = new Descriptor.Method(paramType, boolean.class);
		MethodConstant c = new MethodConstant(classFile.getThisClass(), "test", proto);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		method.addInstruction(Opcode.IRETURN);
	}

	@Override
	public void declare(Transpiler transpiler) {
	    this.source.declare(transpiler);
	    IType manyType = this.source.check(transpiler.getContext());
	    IType itemType = ((IterableType)manyType).getItemType() ;
	    ArrowExpression arrow = toArrowExpression();
	    arrow.declareFilter(transpiler, itemType);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    IType manyType = this.source.check(transpiler.getContext());
	    IType itemType = ((IterableType)manyType).getItemType() ;
		this.source.transpile(transpiler);
	    transpiler.append(".filtered(");
	    ArrowExpression arrow = toArrowExpression();
	    arrow.transpileFilter(transpiler, itemType);
	    transpiler.append(")");
	    transpiler.flush();
		return false;
	}

}
