package compiler.ji;

import compiler.JVMType;

public abstract class LocalVarJI extends JasminInstruction {

	LocalVarJI(JVMType t, int nr) {
		super(t);
		this.nr = nr;
	}

	public final int nr;
	protected boolean isShortForm = false;

	@Override
	protected void generate(AsmGenBuffer ctx) {
		instruction = getJI();
		if (!isShortForm)
			parameters.add(nr);
	}

	protected abstract JI getJI();

	// Implementations:

	public static class LoadVarJI extends LocalVarJI {
		public LoadVarJI(JVMType t, int nr) {
			super(t, nr);
		}

		@Override
		protected JI getJI() {
			switch (type) {
			case long_t:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.lload_0;
					case 1:
						return JI.lload_1;
					case 2:
						return JI.lload_2;
					case 3:
						return JI.lload_3;
					}
				}
				return JI.lload;
			case double_t:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.dload_0;
					case 1:
						return JI.dload_1;
					case 2:
						return JI.dload_2;
					case 3:
						return JI.dload_3;
					}
				}
				return JI.dload;
			case boolean_t:
			case char_t:
			case byte_t:
			case int_t:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.iload_0;
					case 1:
						return JI.iload_1;
					case 2:
						return JI.iload_2;
					case 3:
						return JI.iload_3;
					}
				}
				return JI.iload;
			case objref:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.aload_0;
					case 1:
						return JI.aload_1;
					case 2:
						return JI.aload_2;
					case 3:
						return JI.aload_3;
					}
				}
				return JI.aload;
			default:
				throw typeError(type);
			}
		}
	}

	public static class StoreVarJI extends LocalVarJI {
		public StoreVarJI(JVMType t, int nr) {
			super(t, nr);
		}

		@Override
		protected JI getJI() {
			switch (type) {
			case long_t:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.lstore_0;
					case 1:
						return JI.lstore_1;
					case 2:
						return JI.lstore_2;
					case 3:
						return JI.lstore_3;
					}
				}
				return JI.lstore;
			case double_t:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.dstore_0;
					case 1:
						return JI.dstore_1;
					case 2:
						return JI.dstore_2;
					case 3:
						return JI.dstore_3;
					}
				}
				return JI.dstore;
			case boolean_t:
			case char_t:
			case byte_t:
			case int_t:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.istore_0;
					case 1:
						return JI.istore_1;
					case 2:
						return JI.istore_2;
					case 3:
						return JI.istore_3;
					}
				}
				return JI.istore;
			case objref:
				if (nr <= 3) {
					isShortForm = true;
					switch (nr) {
					case 0:
						return JI.astore_0;
					case 1:
						return JI.astore_1;
					case 2:
						return JI.astore_2;
					case 3:
						return JI.astore_3;
					}
				}
				return JI.astore;
			default:
				throw typeError(type);
			}
		}
	}
}
