package compiler;

public enum JVMType {
	none {
		@Override
		public int stackSize() {
			return 0;
		}

		@Override
		public JVMType getEffectiveType() {
			return none;
		}
	},
	objref {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return objref;
		}
	} /* incl string */,
	void_t {
		@Override
		public int stackSize() {
			return 0;
		}

		@Override
		public JVMType getEffectiveType() {
			return void_t;
		}
	},
	byte_t {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return int_t;
		}
	},
	short_t {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return int_t;
		}
	},
	int_t {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return int_t;
		}
	},
	long_t {
		@Override
		public int stackSize() {
			return 2;
		}

		@Override
		public JVMType getEffectiveType() {
			return long_t;
		}
	},
	float_t {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return float_t;
		}
	},
	double_t {
		@Override
		public int stackSize() {
			return 2;
		}

		@Override
		public JVMType getEffectiveType() {
			return double_t;
		}
	},
	boolean_t {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return int_t;
		}
	},
	char_t {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return int_t;
		}
	},
	obj_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return obj_arr;
		}
	},
	byte_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return byte_arr;
		}
	},
	short_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return short_arr;
		}
	},
	int_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return int_arr;
		}
	},
	long_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return long_arr;
		}
	},
	float_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return float_arr;
		}
	},
	double_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return double_arr;
		}
	},
	boolean_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return boolean_arr;
		}
	},
	char_arr {
		@Override
		public int stackSize() {
			return 1;
		}

		@Override
		public JVMType getEffectiveType() {
			return char_arr;
		}
	};

	public abstract int stackSize();


	public abstract JVMType getEffectiveType();
}
