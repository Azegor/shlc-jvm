package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.JVMType;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ast.list.ElifStatementList;
import compiler.ji.BranchJI;
import compiler.ji.JasminInstruction;
import compiler.ji.LabelJC;
import compiler.ji.UtilityJC;

public class IfStatement implements Statement {

	public final Expression cond;
	public final ScopeStatement body;

	public final ElifStatementList elifs;
	public final ElseStatement elseStmt;

	public IfStatement(Expression c, ScopeStatement b,
			ElifStatementList elifList, ElseStatement else_) {
		cond = c;
		body = b;
		elifs = elifList;
		elseStmt = else_;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock(new UtilityJC.CommentLine(
				"--- if"));
		LabelJC elseLabel = new LabelJC("if_else");
		LabelJC endLabel = new LabelJC("if_end");
		res.add(cond.codegen(scp));
		res.add(new BranchJI.CondJmp(JVMType.int_t, elseLabel,
				JasminInstruction.CmpType.eq));
		res.add(body.codegen(scp));
		res.add(new BranchJI.GotoJI(endLabel));
		res.add(elseLabel);
		elifs.setEndLabel(endLabel);
		res.add(elifs.codegen(scp));
		if (elseStmt != null)
			res.add(elseStmt.codegen(scp));
		res.add(endLabel);
		res.add(new UtilityJC.CommentLine("--- endif"));
		return res;
	}

	@Override
	public int calcStackSize() {
		int res = Math.max(cond.calcStackSize(), body.calcStackSize());
		res = Math.max(res, elifs.calcStackSize());
		if (elseStmt != null)
			res = Math.max(res, elseStmt.calcStackSize());
		return res;
	}

	@Override
	public String toString() {
		StringBuffer res = new StringBuffer();
		res.append("if (" + cond + ") {\n");
		res.append(body);
		res.append("\n}\n");
		res.append(elifs);
		if (elseStmt != null)
			res.append(elseStmt);
		return res.toString();
	}
}
