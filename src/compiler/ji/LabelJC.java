package compiler.ji;

public class LabelJC extends JasminComponent {

	private String baseName;
	private String finalName = null;

	public LabelJC(String name) {
		baseName = name;
	}

	// this makes it possible to get the label name before the label is placed
	public String getName(AsmGenBuffer ctx) {
		if (finalName == null)
			finalName = ctx.newLabel(baseName);
		return finalName;
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		appendln(ctx, getName(ctx) + ":");
	}

}
