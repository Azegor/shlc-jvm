package compiler.ast.stmt;

import compiler.AssignOperation;
import compiler.ByteCodeBlock;
import compiler.CompileException;
import compiler.VariableScope;
import compiler.ast.CodeGenScope;
import compiler.ast.expr.BinaryExpression;
import compiler.ast.expr.CastExpr;
import compiler.ast.expr.Expression;
import compiler.ast.expr.VariableExpression;
import compiler.ji.LocalVarJI;

public class AssignmentExpr extends LineNrStatement {

	VariableScope.ScopeEntry variable;
	AssignOperation assignmentOp;
	Expression rhs;

	public AssignmentExpr(int lineNr, VariableScope.ScopeEntry var,
			AssignOperation op,
			Expression val) {
		super(lineNr);
		variable = var;
		assignmentOp = op;
		rhs = val;
		if (variable.type != rhs.type) {
			if (rhs.type.checkCastTo(variable.type, false)) {
				rhs = new CastExpr(rhs, variable.type);
			} else {
				throw new CompileException("incompatible assignment types: "
						+ variable.type + " and " + rhs.type
						+ ", no implicit cast possible", lineNr);
			}
		}
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock(makeLineNrJC());
		if (assignmentOp == AssignOperation.assign) {
			res.add(rhs.codegen(scp));
			res.add(new LocalVarJI.StoreVarJI(variable.type.getJVMType(),
					variable.stackVarNr));
		} else {
			res.add(new BinaryExpression(new VariableExpression(variable), rhs,
					assignmentOp.getBaseOp(), rhs.type).codegen(scp));
			res.add(new LocalVarJI.StoreVarJI(variable.type.getJVMType(),
					variable.stackVarNr));
		}
		return res;
	}

	@Override
	public String toString() {
		return "assign " + variable.name + "#" + variable.type + " "
				+ assignmentOp.getOpSymbol() + " " + rhs.toString();
	}

	@Override
	public int calcStackSize() {
		if (assignmentOp == AssignOperation.assign)
			return rhs.calcStackSize();
		else
			return rhs.calcStackSize() + variable.type.stackSize();
	}

}
