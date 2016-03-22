package prompto.compiler;

import java.lang.reflect.Type;


public class ClassConstant implements CodeConstant {

	Type type;
	Utf8Constant className;
	int index = -1;
	
	public ClassConstant(Type type) {
		this.type = type;
		this.className = new Utf8Constant(CompilerUtils.makeClassName(type));
	}

	public ClassConstant clone() {
		return new ClassConstant(this.type);
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean isInterface() {
		return new ResultInfo(type).isInterface();
	}

	public Utf8Constant getClassName() {
		return className;
	}
	
	public String getSimpleName() {
		String fullName = className.getValue();
		return fullName.substring(fullName.lastIndexOf('/')+1);
	}

	@Override
	public String toString() {
		return this.className.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof ClassConstant
				&& className.equals(((ClassConstant)obj).className);
	}
	
	@Override
	public int getIndexInConstantPool() {
		if(index==-1)
			throw new UnsupportedOperationException();
		return index;
	}
	
	@Override
	public void register(ConstantsPool pool) {
		index = pool.registerConstant(this);
		className.register(pool);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_Class_info {
		    u1 tag;
		    u2 name_index;
		}
		*/
		writer.writeU1(Tags.CONSTANT_Class);
		writer.writeU2(className.getIndexInConstantPool());
	}


}
