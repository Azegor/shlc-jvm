package compiler.ast.expr;

import compiler.ByteCodeBlock;
import compiler.VariableScope;
import compiler.ast.CodeGenScope;
import compiler.ji.LocalVarJI;

public class VariableExpression extends Expression {

	public final VariableScope.ScopeEntry var;

	public VariableExpression(VariableScope.ScopeEntry v) {
		super(v.type);
		var = v;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		return new ByteCodeBlock(new LocalVarJI.LoadVarJI(
				var.type.getJVMType(), var.stackVarNr));
	}

	@Override
	public int calcStackSize() {
		return type.stackSize();
	}

	@Override
	public String toString() {
		return "var[" + var + "]";
	}

}
