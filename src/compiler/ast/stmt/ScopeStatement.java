package compiler.ast.stmt;

import java.util.List;

import compiler.ByteCodeBlock;
import compiler.VariableScope;
import compiler.ast.CodeGenScope;
import compiler.ast.list.StatementList;
import compiler.ji.LabelJC;
import compiler.ji.UtilityJC;

public class ScopeStatement implements Statement {

	public final VariableScope.ScopeFrame scopeFrame;
	public final Statement body;
	public final String scopeName;

	public ScopeStatement(VariableScope.ScopeFrame scp, Statement body) {
		this(scp, body, "");
	}

	public ScopeStatement(VariableScope.ScopeFrame scp, Statement body,
			String name) {
		scopeFrame = scp;
		this.body = body;
		scopeName = name;
	}

	@Override
	public int calcStackSize() {
		return body.calcStackSize();
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();
		LabelJC startLabel = new LabelJC(scopeName + "_scope_start");
		LabelJC endLabel = new LabelJC(scopeName + "_scope_end");
		res.add(startLabel);

		for (VariableScope.ScopeEntry var : scopeFrame.entries.values()) {
			res.add(new UtilityJC.ScopeVariableJC(var, startLabel, endLabel));
		}

		res.add(body.codegen(scp));
		res.add(endLabel);
		return res;
	}

	public List<Statement> getStmtList() {
		if (body instanceof ScopeStatement)
			return ((ScopeStatement) body).getStmtList();
		if (body instanceof StatementList)
			return ((StatementList) body).elements;
		throw new RuntimeException(
				"cannot get statement list of scope statement");
	}

}
