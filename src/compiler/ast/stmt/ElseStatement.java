package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.ast.CodeGenScope;

public class ElseStatement implements Statement {

	public final ScopeStatement body;

	public ElseStatement(ScopeStatement b) {
		body = b;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		return body.codegen(scp);
	}

	@Override
	public int calcStackSize() {
		return body.calcStackSize();
	}

	@Override
	public String toString() {
		return "else {\n" + body + "\n}\n";
	}
}
