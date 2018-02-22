package compiler.ast.expr;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.CastJI;

public class CastExpr extends Expression {

	public final Expression expr;

	public CastExpr(Expression e, SHLType type) {
		super(type);
		expr = e;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = expr.codegen(scp);
		res.add(new CastJI(expr.type.getJVMType(), type.getJVMType()));
		return res;
	}

	@Override
	public int calcStackSize() {
		return Math.max(expr.calcStackSize(), type.stackSize());
	}

	@Override
	public String toString() {
		return "[cast " + expr + " -> " + type + "]";
	}
}
