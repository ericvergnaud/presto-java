package prompto.compiler;

public class Instruction {

	Opcode opcode;
	Constant[] operands;
	
	Instruction(Opcode opcode, Constant[] operands) {
		this.opcode = opcode;
		this.operands = operands;
	}

	void register(ConstantsPool pool) {
		for(Constant operand : operands)
			operand.register(pool);
	}

	void writeTo(ByteCode byteCode, ByteWriter writer) {
		int operandsCount = opcode.countOperands(this);
		if(operandsCount<0)
			byteCode.popOperands(-operandsCount);
		else
			byteCode.pushOperands(operandsCount);
		if(opcode.kind.width==1)
			writer.writeU1(opcode.opcode);
		else
			writer.writeU2(opcode.opcode);
		if(opcode.kind.length==-1) {
			throw new UnsupportedOperationException(); // TODO
		} else if(operands.length>0) {
			switch(opcode.kind) {
				case CPREF:
					writer.writeU1(operands[0].index());
					break;
				case CPREF_W:
					writer.writeU2(operands[0].index());
					break;
				default:
					throw new UnsupportedOperationException(); // TODO
			}
		}
	}

	public int countMethodArguments() {
		for(Constant operand : operands) {
			if(operand instanceof MethodConstant)
				return ((MethodConstant)operand).getParamsCount();
		}
		return 0;
	}

}
