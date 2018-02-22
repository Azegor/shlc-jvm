package compiler.ast.stmt;

import java.util.ArrayList;
import java.util.List;

import compiler.AssignOperation;
import compiler.ByteCodeBlock;
import compiler.CompileException;
import compiler.PrintUtils;
import compiler.SHLType;
import compiler.VariableScope;
import compiler.ast.CodeGenScope;
import compiler.ast.InitializedIdentifier;
import compiler.ast.expr.Expression;
import compiler.ast.list.InitializedIdentifierList;

public class InitializedVarList extends VarDeclarationList {

	public static class InitializedVar {
		public final VariableScope.ScopeEntry var;
		public final Expression val;

		public InitializedVar(VariableScope.ScopeEntry v, Expression e) {
			var = v;
			val = e;
		}

		@Override
		public String toString() {
			return var + " = " + val;
		}
	}

	public final InitializedIdentifierList idents;
	public final List<InitializedVar> variables = new ArrayList<>();
	public final SHLType type;

	public InitializedVarList(int lineNr, InitializedIdentifierList vars,
			VariableScope scp) {
		super(lineNr);
		idents = vars;
		SHLType type = null;
		for (InitializedIdentifier v : vars.elements) {
			if (type == null) {
				type = v.value.type;
			} else if (type != v.value.type) {
				throw new CompileException(
						"different types in variable declaration: " + type
								+ " and " + v.value.type, lineNr);
			}
		}
		this.type = type;

		for (InitializedIdentifier v : vars.elements)
			variables.add(new InitializedVar(scp.addVariable(v.name, type),
					v.value));
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock(makeLineNrJC());
		for (InitializedVar v : variables) {
			res.add(new AssignmentExpr(lineNr, v.var, AssignOperation.assign,
					v.val)
					.codegen(scp));
		}
		return res;
	}

	@Override
	public int calcStackSize() {
		int res = 0;
		for (InitializedVar id : variables) {
			res = Math.max(res, id.val.calcStackSize());
		}
		return res;
	}

	@Override
	public String toString() {
		return "declare " + PrintUtils.printList(variables) + " : " + type;
	}

}
