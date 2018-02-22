package compiler.ji;

import compiler.JVMType;

public abstract class BranchJI extends JasminInstruction {

	BranchJI(JVMType type, LabelJC label) {
		super(type);
		this.label = label;
	}

	public final LabelJC label;

	@Override
	public void generate(AsmGenBuffer ctx) {
		instruction = getJI();
		parameters.add(label.getName(ctx));
	}

	protected abstract JI getJI();

	// Implementations:

	public static class GotoJI extends BranchJI {

		public GotoJI(LabelJC label) {
			super(JVMType.none, label);
		}

		@Override
		protected JI getJI() {
			return JI.goto_;
		}
	}

	public static class CondJmp extends BranchJI {

		public final CmpType cType;

		public CondJmp(JVMType type, LabelJC label, CmpType cmp) {
			super(type, label);
			cType = cmp;
		}

		@Override
		protected JI getJI() {
			// probably unused...
			if (type == JVMType.objref) {
				switch (cType) {
				case eq:
					return JI.ifnull;
				case ne:
					return JI.ifnonnull;
				default:
					throw new RuntimeException(
							"Invalid compare type for object reference:"
									+ cType);
				}
			} else {
				switch (cType) {
				case eq:
					return JI.ifeq;
				case ge:
					return JI.ifge;
				case gt:
					return JI.ifgt;
				case le:
					return JI.ifle;
				case lt:
					return JI.iflt;
				case ne:
					return JI.ifne;
				default:
					return null; // can never happen (but compiler complains)
				}
			}
		}
	}

	public static class CompareJI extends BranchJI {

		public final CondJmp condJmp;

		public CompareJI(JVMType type, LabelJC label, CmpType cmp) {
			super(type, label);
			condJmp = new CondJmp(type, label, cmp);
		}

		@Override
		protected JI getJI() {
			// unused
			return null;
		}

		@Override
		public void asmGen(AsmGenBuffer ctx) {
			switch (type) {
			case long_t:
				appendIdentln(ctx, JI.lcmp);
				break;
			case double_t:
				appendIdentln(ctx, JI.dcmpg);
				break;
			case objref:
				break;
			default:
				throw typeError(type);
			}
			condJmp.asmGen(ctx);
		}
	}

	public static class IfCmp2JI extends BranchJI {

		IfCmp2JI(JVMType type, LabelJC label, CmpType cmp) {
			super(type, label);
			cType = cmp;
		}

		public final CmpType cType;

		@Override
		protected JI getJI() {
			if (type == JVMType.objref) {
				switch (cType) {
				case eq:
					return JI.if_acmpeq;
				case ne:
					return JI.if_acmpne;
				default:
					throw new RuntimeException(
							"Invalid compare type for object reference:"
									+ cType);
				}
			} else if (type == JVMType.int_t) {
				switch (cType) {
				case eq:
					return JI.if_icmpeq;
				case ge:
					return JI.if_icmpge;
				case gt:
					return JI.if_icmpgt;
				case le:
					return JI.if_icmple;
				case lt:
					return JI.if_icmplt;
				case ne:
					return JI.if_icmpne;
				default:
					return null; // can never happen (by compiler complains)
				}
			} else
				throw typeError(type);
		}

	}

}
