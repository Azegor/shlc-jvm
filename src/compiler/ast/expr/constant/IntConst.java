package compiler.ast.expr.constant;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.LoadConstantJI;

public class IntConst extends Constant {

	public final long value;

	public IntConst(long value) {
		super(SHLType.int_t);
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
