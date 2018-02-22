package compiler;

import grammar.shlBaseVisitor;
import grammar.shlParser.AndExprContext;
import grammar.shlParser.AssignOpContext;
import grammar.shlParser.Assignment_statementContext;
import grammar.shlParser.BinNrContext;
import grammar.shlParser.BlockStatementContext;
import grammar.shlParser.BoolTypeContext;
import grammar.shlParser.Brk_statementContext;
import grammar.shlParser.CastExprContext;
import grammar.shlParser.CharTypeContext;
import grammar.shlParser.CmpEQExprContext;
import grammar.shlParser.CmpGEExprContext;
import grammar.shlParser.CmpGTExprContext;
import grammar.shlParser.CmpLEExprContext;
import grammar.shlParser.CmpLTExprContext;
import grammar.shlParser.CmpNEExprContext;
import grammar.shlParser.Cnt_statementContext;
import grammar.shlParser.DecNrContext;
import grammar.shlParser.DivAssignOpContext;
import grammar.shlParser.DivExprContext;
import grammar.shlParser.ElStatementContext;
import grammar.shlParser.ElifListContext;
import grammar.shlParser.Elif_statementContext;
import grammar.shlParser.EmptyFnCallParmsContext;
import grammar.shlParser.EmptyFnDeclListContext;
import grammar.shlParser.EmptyStmtListContext;
import grammar.shlParser.ExprStmtContext;
import grammar.shlParser.FalseConstContext;
import grammar.shlParser.FloatTypeContext;
import grammar.shlParser.FnCallParmListContext;
import grammar.shlParser.FnDeclContext;
import grammar.shlParser.FnDeclListContext;
import grammar.shlParser.FnDefContext;
import grammar.shlParser.FnNativeContext;
import grammar.shlParser.For_statementContext;
import grammar.shlParser.Function_call_expressionContext;
import grammar.shlParser.Function_parameter_declarationContext;
import grammar.shlParser.HexNrContext;
import grammar.shlParser.IdentContext;
import grammar.shlParser.IdentListContext;
import grammar.shlParser.If_statementContext;
import grammar.shlParser.InitIdentContext;
import grammar.shlParser.InitIdentListContext;
import grammar.shlParser.InitVarContext;
import grammar.shlParser.Initialized_identifierContext;
import grammar.shlParser.IntTypeContext;
import grammar.shlParser.LShiftAssignOpContext;
import grammar.shlParser.MainFnContext;
import grammar.shlParser.MinusAssignOpContext;
import grammar.shlParser.MinusExprContext;
import grammar.shlParser.ModAssignOpContext;
import grammar.shlParser.ModExprContext;
import grammar.shlParser.MulExprContext;
import grammar.shlParser.NoElifContext;
import grammar.shlParser.NonFnParamContext;
import grammar.shlParser.NoneElContext;
import grammar.shlParser.NoneRetTypeContext;
import grammar.shlParser.NormalStatementContext;
import grammar.shlParser.NotExprContext;
import grammar.shlParser.OctNrContext;
import grammar.shlParser.OrExprContext;
import grammar.shlParser.ParamListContext;
import grammar.shlParser.ParenExprContext;
import grammar.shlParser.PlusAssignOpContext;
import grammar.shlParser.PlusExprContext;
import grammar.shlParser.PowAssignOpContext;
import grammar.shlParser.PowExprContext;
import grammar.shlParser.RShiftAssignOpContext;
import grammar.shlParser.RetTypeStmtContext;
import grammar.shlParser.RetVoidStmtContext;
import grammar.shlParser.SingleFnCallParmContext;
import grammar.shlParser.SingleParamContext;
import grammar.shlParser.Statement_blockContext;
import grammar.shlParser.StrTypeContext;
import grammar.shlParser.StringExprContext;
import grammar.shlParser.String_constContext;
import grammar.shlParser.TimesAssignOpContext;
import grammar.shlParser.TrueConstContext;
import grammar.shlParser.TypeVarContext;
import grammar.shlParser.UseStmtContext;
import grammar.shlParser.Use_statementContext;
import grammar.shlParser.VacContext;
import grammar.shlParser.VarExprContext;
import grammar.shlParser.Whl_statementContext;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;

