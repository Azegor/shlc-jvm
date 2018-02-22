package compiler.ast.list;

import compiler.ByteCodeBlock;
import compiler.ast.CodeGenScope;
import compiler.ast.stmt.Statement;


public class StatementList extends StackANList<Statement> implements Statement {

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();
		for (Statement s : elements)
			res.add(s.codegen(scp));
		return res;
	}

}
