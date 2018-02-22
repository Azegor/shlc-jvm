package compiler.ast.list;

import compiler.ByteCodeBlock;
import compiler.ast.CodeGenScope;
import compiler.ast.stmt.ElifStatement;
import compiler.ast.stmt.Statement;
import compiler.ji.LabelJC;

public class ElifStatementList extends StackANList<ElifStatement> implements
		Statement {

	private LabelJC endLabel = null;

	public void setEndLabel(LabelJC label) {
		endLabel = label;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();

		for (ElifStatement s : elements) {
			s.setEndLabel(endLabel);
			res.add(s.codegen(scp));
		}

		return res;
	}
}