import compiler.ast.ASTNode;
import compiler.ast.ASTWrapper;
import compiler.ast.ASTWrapper.WAssignOperation;
import compiler.ast.ASTWrapper.WSHLType;
import compiler.ast.ASTWrapper.WString;
import compiler.ast.FunctionDef;
import compiler.ast.FunctionDef.FnParam;
import compiler.ast.InitializedIdentifier;
import compiler.ast.NativeFunction;
import compiler.ast.expr.BinaryExpression;
import compiler.ast.expr.CastExpr;
import compiler.ast.expr.Expression;
import compiler.ast.expr.FnCallExpression;
import compiler.ast.expr.UnaryExpression;
import compiler.ast.expr.VariableExpression;
import compiler.ast.expr.constant.BoolConst;
import compiler.ast.expr.constant.Constant;
import compiler.ast.expr.constant.FloatConst;
import compiler.ast.expr.constant.IntConst;
import compiler.ast.expr.constant.StringConst;
import compiler.ast.list.ElifStatementList;
import compiler.ast.list.ExprList;
import compiler.ast.list.FunctionDefList;
import compiler.ast.list.FunctionParamList;
import compiler.ast.list.IdentifierList;
import compiler.ast.list.InitializedIdentifierList;
import compiler.ast.list.StatementList;
import compiler.ast.stmt.AssignmentExpr;
import compiler.ast.stmt.BreakStatement;
import compiler.ast.stmt.ContinueStatement;
import compiler.ast.stmt.ElifStatement;
import compiler.ast.stmt.ElseStatement;
import compiler.ast.stmt.ExprStmt;
import compiler.ast.stmt.ForStatement;
import compiler.ast.stmt.IfStatement;
import compiler.ast.stmt.InitializedVarList;
import compiler.ast.stmt.LoopStatement;
import compiler.ast.stmt.ReturnStatement;
import compiler.ast.stmt.ScopeStatement;
import compiler.ast.stmt.Statement;
import compiler.ast.stmt.TypedVarList;
import compiler.ast.stmt.WhileStatement;

public class ASTCreator extends shlBaseVisitor<ASTNode> {

	private VariableScope currentVariableScope = null;

	private FunctionTable functionTable = new FunctionTable();

	private Stack<LoopStatement> currentLoop = new Stack<>();

	private BinaryExpression visitBinaryExpr(ParseTree lhs, ParseTree rhs,
			BinaryOperation o) {
		return BinaryExpression.createWithCast((Expression) visit(lhs),
				(Expression) visit(rhs), o);
	}

	private final String packageName;

	public ASTCreator(String programName) {
		packageName = programName;
	}

	private void importModule(String moduleName) {
		Modules.loadModule(moduleName, functionTable);
	}

	// -------------------------------------------------------------------------

