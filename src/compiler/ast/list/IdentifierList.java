package compiler.ast.list;

import javax.naming.OperationNotSupportedException;

import compiler.ast.CodeGenScope;
import compiler.ji.JasminComponent;


public class IdentifierList extends ANList<String> {

	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		throw new RuntimeException(new OperationNotSupportedException());
	}

}
