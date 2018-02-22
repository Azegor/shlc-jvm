package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.JVMType;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ji.BranchJI;
import compiler.ji.JasminInstruction;
import compiler.ji.LabelJC;
import compiler.ji.UtilityJC;

public class WhileStatement implements LoopStatement {

	private Expression cond;
	private ScopeStatement body;
	private LabelJC loopStart = new LabelJC("whl_loop_body_start");
	private LabelJC loopEnd = new LabelJC("whl_loop_body_end");

	public WhileStatement() {
	}

	public void setContent(Expression c, ScopeStatement b) {
		cond = c;
		body = b;
	}

	public WhileStatement(Expression c, ScopeStatement b) {
		setContent(cond, body);
	}

	@Override
	public LabelJC getContinueLabel() {
		return loopStart;
	}

	@Override
	public LabelJC getBreakLabel() {
		return loopEnd;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();

		res.add(loopStart);
		res.add(cond.codegen(scp));
		res.add(new BranchJI.CondJmp(JVMType.int_t, loopEnd,
				JasminInstruction.CmpType.eq));
		res.add(body.codegen(scp));
		res.add(new BranchJI.GotoJI(loopStart));
		res.add(loopEnd);
		res.add(new UtilityJC.BlankLine());

		return res;
	}

	@Override
	public int calcStackSize() {
		return Math.max(cond.calcStackSize(), body.calcStackSize());
	}

	@Override
	public String toString() {
		return "while (" + cond + ") {\n" + body + "\n}\n";
	}
}
