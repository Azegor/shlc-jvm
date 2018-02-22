package compiler.ast.expr;

import compiler.BinaryOperation;
import compiler.ByteCodeBlock;
import compiler.OpType;
import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ji.CompareJC;
import compiler.ji.ComplexBinaryOperationJC;
import compiler.ji.SimpleBinaryOperationJI;

public class BinaryExpression extends Expression {

	private Expression lhs, rhs;
	public final BinaryOperation op;
	public final SHLType inputType;

	public static BinaryExpression createWithCast(Expression lhs,
			Expression rhs, BinaryOperation op) {
		if (lhs.type == rhs.type)
			return new BinaryExpression(lhs, rhs, op, lhs.type);
		else {
			SHLType resType = SHLType.getCommonType(lhs.type, rhs.type);
			if (lhs.type != resType)
				lhs = new CastExpr(lhs, resType);
			if (rhs.type != resType)
				rhs = new CastExpr(rhs, resType);
			return new BinaryExpression(lhs, rhs, op, resType);
		}
	}

	public BinaryExpression(Expression l, Expression r, BinaryOperation o,
			SHLType type) {
		super(o.resultType(type));
		inputType = type;
		lhs = l;
		rhs = r;
		op = o;
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock();
		SHLType reqInputType = op.requiredInputType(inputType);
		if (reqInputType != inputType) {
			lhs = new CastExpr(lhs, reqInputType);
			rhs = new CastExpr(rhs, reqInputType);
		}
		res.add(lhs.codegen(scp));
		res.add(rhs.codegen(scp));

		if (op.opType(inputType) == OpType.simple) {
			res.add(new SimpleBinaryOperationJI(inputType, op));
		} else if (op.opType(inputType) == OpType.compare) {
			res.add(new CompareJC(inputType, op));
		} else {
			res.add(new ComplexBinaryOperationJC(inputType, op));
		}
		return res;
	}

	@Override
	public int calcStackSize() {
		return Math.max(lhs.calcStackSize(),
				rhs.calcStackSize() + lhs.type.stackSize());
	}

	@Override
	public String toString() {
		return "[" + lhs + " " + op.getOpSymbol() + " " + rhs + "]";
	}

}
