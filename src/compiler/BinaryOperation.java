package compiler;

import compiler.ji.JasminInstruction;

public enum BinaryOperation {
	add {
		@Override
		public String getOpSymbol() {
			return "+";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
				return true;
			case boo_t:
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			if (type == SHLType.str_t)
				return OpType.complex;
			return OpType.simple;
		}
	},
	sub {
		@Override
		public String getOpSymbol() {
			return "-";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case str_t:
			case boo_t:
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	mul {
		@Override
		public String getOpSymbol() {
			return "*";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case str_t:
			case boo_t:
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	div {
		@Override
		public String getOpSymbol() {
			return "/";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case str_t:
			case boo_t:
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	mod {
		@Override
		public String getOpSymbol() {
			return "%";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case str_t:
			case boo_t:
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	pow {
		@Override
		public String getOpSymbol() {
			return "**";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
				return true;
			case str_t:
			case boo_t:
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.complex;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.flt_t;
		}

		@Override
		public SHLType requiredInputType(SHLType valType) {
			return SHLType.flt_t;
		}
	},
	or {
		@Override
		public String getOpSymbol() {
			return "||";
		}

		@Override
		public boolean supportsType(SHLType type) {
			return type == SHLType.boo_t;
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	and {
		@Override
		public String getOpSymbol() {
			return "&&";
		}

		@Override
		public boolean supportsType(SHLType type) {
			return type == SHLType.boo_t;
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	lt {
		@Override
		public String getOpSymbol() {
			return "<";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case boo_t:
				return true;
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.compare;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	le {
		@Override
		public String getOpSymbol() {
			return "<=";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case boo_t:
				return true;
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.compare;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	gt {
		@Override
		public String getOpSymbol() {
			return ">";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case boo_t:
				return true;
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.compare;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	ge {
		@Override
		public String getOpSymbol() {
			return ">=";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case boo_t:
				return true;
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.compare;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	eq {
		@Override
		public String getOpSymbol() {
			return "==";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case boo_t:
				return true;
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.compare;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	ne {
		@Override
		public String getOpSymbol() {
			return "!=";
		}

		@Override
		public boolean supportsType(SHLType type) {
			switch (type) {
			case chr_t:
			case flt_t:
			case int_t:
			case str_t:
			case boo_t:
				return true;
			case vac_t:
			default:
				return false;
			}
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.compare;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	lshift {
		@Override
		public String getOpSymbol() {
			return "<<";
		}

		@Override
		public boolean supportsType(SHLType type) {
			return type == SHLType.int_t;
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	},
	rshift {
		@Override
		public String getOpSymbol() {
			return ">>";
		}

		@Override
		public boolean supportsType(SHLType type) {
			return type == SHLType.int_t;
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	};

	public abstract String getOpSymbol();

	public abstract boolean supportsType(SHLType type);

	public abstract OpType opType(SHLType type);

	public SHLType resultType(SHLType inputType) {
		return inputType;
	}

	public SHLType requiredInputType(SHLType valType) {
		return valType;
	}

	public static JasminInstruction.CmpType getCmpType(BinaryOperation op) {
		switch (op) {
		case eq:
			return JasminInstruction.CmpType.eq;
		case ge:
			return JasminInstruction.CmpType.ge;
		case gt:
			return JasminInstruction.CmpType.gt;
		case le:
			return JasminInstruction.CmpType.le;
		case lt:
			return JasminInstruction.CmpType.lt;
		case ne:
			return JasminInstruction.CmpType.ne;
		default:
			throw new RuntimeException("invalid compare operation " + op);

		}
	}
}
