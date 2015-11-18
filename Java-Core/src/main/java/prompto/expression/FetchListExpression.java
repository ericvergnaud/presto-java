package prompto.expression;

import java.util.ArrayList;
import java.util.List;

import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.BooleanType;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IContainer;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.ListValue;

public class FetchListExpression extends Section implements IExpression {

	Identifier itemName;
	IExpression source;
	IExpression filter;
	
	public FetchListExpression(Identifier itemName, IExpression source, IExpression filter) {
		this.itemName = itemName;
		this.source = source;
		this.filter = filter;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch any ");
			writer.append(itemName);
			break;
		case O:
			writer.append("fetch (");
			writer.append(itemName);
			writer.append(")");
			break;
		case S:
			writer.append("fetch ");
			writer.append(itemName);
			break;
		}
		writer.append(" from ");
		source.toDialect(writer);
		writer.append(" where ");
		filter.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof ContainerType))
			throw new SyntaxError("Expecting a list, set or tuple as data source !");
		Context local = context.newLocalContext();
		IType itemType = ((ContainerType)sourceType).getItemType();
		local.registerValue(new Variable(itemName, itemType));
		IType filterType = filter.check(local);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
		return new ListType(itemType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Object src = source.interpret(context);
		if(src==null)
			throw new NullReferenceError();
		if(!(src instanceof IContainer<?>))
			throw new InternalError("Illegal fetch source: " + source);
		IType sourceType = source.check(context);
		if(!(sourceType instanceof ContainerType))
			throw new InternalError("Illegal source type: " + sourceType.getId());
		IType itemType = ((ContainerType)sourceType).getItemType();
		List<IValue> result = new ArrayList<IValue>();
		Context local = context.newLocalContext();
		Variable item = new Variable(itemName, itemType);
		local.registerValue(item);
		for(IValue o : ((IIterable<?>)src).getIterable(context)) {
			local.setValue(itemName, o);
			IValue test = filter.interpret(local);
			if(!(test instanceof Boolean))
				throw new InternalError("Illegal test result: " + test);
			if(((Boolean)test).getValue())
				result.add(o);
		}
		return new ListValue(itemType, result);
	}
}
