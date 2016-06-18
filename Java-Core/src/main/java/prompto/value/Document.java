package prompto.value;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import prompto.error.InvalidValueError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.runtime.Context;
import prompto.type.DocumentType;

import com.fasterxml.jackson.core.JsonGenerator;

public class Document extends BaseValue {
	
	PromptoDocument<Identifier,IValue> values = new PromptoDocument<Identifier,IValue>();
	
	public Document() {
		super(DocumentType.instance());
	}
	

	@Override
	public PromptoDocument<Identifier,IValue> getStorableData() {
		return values;
	}
	
	@Override
	public boolean isMutable() {
		return true;
	}
	
    @Override
    public IValue getMember(Context context, Identifier name, boolean autoCreate) {
    	return getMember(name, autoCreate);
 	}
    
    
    public Set<Identifier> getMemberNames() {
    	return values.keySet();
    }

    public IValue getMember(Identifier name, boolean autoCreate) {
        IValue result = values.getOrDefault(name, NullValue.instance());
        if(autoCreate && result==NullValue.instance()) {
            result = new Document();
            values.put(name, result);
        }
        return result;
 	}

	@Override
    public void setMember(Context context, Identifier name, IValue value) {
    	values.put(name, value);
    }

   public void setMember(Identifier name, IValue value) {
    	values.put(name, value);
    }
	
	public boolean hasMember(Identifier name) {
		return values.containsKey(name);
	}
	
	
	@Override
	public void setItem(Context context, IValue item, IValue value) {
		if(!(item instanceof Text))
			throw new InvalidValueError("Expected a Text, got:" + item.getClass().getName());
		values.put(new Identifier(item.toString()), value);
	}
	
	@Override
	public IValue getItem(Context context, IValue item) {
		if(!(item instanceof Text))
			throw new InvalidValueError("Expected a Text, got:" + item.getClass().getName());
		return values.getOrDefault(new Identifier(item.toString()), NullValue.instance());
	}
	

	@Override
	public String toString() {
		return values.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Document)
			return values.equals(((Document)obj).values);
		else
			return false;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, Object instanceId, Identifier fieldName, Map<String, byte[]> binaries) throws PromptoError {
		try {
			generator.writeStartObject();
			generator.writeFieldName("type");
			generator.writeString(DocumentType.instance().getTypeName());
			generator.writeFieldName("value");
			generator.writeStartObject();
			for(Entry<Identifier, IValue> entry : values.entrySet()) {
				generator.writeFieldName(entry.getKey().toString());
				IValue value = entry.getValue();
				if(value==null)
					generator.writeNull();
				else
					value.toJson(context, generator, System.identityHashCode(this), entry.getKey(), binaries);
			}
			generator.writeEndObject();
			generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
