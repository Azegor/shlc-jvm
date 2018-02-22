package compiler.ast;

import java.util.List;

import compiler.ByteCodeBlock;
import compiler.SHLType;
import compiler.ast.list.FunctionParamList;
import compiler.ji.JasminComponent;

// XXX: unused class!
public class NativeFunction implements ASTNode {

	public final String name;
	public final List<SHLType> params;
	public final SHLType returnType;

	public NativeFunction(String n, FunctionParamList paramTypes,
			SHLType retType) {
		name = n;
		params = paramTypes.getParamTypes();
		returnType = retType;
	}

	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		// unused!!!
		return new ByteCodeBlock();
	}

}
