package compiler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import compiler.ast.expr.Expression;
import compiler.ast.list.ExprList;

public class FunctionTable {
	
	public static class Entry {
		public final String packageName;
		public final String name;
		public final List<SHLType> params;
		public final SHLType returnType;
		
		public Entry(String pack, String n, List<SHLType> parms, SHLType retType) {
			packageName = pack;
			name = n;
			params =parms;
			returnType = retType;
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof Entry) {
				Entry e = (Entry) o;
				return name.equals(e.name) && params.equals(e.params)
						&& returnType.equals(e.returnType);
			}
			return false;
		}

		@Override
		public String toString() {
			return name + "(" + PrintUtils.printList(params) + ") : "
					+ returnType;
		}

		public String fullFunctionName() {
			StringBuffer buf = new StringBuffer();
			buf.append(packageName + "/" + name + "(");
			for (SHLType param : params)
				buf.append(param.toJasminType());
			buf.append(')' + returnType.toJasminType());
			return buf.toString();
		}
	}
	
	public FunctionTable() {
		// addFunction("main", new ArrayList<SHLType>(), SHLType.vac_t);
	}

	private final Set<Entry> entries = new HashSet<>();

	public SHLType lookupFnReturnType(String name, ExprList params) {
		return lookupFunction(name, params).returnType;
	}

	public SHLType lookupFnReturnType(String name, List<SHLType> paramTypes) {
		return lookupFunction(name, paramTypes).returnType;
	}
	
	public void addFunction(String pack, String name, List<SHLType> params,
			SHLType returnType) {
		entries.add(new Entry(pack, name, params, returnType));
	}

	public Entry lookupFunction(String name, ExprList params) {
		List<SHLType> types = new ArrayList<>();
		for (Expression e : params.elements)
			types.add(e.type);
		return lookupFunction(name, types);
	}

	public Entry lookupFunction(String name, List<SHLType> paramTypes) {
		for (Entry e : entries) {
			if (e.name.equals(name) && e.params.equals(paramTypes))
				return e;
		}
		throw new RuntimeException("function " + name
				+ " not found in function table");
	}
}
