package compiler;

public enum AssignOperation {

	// assigment
	assign {
		@Override
		public String getOpSymbol() {
			return "=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return null;
		}
	},
	add_assign {
		@Override
		public String getOpSymbol() {
			return "+=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.add;
		}
	},
	sub_assign {
		@Override
		public String getOpSymbol() {
			return "-=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.sub;
		}
	},
	mul_assign {
		@Override
		public String getOpSymbol() {
			return "*=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.mul;
		}
	},
	div_assign {
		@Override
		public String getOpSymbol() {
			return "/=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.div;
		}
	},
	mod_assign {
		@Override
		public String getOpSymbol() {
			return "%=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.mod;
		}
	},
	pow_assign {
		@Override
		public String getOpSymbol() {
			return "**=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.pow;
		}
	},
	lshift_assign {
		@Override
		public String getOpSymbol() {
			return "<<=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.lshift;
		}
	},
	rshift_assign {
		@Override
		public String getOpSymbol() {
			return ">>=";
		}

		@Override
		public BinaryOperation getBaseOp() {
			return BinaryOperation.rshift;
		}
	};

	public abstract String getOpSymbol();

	public abstract BinaryOperation getBaseOp();
}
