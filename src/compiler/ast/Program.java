package compiler.ast;

import java.util.ArrayList;
import java.util.List;

import compiler.PrintUtils;
import compiler.ast.list.FunctionDefList;
import compiler.ji.FunctionDefJC;
import compiler.ji.ProgramJC;

public class Program implements ASTNode {

	public final String programName;
	private FunctionDefList functions;

	public Program(String name, FunctionDefList funcs) {
		programName = name;
		functions = funcs;
	}

	public String generateJasminASM() {
		ProgramJC comp = codegen(new CodeGenScope(this));
		return comp.asmGen();
	}

	@Override
	public ProgramJC codegen(CodeGenScope scp) {
		List<FunctionDefJC> functionJCs = new ArrayList<>();
		for (FunctionDef f : functions.elements)
			functionJCs.add(f.codegen(scp));
		return new ProgramJC(programName, functionJCs);
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Program " + programName + " [[\n");
		buf.append(PrintUtils.printList(functions, true));
		buf.append("\n]]\n");
		return buf.toString();
	}

}
