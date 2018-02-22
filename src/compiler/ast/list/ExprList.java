package compiler.ast.list;

import javax.naming.OperationNotSupportedException;

import compiler.ast.CodeGenScope;
import compiler.ast.expr.Expression;
import compiler.ji.JasminComponent;

public class ExprList extends StackANList<Expression> {

	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		throw new RuntimeException(new OperationNotSupportedException());
	}

}
