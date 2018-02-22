package compiler.ast.stmt;

import compiler.ByteCodeBlock;
import compiler.ast.CodeGenScope;
import compiler.ji.BranchJI;
import compiler.ji.LabelJC;

public class ContinueStatement extends LineNrStatement {

	public final LabelJC jmpLabel;

	public ContinueStatement(int lineNr, LabelJC label) {
		super(lineNr);
		jmpLabel = label;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock(makeLineNrJC());
		res.add(new BranchJI.GotoJI(jmpLabel));
		return res;
	}

	@Override
	public int calcStackSize() {
		return 0;
	}

}
