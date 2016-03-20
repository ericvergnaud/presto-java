package prompto.compiler;

import java.lang.reflect.Type;

import prompto.compiler.Descriptor.Method;

public class InterfaceConstant extends MethodConstant {

	public InterfaceConstant(Type klass, String methodName, Type ... params) {
		super(klass, methodName, params);
	}
	
	public InterfaceConstant(ClassConstant klass, String methodName, Method method) {
		super(klass, methodName, method);
	}

	public int getArgsCount() {
		return methodNameAndType.getDescriptor().getTypes().length; // this + args.count - result
	}

	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_InterfaceMethodref_info {
		    u1 tag;
		    u2 class_index;
		    u2 name_and_type_index;
		}	
		*/
		writer.writeU1(Tags.CONSTANT_InterfaceMethodref);
		writer.writeU2(className.getIndexInConstantPool());
		writer.writeU2(methodNameAndType.getIndexInConstantPool());
	}

}
