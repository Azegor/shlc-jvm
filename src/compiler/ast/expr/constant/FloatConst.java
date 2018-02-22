package compiler.ast.expr.constant;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.LoadConstantJI;

public class FloatConst extends Constant {

	public final double value;

	public FloatConst(double value) {
		super(SHLType.flt_t);
		this.value = value;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		return new ByteCodeBlock(new LoadConstantJI(value));
	}

	@Override
	public String toString() {
		return value + "#int";
	}

}
