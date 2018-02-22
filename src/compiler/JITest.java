package compiler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import compiler.ji.FunctionDefJC;
import compiler.ji.ProgramJC;
import compiler.ji.StackJI;

public class JITest {

	public static void main(String[] args) {
		List<FunctionDefJC> functions = new ArrayList<>();

		ByteCodeBlock content = new ByteCodeBlock();
		content.add(new StackJI.ReturnJI(JVMType.void_t));

		FunctionDefJC f1 = new FunctionDefJC("main", SHLType.vac_t,
				new ArrayList<SHLType>(), content, 0, 0);

		functions.add(f1);

		ProgramJC prog = new ProgramJC("testprogram", functions);
		String res = prog.asmGen();
		System.out.println(res);
		PrintWriter out;
		try {
			out = new PrintWriter("test.j");
			out.write(res);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
