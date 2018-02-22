package compiler.ji;

import compiler.JVMType;

public class FunctionCallJI extends JasminInstruction {

	public final String fullFunctionName;
	public final CallType callType;

	public static enum CallType {
		staticCall, virtualCall
	}

	public FunctionCallJI(String fullFnName, JVMType retType) {
		super(retType);
		fullFunctionName = fullFnName;
		callType = CallType.staticCall;
	}

	public FunctionCallJI(String fullFnName, JVMType retType, CallType cType) {
		super(retType);
		fullFunctionName = fullFnName;
		callType = cType;
	}

	@Override
	protected void generate(AsmGenBuffer ctx) {
		switch (callType) {
		case staticCall:
			instruction = JI.invokestatic;
			break;
		case virtualCall:
			instruction = JI.invokevirtual;
			break;
		default:
			throw new RuntimeException("Unknown function call type: "
					+ callType);
		}
		parameters.add(fullFunctionName);
	}
}
