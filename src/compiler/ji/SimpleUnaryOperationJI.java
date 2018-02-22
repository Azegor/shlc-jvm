package compiler.ji;

import compiler.SHLType;
import compiler.UnaryOperation;

public class SimpleUnaryOperationJI extends JasminInstruction {
	public final SHLType opType;
	public final UnaryOperation op;

	public SimpleUnaryOperationJI(SHLType type, UnaryOperation op) {
		super(type.getJVMType());
		opType = type;
		this.op = op;
	}

	private JI getJI() {
		switch (opType) {
		case int_t:
			switch (op) {
			case neg:
				return JI.lneg;
			default:
				break;
			}
			break;
		case flt_t:
			switch (op) {
			case neg:
				return JI.fneg;
			default:
				break;
			}
			break;
		case boo_t:
		case chr_t:
		case str_t:
		case vac_t:
		default:
			break;
		}
		throw new RuntimeException("Unsupported simple unary operation " + op
				+ " for type " + opType);
	}


	@Override
	protected void generate(AsmGenBuffer ctx) {
		instruction = getJI();
	}
}
