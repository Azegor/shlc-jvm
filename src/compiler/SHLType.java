package compiler;

import compiler.ast.expr.constant.BoolConst;
import compiler.ast.expr.constant.CharConst;
import compiler.ast.expr.constant.Constant;
import compiler.ast.expr.constant.FloatConst;
import compiler.ast.expr.constant.IntConst;
import compiler.ast.expr.constant.StringConst;

public enum SHLType {
	int_t {
		@Override
		public String toJasminType() {
			return "J";
		}

		@Override
		public JVMType getJVMType() {
			return JVMType.long_t;
		}

		@Override
		public String toString() {
			return "int";
		}

		@Override
		public boolean checkCastTo(SHLType target, boolean explicit) {
			switch (target) {
			case flt_t:
			case int_t:
				return true;
			case boo_t:
			case chr_t:
			case str_t:
				return explicit;
			case vac_t:
			default:
				return false;
			}
		}
	},
	flt_t {
		@Override
		public String toJasminType() {
			return "D";
		}

		@Override
		public JVMType getJVMType() {
			return JVMType.double_t;
		}

		@Override
		public String toString() {
			return "flt";
		}

		@Override
		public boolean checkCastTo(SHLType target, boolean explicit) {
			switch (target) {
			case flt_t:
				return true;
			case boo_t:
			case chr_t:
			case int_t:
			case str_t:
				return explicit;
			case vac_t:
			default:
				return false;
			}
		}
	},
	chr_t {
		@Override
		public String toJasminType() {
			return "C";
		}

		@Override
		public JVMType getJVMType() {
			return JVMType.char_t;
		}

		@Override
		public String toString() {
			return "chr";
		}

		@Override
		public boolean checkCastTo(SHLType target, boolean explicit) {
			switch (target) {
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case boo_t:
			case str_t:
				return explicit;
			case vac_t:
			default:
				return false;
			}
		}
	},
	boo_t {
		@Override
		public String toJasminType() {
			return "Z";
		}

		@Override
		public JVMType getJVMType() {
			return JVMType.boolean_t;
		}

		@Override
		public String toString() {
			return "boo";
		}

		@Override
		public boolean checkCastTo(SHLType target, boolean explicit) {
			switch (target) {
			case boo_t:
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case str_t:
				return explicit;
			case vac_t:
			default:
				return false;
			}
		}
	},
	str_t {
		@Override
		public String toJasminType() {
			return "Ljava/lang/String;";
		}

		@Override
		public JVMType getJVMType() {
			return JVMType.objref;
		}

		@Override
		public String toString() {
			return "str";
		}

		@Override
		public boolean checkCastTo(SHLType target, boolean explicit) {
			switch (target) {
			case str_t:
				return true;
			case boo_t:
			case chr_t:
			case flt_t:
			case int_t:
			case vac_t:
			default:
				return false;
			}
		}
	},
	vac_t {
		@Override
		public String toJasminType() {
			return "V";
		}

		@Override
		public JVMType getJVMType() {
			return JVMType.void_t;
		}

		@Override
		public String toString() {
			return "vac";
		}

		@Override
		public boolean checkCastTo(SHLType target, boolean explicit) {
			return false;
		}
	};

	public int stackSize() {
		return getJVMType().stackSize();
	}

	public static SHLType fromString(String s) {
		switch (s) {
		case "int":
			return int_t;
		case "flt":
			return flt_t;
		case "chr":
			return chr_t;
		case "boo":
			return boo_t;
		case "str":
			return str_t;
		default:
			throw new RuntimeException("Unknown type: " + s);
		}
	}

	public abstract String toJasminType();

	public abstract JVMType getJVMType();

	public abstract boolean checkCastTo(SHLType target, boolean explicit);

	public static SHLType getCommonType(SHLType t1, SHLType t2) {
		switch (t1) {
		case boo_t:
			switch (t2) {
			case boo_t:
				return boo_t;
			case chr_t:
				return chr_t;
			case flt_t:
				return flt_t;
			case int_t:
				return int_t;
			case str_t:
			case vac_t:
				return null;
			default:
				throw new RuntimeException("Unknown type " + t2);
			}
		case chr_t:
			switch (t2) {
			case boo_t:
			case chr_t:
				return chr_t;
			case flt_t:
			case int_t:
				return int_t;
			case str_t:
			case vac_t:
				return null;
			default:
				throw new RuntimeException("Unknown type " + t2);
			}
		case flt_t:
			switch (t2) {
			case boo_t:
			case chr_t:
			case flt_t:
			case int_t:
				return flt_t;
			case str_t:
			case vac_t:
				return null;
			default:
				throw new RuntimeException("Unknown type " + t2);
			}
		case int_t:
			switch (t2) {
			case boo_t:
			case chr_t:
			case int_t:
				return int_t;
			case flt_t:
				return flt_t;
			case str_t:
			case vac_t:
				return null;
			default:
				throw new RuntimeException("Unknown type " + t2);
			}
		case str_t:
			switch (t2) {
			case str_t:
				return str_t;
			case boo_t:
			case chr_t:
			case flt_t:
			case int_t:
			case vac_t:
				return null;
			default:
				throw new RuntimeException("Unknown type " + t2);
			}
		case vac_t:
			switch (t2) {
			case boo_t:
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case vac_t:
				return null;
			default:
				throw new RuntimeException("Unknown type " + t2);
			}
		default:
			throw new RuntimeException("Unknown type " + t1);
		}
	}

	public static Constant getDefaultValue(SHLType type) {
		switch (type) {
		case boo_t:
			return new BoolConst(false);
		case chr_t:
			return new CharConst('\0');
		case flt_t:
			return new FloatConst(0.0D);
		case int_t:
			return new IntConst(0L);
		case str_t:
			return new StringConst("");
		case vac_t:
		default:
			throw new RuntimeException("Cannot get constant for type vac");
		}
	}
}
