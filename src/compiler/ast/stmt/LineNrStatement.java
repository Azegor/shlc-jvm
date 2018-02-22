package compiler.ast.stmt;

import compiler.ji.UtilityJC;

public abstract class LineNrStatement implements Statement {

	public final int lineNr;

	public LineNrStatement(int nr) {
		lineNr = nr;
	}

	protected UtilityJC.LineJC makeLineNrJC() {
		return new UtilityJC.LineJC(lineNr);
	}

}
