package compiler.ast.expr.constant;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.LoadConstantJI;

public class BoolConst extends Constant {

	public final boolean value;

	public BoolConst(boolean value) {
		super(SHLType.boo_t);
		this.value = value;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		return new ByteCodeBlock(new LoadConstantJI(value));
	}

	@Override
	public String toString() {
		return value ? "true" : "false";
	}

}
