package compiler.ji;

import compiler.BinaryOperation;
import compiler.JVMType;
import compiler.SHLType;

public class CompareJC extends JasminComponent {

	public final SHLType opType;
	public final BinaryOperation operation;

	public CompareJC(SHLType type, BinaryOperation op) {
		opType = type;
		operation = op;
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		LabelJC lTrue = new LabelJC("cmp_true");
		LabelJC lFalse = new LabelJC("cmp_false");
		if (opType.getJVMType().getEffectiveType() == JVMType.int_t) {
			new BranchJI.IfCmp2JI(JVMType.int_t, lTrue,
					BinaryOperation.getCmpType(operation)).asmGen(ctx);
		} else {
			new BranchJI.CompareJI(opType.getJVMType().getEffectiveType(),
					lTrue, BinaryOperation.getCmpType(operation)).asmGen(ctx);
		}
		new LoadConstantJI(false).asmGen(ctx);
		new BranchJI.GotoJI(lFalse).asmGen(ctx);
		lTrue.asmGen(ctx);
		new LoadConstantJI(true).asmGen(ctx);
		lFalse.asmGen(ctx);
	}

}
