package compiler.ast.list;

import javax.naming.OperationNotSupportedException;

import compiler.ast.CodeGenScope;
import compiler.ast.InitializedIdentifier;
import compiler.ji.JasminComponent;

public class InitializedIdentifierList extends ANList<InitializedIdentifier> {
	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		throw new RuntimeException(new OperationNotSupportedException());
	}
}
