package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.JVMType;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ji.StackJI;

public class ReturnStatement implements Statement {

	public final Expression value;

	public ReturnStatement(Expression val) {
		// TODO: type check with function return type!
		value = val;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();
		if (value != null) { // non-void
			res.add(value.codegen(scp));
			res.add(new StackJI.ReturnJI(value.type.getJVMType()));
		} else {
			res.add(new StackJI.ReturnJI(JVMType.void_t));
		}
		return res;
	}

	@Override
	public int calcStackSize() {
		if (value != null)
			return value.calcStackSize();
		return 0;
	}

	@Override
	public String toString() {
		return "ret " + value;
	}

}
