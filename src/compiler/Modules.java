package compiler;

import java.util.ArrayList;
import java.util.List;

public class Modules {
	public static void loadModule(String moduleName, FunctionTable fnTable) {
		switch (moduleName) {
		case "stdlib": {
			// fn prt(chr d) native "stdlib";
			// fn pln(chr d) native "stdlib";
			//
			// fn prt(int i) native "stdlib";
			// fn pln(int i) native "stdlib";
			//
			// fn prt(str c) native "stdlib";
			// fn pln(str c) native "stdlib";
			//
			// fn prt(flt k) native "stdlib";
			// fn pln(flt k) native "stdlib";
			//
			// fn prt(boo k) native "stdlib";
			// fn pln(boo k) native "stdlib";

			List<SHLType> params = new ArrayList<>();
			params.add(SHLType.chr_t);
			fnTable.addFunction("stdlib", "prt(C)V", params, SHLType.vac_t);
			fnTable.addFunction("stdlib", "pln(C)V", params, SHLType.vac_t);

			// TODO: make a function-table-only pass for these files, or try to
			// analyze .class files (maybe better?)
			// ...
		}
		default:
			break;
		}
	}
}
