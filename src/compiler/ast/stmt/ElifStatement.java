package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.JVMType;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ji.BranchJI;
import compiler.ji.JasminInstruction;
import compiler.ji.LabelJC;

public class ElifStatement implements Statement {

	public final Expression cond;
	public final ScopeStatement body;
	private LabelJC endLabel = null;

	public ElifStatement(Expression c, ScopeStatement b) {
		cond = c;
		body = b;
	}

	public void setEndLabel(LabelJC label) {
		endLabel = label;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();

		LabelJC falseLabel = new LabelJC("elif_false");
		res.add(cond.codegen(scp));
		res.add(new BranchJI.CondJmp(JVMType.int_t, falseLabel,
				JasminInstruction.CmpType.eq));
		res.add(body.codegen(scp));
		res.add(new BranchJI.GotoJI(endLabel));
		res.add(falseLabel);

		return res;
	}

	@Override
	public int calcStackSize() {
		return Math.max(cond.calcStackSize(), body.calcStackSize());
	}

	@Override
	public String toString() {
		return "elif (" + cond + ") {\n" + body + "\n}\n";
	}
}
