package compiler.ji;

public abstract class JasminComponent {

	public abstract void asmGen(AsmGenBuffer ctx);

	protected static void append(AsmGenBuffer ctx, Object... vals) {
		boolean first = true;
		for (Object s : vals) {
			if (first)
				first = false;
			else
				ctx.append(" ");
			ctx.append(s.toString());
		}
	}

	protected static void appendNext(AsmGenBuffer ctx, Object... vals) {
		for (Object s : vals) {
			ctx.append(" ");
			ctx.append(s.toString());
		}
	}

	protected static void appendln(AsmGenBuffer ctx, Object... vals) {
		boolean first = true;
		for (Object s : vals) {
			if (first)
				first = false;
			else
				ctx.append(" ");
			ctx.append(s.toString());
		}
		ctx.append('\n');
	}

	protected static void appendIdent(AsmGenBuffer ctx, Object... vals) {
		ctx.append("    ");
		append(ctx, vals);
	}

	protected static void appendIdentln(AsmGenBuffer ctx, Object... vals) {
		ctx.append("    ");
		appendln(ctx, vals);
	}
}
