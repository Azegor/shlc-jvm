package compiler;

import java.util.List;

import compiler.ast.list.ANList;

public class PrintUtils {
	public static String printList(ANList<?> list) {
		return printList(list.elements, false);
	}
	public static String printList(ANList<?> list, boolean newLine) {
		return printList(list.elements, newLine);
	}

	public static String printList(List<?> list) {
		return printList(list, false);
	}

	public static <T> String printList(List<T> list, boolean newLine) {
		boolean first = true;
		StringBuffer res = new StringBuffer();
		for (T t : list) {
			if (first)
				first = false;
			else {
				if (newLine)
					res.append("\n");
				else
					res.append(", ");
			}
			res.append(t.toString());
		}
		return res.toString();
	}
}
