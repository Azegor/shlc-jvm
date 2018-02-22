package compiler.ast.list;

import compiler.ast.stmt.StackASTNode;

public abstract class StackANList<N extends StackASTNode> extends ANList<N>
		implements StackASTNode {
	@Override
	public int calcStackSize() {
		int res = 0;
		for (N s : elements) {
			res = Math.max(res, s.calcStackSize());
		}
		return res;
	}
}
