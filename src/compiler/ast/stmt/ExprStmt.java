package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ji.StackJI;
import compiler.ji.UtilityJC;

public class ExprStmt extends LineNrStatement {

	public final Expression expr;

	public ExprStmt(int lineNr, Expression e) {
		super(lineNr);
		expr = e;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock(makeLineNrJC());
		res.add(expr.codegen(scp));
		if (expr.type != SHLType.vac_t) // void function call
			res.add(new StackJI.Pop(expr.type.getJVMType()));
		res.add(new UtilityJC.CommentLine("---"));
		return res;
	}

	@Override
	public String toString() {
		return "ExprStmt [" + expr.toString() + "]";
	}

	@Override
	public int calcStackSize() {
		return expr.calcStackSize();
	}

}
