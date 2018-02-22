package compiler;

import grammar.shlLexer;
import grammar.shlParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.ast.Program;
import compiler.ast.list.FunctionDefList;

public class Compiler {
	public static void main(String args[]) {
		new Compiler().compile(args);
	}

	public void compile(String args[]) {
		String fileName;
		if (args.length == 1) {
			fileName = args[0];
		} else {
			fileName = "language_def.shl";
		}
		int startIndex = fileName.lastIndexOf('/') + 1;
		System.out.println(startIndex);

		String programName = fileName.substring(startIndex,
				fileName.lastIndexOf('.'));

		Program prog = compileProgram(fileName, programName);

		System.out.println(prog);

		String asm = prog.generateJasminASM();

		try {
			PrintWriter out = new PrintWriter(programName + ".j");
			out.write(asm);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(asm);

	}

	private Program compileProgram(String fileName, String programName) {
		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
					fileName));

			shlLexer lexer = new shlLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			shlParser parser = new shlParser(tokens);
			ParseTree tree = parser.start(); // see the grammar ->
			// starting point for
			// parsing a java file

			ASTCreator visitor = new ASTCreator(programName);

			FunctionDefList functions = (FunctionDefList) visitor.visit(tree);

			return new Program(programName, functions);

		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (CompileException ce) {
			System.out.println("Compile error: " + ce.getMessage());
			System.exit(1);
			return null; // shut up the compiler
		}
	}
}
