package compiler;

import java.util.ArrayList;
import java.util.List;

import compiler.ji.AsmGenBuffer;
import compiler.ji.JasminComponent;

public class ByteCodeBlock extends JasminComponent {
	private List<JasminComponent> instructions = new ArrayList<>();

	public ByteCodeBlock() {

	}

	public ByteCodeBlock(JasminComponent inst) {
		instructions.add(inst);
	}

	public void add(JasminComponent ji) {
		instructions.add(ji);
	}

	public void add(ByteCodeBlock b) {
		if (b != null)
			instructions.addAll(b.instructions);
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		for (JasminComponent inst : instructions) {
			inst.asmGen(ctx);
			// ctx.appendln(); // necessary?
		}
	}

	// public boolean verifyStack(){} // not needed
}
