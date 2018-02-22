package compiler.ast.expr;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ast.stmt.StackASTNode;

public abstract class Expression implements StackASTNode {
	public final SHLType type;

	public Expression(SHLType type) {
		this.type = type;
	}

	@Override
	public abstract ByteCodeBlock codegen(CodeGenScope scp);
}
