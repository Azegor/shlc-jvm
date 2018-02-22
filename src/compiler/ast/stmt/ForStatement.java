package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.JVMType;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ji.BranchJI;
import compiler.ji.JasminInstruction;
import compiler.ji.LabelJC;
import compiler.ji.UtilityJC;

public class ForStatement implements LoopStatement {

	private Statement init;
	private Expression cond;
	private Statement incr;
	private ScopeStatement body;
	private LabelJC loopStart = new LabelJC("for_loop_body_start");
	private LabelJC loopEnd = new LabelJC("for_loop_body_end");

	public ForStatement() {
	}

	public void setContent(Statement init, Expression cond, Statement incr,
			ScopeStatement body) {
		this.init = init;
		this.cond = cond;
		this.incr = incr;
		this.body = body;
	}

	public ForStatement(Statement init, Expression cond, Statement incr,
			ScopeStatement body) {
		setContent(init, cond, incr, body);
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

		res.add(init.codegen(scp));
		res.add(loopStart);
		res.add(cond.codegen(scp));
		res.add(new BranchJI.CondJmp(JVMType.int_t, loopEnd,
				JasminInstruction.CmpType.eq));
		res.add(body.codegen(scp));
		res.add(incr.codegen(scp));
		res.add(new BranchJI.GotoJI(loopStart));
		res.add(loopEnd);
		res.add(new UtilityJC.BlankLine());

		return res;
	}

	@Override
	public int calcStackSize() {
		int res1 = Math.max(init.calcStackSize(), cond.calcStackSize());
		int res2 = Math.max(incr.calcStackSize(), body.calcStackSize());
		return Math.max(res1, res2);
	}

}
