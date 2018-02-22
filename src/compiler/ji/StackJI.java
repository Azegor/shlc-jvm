package compiler.ji;

import compiler.JVMType;

public abstract class StackJI extends JasminInstruction {

	StackJI(JVMType type) {
		super(type);
	}

	@Override
	protected void generate(AsmGenBuffer ctx) {
		instruction = getJI();
	}

	protected abstract JI getJI();

	// Implementations:

	public static class Pop extends StackJI {
		public Pop(JVMType type) {
			super(type);
		}

		@Override
		protected JI getJI() {
			if (type.stackSize() == 2)
				return JI.pop2;
			return JI.pop;
		}
	}

	public static class ReturnJI extends StackJI {
		public ReturnJI(JVMType t) {
			super(t);
		}

		@Override
		protected JI getJI() {
			switch (type) {
			case void_t:
				return JI.return_;
			case long_t:
				return JI.lreturn;
			case double_t:
				return JI.dreturn;
			case boolean_t:
			case char_t:
				return JI.ireturn;
			case objref:
				return JI.areturn;
			default:
				throw typeError(type);
			}
		}
	}

}
