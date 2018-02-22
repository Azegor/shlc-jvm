package compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariableScope {
	public static class ScopeFrame {
		public int baseVarNr;
		public int topVarNr;
		public Map<String, ScopeEntry> entries = new HashMap<>();
		public List<ScopeFrame> children = new ArrayList<>();
		public ScopeFrame parent = null;

		ScopeFrame() {
			baseVarNr = 0;
			topVarNr = 0;
		}

		ScopeFrame(ScopeFrame parent) {
			this.parent = parent;
			parent.children.add(this);
			baseVarNr = parent.topVarNr;
			topVarNr = baseVarNr;
		}

		ScopeEntry addVariable(String name, SHLType type) {
			if (entries.containsKey(name))
				// return null;
				throw new RuntimeException("Variable " + name
						+ " already exists in current scope");

			ScopeEntry entry = new ScopeEntry(name, type, topVarNr);
			entries.put(name, entry);
			if (type == SHLType.int_t || type == SHLType.flt_t)
				topVarNr += 2;
			else
				topVarNr += 1;
			return entry;
		}

		int getStackSize() {
			int res = 0;
			for (ScopeEntry e : entries.values())
				res += e.stackSize();

			for (ScopeFrame f : children)
				res += f.getStackSize();
			return res;
		}
	}

	public static class ScopeEntry {
		public ScopeEntry(String name, SHLType t, int nr) {
			this.name = name;
			stackVarNr = nr;
			type = t;
		}

		public String name;
		public int stackVarNr;
		public SHLType type;

		public int stackSize() {
			switch (type) {
			case int_t:
			case flt_t:
				return 2;
			case vac_t:
				throw new RuntimeException(
						"Cannot place 'void' variable on the stack");
			default:
				return 1;
			}
		}

		@Override
		public String toString() {
			return name + "#" + stackVarNr;
		}
	}

	private ScopeFrame root = new ScopeFrame();
	private ScopeFrame currentFrame = root;

	public void pushScope() {
		currentFrame = new ScopeFrame(currentFrame);
	}

	public void popScope() {
		currentFrame = currentFrame.parent;
	}

	public ScopeEntry addVariable(String name, SHLType type) {
		return currentFrame.addVariable(name, type);
	}

	public ScopeEntry getVar(String name) {
		ScopeFrame f = currentFrame;
		while (f != null) {
			if (f.entries.containsKey(name))
				return f.entries.get(name);
			f = f.parent;
		}
		throw new RuntimeException("Unknown Variable " + name);
	}

	public int getVarNr(String name) {
		return getVar(name).stackVarNr;
	}

	public SHLType getVarType(String name) {
		return getVar(name).type;
	}

	public int calcStackSize() {
		return root.getStackSize();
	}

	public ScopeFrame currentFrame() {
		return currentFrame;
	}
}
