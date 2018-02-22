package compiler.ast;

import javax.naming.OperationNotSupportedException;

import compiler.ast.expr.Expression;
import compiler.ji.JasminComponent;

public class InitializedIdentifier implements ASTNode {

	public final String name;
	public final Expression value;

	public InitializedIdentifier(String n, Expression val) {
		name = n;
		value = val;
	}
	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		throw new RuntimeException(new OperationNotSupportedException());
	}

}
