package compiler.ast.stmt;

import compiler.ji.LabelJC;

public interface LoopStatement extends Statement {
	public abstract LabelJC getContinueLabel();
	public abstract LabelJC getBreakLabel();
}
