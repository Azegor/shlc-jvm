package compiler.ast;

import compiler.ast.stmt.LoopStatement;

public class CodeGenScope {
	public final Program program;
	public FunctionDef currentFunction;
	public LoopStatement currentLoop;

	CodeGenScope(Program prog) {
		program = prog;
	}
}
