package compiler.ji;

import java.util.List;

public class ProgramJC extends JasminComponent {

	String programName;
	private List<FunctionDefJC> functions;

	public ProgramJC(String programName, List<FunctionDefJC> functions) {
		this.programName = programName;
		this.functions = functions;
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		appendln(ctx, ".source", programName + ".shl");
		appendln(ctx, ".class public", programName);
		appendln(ctx, ".super java/lang/Object");
		
		generateMainMethod(ctx);
		appendln(ctx);

		for (FunctionDefJC fn : functions) {
			fn.asmGen(ctx);
			appendln(ctx);
		}
	}

	private void generateMainMethod(AsmGenBuffer ctx) {
		appendln(ctx, ".method public static main([Ljava/lang/String;)V");
		appendln(ctx, ".limit stack 2"); // 2 for debug print
		appendln(ctx, ".limit locals 1");

		appendln(ctx,
				"getstatic      java/lang/System/out Ljava/io/PrintStream;");
		appendln(ctx, "ldc            \"[Program Start]\"");
		appendln(ctx,
				"invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V");

		appendln(ctx, "invokestatic " + programName + "/$main$()V");

		appendln(ctx,
				"getstatic      java/lang/System/out Ljava/io/PrintStream;");
		appendln(ctx, "ldc            \"[Program End]\"");
		appendln(ctx,
				"invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V");

		// info: can be duplicate
		appendln(ctx, "return");

		ctx.appendln(".end method");
	}

	public String asmGen() {
		AsmGenBuffer ctx = new AsmGenBuffer();
		asmGen(ctx);
		return ctx.getContent();
	}
}
