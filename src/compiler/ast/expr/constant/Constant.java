package compiler.ast.expr.constant;

import compiler.SHLType;
import compiler.ast.expr.Expression;

public abstract class Constant extends Expression {
	public Constant(SHLType type) {
		super(type);
	}

	@Override
	public int calcStackSize() {
		return type.stackSize();
	}
}
