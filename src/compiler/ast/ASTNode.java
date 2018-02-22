package compiler.ast;

import compiler.ji.JasminComponent;

public interface ASTNode {
	public abstract JasminComponent codegen(CodeGenScope scp);
}
