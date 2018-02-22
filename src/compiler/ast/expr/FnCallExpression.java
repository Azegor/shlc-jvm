package compiler.ast.expr;

import compiler.ByteCodeBlock;
import compiler.FunctionTable;
import compiler.PrintUtils;
import compiler.ast.CodeGenScope;
import compiler.ast.list.ExprList;
import compiler.ji.FunctionCallJI;

public class FnCallExpression extends Expression {

	public final FunctionTable.Entry function;
	public final ExprList params;

	public FnCallExpression(FunctionTable.Entry fn, ExprList fnParams) {
		super(fn.returnType);
		function = fn;
		params = fnParams;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();
		for (Expression p : params.elements)
			res.add(p.codegen(scp));

		res.add(new FunctionCallJI(function.fullFunctionName(),
				function.returnType.getJVMType()));
		return res;
	}

	@Override
	public String toString() {
		return "call " + function.name + "(" + PrintUtils.printList(params)
				+ ") -> " + function.returnType;
	}

	@Override
	public int calcStackSize() {
		return Math.max(params.calcStackSize(), type.stackSize());
	}

}