	@Override
	public BinaryExpression visitAndExpr(AndExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.and);
	}

	@Override
	public ASTWrapper.WAssignOperation visitAssignOp(AssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.assign);
	}

	@Override
	public AssignmentExpr visitAssignment_statement(
			Assignment_statementContext ctx) {
		int lineNr = ctx.getStart().getLine();
		String name = ctx.ident.getText();
		ASTWrapper.WAssignOperation op = (WAssignOperation) visit(ctx.op);
		Expression rhs = (Expression) visit(ctx.expr);
		return new AssignmentExpr(lineNr, currentVariableScope.getVar(name),
				op.value, rhs);
	}

	@Override
	public IntConst visitBinNr(BinNrContext ctx) {
		String nrStr = ctx.BIN_NUMBER().getText();
		Long nr = Long.parseLong(nrStr.substring(2), 2);
		return new IntConst(nr.longValue());
	}

	@Override
	public StatementList visitBlockStatement(BlockStatementContext ctx) {
		StatementList list = (StatementList) visit(ctx.list);
		Statement stmt = (Statement) visit(ctx.stmt);
		list.add(stmt);
		return list;
	}

	@Override
	public ASTWrapper.WSHLType visitBoolType(BoolTypeContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.boo_t);
	}

	@Override
	public ASTNode visitBrk_statement(Brk_statementContext ctx) {
		int lineNr = ctx.getStart().getLine();
		if (currentLoop.empty())
			throw new CompileException("no loop to break out of", lineNr);
		return new BreakStatement(lineNr, currentLoop.peek().getBreakLabel());
	}

	@Override
	public CastExpr visitCastExpr(CastExprContext ctx) {
		Expression expr = (Expression) visit(ctx.expr);
		ASTWrapper.WSHLType type = (WSHLType) visit(ctx.cast_type);
		return new CastExpr(expr, type.value);
	}

	@Override
	public ASTWrapper.WSHLType visitCharType(CharTypeContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.chr_t);
	}

	@Override
	public BinaryExpression visitCmpEQExpr(CmpEQExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.eq);
	}

	@Override
	public BinaryExpression visitCmpGEExpr(CmpGEExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.ge);
	}

	@Override
	public BinaryExpression visitCmpGTExpr(CmpGTExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.gt);
	}

	@Override
	public BinaryExpression visitCmpLEExpr(CmpLEExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.le);
	}

	@Override
	public BinaryExpression visitCmpLTExpr(CmpLTExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.lt);
	}

	@Override
	public BinaryExpression visitCmpNEExpr(CmpNEExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.ne);
	}

	@Override
	public ASTNode visitCnt_statement(Cnt_statementContext ctx) {
		int lineNr = ctx.getStart().getLine();
		if (currentLoop.empty())
			throw new CompileException("no loop to break out of", lineNr);
		return new ContinueStatement(lineNr, currentLoop.peek()
				.getContinueLabel());
	}

	@Override
	public Constant visitDecNr(DecNrContext ctx) {
		int lineNr = ctx.getStart().getLine();
		String nrStr = ctx.DEC_NUMBER().getText();
		try {
			Number n = NumberFormat.getInstance().parse(nrStr);
			if (n instanceof Long)
				return new IntConst(n.longValue());
			if (n instanceof Double)
				return new FloatConst(n.doubleValue());
			throw new CompileException("unexpected number type: "
					+ n.getClass().getSimpleName(), lineNr);
		} catch (ParseException e) {
			throw new CompileException(e, lineNr);
		}
	}

	@Override
	public ASTWrapper.WAssignOperation visitDivAssignOp(DivAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.div_assign);
	}

	@Override
	public BinaryExpression visitDivExpr(DivExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.div);
	}

	@Override
	public ElifStatement visitElif_statement(Elif_statementContext ctx) {
		currentVariableScope.pushScope();
		Expression cond = (Expression) visit(ctx.cond);
		ScopeStatement body = (ScopeStatement) visit(ctx.stmts);
		currentVariableScope.popScope();
		return new ElifStatement(cond, body);
	}

	@Override
	public ElifStatementList visitElifList(ElifListContext ctx) {
		ElifStatement elif = (ElifStatement) visit(ctx.elif_stmt);
		ElifStatementList list = (ElifStatementList) visit(ctx.list);
		list.add(elif);
		return list;
	}

	@Override
	public ElseStatement visitElStatement(ElStatementContext ctx) {
		currentVariableScope.pushScope();
		ScopeStatement body = (ScopeStatement) visit(ctx.stmts);
		currentVariableScope.popScope();
		return new ElseStatement(body);
	}

	@Override
	public ExprList visitEmptyFnCallParms(EmptyFnCallParmsContext ctx) {
		return new ExprList();
	}

	@Override
	public FunctionDefList visitEmptyFnDeclList(EmptyFnDeclListContext ctx) {
		return new FunctionDefList();
	}

	@Override
	public StatementList visitEmptyStmtList(EmptyStmtListContext ctx) {
		return new StatementList();
	}

	@Override
	public ExprStmt visitExprStmt(ExprStmtContext ctx) {
		int lineNr = ctx.getStart().getLine();
		return new ExprStmt(lineNr, (Expression) visit(ctx.expression()));
	}

	@Override
	public BoolConst visitFalseConst(FalseConstContext ctx) {
		return new BoolConst(false);
	}

	@Override
	public ASTWrapper.WSHLType visitFloatType(FloatTypeContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.flt_t);
	}

	@Override
	public ExprList visitFnCallParmList(FnCallParmListContext ctx) {
		ExprList list = (ExprList) visit(ctx.list);
		Expression expr = (Expression) visit(ctx.expr);
		list.add(expr);
		return list;
	}

	@Override
	public ASTNode visitFnDecl(FnDeclContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		FunctionParamList params = (FunctionParamList) visit(ctx.params);
		ASTWrapper.WSHLType retType = (WSHLType) visit(ctx.ret);
		functionTable.addFunction(packageName, name, params.getParamTypes(),
				retType.value);
		return null;
	}

	@Override
	public FunctionDefList visitFnDeclList(FnDeclListContext ctx) {
		FunctionDefList list = (FunctionDefList) visit(ctx
				.function_declaration_list_or_use_statement());
		FunctionDef decl = (FunctionDef) visit(ctx.function_declaration());
		if (decl != null)
			list.add(decl);
		return list;
	}

	@Override
	public FunctionDef visitFnDef(FnDefContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		FunctionParamList params = (FunctionParamList) visit(ctx.params);
		ASTWrapper.WSHLType retType = (ASTWrapper.WSHLType) visit(ctx.ret);
		currentVariableScope = new VariableScope();

		// add parameters to variable scope:
		for (FnParam p : params.elements) {
			currentVariableScope.addVariable(p.name, p.type);
		}

		ScopeStatement body = (ScopeStatement) visit(ctx.body);
		// body scope including parameters (body itself is again a scope):
		ScopeStatement bodyScp = new ScopeStatement(
				currentVariableScope.currentFrame(), body, name);

		functionTable.addFunction(packageName, name, params.getParamTypes(),
				retType.value);
		return new FunctionDef(name, retType.value, params, bodyScp,
				currentVariableScope);
	}

	@Override
	public NativeFunction visitFnNative(FnNativeContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		FunctionParamList params = (FunctionParamList) visit(ctx.params);
		ASTWrapper.WSHLType retType = (ASTWrapper.WSHLType) visit(ctx.ret);
		ASTWrapper.WString pkgName = (WString) visit(ctx.pkgname);
		functionTable.addFunction(pkgName.value, name, params.getParamTypes(),
				retType.value);
		// return new NativeFunction(name, params, retType.value);
		return null; // TODO: make this work
	}

	@Override
	public ScopeStatement visitFor_statement(For_statementContext ctx) {
		currentVariableScope.pushScope();
		Statement init = (Statement) visit(ctx.init);
		Expression cond = (Expression) visit(ctx.cond);
		Statement incr = (Statement) visit(ctx.incr);

		VariableScope.ScopeFrame outerScopeFrame = currentVariableScope
				.currentFrame();

		ForStatement forStmt = new ForStatement();
		currentVariableScope.pushScope();
		ScopeStatement body = (ScopeStatement) visit(ctx.stmts);
		currentVariableScope.popScope();

		currentVariableScope.popScope();
		forStmt.setContent(init, cond, incr, body);
		return new ScopeStatement(outerScopeFrame, forStmt, "for_loop");
	}

	@Override
	public FnCallExpression visitFunction_call_expression(
			Function_call_expressionContext ctx) {
		String name = ctx.ident.getText();
		ExprList params = (ExprList) visit(ctx.parms);
		return new FnCallExpression(functionTable.lookupFunction(name, params),
				params);
	}

	@Override
	public FunctionParamList visitFunction_parameter_declaration(
			Function_parameter_declarationContext ctx) {
		FunctionParamList res = new FunctionParamList();
		ASTWrapper.WSHLType type = (ASTWrapper.WSHLType) visit(ctx.parm_type);
		IdentifierList name = (IdentifierList) visit(ctx.id_list);
		for (String n : name.elements)
			res.add(new FnParam(n, type.value));
		return res;
	}

	@Override
	public IntConst visitHexNr(HexNrContext ctx) {
		String nrStr = ctx.HEX_NUMBER().getText();
		Long nr = Long.parseLong(nrStr.substring(2), 16);
		return new IntConst(nr.longValue());
	}

	@Override
	public IdentifierList visitIdent(IdentContext ctx) {
		IdentifierList list = new IdentifierList();
		list.add(ctx.IDENTIFIER().getText());
		return list;
	}

	@Override
	public IdentifierList visitIdentList(IdentListContext ctx) {
		IdentifierList list = (IdentifierList) visit(ctx.list);
		list.add(ctx.IDENTIFIER().getText());
		return list;
	}

	@Override
	public IfStatement visitIf_statement(If_statementContext ctx) {
		currentVariableScope.pushScope(); // whole if / elif / else block
		Expression cond = (Expression) visit(ctx.cond);

		currentVariableScope.pushScope(); // only 'then' block
		ScopeStatement then = (ScopeStatement) visit(ctx.then);
		currentVariableScope.popScope();

		ElifStatementList elifs = (ElifStatementList) visit(ctx.elifstmt);

		ElseStatement else_ = (ElseStatement) visit(ctx.else_stmt);

		currentVariableScope.popScope();

		return new IfStatement(cond, then, elifs, else_);
	}

	@Override
	public InitializedIdentifier visitInitialized_identifier(
			Initialized_identifierContext ctx) {
		Expression value = (Expression) visit(ctx.expr);
		return new InitializedIdentifier(ctx.ident.getText(), value);
	}

	@Override
	public InitializedIdentifierList visitInitIdent(InitIdentContext ctx) {
		InitializedIdentifierList list = new InitializedIdentifierList();
		InitializedIdentifier ident = (InitializedIdentifier) visit(ctx.ident);
		list.add(ident);
		return list;
	}

	@Override
	public InitializedIdentifierList visitInitIdentList(InitIdentListContext ctx) {
		InitializedIdentifier ident = (InitializedIdentifier) visit(ctx.ident);
		InitializedIdentifierList list = (InitializedIdentifierList) visit(ctx.list);
		list.add(ident);
		return list;
	}

	@Override
	public InitializedVarList visitInitVar(InitVarContext ctx) {
		int lineNr = ctx.getStart().getLine();
		InitializedIdentifierList vars = (InitializedIdentifierList) visit(ctx.vars);
		return new InitializedVarList(lineNr, vars, currentVariableScope);
	}

	@Override
	public ASTWrapper.WSHLType visitIntType(IntTypeContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.int_t);
	}

	@Override
	public ASTWrapper.WAssignOperation visitLShiftAssignOp(
			LShiftAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.lshift_assign);
	}

	@Override
	public FunctionDef visitMainFn(MainFnContext ctx) {
		currentVariableScope = new VariableScope();
		currentVariableScope.pushScope();
		ScopeStatement body = (ScopeStatement) visit(ctx.body);
		ScopeStatement scp = new ScopeStatement(
				currentVariableScope.currentFrame(), body, "main");
		currentVariableScope.popScope();
		return new FunctionDef("main", SHLType.vac_t, new FunctionParamList(),
				scp, currentVariableScope);
	}

	@Override
	public ASTWrapper.WAssignOperation visitMinusAssignOp(
			MinusAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.sub_assign);
	}

	@Override
	public BinaryExpression visitMinusExpr(MinusExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.sub);
	}

	@Override
	public ASTWrapper.WAssignOperation visitModAssignOp(ModAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.mod_assign);
	}

	@Override
	public BinaryExpression visitModExpr(ModExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.mod);
	}

	@Override
	public BinaryExpression visitMulExpr(MulExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.mul);
	}

	@Override
	public ElifStatementList visitNoElif(NoElifContext ctx) {
		return new ElifStatementList();
	}

	@Override
	public ElseStatement visitNoneEl(NoneElContext ctx) {
		return null;
	}

	@Override
	public ASTWrapper.WSHLType visitNoneRetType(NoneRetTypeContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.vac_t);
	}

	@Override
	public ASTNode visitNonFnParam(NonFnParamContext ctx) {
		return new FunctionParamList();
	}

	@Override
	public StatementList visitNormalStatement(NormalStatementContext ctx) {
		StatementList list = (StatementList) visit(ctx.list);
		Statement stmt = (Statement) visit(ctx.stmt);
		list.add(stmt);
		return list;
	}

	@Override
	public ASTNode visitNotExpr(NotExprContext ctx) {
		Expression expr = (Expression) visit(ctx.expr);
		return new UnaryExpression(expr, UnaryOperation.not, expr.type);
	}

	@Override
	public ASTNode visitOctNr(OctNrContext ctx) {
		String nrStr = ctx.OCT_NUMBER().getText();
		Long nr = Long.parseLong(nrStr.substring(1), 7);
		return new IntConst(nr.longValue());
	}

	@Override
	public ASTNode visitOrExpr(OrExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.or);
	}

	@Override
	public ASTNode visitParamList(ParamListContext ctx) {
		FunctionParamList parms = (FunctionParamList) visit(ctx.parm);
		FunctionParamList list = (FunctionParamList) visit(ctx.list);
		list.addAll(parms);
		return list;
	}

	@Override
	public ASTNode visitParenExpr(ParenExprContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public ASTWrapper.WAssignOperation visitPlusAssignOp(PlusAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.add_assign);
	}

	@Override
	public ASTNode visitPlusExpr(PlusExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.add);
	}

	@Override
	public ASTWrapper.WAssignOperation visitPowAssignOp(PowAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.pow_assign);
	}

	@Override
	public ASTNode visitPowExpr(PowExprContext ctx) {
		return visitBinaryExpr(ctx.lhs, ctx.rhs, BinaryOperation.pow);
	}

	@Override
	public ReturnStatement visitRetTypeStmt(RetTypeStmtContext ctx) {
		Expression val = (Expression) visit(ctx.val);
		return new ReturnStatement(val);
	}

	@Override
	public ReturnStatement visitRetVoidStmt(RetVoidStmtContext ctx) {
		return new ReturnStatement(null);
	}

	@Override
	public ASTWrapper.WAssignOperation visitRShiftAssignOp(
			RShiftAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.rshift_assign);
	}

	@Override
	public ExprList visitSingleFnCallParm(SingleFnCallParmContext ctx) {
		Expression expr = (Expression) visit(ctx.expr);
		ExprList list = new ExprList();
		list.add(expr);
		return list;
	}

	@Override
	public ASTNode visitSingleParam(SingleParamContext ctx) {
		FunctionParamList list = new FunctionParamList();
		list.addAll((FunctionParamList) visit(ctx.parm));
		return list;
	}

	@Override
	public ScopeStatement visitStatement_block(Statement_blockContext ctx) {
		currentVariableScope.pushScope();
		StatementList list = (StatementList) visit(ctx.stmt_list);
		ScopeStatement res = new ScopeStatement(
				currentVariableScope.currentFrame(), list);
		currentVariableScope.popScope();
		return res;
	}

	@Override
	public ASTNode visitString_const(String_constContext ctx) {
		String strWithQuotes = ctx.STRING().getText();
		return new ASTWrapper.WString(strWithQuotes.substring(1,
				strWithQuotes.length() - 1));
	}

	@Override
	public ASTWrapper.WSHLType visitStrType(StrTypeContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.str_t);
	}

	@Override
	public StringConst visitStringExpr(StringExprContext ctx) {
		ASTWrapper.WString str = (WString) visit(ctx.string_const());
		return new StringConst(str.value);
	}

	@Override
	public ASTWrapper.WAssignOperation visitTimesAssignOp(
			TimesAssignOpContext ctx) {
		return new ASTWrapper.WAssignOperation(AssignOperation.mul_assign);
	}

	@Override
	public BoolConst visitTrueConst(TrueConstContext ctx) {
		return new BoolConst(true);
	}

	@Override
	public TypedVarList visitTypeVar(TypeVarContext ctx) {
		int lineNr = ctx.getStart().getLine();
		IdentifierList names = (IdentifierList) visit(ctx.vars);
		ASTWrapper.WSHLType type = (WSHLType) visit(ctx.var_type);
		return new TypedVarList(lineNr, names, type.value, currentVariableScope);
	}

	@Override
	public ASTNode visitUse_statement(Use_statementContext ctx) {
		// Info: this is not completely implemented, just don't use :D
		// Instead please declare the print functions in the beginning of the
		// file
		ASTWrapper.WString moduleName = (WString) visit(ctx.module_name);
		importModule(moduleName.value);
		return null;
	}

	@Override
	public FunctionDefList visitUseStmt(UseStmtContext ctx) {
		return (FunctionDefList) visit(ctx
				.function_declaration_list_or_use_statement());
	}

	@Override
	public ASTWrapper.WSHLType visitVac(VacContext ctx) {
		return new ASTWrapper.WSHLType(SHLType.vac_t);
	}

	@Override
	public ASTNode visitVarExpr(VarExprContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		return new VariableExpression(currentVariableScope.getVar(name));
	}

	@Override
	public ASTNode visitWhl_statement(Whl_statementContext ctx) {
		currentVariableScope.pushScope();
		Expression cond = (Expression) visit(ctx.cond);

		WhileStatement whlStmt = new WhileStatement();
		currentVariableScope.pushScope();
		currentLoop.push(whlStmt);
		ScopeStatement body = (ScopeStatement) visit(ctx.stmts);
		currentLoop.pop();
		currentVariableScope.popScope();

		currentVariableScope.popScope();
		whlStmt.setContent(cond, body);
		return whlStmt;
	}
}
