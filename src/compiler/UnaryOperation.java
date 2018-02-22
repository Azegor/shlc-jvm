package compiler;

public enum UnaryOperation {
	not {
		@Override
		public SHLType requiredInputType(SHLType valType) {
			return SHLType.boo_t;
		}

		@Override
		public OpType opType(SHLType type) {
			return OpType.complex;
		}

		@Override
		public SHLType resultType(SHLType inputType) {
			return SHLType.boo_t;
		}
	},
	neg {
		@Override
		public OpType opType(SHLType type) {
			return OpType.simple;
		}
	};

	public SHLType requiredInputType(SHLType valType) {
		return valType;
	}

	public abstract OpType opType(SHLType type);

	public SHLType resultType(SHLType inputType) {
		return inputType;
	}
}
