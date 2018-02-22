package compiler.ji;

import compiler.JVMType;
import compiler.SHLType;

public class LoadConstantJI extends JasminInstruction {

	public final String valueString;
	public final Object val;
	public final SHLType constType;

	private enum LoadType {
		ldc, sipush, bipush, xconst;
	}

	private LoadType loadType = LoadType.ldc;

	private void makeIntLoad(int value) {
		if (-32768 <= value && value <= 32767) {
			if (-128 <= value && value <= 127) {
				if (-1 <= value && value <= 5) {
					loadType = LoadType.xconst;
					switch (value) {
					case -1:
						instruction = JI.iconst_m1;
						break;
					case 0:
						instruction = JI.iconst_0;
						break;
					case 1:
						instruction = JI.iconst_1;
						break;
					case 2:
						instruction = JI.iconst_2;
						break;
					case 3:
						instruction = JI.iconst_3;
						break;
					case 4:
						instruction = JI.iconst_4;
						break;
					case 5:
						instruction = JI.iconst_5;
						break;
					}
				} else {
					loadType = LoadType.bipush;
				}
			} else {
				loadType = LoadType.sipush;
			}
		} else
			loadType = LoadType.ldc;
	}

	private void makeLongLoad(long value) {
		if (value == 0L) {
			loadType = LoadType.xconst;
			instruction = JI.lconst_0;
		} else if (value == 1L) {
			loadType = LoadType.xconst;
			instruction = JI.lconst_1;
		} else
			loadType = LoadType.ldc;
	}

	private void makeDoubleLoad(double value) {
		if (value == 0.0) {
			loadType = LoadType.xconst;
			instruction = JI.lconst_0;
		} else if (value == 1.0) {
			loadType = LoadType.xconst;
			instruction = JI.lconst_1;
		} else
			loadType = LoadType.ldc;
	}

	public LoadConstantJI(String value) {
		super(JVMType.objref);
		val = value;
		valueString = '"' + value + '"';
		constType = SHLType.str_t;
	}

	public LoadConstantJI(long value) {
		super(JVMType.long_t);
		val = value;
		valueString = Long.toString(value);
		constType = SHLType.int_t;
		makeLongLoad(value);
	}

	public LoadConstantJI(double value) {
		super(JVMType.double_t);
		val = value;
		valueString = Double.toString(value);
		constType = SHLType.flt_t;
		makeDoubleLoad(value);
	}

	public LoadConstantJI(boolean value) {
		super(JVMType.boolean_t);
		val = value;
		valueString = value ? "1" : "0"; // not necessary :D
		constType = SHLType.boo_t;
		makeIntLoad(value ? 1 : 0);
	}

	public LoadConstantJI(char value) {
		super(JVMType.char_t);
		val = value;
		valueString = Integer.toString(value);
		constType = SHLType.chr_t;
		makeIntLoad(value);
	}

	@Override
	protected void generate(AsmGenBuffer ctx) {
		if (type.stackSize() == 2) {
			instruction = JI.ldc2_w;
		} else {
			switch (loadType) {
			case ldc:
				instruction = JI.ldc;
				break;
			case sipush:
				instruction = JI.sipush;
				break;
			case bipush:
				instruction = JI.bipush;
				break;
			case xconst:
				return; // instruction already set by constructor

			}
		}
		parameters.add(valueString);
	}
}
