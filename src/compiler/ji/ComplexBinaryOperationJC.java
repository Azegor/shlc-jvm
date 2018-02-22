package compiler.ji;

import compiler.BinaryOperation;
import compiler.JVMType;
import compiler.SHLType;

public class ComplexBinaryOperationJC extends JasminComponent {

	public final SHLType type;
	BinaryOperation operation;

	public ComplexBinaryOperationJC(SHLType inputType, BinaryOperation op) {
		type = inputType;
		operation = op;
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		switch (operation) {
		case pow:
			// expects inputs to be double
			new FunctionCallJI("java/lang/Math/pow(DD)D", JVMType.double_t)
					.asmGen(ctx);
			break;
		case add:
			// expects inputs to be String
			new FunctionCallJI(
					"java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;",
					JVMType.objref, FunctionCallJI.CallType.virtualCall)
					.asmGen(ctx);
			break;
		default:
			throw new RuntimeException("unknown complex binary operation: "
					+ operation);
		}
	}

}
