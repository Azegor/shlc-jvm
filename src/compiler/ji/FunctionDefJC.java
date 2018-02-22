package compiler.ji;

import java.util.List;

import compiler.ByteCodeBlock;
import compiler.SHLType;

public class FunctionDefJC extends JasminComponent {

	private String name;
	private SHLType retType;
	private List<SHLType> paramTypes;
	int stack_limit, locals_limit;

	private ByteCodeBlock body;


	public FunctionDefJC(String name, SHLType returnType,
			List<SHLType> paramTypes,
 ByteCodeBlock body, int stack_limit,
			int locals_limit) {
		// super(returnType.getJVMType());
		if (name == "main")
			name = "$main$";
		this.name = name;
		retType = returnType;
		this.paramTypes = paramTypes;
		this.body = body;
		this.stack_limit = stack_limit;
		this.locals_limit = locals_limit;
	}

	@Override
	public void asmGen(AsmGenBuffer ctx) {
		append(ctx, ".method public static", name + '(');
		for (SHLType param : paramTypes)
			ctx.append(param.toJasminType());
		appendln(ctx, ')' + retType.toJasminType());
		appendln(ctx, ".limit stack", stack_limit);
		appendln(ctx, ".limit locals", locals_limit);

		body.asmGen(ctx);

		appendln(ctx, ".end method");
	}
}
