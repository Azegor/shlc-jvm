package compiler.ast.expr.constant;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.LoadConstantJI;

public class CharConst extends Constant {

	public final char value;

	public CharConst(char value) {
		super(SHLType.chr_t);
		this.value = value;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		return new ByteCodeBlock(new LoadConstantJI(value));
	}

	@Override
	public String toString() {
		return "'" + (char) value + "'";
	}

}
