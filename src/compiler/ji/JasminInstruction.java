package compiler.ji;

import java.util.ArrayList;
import java.util.List;

import compiler.JVMType;

// Jasmin Instructions
public abstract class JasminInstruction extends JasminComponent {
	public final JVMType type;

	protected JI instruction;
	protected List<Object> parameters = new ArrayList<>();

	public JasminInstruction() {
		type = JVMType.none;
	}

	JasminInstruction(JVMType type) {
		this.type = type;
	}

	protected abstract void generate(AsmGenBuffer ctx);

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		generate(ctx);
		appendIdent(ctx, instruction);
		for (Object p : parameters)
			appendNext(ctx, p);
		appendln(ctx);
	}

	protected static RuntimeException typeError(JVMType t) {
		return new RuntimeException("Error: unsupported type: " + t);
	}

	public static enum CmpType {
		eq, ge, gt, le, lt, ne;
	}
}
