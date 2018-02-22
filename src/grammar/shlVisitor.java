// Generated from shl.g4 by ANTLR 4.2.1

package grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link shlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface shlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link shlParser#CmpLTExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpLTExpr(@NotNull shlParser.CmpLTExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#TypeVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVar(@NotNull shlParser.TypeVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ModExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(@NotNull shlParser.ModExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FnNative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnNative(@NotNull shlParser.FnNativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#BrkStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrkStmt(@NotNull shlParser.BrkStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(@NotNull shlParser.Use_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FalseConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseConst(@NotNull shlParser.FalseConstContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#Whl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhl(@NotNull shlParser.WhlContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#BoolType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(@NotNull shlParser.BoolTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#RetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(@NotNull shlParser.RetStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#IntType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull shlParser.IntTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#HexNr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexNr(@NotNull shlParser.HexNrContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull shlParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ExprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(@NotNull shlParser.ExprStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#LShiftAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLShiftAssignOp(@NotNull shlParser.LShiftAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#RetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetType(@NotNull shlParser.RetTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNrExpr(@NotNull shlParser.NrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ParenExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull shlParser.ParenExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NoneRetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneRetType(@NotNull shlParser.NoneRetTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CmpFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpFT(@NotNull shlParser.CmpFTContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CmpGTExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpGTExpr(@NotNull shlParser.CmpGTExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#PlusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(@NotNull shlParser.PlusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FnCallParmList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnCallParmList(@NotNull shlParser.FnCallParmListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#DecNr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecNr(@NotNull shlParser.DecNrContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#StrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrType(@NotNull shlParser.StrTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#OrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull shlParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull shlParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#function_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter_declaration(@NotNull shlParser.Function_parameter_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#PowExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(@NotNull shlParser.PowExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#BlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull shlParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#DivExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(@NotNull shlParser.DivExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#PlusAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAssignOp(@NotNull shlParser.PlusAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ElifList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifList(@NotNull shlParser.ElifListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull shlParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#RShiftAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRShiftAssignOp(@NotNull shlParser.RShiftAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#MinusAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusAssignOp(@NotNull shlParser.MinusAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#AndFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndFT(@NotNull shlParser.AndFTContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ArithFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithFT(@NotNull shlParser.ArithFTContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(@NotNull shlParser.If_condContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#AndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull shlParser.AndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#cnt_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnt_statement(@NotNull shlParser.Cnt_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#PowAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowAssignOp(@NotNull shlParser.PowAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#MainFn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFn(@NotNull shlParser.MainFnContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull shlParser.ParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#BinNr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinNr(@NotNull shlParser.BinNrContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NEFnCallParms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEFnCallParms(@NotNull shlParser.NEFnCallParmsContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CmpGEExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpGEExpr(@NotNull shlParser.CmpGEExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#for_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cond(@NotNull shlParser.For_condContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#Block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull shlParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#RetVoidStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetVoidStmt(@NotNull shlParser.RetVoidStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NormalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalStatement(@NotNull shlParser.NormalStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#Ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull shlParser.IdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(@NotNull shlParser.Assignment_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(@NotNull shlParser.Function_call_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(@NotNull shlParser.Statement_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#InitIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitIdent(@NotNull shlParser.InitIdentContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#BinFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinFT(@NotNull shlParser.BinFTContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#for_incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_incr(@NotNull shlParser.For_incrContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#InitVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVar(@NotNull shlParser.InitVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CmpNEExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpNEExpr(@NotNull shlParser.CmpNEExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CmpEQExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpEQExpr(@NotNull shlParser.CmpEQExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#StringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(@NotNull shlParser.StringExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#AssignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(@NotNull shlParser.AssignStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull shlParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#whl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhl_statement(@NotNull shlParser.Whl_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#brk_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrk_statement(@NotNull shlParser.Brk_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnDef(@NotNull shlParser.FnDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull shlParser.NotExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#VarExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(@NotNull shlParser.VarExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FnDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnDeclList(@NotNull shlParser.FnDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#string_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_const(@NotNull shlParser.String_constContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#EmptyFnCallParms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyFnCallParms(@NotNull shlParser.EmptyFnCallParmsContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NotFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFT(@NotNull shlParser.NotFTContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NoElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoElif(@NotNull shlParser.NoElifContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#Vac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVac(@NotNull shlParser.VacContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NonFnParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonFnParam(@NotNull shlParser.NonFnParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NoneEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneEl(@NotNull shlParser.NoneElContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#DeclStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStmt(@NotNull shlParser.DeclStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#MulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(@NotNull shlParser.MulExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CharType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(@NotNull shlParser.CharTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#TimesAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesAssignOp(@NotNull shlParser.TimesAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NoneVacType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneVacType(@NotNull shlParser.NoneVacTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ModAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAssignOp(@NotNull shlParser.ModAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#SingleFnCallParm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFnCallParm(@NotNull shlParser.SingleFnCallParmContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CntStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntStmt(@NotNull shlParser.CntStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(@NotNull shlParser.For_initContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#MulFT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulFT(@NotNull shlParser.MulFTContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull shlParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#IdentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentList(@NotNull shlParser.IdentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#ElStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElStatement(@NotNull shlParser.ElStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#initialized_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialized_identifier(@NotNull shlParser.Initialized_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnDecl(@NotNull shlParser.FnDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#BoolConstExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConstExpr(@NotNull shlParser.BoolConstExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#EmptyFnDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyFnDeclList(@NotNull shlParser.EmptyFnDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#AssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(@NotNull shlParser.AssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FnCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnCallExpr(@NotNull shlParser.FnCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#EmptyStmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmtList(@NotNull shlParser.EmptyStmtListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#RetTypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetTypeStmt(@NotNull shlParser.RetTypeStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#FloatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(@NotNull shlParser.FloatTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CastExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(@NotNull shlParser.CastExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#MinusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(@NotNull shlParser.MinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#SingleParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParam(@NotNull shlParser.SingleParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#OctNr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctNr(@NotNull shlParser.OctNrContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull shlParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#For}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull shlParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#TrueConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueConst(@NotNull shlParser.TrueConstContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#CmpLEExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpLEExpr(@NotNull shlParser.CmpLEExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#InitIdentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitIdentList(@NotNull shlParser.InitIdentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#NormalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalExpr(@NotNull shlParser.NormalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#whl_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhl_cond(@NotNull shlParser.Whl_condContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_statement(@NotNull shlParser.Elif_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#DivAssignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAssignOp(@NotNull shlParser.DivAssignOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link shlParser#UseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStmt(@NotNull shlParser.UseStmtContext ctx);
}