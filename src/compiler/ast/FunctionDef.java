package compiler.ast;

import java.util.ArrayList;
import java.util.List;

import compiler.ByteCodeBlock;
import compiler.PrintUtils;
import compiler.SHLType;
import compiler.VariableScope;
import compiler.ast.list.FunctionParamList;
import compiler.ast.stmt.ReturnStatement;
import compiler.ast.stmt.ScopeStatement;
import compiler.ast.stmt.Statement;
import compiler.ji.FunctionDefJC;

public class FunctionDef implements ASTNode {
	public static class FnParam {
		public final String name;
		public final SHLType type;

		public FnParam(String n, SHLType t) {
			name = n;
			type = t;
		}

		@Override
		public String toString() {
			return type + " " + name;
		}
	}

	// -----

	private String name;
	private SHLType retType;
	private FunctionParamList params;
	private ScopeStatement body;
	private VariableScope variableScope;

	public FunctionDef(String name, SHLType retType, FunctionParamList parms,
			ScopeStatement body, VariableScope varScope) {
		this.name = name;
		this.retType = retType;
		this.params = parms;
		this.body = body;
		this.variableScope = varScope;
	}

	@Override
	public FunctionDefJC codegen(CodeGenScope scp) {
		List<SHLType> paramTypes = new ArrayList<>();
		for (FnParam p : params.elements)
			paramTypes.add(p.type);

		ByteCodeBlock fnBody = new ByteCodeBlock();
		boolean hasReturn = false;
		// FIXME: doesn't check nested scopes!
		for (Statement stmt : body.getStmtList()) {
			if (stmt.getClass().equals(ReturnStatement.class)) {
				ReturnStatement ret = (ReturnStatement) stmt;
				if (ret.value.type != retType)
					throw new RuntimeException("Wrong return type "
							+ ret.value.type
							+ " for function with return type " + retType);
				hasReturn = true;
			}
			// fnBody.add(stmt.codegen(scp));
		}

		if (retType == SHLType.vac_t) // auto return at method end
			body.getStmtList().add(new ReturnStatement(null));
		else if (!hasReturn)
			throw new RuntimeException("Missing return statement in function "
					+ name);

		fnBody.add(body.codegen(scp));

		int stack_limit = body.calcStackSize();

		int locals_limit = variableScope.calcStackSize();

		return new FunctionDefJC(name, retType, paramTypes, fnBody,
				stack_limit, locals_limit);
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();

		buf.append("Function " + name + "(");
		buf.append(PrintUtils.printList(params));
		buf.append(") -> " + retType + " {\n");
		buf.append(PrintUtils.printList(body.getStmtList(), true));
		buf.append("\n}");

		return buf.toString();
	}

}
