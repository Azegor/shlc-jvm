package compiler.ast.list;

import javax.naming.OperationNotSupportedException;

import compiler.ast.CodeGenScope;
import compiler.ast.FunctionDef;
import compiler.ji.JasminComponent;


public class FunctionDefList extends ANList<FunctionDef> {

	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		throw new RuntimeException(new OperationNotSupportedException());
	}
}
