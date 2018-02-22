package compiler.ast.stmt;

import compiler.ast.ASTNode;

public interface StackASTNode extends ASTNode {
	public abstract int calcStackSize();
}
