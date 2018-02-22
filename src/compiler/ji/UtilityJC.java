package compiler.ji;

import compiler.VariableScope;

public abstract class UtilityJC extends JasminComponent {

	public static class BlankLine extends UtilityJC {
		@Override
		public void asmGen(AsmGenBuffer ctx) {
			appendln(ctx);
		}
	}

	public static class CommentLine extends UtilityJC {

		public final String comment;

		public CommentLine(String text) {
			comment = text;
		}

		@Override
		public void asmGen(AsmGenBuffer ctx) {
			appendln(ctx, ';', comment);
		}
	}

	public static class ScopeVariableJC extends UtilityJC {
		public final VariableScope.ScopeEntry var;
		public final LabelJC startLabel, endLabel;

		public ScopeVariableJC(VariableScope.ScopeEntry v, LabelJC start,
				LabelJC end) {
			var = v;
			startLabel = start;
			endLabel = end;
		}

		@Override
		public void asmGen(AsmGenBuffer ctx) {
			appendln(ctx, ".var", var.stackVarNr, "is", var.name,
					var.type.toJasminType(), "from", startLabel.getName(ctx),
					"to", endLabel.getName(ctx));
		}

	}

	public static class LineJC extends UtilityJC {
		public final int lineNr;
		private static int currentLineNr = -1;

		public LineJC(int nr) {
			lineNr = nr;
		}

		@Override
		public void asmGen(AsmGenBuffer ctx) {
			if (currentLineNr == lineNr) // don't output duplicates
				return;
			currentLineNr = lineNr;
			appendln(ctx, ".line", lineNr);
		}
	}

}
