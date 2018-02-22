package compiler.ast.expr;

import compiler.ByteCodeBlock;
import compiler.OpType;
import compiler.SHLType;
import compiler.UnaryOperation;
import compiler.ast.CodeGenScope;
import compiler.ji.ComplexUnaryOperationJC;
import compiler.ji.SimpleUnaryOperationJI;

public class UnaryExpression extends Expression {

	Expression operand;
	UnaryOperation op;
	public final SHLType inputType;

	public UnaryExpression(Expression operand, UnaryOperation op, SHLType type) {
		super(op.resultType(type));
		inputType = type;
		this.operand = operand;
		this.op = op;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();
		SHLType reqInputType = op.requiredInputType(inputType);
		if (reqInputType != inputType) {
			operand = new CastExpr(operand, reqInputType);
		}
		res.add(operand.codegen(scp));

		if (op.opType(inputType) == OpType.simple) {
			res.add(new SimpleUnaryOperationJI(inputType, op));
		} else if (op.opType(inputType) == OpType.complex) {
			res.add(new ComplexUnaryOperationJC(inputType, op));
		} else {
			throw new RuntimeException(
					"unsupported operation type for unary operation");
		}
		return res;
	}

	@Override
	public int calcStackSize() {
		return operand.calcStackSize();
	}

}
