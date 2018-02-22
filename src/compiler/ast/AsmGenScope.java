package compiler.ast;

import compiler.ast.stmt.LoopStatement;

public class AsmGenScope {
	public final Program program;
	public FunctionDef currentFunction;
	public LoopStatement currentLoop;

	AsmGenScope(Program prog) {
		program = prog;
	}
}
