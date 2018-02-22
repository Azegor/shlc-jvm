package compiler.ast.list;

import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import compiler.SHLType;
import compiler.ast.CodeGenScope;
import compiler.ast.FunctionDef.FnParam;
import compiler.ji.JasminComponent;


public class FunctionParamList extends ANList<FnParam> {

	public List<SHLType> getParamTypes() {
		List<SHLType> res = new ArrayList<>();
		for (FnParam p : elements)
			res.add(p.type);
		return res;
	}

	@Override
	public JasminComponent codegen(CodeGenScope scp) {
		throw new RuntimeException(new OperationNotSupportedException());
	}

	public int calcStackSize() {
		int res = 0;
		for (FnParam p : elements) {
			res += p.type.stackSize();
		}
		return res;
	}

}
