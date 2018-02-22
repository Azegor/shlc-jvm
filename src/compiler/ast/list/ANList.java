package compiler.ast.list;

import java.util.ArrayList;
import java.util.List;

import compiler.PrintUtils;
import compiler.ast.ASTNode;

public abstract class ANList<N> implements ASTNode {

	public final List<N> elements = new ArrayList<>();

	public void add(N n) {
		elements.add(n);
	}

	public void addAll(ANList<N> o) {
		elements.addAll(o.elements);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[\n"
				+ PrintUtils.printList(elements, true) + "\n]";
	}
}
