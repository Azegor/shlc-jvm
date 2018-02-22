package compiler.ji;

import compiler.JVMType;

public class CastJI extends JasminInstruction {

	JVMType targetType;

	public CastJI(JVMType input, JVMType output) {
		super(input);
		targetType = output;
	}

	private JI getJI() {
		switch (type.getEffectiveType()) {
		case double_t:
			switch (targetType) {
			case float_t:
				return JI.d2f;
			case int_t:
				return JI.d2i;
			case long_t:
				return JI.d2l;
			default:
				break;
			}
			break;
		case float_t:
			switch (targetType) {
			case double_t:
				return JI.f2d;
			case int_t:
				return JI.f2i;
			case long_t:
				return JI.f2l;
			default:
				break;
			}
			break;
		case int_t:
			switch (targetType) {
			case float_t:
				return JI.i2f;
			case double_t:
				return JI.i2d;
			case long_t:
				return JI.i2l;
			default:
				break;
			}
			break;
		case long_t:
			switch (targetType) {
			case float_t:
				return JI.l2f;
			case double_t:
				return JI.l2d;
			case int_t:
				return JI.l2i;
			default:
				break;
			}
			break;
		default:
			break;
		}
		throw new RuntimeException("invalid cast from " + type + " to "
				+ targetType);
	}

	@Override
	protected void generate(AsmGenBuffer ctx) {
		instruction = getJI();
	}

}
