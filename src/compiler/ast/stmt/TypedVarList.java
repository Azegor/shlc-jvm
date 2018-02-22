package compiler.ast.stmt;

import java.util.ArrayList;
import java.util.List;

import compiler.AssignOperation;
import compiler.ByteCodeBlock;
import compiler.PrintUtils;
import compiler.SHLType;
import compiler.VariableScope;
import compiler.ast.CodeGenScope;
import compiler.ast.list.IdentifierList;

public class TypedVarList extends VarDeclarationList {

	// public final IdentifierList names;
	public final List<VariableScope.ScopeEntry> vars = new ArrayList<>();
	public final SHLType type;

	public TypedVarList(int lineNr, IdentifierList names, SHLType t,
			VariableScope scp) {
		super(lineNr);
		type = t;
		for (String v : names.elements)
			vars.add(scp.addVariable(v, type));
	}

	@Override
	public ByteCodeBlock codegen(CodeGenScope scp) {
		ByteCodeBlock res = new ByteCodeBlock(makeLineNrJC());
		for (VariableScope.ScopeEntry v : vars) {
			res.add(new AssignmentExpr(lineNr, v, AssignOperation.assign,
					SHLType.getDefaultValue(type)).codegen(scp));
		}
		return res;
	}

	@Override
	public int calcStackSize() {
		return type.stackSize();
	}

	@Override
	public String toString() {
		return "declare " + PrintUtils.printList(vars) + " : " + type;
	}

}
