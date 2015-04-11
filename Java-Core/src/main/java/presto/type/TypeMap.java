package presto.type;

import java.util.HashMap;

import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;



public class TypeMap extends HashMap<Identifier, IType> {

	private static final long serialVersionUID = 1L;

	public IType inferType(Context context) throws SyntaxError {
		if(size()==0)
			return VoidType.instance();
		IType type = null;
		// first pass: get less specific type
		for(IType t : values()) {
			if(type==null)
				type = t;
			else if(t.isAssignableTo(context, type))
				continue;
			else if(type.isAssignableTo(context, t))
				type = t;
			else
				throw new SyntaxError("Incompatible types: " + type.getName() + " and " + t.getName());
		}
		// second pass: check compatible
		for(IType t : values()) {
			if(!t.isAssignableTo(context, type))
				throw new SyntaxError("Incompatible types: " + type.getName() + " and " + t.getName());
		}
		return type;
	}

}
