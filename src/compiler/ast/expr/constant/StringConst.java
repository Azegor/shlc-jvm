package compiler.ast.expr.constant;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.LoadConstantJI;

public class StringConst extends Constant {

	public final String value;

	public StringConst(String value) {
		super(SHLType.str_t);
		this.value = value;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		return new ByteCodeBlock(new LoadConstantJI(value));
	}

	@Override
	public String toString() {
		return "\"" + value + "\"";
	}

}
