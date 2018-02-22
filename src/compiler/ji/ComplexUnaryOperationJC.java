package compiler.ji;

import compiler.SHLType;
import compiler.UnaryOperation;

public class ComplexUnaryOperationJC extends JasminComponent {

	public final SHLType type;
	UnaryOperation operation;

	public ComplexUnaryOperationJC(SHLType inputType, UnaryOperation op) {
		type = inputType;
		operation = op;
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		switch (operation) {
		case not:
			// expects inputs to be double
			new LoadConstantJI(true).asmGen(ctx);
			appendIdentln(ctx, JI.ixor);
			break;
		default:
			throw new RuntimeException("unknown complex binary operation: "
					+ operation);
		}
	}

}
