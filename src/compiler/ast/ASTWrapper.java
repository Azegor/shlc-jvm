package compiler.ast;

import compiler.AssignOperation;
import compiler.BinaryOperation;
import compiler.SHLType;
import compiler.ji.JasminComponent;

public class ASTWrapper<O> implements ASTNode {

	public ASTWrapper(O o) {
		value = o;
	}

	public final O value;

	@SuppressWarnings("unchecked")
	<T> T getValue() {
		return (T) value;
	}

	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		return null;
	}

	public static class WString extends ASTWrapper<String> {
		public WString(String o) {
			super(o);
		}
	}

	public static class WSHLType extends ASTWrapper<SHLType> {
		public WSHLType(SHLType o) {
			super(o);
		}
	}
	
	public static class WBinaryOperation extends ASTWrapper<BinaryOperation> {
		public WBinaryOperation(BinaryOperation o) {
			super(o);
		}
	}

	public static class WAssignOperation extends ASTWrapper<AssignOperation> {
		public WAssignOperation(AssignOperation o) {
			super(o);
		}
	}
}
