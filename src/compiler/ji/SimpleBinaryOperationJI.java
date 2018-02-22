package compiler.ji;

import compiler.BinaryOperation;
import compiler.SHLType;

public class SimpleBinaryOperationJI extends JasminInstruction {
	public final SHLType opType;
	public final BinaryOperation op;

	public SimpleBinaryOperationJI(SHLType type, BinaryOperation op) {
		super(type.getJVMType());
		opType = type;
		this.op = op;
	}

	private JI getJI() {
		switch (opType) {
		case int_t:
			switch (op) {
			case add:
				return JI.ladd;
			case sub:
				return JI.lsub;
			case mul:
				return JI.lmul;
			case div:
				return JI.ldiv;
			case mod:
				return JI.lrem;
			case lshift:
				return JI.lshl;
			case rshift:
				return JI.lshr;
			default:
				break;
			}
			break;
		case chr_t:
			switch (op) {
			case add:
				return JI.iadd;
			case sub:
				return JI.isub;
			case mul:
				return JI.imul;
			case div:
				return JI.idiv;
			case mod:
				return JI.irem;
			default:
				break;
			}
			break;
		case flt_t:
			switch (op) {
			case add:
				return JI.dadd;
			case sub:
				return JI.dsub;
			case mul:
				return JI.dmul;
			case div:
				return JI.ddiv;
			case mod:
				return JI.drem;
			default:
				break;
			}
			break;
		case boo_t:
			switch (op) {
			case and:
				return JI.iand; // this is bitwise!!! works only if true === 1!
			case or:
				return JI.ior;
			default:
				break;
			}
			break;
		case str_t:
		case vac_t:
		default:
			break;
		}
		throw new RuntimeException("Unsupported binary operation " + op
				+ " for type " + opType);
	}

	@Override
	protected void generate(AsmGenBuffer ctx) {
		instruction = getJI();
	}
}
