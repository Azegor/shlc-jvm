package compiler.ji;

import java.util.HashMap;
import java.util.Map;

public class AsmGenBuffer {

	public final StringBuffer buffer = new StringBuffer();

	private Map<String, Integer> labelTable = new HashMap<>();

	public String newLabel(String name) {
		if (labelTable.containsKey(name)) {
			int nr = labelTable.get(name);
			labelTable.put(name, ++nr);
			String labelName = name + '_' + nr;
			if (labelTable.containsKey(labelName)) // in case of existance
				return newLabel(labelName);
			return labelName;
		}
		labelTable.put(name, 1);
		return name + "_1";
	}

	public void append(Object o) {
		buffer.append(o);
	}

	public void appendln() {
		buffer.append('\n');
	}

	public void appendln(Object o) {
		buffer.append(o);
		buffer.append('\n');
	}

	public String getContent() {
		return buffer.toString();
	}
}
