package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.ast.CodeGenScope;

public interface Statement extends StackASTNode {
	@Override
	public abstract ByteCodeBlock codegen(CodeGenScope scp);
}
