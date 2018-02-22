// Generated from shl.g4 by ANTLR 4.2.1

package grammar;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class shlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__49=1, T__48=2, T__47=3, T__46=4, T__45=5, T__44=6, T__43=7, T__42=8, 
		T__41=9, T__40=10, T__39=11, T__38=12, T__37=13, T__36=14, T__35=15, T__34=16, 
		T__33=17, T__32=18, T__31=19, T__30=20, T__29=21, T__28=22, T__27=23, 
		T__26=24, T__25=25, T__24=26, T__23=27, T__22=28, T__21=29, T__20=30, 
		T__19=31, T__18=32, T__17=33, T__16=34, T__15=35, T__14=36, T__13=37, 
		T__12=38, T__11=39, T__10=40, T__9=41, T__8=42, T__7=43, T__6=44, T__5=45, 
		T__4=46, T__3=47, T__2=48, T__1=49, T__0=50, TRUE=51, FALSE=52, DEC_NUMBER=53, 
		HEX_NUMBER=54, OCT_NUMBER=55, BIN_NUMBER=56, IDENTIFIER=57, STRING=58, 
		MULTI_COMMENT=59, LINE_COMMENT=60, WS=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'*'", "'chr'", "'<'", "'main'", "'!='", "'cnt'", "'<='", 
		"'}'", "'%'", "'use'", "'*='", "')'", "'el'", "'='", "'str'", "'!'", "'<<='", 
		"'-='", "','", "'-'", "'**'", "'('", "':'", "'if'", "'int'", "'var'", 
		"'ret'", "'>>='", "'{'", "'+='", "'native'", "'vac'", "'boo'", "'fn'", 
		"'+'", "'for'", "'elif'", "';'", "'whl'", "'&&'", "'flt'", "'**='", "'||'", 
		"'>'", "'%='", "'/='", "'brk'", "'=='", "'/'", "'>='", "'T'", "'F'", "DEC_NUMBER", 
		"HEX_NUMBER", "OCT_NUMBER", "BIN_NUMBER", "IDENTIFIER", "STRING", "MULTI_COMMENT", 
		"LINE_COMMENT", "WS"
	};
	public static final int
		RULE_unary_expression = 0, RULE_multiplication_expression = 1, RULE_arithmetic_expr = 2, 
		RULE_cmp_expr = 3, RULE_log_negation = 4, RULE_log_and_expr = 5, RULE_binary_expression = 6, 
		RULE_non_empty_function_call_params = 7, RULE_function_call_params = 8, 
		RULE_function_call_expression = 9, RULE_string_const = 10, RULE_number = 11, 
		RULE_bool_const = 12, RULE_cast_expression = 13, RULE_primary_expression = 14, 
		RULE_assign_operator = 15, RULE_assignment_statement = 16, RULE_expression = 17, 
		RULE_identifier_list = 18, RULE_initialized_identifier = 19, RULE_initialized_identifier_list = 20, 
		RULE_declaration = 21, RULE_elif_statement = 22, RULE_opt_elif_statement_list = 23, 
		RULE_if_statement = 24, RULE_else_statement = 25, RULE_if_cond = 26, RULE_for_statement = 27, 
		RULE_for_init = 28, RULE_for_cond = 29, RULE_for_incr = 30, RULE_whl_statement = 31, 
		RULE_whl_cond = 32, RULE_ret_statement = 33, RULE_brk_statement = 34, 
		RULE_cnt_statement = 35, RULE_statement = 36, RULE_block_statement = 37, 
		RULE_type = 38, RULE_type_or_void = 39, RULE_statement_list = 40, RULE_statement_block = 41, 
		RULE_function_parameter_declaration = 42, RULE_function_parameter_list = 43, 
		RULE_opt_return_type = 44, RULE_function_declaration = 45, RULE_use_statement = 46, 
		RULE_function_declaration_list_or_use_statement = 47, RULE_start = 48;
	public static final String[] ruleNames = {
		"unary_expression", "multiplication_expression", "arithmetic_expr", "cmp_expr", 
		"log_negation", "log_and_expr", "binary_expression", "non_empty_function_call_params", 
		"function_call_params", "function_call_expression", "string_const", "number", 
		"bool_const", "cast_expression", "primary_expression", "assign_operator", 
		"assignment_statement", "expression", "identifier_list", "initialized_identifier", 
		"initialized_identifier_list", "declaration", "elif_statement", "opt_elif_statement_list", 
		"if_statement", "else_statement", "if_cond", "for_statement", "for_init", 
		"for_cond", "for_incr", "whl_statement", "whl_cond", "ret_statement", 
		"brk_statement", "cnt_statement", "statement", "block_statement", "type", 
		"type_or_void", "statement_list", "statement_block", "function_parameter_declaration", 
		"function_parameter_list", "opt_return_type", "function_declaration", 
		"use_statement", "function_declaration_list_or_use_statement", "start"
	};

	@Override
	public String getGrammarFileName() { return "shl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public shlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Unary_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); cast_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplication_expressionContext extends ParserRuleContext {
		public Multiplication_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication_expression; }
	 
		public Multiplication_expressionContext() { }
		public void copyFrom(Multiplication_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivExprContext extends Multiplication_expressionContext {
		public Multiplication_expressionContext lhs;
		public Unary_expressionContext rhs;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public DivExprContext(Multiplication_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends Multiplication_expressionContext {
		public Multiplication_expressionContext lhs;
		public Unary_expressionContext rhs;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public MulExprContext(Multiplication_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExprContext extends Multiplication_expressionContext {
		public Multiplication_expressionContext lhs;
		public Unary_expressionContext rhs;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public ModExprContext(Multiplication_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends Multiplication_expressionContext {
		public Multiplication_expressionContext lhs;
		public Unary_expressionContext rhs;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public PowExprContext(Multiplication_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulFTContext extends Multiplication_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public MulFTContext(Multiplication_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitMulFT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplication_expressionContext multiplication_expression() throws RecognitionException {
		return multiplication_expression(0);
	}

	private Multiplication_expressionContext multiplication_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplication_expressionContext _localctx = new Multiplication_expressionContext(_ctx, _parentState);
		Multiplication_expressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_multiplication_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulFTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(101); unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new Multiplication_expressionContext(_parentctx, _parentState));
						((PowExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplication_expression);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104); match(21);
						setState(105); ((PowExprContext)_localctx).rhs = unary_expression();
						}
						break;

					case 2:
						{
						_localctx = new MulExprContext(new Multiplication_expressionContext(_parentctx, _parentState));
						((MulExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplication_expression);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107); match(1);
						setState(108); ((MulExprContext)_localctx).rhs = unary_expression();
						}
						break;

					case 3:
						{
						_localctx = new DivExprContext(new Multiplication_expressionContext(_parentctx, _parentState));
						((DivExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplication_expression);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110); match(49);
						setState(111); ((DivExprContext)_localctx).rhs = unary_expression();
						}
						break;

					case 4:
						{
						_localctx = new ModExprContext(new Multiplication_expressionContext(_parentctx, _parentState));
						((ModExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplication_expression);
						setState(112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(113); match(9);
						setState(114); ((ModExprContext)_localctx).rhs = unary_expression();
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusExprContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext lhs;
		public Multiplication_expressionContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public MinusExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithFTContext extends Arithmetic_exprContext {
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public ArithFTContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitArithFT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext lhs;
		public Multiplication_expressionContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Multiplication_expressionContext multiplication_expression() {
			return getRuleContext(Multiplication_expressionContext.class,0);
		}
		public PlusExprContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_arithmetic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArithFTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(121); multiplication_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((PlusExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124); match(35);
						setState(125); ((PlusExprContext)_localctx).rhs = multiplication_expression(0);
						}
						break;

					case 2:
						{
						_localctx = new MinusExprContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((MinusExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(127); match(20);
						setState(128); ((MinusExprContext)_localctx).rhs = multiplication_expression(0);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cmp_exprContext extends ParserRuleContext {
		public Cmp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_expr; }
	 
		public Cmp_exprContext() { }
		public void copyFrom(Cmp_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmpLTExprContext extends Cmp_exprContext {
		public Cmp_exprContext lhs;
		public Arithmetic_exprContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public CmpLTExprContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpLTExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpNEExprContext extends Cmp_exprContext {
		public Cmp_exprContext lhs;
		public Arithmetic_exprContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public CmpNEExprContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpNEExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpEQExprContext extends Cmp_exprContext {
		public Cmp_exprContext lhs;
		public Arithmetic_exprContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public CmpEQExprContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpEQExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpFTContext extends Cmp_exprContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public CmpFTContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpFT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpGTExprContext extends Cmp_exprContext {
		public Cmp_exprContext lhs;
		public Arithmetic_exprContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public CmpGTExprContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpGTExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpLEExprContext extends Cmp_exprContext {
		public Cmp_exprContext lhs;
		public Arithmetic_exprContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public CmpLEExprContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpLEExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpGEExprContext extends Cmp_exprContext {
		public Cmp_exprContext lhs;
		public Arithmetic_exprContext rhs;
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public CmpGEExprContext(Cmp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCmpGEExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_exprContext cmp_expr() throws RecognitionException {
		return cmp_expr(0);
	}

	private Cmp_exprContext cmp_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cmp_exprContext _localctx = new Cmp_exprContext(_ctx, _parentState);
		Cmp_exprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_cmp_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CmpFTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(135); arithmetic_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new CmpLTExprContext(new Cmp_exprContext(_parentctx, _parentState));
						((CmpLTExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cmp_expr);
						setState(137);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(138); match(3);
						setState(139); ((CmpLTExprContext)_localctx).rhs = arithmetic_expr(0);
						}
						break;

					case 2:
						{
						_localctx = new CmpLEExprContext(new Cmp_exprContext(_parentctx, _parentState));
						((CmpLEExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cmp_expr);
						setState(140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141); match(7);
						setState(142); ((CmpLEExprContext)_localctx).rhs = arithmetic_expr(0);
						}
						break;

					case 3:
						{
						_localctx = new CmpGTExprContext(new Cmp_exprContext(_parentctx, _parentState));
						((CmpGTExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cmp_expr);
						setState(143);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(144); match(44);
						setState(145); ((CmpGTExprContext)_localctx).rhs = arithmetic_expr(0);
						}
						break;

					case 4:
						{
						_localctx = new CmpGEExprContext(new Cmp_exprContext(_parentctx, _parentState));
						((CmpGEExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cmp_expr);
						setState(146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(147); match(50);
						setState(148); ((CmpGEExprContext)_localctx).rhs = arithmetic_expr(0);
						}
						break;

					case 5:
						{
						_localctx = new CmpEQExprContext(new Cmp_exprContext(_parentctx, _parentState));
						((CmpEQExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cmp_expr);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150); match(48);
						setState(151); ((CmpEQExprContext)_localctx).rhs = arithmetic_expr(0);
						}
						break;

					case 6:
						{
						_localctx = new CmpNEExprContext(new Cmp_exprContext(_parentctx, _parentState));
						((CmpNEExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cmp_expr);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153); match(5);
						setState(154); ((CmpNEExprContext)_localctx).rhs = arithmetic_expr(0);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Log_negationContext extends ParserRuleContext {
		public Log_negationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_negation; }
	 
		public Log_negationContext() { }
		public void copyFrom(Log_negationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends Log_negationContext {
		public Log_negationContext expr;
		public Log_negationContext log_negation() {
			return getRuleContext(Log_negationContext.class,0);
		}
		public NotExprContext(Log_negationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFTContext extends Log_negationContext {
		public Cmp_exprContext cmp_expr() {
			return getRuleContext(Cmp_exprContext.class,0);
		}
		public NotFTContext(Log_negationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNotFT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_negationContext log_negation() throws RecognitionException {
		Log_negationContext _localctx = new Log_negationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_log_negation);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case 16:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(16);
				setState(161); ((NotExprContext)_localctx).expr = log_negation();
				}
				break;
			case 22:
			case TRUE:
			case FALSE:
			case DEC_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case BIN_NUMBER:
			case IDENTIFIER:
			case STRING:
				_localctx = new NotFTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162); cmp_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Log_and_exprContext extends ParserRuleContext {
		public Log_and_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_and_expr; }
	 
		public Log_and_exprContext() { }
		public void copyFrom(Log_and_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends Log_and_exprContext {
		public Log_and_exprContext lhs;
		public Log_negationContext rhs;
		public Log_negationContext log_negation() {
			return getRuleContext(Log_negationContext.class,0);
		}
		public Log_and_exprContext log_and_expr() {
			return getRuleContext(Log_and_exprContext.class,0);
		}
		public AndExprContext(Log_and_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndFTContext extends Log_and_exprContext {
		public Log_negationContext log_negation() {
			return getRuleContext(Log_negationContext.class,0);
		}
		public AndFTContext(Log_and_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitAndFT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_and_exprContext log_and_expr() throws RecognitionException {
		return log_and_expr(0);
	}

	private Log_and_exprContext log_and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Log_and_exprContext _localctx = new Log_and_exprContext(_ctx, _parentState);
		Log_and_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_log_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndFTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(166); log_negation();
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new Log_and_exprContext(_parentctx, _parentState));
					((AndExprContext)_localctx).lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_log_and_expr);
					setState(168);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(169); match(40);
					setState(170); ((AndExprContext)_localctx).rhs = log_negation();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
	 
		public Binary_expressionContext() { }
		public void copyFrom(Binary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrExprContext extends Binary_expressionContext {
		public Binary_expressionContext lhs;
		public Log_and_exprContext rhs;
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Log_and_exprContext log_and_expr() {
			return getRuleContext(Log_and_exprContext.class,0);
		}
		public OrExprContext(Binary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinFTContext extends Binary_expressionContext {
		public Log_and_exprContext log_and_expr() {
			return getRuleContext(Log_and_exprContext.class,0);
		}
		public BinFTContext(Binary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBinFT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		return binary_expression(0);
	}

	private Binary_expressionContext binary_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, _parentState);
		Binary_expressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_binary_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BinFTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(177); log_and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new Binary_expressionContext(_parentctx, _parentState));
					((OrExprContext)_localctx).lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180); match(43);
					setState(181); ((OrExprContext)_localctx).rhs = log_and_expr(0);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Non_empty_function_call_paramsContext extends ParserRuleContext {
		public Non_empty_function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_function_call_params; }
	 
		public Non_empty_function_call_paramsContext() { }
		public void copyFrom(Non_empty_function_call_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleFnCallParmContext extends Non_empty_function_call_paramsContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleFnCallParmContext(Non_empty_function_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitSingleFnCallParm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FnCallParmListContext extends Non_empty_function_call_paramsContext {
		public Non_empty_function_call_paramsContext list;
		public ExpressionContext expr;
		public Non_empty_function_call_paramsContext non_empty_function_call_params() {
			return getRuleContext(Non_empty_function_call_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FnCallParmListContext(Non_empty_function_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFnCallParmList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_function_call_paramsContext non_empty_function_call_params() throws RecognitionException {
		return non_empty_function_call_params(0);
	}

	private Non_empty_function_call_paramsContext non_empty_function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_function_call_paramsContext _localctx = new Non_empty_function_call_paramsContext(_ctx, _parentState);
		Non_empty_function_call_paramsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_non_empty_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleFnCallParmContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(188); ((SingleFnCallParmContext)_localctx).expr = expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FnCallParmListContext(new Non_empty_function_call_paramsContext(_parentctx, _parentState));
					((FnCallParmListContext)_localctx).list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_function_call_params);
					setState(190);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(191); match(19);
					setState(192); ((FnCallParmListContext)_localctx).expr = expression();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_call_paramsContext extends ParserRuleContext {
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
	 
		public Function_call_paramsContext() { }
		public void copyFrom(Function_call_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEFnCallParmsContext extends Function_call_paramsContext {
		public Non_empty_function_call_paramsContext non_empty_function_call_params() {
			return getRuleContext(Non_empty_function_call_paramsContext.class,0);
		}
		public NEFnCallParmsContext(Function_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNEFnCallParms(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyFnCallParmsContext extends Function_call_paramsContext {
		public EmptyFnCallParmsContext(Function_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitEmptyFnCallParms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call_params);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case 16:
			case 22:
			case TRUE:
			case FALSE:
			case DEC_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case BIN_NUMBER:
			case IDENTIFIER:
			case STRING:
				_localctx = new NEFnCallParmsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198); non_empty_function_call_params(0);
				}
				break;
			case 12:
				_localctx = new EmptyFnCallParmsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_expressionContext extends ParserRuleContext {
		public Token ident;
		public Function_call_paramsContext parms;
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_expressionContext function_call_expression() throws RecognitionException {
		Function_call_expressionContext _localctx = new Function_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); ((Function_call_expressionContext)_localctx).ident = match(IDENTIFIER);
			setState(203); match(22);
			setState(204); ((Function_call_expressionContext)_localctx).parms = function_call_params();
			setState(205); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_constContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(shlParser.STRING, 0); }
		public String_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_const; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitString_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_constContext string_const() throws RecognitionException {
		String_constContext _localctx = new String_constContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OctNrContext extends NumberContext {
		public TerminalNode OCT_NUMBER() { return getToken(shlParser.OCT_NUMBER, 0); }
		public OctNrContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitOctNr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinNrContext extends NumberContext {
		public TerminalNode BIN_NUMBER() { return getToken(shlParser.BIN_NUMBER, 0); }
		public BinNrContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBinNr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexNrContext extends NumberContext {
		public TerminalNode HEX_NUMBER() { return getToken(shlParser.HEX_NUMBER, 0); }
		public HexNrContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitHexNr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecNrContext extends NumberContext {
		public TerminalNode DEC_NUMBER() { return getToken(shlParser.DEC_NUMBER, 0); }
		public DecNrContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitDecNr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case DEC_NUMBER:
				_localctx = new DecNrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(DEC_NUMBER);
				}
				break;
			case HEX_NUMBER:
				_localctx = new HexNrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(HEX_NUMBER);
				}
				break;
			case OCT_NUMBER:
				_localctx = new OctNrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211); match(OCT_NUMBER);
				}
				break;
			case BIN_NUMBER:
				_localctx = new BinNrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212); match(BIN_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_constContext extends ParserRuleContext {
		public Bool_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_const; }
	 
		public Bool_constContext() { }
		public void copyFrom(Bool_constContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseConstContext extends Bool_constContext {
		public TerminalNode FALSE() { return getToken(shlParser.FALSE, 0); }
		public FalseConstContext(Bool_constContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFalseConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueConstContext extends Bool_constContext {
		public TerminalNode TRUE() { return getToken(shlParser.TRUE, 0); }
		public TrueConstContext(Bool_constContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitTrueConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_constContext bool_const() throws RecognitionException {
		Bool_constContext _localctx = new Bool_constContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_const);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216); match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
	 
		public Cast_expressionContext() { }
		public void copyFrom(Cast_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalExprContext extends Cast_expressionContext {
		public Primary_expressionContext expr;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public NormalExprContext(Cast_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNormalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprContext extends Cast_expressionContext {
		public Primary_expressionContext expr;
		public TypeContext cast_type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public CastExprContext(Cast_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cast_expression);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CastExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219); ((CastExprContext)_localctx).expr = primary_expression();
				setState(220); match(23);
				setState(221); ((CastExprContext)_localctx).cast_type = type();
				}
				break;

			case 2:
				_localctx = new NormalExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223); ((NormalExprContext)_localctx).expr = primary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NrExprContext extends Primary_expressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NrExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends Primary_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstExprContext extends Primary_expressionContext {
		public Bool_constContext bool_const() {
			return getRuleContext(Bool_constContext.class,0);
		}
		public BoolConstExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBoolConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FnCallExprContext extends Primary_expressionContext {
		public Function_call_expressionContext function_call_expression() {
			return getRuleContext(Function_call_expressionContext.class,0);
		}
		public FnCallExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFnCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends Primary_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public VarExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExprContext extends Primary_expressionContext {
		public String_constContext string_const() {
			return getRuleContext(String_constContext.class,0);
		}
		public StringExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary_expression);
		try {
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); match(IDENTIFIER);
				}
				break;

			case 2:
				_localctx = new NrExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227); number();
				}
				break;

			case 3:
				_localctx = new BoolConstExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228); bool_const();
				}
				break;

			case 4:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229); string_const();
				}
				break;

			case 5:
				_localctx = new FnCallExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230); function_call_expression();
				}
				break;

			case 6:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(231); match(22);
				setState(232); expression();
				setState(233); match(12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_operatorContext extends ParserRuleContext {
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
	 
		public Assign_operatorContext() { }
		public void copyFrom(Assign_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModAssignOpContext extends Assign_operatorContext {
		public ModAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitModAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusAssignOpContext extends Assign_operatorContext {
		public PlusAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitPlusAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LShiftAssignOpContext extends Assign_operatorContext {
		public LShiftAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitLShiftAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignOpContext extends Assign_operatorContext {
		public AssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowAssignOpContext extends Assign_operatorContext {
		public PowAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitPowAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivAssignOpContext extends Assign_operatorContext {
		public DivAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitDivAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RShiftAssignOpContext extends Assign_operatorContext {
		public RShiftAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitRShiftAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusAssignOpContext extends Assign_operatorContext {
		public MinusAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitMinusAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesAssignOpContext extends Assign_operatorContext {
		public TimesAssignOpContext(Assign_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitTimesAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_operator);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case 14:
				_localctx = new AssignOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237); match(14);
				}
				break;
			case 30:
				_localctx = new PlusAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(30);
				}
				break;
			case 18:
				_localctx = new MinusAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239); match(18);
				}
				break;
			case 11:
				_localctx = new TimesAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240); match(11);
				}
				break;
			case 46:
				_localctx = new DivAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241); match(46);
				}
				break;
			case 45:
				_localctx = new ModAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242); match(45);
				}
				break;
			case 17:
				_localctx = new LShiftAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(243); match(17);
				}
				break;
			case 28:
				_localctx = new RShiftAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(244); match(28);
				}
				break;
			case 42:
				_localctx = new PowAssignOpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(245); match(42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public Token ident;
		public Assign_operatorContext op;
		public ExpressionContext expr;
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); ((Assignment_statementContext)_localctx).ident = match(IDENTIFIER);
			setState(249); ((Assignment_statementContext)_localctx).op = assign_operator();
			setState(250); ((Assignment_statementContext)_localctx).expr = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); binary_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
	 
		public Identifier_listContext() { }
		public void copyFrom(Identifier_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentContext extends Identifier_listContext {
		public Token ident;
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public IdentContext(Identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentListContext extends Identifier_listContext {
		public Token ident;
		public Identifier_listContext list;
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public IdentListContext(Identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitIdentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier_list);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IdentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254); ((IdentListContext)_localctx).ident = match(IDENTIFIER);
				setState(255); match(19);
				setState(256); ((IdentListContext)_localctx).list = identifier_list();
				}
				break;

			case 2:
				_localctx = new IdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257); ((IdentContext)_localctx).ident = match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initialized_identifierContext extends ParserRuleContext {
		public Token ident;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Initialized_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialized_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitInitialized_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialized_identifierContext initialized_identifier() throws RecognitionException {
		Initialized_identifierContext _localctx = new Initialized_identifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initialized_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); ((Initialized_identifierContext)_localctx).ident = match(IDENTIFIER);
			setState(261); match(14);
			setState(262); ((Initialized_identifierContext)_localctx).expr = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initialized_identifier_listContext extends ParserRuleContext {
		public Initialized_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialized_identifier_list; }
	 
		public Initialized_identifier_listContext() { }
		public void copyFrom(Initialized_identifier_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitIdentContext extends Initialized_identifier_listContext {
		public Initialized_identifierContext ident;
		public Initialized_identifierContext initialized_identifier() {
			return getRuleContext(Initialized_identifierContext.class,0);
		}
		public InitIdentContext(Initialized_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitInitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitIdentListContext extends Initialized_identifier_listContext {
		public Initialized_identifier_listContext list;
		public Initialized_identifierContext ident;
		public Initialized_identifierContext initialized_identifier() {
			return getRuleContext(Initialized_identifierContext.class,0);
		}
		public Initialized_identifier_listContext initialized_identifier_list() {
			return getRuleContext(Initialized_identifier_listContext.class,0);
		}
		public InitIdentListContext(Initialized_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitInitIdentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialized_identifier_listContext initialized_identifier_list() throws RecognitionException {
		return initialized_identifier_list(0);
	}

	private Initialized_identifier_listContext initialized_identifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Initialized_identifier_listContext _localctx = new Initialized_identifier_listContext(_ctx, _parentState);
		Initialized_identifier_listContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_initialized_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InitIdentContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(265); ((InitIdentContext)_localctx).ident = initialized_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitIdentListContext(new Initialized_identifier_listContext(_parentctx, _parentState));
					((InitIdentListContext)_localctx).list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_initialized_identifier_list);
					setState(267);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(268); match(19);
					setState(269); ((InitIdentListContext)_localctx).ident = initialized_identifier();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeVarContext extends DeclarationContext {
		public Identifier_listContext vars;
		public TypeContext var_type;
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVarContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitTypeVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitVarContext extends DeclarationContext {
		public Initialized_identifier_listContext vars;
		public Initialized_identifier_listContext initialized_identifier_list() {
			return getRuleContext(Initialized_identifier_listContext.class,0);
		}
		public InitVarContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitInitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaration);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new InitVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275); match(26);
				setState(276); ((InitVarContext)_localctx).vars = initialized_identifier_list(0);
				}
				break;

			case 2:
				_localctx = new TypeVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277); match(26);
				setState(278); ((TypeVarContext)_localctx).vars = identifier_list();
				setState(279); match(23);
				setState(280); ((TypeVarContext)_localctx).var_type = type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_statementContext extends ParserRuleContext {
		public If_condContext cond;
		public Statement_blockContext stmts;
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(37);
			setState(285); ((Elif_statementContext)_localctx).cond = if_cond();
			setState(286); ((Elif_statementContext)_localctx).stmts = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_elif_statement_listContext extends ParserRuleContext {
		public Opt_elif_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_elif_statement_list; }
	 
		public Opt_elif_statement_listContext() { }
		public void copyFrom(Opt_elif_statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElifListContext extends Opt_elif_statement_listContext {
		public Elif_statementContext elif_stmt;
		public Opt_elif_statement_listContext list;
		public Opt_elif_statement_listContext opt_elif_statement_list() {
			return getRuleContext(Opt_elif_statement_listContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public ElifListContext(Opt_elif_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitElifList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoElifContext extends Opt_elif_statement_listContext {
		public NoElifContext(Opt_elif_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNoElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_elif_statement_listContext opt_elif_statement_list() throws RecognitionException {
		Opt_elif_statement_listContext _localctx = new Opt_elif_statement_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opt_elif_statement_list);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ElifListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288); ((ElifListContext)_localctx).elif_stmt = elif_statement();
				setState(289); ((ElifListContext)_localctx).list = opt_elif_statement_list();
				}
				break;

			case 2:
				_localctx = new NoElifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public If_condContext cond;
		public Statement_blockContext then;
		public Opt_elif_statement_listContext elifstmt;
		public Else_statementContext else_stmt;
		public Opt_elif_statement_listContext opt_elif_statement_list() {
			return getRuleContext(Opt_elif_statement_listContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(24);
			setState(295); ((If_statementContext)_localctx).cond = if_cond();
			setState(296); ((If_statementContext)_localctx).then = statement_block();
			setState(297); ((If_statementContext)_localctx).elifstmt = opt_elif_statement_list();
			setState(298); ((If_statementContext)_localctx).else_stmt = else_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	 
		public Else_statementContext() { }
		public void copyFrom(Else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoneElContext extends Else_statementContext {
		public NoneElContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNoneEl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElStatementContext extends Else_statementContext {
		public Statement_blockContext stmts;
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public ElStatementContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitElStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_statement);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ElStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300); match(13);
				setState(301); ((ElStatementContext)_localctx).stmts = statement_block();
				}
				break;

			case 2:
				_localctx = new NoneElContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_condContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitIf_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); binary_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public For_initContext init;
		public For_condContext cond;
		public For_incrContext incr;
		public Statement_blockContext stmts;
		public For_condContext for_cond() {
			return getRuleContext(For_condContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public For_incrContext for_incr() {
			return getRuleContext(For_incrContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(36);
			setState(308); ((For_statementContext)_localctx).init = for_init();
			setState(309); match(38);
			setState(310); ((For_statementContext)_localctx).cond = for_cond();
			setState(311); match(38);
			setState(312); ((For_statementContext)_localctx).incr = for_incr();
			setState(313); ((For_statementContext)_localctx).stmts = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_init);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case 16:
			case 22:
			case TRUE:
			case FALSE:
			case DEC_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case BIN_NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); expression();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_condContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFor_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_condContext for_cond() throws RecognitionException {
		For_condContext _localctx = new For_condContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_incrContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_incrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_incr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFor_incr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_incrContext for_incr() throws RecognitionException {
		For_incrContext _localctx = new For_incrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_incr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Whl_statementContext extends ParserRuleContext {
		public Whl_condContext cond;
		public Statement_blockContext stmts;
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Whl_condContext whl_cond() {
			return getRuleContext(Whl_condContext.class,0);
		}
		public Whl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whl_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitWhl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whl_statementContext whl_statement() throws RecognitionException {
		Whl_statementContext _localctx = new Whl_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(39);
			setState(324); ((Whl_statementContext)_localctx).cond = whl_cond();
			setState(325); ((Whl_statementContext)_localctx).stmts = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Whl_condContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Whl_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whl_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitWhl_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whl_condContext whl_cond() throws RecognitionException {
		Whl_condContext _localctx = new Whl_condContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whl_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ret_statementContext extends ParserRuleContext {
		public Ret_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_statement; }
	 
		public Ret_statementContext() { }
		public void copyFrom(Ret_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RetVoidStmtContext extends Ret_statementContext {
		public RetVoidStmtContext(Ret_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitRetVoidStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetTypeStmtContext extends Ret_statementContext {
		public ExpressionContext val;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetTypeStmtContext(Ret_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitRetTypeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_statementContext ret_statement() throws RecognitionException {
		Ret_statementContext _localctx = new Ret_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ret_statement);
		try {
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new RetTypeStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329); match(27);
				setState(330); ((RetTypeStmtContext)_localctx).val = expression();
				}
				break;

			case 2:
				_localctx = new RetVoidStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331); match(27);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Brk_statementContext extends ParserRuleContext {
		public Brk_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brk_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBrk_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Brk_statementContext brk_statement() throws RecognitionException {
		Brk_statementContext _localctx = new Brk_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_brk_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cnt_statementContext extends ParserRuleContext {
		public Cnt_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnt_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCnt_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cnt_statementContext cnt_statement() throws RecognitionException {
		Cnt_statementContext _localctx = new Cnt_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cnt_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CntStmtContext extends StatementContext {
		public Cnt_statementContext cnt_statement() {
			return getRuleContext(Cnt_statementContext.class,0);
		}
		public CntStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCntStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclStmtContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetStmtContext extends StatementContext {
		public Ret_statementContext ret_statement() {
			return getRuleContext(Ret_statementContext.class,0);
		}
		public RetStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BrkStmtContext extends StatementContext {
		public Brk_statementContext brk_statement() {
			return getRuleContext(Brk_statementContext.class,0);
		}
		public BrkStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBrkStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmtContext extends StatementContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new DeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338); declaration();
				}
				break;

			case 2:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(339); assignment_statement();
				}
				break;

			case 3:
				_localctx = new RetStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(340); ret_statement();
				}
				break;

			case 4:
				_localctx = new BrkStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(341); brk_statement();
				}
				break;

			case 5:
				_localctx = new CntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(342); cnt_statement();
				}
				break;

			case 6:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(343); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
	 
		public Block_statementContext() { }
		public void copyFrom(Block_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhlContext extends Block_statementContext {
		public Whl_statementContext whl_statement() {
			return getRuleContext(Whl_statementContext.class,0);
		}
		public WhlContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitWhl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends Block_statementContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends Block_statementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends Block_statementContext {
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public BlockContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block_statement);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case 29:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346); statement_block();
				}
				break;
			case 24:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347); if_statement();
				}
				break;
			case 36:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348); for_statement();
				}
				break;
			case 39:
				_localctx = new WhlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(349); whl_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrTypeContext extends TypeContext {
		public StrTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitStrType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTypeContext extends TypeContext {
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeContext extends TypeContext {
		public FloatTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			setState(357);
			switch (_input.LA(1)) {
			case 25:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352); match(25);
				}
				break;
			case 41:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353); match(41);
				}
				break;
			case 33:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354); match(33);
				}
				break;
			case 2:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(355); match(2);
				}
				break;
			case 15:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_or_voidContext extends ParserRuleContext {
		public Type_or_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_or_void; }
	 
		public Type_or_voidContext() { }
		public void copyFrom(Type_or_voidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoneVacTypeContext extends Type_or_voidContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NoneVacTypeContext(Type_or_voidContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNoneVacType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VacContext extends Type_or_voidContext {
		public VacContext(Type_or_voidContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitVac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_or_voidContext type_or_void() throws RecognitionException {
		Type_or_voidContext _localctx = new Type_or_voidContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_or_void);
		try {
			setState(361);
			switch (_input.LA(1)) {
			case 2:
			case 15:
			case 25:
			case 33:
			case 41:
				_localctx = new NoneVacTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359); type();
				}
				break;
			case 32:
				_localctx = new VacContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(360); match(32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	 
		public Statement_listContext() { }
		public void copyFrom(Statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalStatementContext extends Statement_listContext {
		public Statement_listContext list;
		public StatementContext stmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public NormalStatementContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNormalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtListContext extends Statement_listContext {
		public EmptyStmtListContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitEmptyStmtList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends Statement_listContext {
		public Statement_listContext list;
		public Block_statementContext stmt;
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockStatementContext(Statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EmptyStmtListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(370);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new NormalStatementContext(new Statement_listContext(_parentctx, _parentState));
						((NormalStatementContext)_localctx).list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
						setState(364);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(365); ((NormalStatementContext)_localctx).stmt = statement();
						setState(366); match(38);
						}
						break;

					case 2:
						{
						_localctx = new BlockStatementContext(new Statement_listContext(_parentctx, _parentState));
						((BlockStatementContext)_localctx).list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
						setState(368);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(369); ((BlockStatementContext)_localctx).stmt = block_statement();
						}
						break;
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public Statement_listContext stmt_list;
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(29);
			setState(376); ((Statement_blockContext)_localctx).stmt_list = statement_list(0);
			setState(377); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_declarationContext extends ParserRuleContext {
		public TypeContext parm_type;
		public Identifier_listContext id_list;
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFunction_parameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameter_declarationContext function_parameter_declaration() throws RecognitionException {
		Function_parameter_declarationContext _localctx = new Function_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); ((Function_parameter_declarationContext)_localctx).parm_type = type();
			setState(380); ((Function_parameter_declarationContext)_localctx).id_list = identifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_listContext extends ParserRuleContext {
		public Function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_list; }
	 
		public Function_parameter_listContext() { }
		public void copyFrom(Function_parameter_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonFnParamContext extends Function_parameter_listContext {
		public NonFnParamContext(Function_parameter_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNonFnParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleParamContext extends Function_parameter_listContext {
		public Function_parameter_declarationContext parm;
		public Function_parameter_declarationContext function_parameter_declaration() {
			return getRuleContext(Function_parameter_declarationContext.class,0);
		}
		public SingleParamContext(Function_parameter_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitSingleParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamListContext extends Function_parameter_listContext {
		public Function_parameter_declarationContext parm;
		public Function_parameter_listContext list;
		public Function_parameter_declarationContext function_parameter_declaration() {
			return getRuleContext(Function_parameter_declarationContext.class,0);
		}
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public ParamListContext(Function_parameter_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameter_listContext function_parameter_list() throws RecognitionException {
		Function_parameter_listContext _localctx = new Function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_parameter_list);
		try {
			setState(388);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ParamListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382); ((ParamListContext)_localctx).parm = function_parameter_declaration();
				setState(383); match(38);
				setState(384); ((ParamListContext)_localctx).list = function_parameter_list();
				}
				break;

			case 2:
				_localctx = new SingleParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386); ((SingleParamContext)_localctx).parm = function_parameter_declaration();
				}
				break;

			case 3:
				_localctx = new NonFnParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_return_typeContext extends ParserRuleContext {
		public Opt_return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_return_type; }
	 
		public Opt_return_typeContext() { }
		public void copyFrom(Opt_return_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RetTypeContext extends Opt_return_typeContext {
		public Type_or_voidContext type_or_void() {
			return getRuleContext(Type_or_voidContext.class,0);
		}
		public RetTypeContext(Opt_return_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitRetType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoneRetTypeContext extends Opt_return_typeContext {
		public NoneRetTypeContext(Opt_return_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitNoneRetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_return_typeContext opt_return_type() throws RecognitionException {
		Opt_return_typeContext _localctx = new Opt_return_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_opt_return_type);
		try {
			setState(393);
			switch (_input.LA(1)) {
			case 23:
				_localctx = new RetTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390); match(23);
				setState(391); type_or_void();
				}
				break;
			case 29:
			case 31:
			case 38:
				_localctx = new NoneRetTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FnDeclContext extends Function_declarationContext {
		public Function_parameter_listContext params;
		public Opt_return_typeContext ret;
		public Opt_return_typeContext opt_return_type() {
			return getRuleContext(Opt_return_typeContext.class,0);
		}
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public FnDeclContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFnDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FnNativeContext extends Function_declarationContext {
		public Function_parameter_listContext params;
		public Opt_return_typeContext ret;
		public String_constContext pkgname;
		public Opt_return_typeContext opt_return_type() {
			return getRuleContext(Opt_return_typeContext.class,0);
		}
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public String_constContext string_const() {
			return getRuleContext(String_constContext.class,0);
		}
		public FnNativeContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFnNative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MainFnContext extends Function_declarationContext {
		public Statement_blockContext body;
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public MainFnContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitMainFn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FnDefContext extends Function_declarationContext {
		public Function_parameter_listContext params;
		public Opt_return_typeContext ret;
		public Statement_blockContext body;
		public Opt_return_typeContext opt_return_type() {
			return getRuleContext(Opt_return_typeContext.class,0);
		}
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(shlParser.IDENTIFIER, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public FnDefContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_declaration);
		try {
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new MainFnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395); match(34);
				setState(396); match(4);
				setState(397); match(22);
				setState(398); match(12);
				setState(399); ((MainFnContext)_localctx).body = statement_block();
				}
				break;

			case 2:
				_localctx = new FnDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400); match(34);
				setState(401); match(IDENTIFIER);
				setState(402); match(22);
				setState(403); ((FnDefContext)_localctx).params = function_parameter_list();
				setState(404); match(12);
				setState(405); ((FnDefContext)_localctx).ret = opt_return_type();
				setState(406); ((FnDefContext)_localctx).body = statement_block();
				}
				break;

			case 3:
				_localctx = new FnDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408); match(34);
				setState(409); match(IDENTIFIER);
				setState(410); match(22);
				setState(411); ((FnDeclContext)_localctx).params = function_parameter_list();
				setState(412); match(12);
				setState(413); ((FnDeclContext)_localctx).ret = opt_return_type();
				setState(414); match(38);
				}
				break;

			case 4:
				_localctx = new FnNativeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(416); match(34);
				setState(417); match(IDENTIFIER);
				setState(418); match(22);
				setState(419); ((FnNativeContext)_localctx).params = function_parameter_list();
				setState(420); match(12);
				setState(421); ((FnNativeContext)_localctx).ret = opt_return_type();
				setState(422); match(31);
				setState(423); ((FnNativeContext)_localctx).pkgname = string_const();
				setState(424); match(38);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_statementContext extends ParserRuleContext {
		public String_constContext module_name;
		public String_constContext string_const() {
			return getRuleContext(String_constContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(10);
			setState(429); ((Use_statementContext)_localctx).module_name = string_const();
			setState(430); match(38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declaration_list_or_use_statementContext extends ParserRuleContext {
		public Function_declaration_list_or_use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_list_or_use_statement; }
	 
		public Function_declaration_list_or_use_statementContext() { }
		public void copyFrom(Function_declaration_list_or_use_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyFnDeclListContext extends Function_declaration_list_or_use_statementContext {
		public EmptyFnDeclListContext(Function_declaration_list_or_use_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitEmptyFnDeclList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FnDeclListContext extends Function_declaration_list_or_use_statementContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_declaration_list_or_use_statementContext function_declaration_list_or_use_statement() {
			return getRuleContext(Function_declaration_list_or_use_statementContext.class,0);
		}
		public FnDeclListContext(Function_declaration_list_or_use_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitFnDeclList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseStmtContext extends Function_declaration_list_or_use_statementContext {
		public Function_declaration_list_or_use_statementContext function_declaration_list_or_use_statement() {
			return getRuleContext(Function_declaration_list_or_use_statementContext.class,0);
		}
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public UseStmtContext(Function_declaration_list_or_use_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_list_or_use_statementContext function_declaration_list_or_use_statement() throws RecognitionException {
		return function_declaration_list_or_use_statement(0);
	}

	private Function_declaration_list_or_use_statementContext function_declaration_list_or_use_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_declaration_list_or_use_statementContext _localctx = new Function_declaration_list_or_use_statementContext(_ctx, _parentState);
		Function_declaration_list_or_use_statementContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_function_declaration_list_or_use_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EmptyFnDeclListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(437);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new FnDeclListContext(new Function_declaration_list_or_use_statementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function_declaration_list_or_use_statement);
						setState(433);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(434); function_declaration();
						}
						break;

					case 2:
						{
						_localctx = new UseStmtContext(new Function_declaration_list_or_use_statementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function_declaration_list_or_use_statement);
						setState(435);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(436); use_statement();
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public Function_declaration_list_or_use_statementContext function_declaration_list_or_use_statement() {
			return getRuleContext(Function_declaration_list_or_use_statementContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shlVisitor ) return ((shlVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); function_declaration_list_or_use_statement(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return multiplication_expression_sempred((Multiplication_expressionContext)_localctx, predIndex);

		case 2: return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);

		case 3: return cmp_expr_sempred((Cmp_exprContext)_localctx, predIndex);

		case 5: return log_and_expr_sempred((Log_and_exprContext)_localctx, predIndex);

		case 6: return binary_expression_sempred((Binary_expressionContext)_localctx, predIndex);

		case 7: return non_empty_function_call_params_sempred((Non_empty_function_call_paramsContext)_localctx, predIndex);

		case 20: return initialized_identifier_list_sempred((Initialized_identifier_listContext)_localctx, predIndex);

		case 40: return statement_list_sempred((Statement_listContext)_localctx, predIndex);

		case 47: return function_declaration_list_or_use_statement_sempred((Function_declaration_list_or_use_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean multiplication_expression_sempred(Multiplication_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);

		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean log_and_expr_sempred(Log_and_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return precpred(_ctx, 2);

		case 16: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean initialized_identifier_list_sempred(Initialized_identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_function_call_params_sempred(Non_empty_function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean binary_expression_sempred(Binary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmp_expr_sempred(Cmp_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 7);

		case 7: return precpred(_ctx, 6);

		case 8: return precpred(_ctx, 5);

		case 9: return precpred(_ctx, 4);

		case 10: return precpred(_ctx, 3);

		case 11: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 3);

		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_declaration_list_or_use_statement_sempred(Function_declaration_list_or_use_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return precpred(_ctx, 2);

		case 18: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3v\n\3\f\3\16\3y"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16\4\u0087"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u009e\n\5\f\5\16\5\u00a1\13\5\3\6\3\6\3\6\5\6"+
		"\u00a6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3\n\3\n\5\n\u00cb\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\16\3\16\5"+
		"\16\u00dc\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ee\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f9\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\5\24\u0105\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0111\n\26\f\26\16\26\u0114\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u011d\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\5\31\u0127\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0132"+
		"\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\5\36"+
		"\u0140\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\5#\u014f\n#\3"+
		"$\3$\3%\3%\3&\3&\3&\3&\3&\3&\5&\u015b\n&\3\'\3\'\3\'\3\'\5\'\u0161\n\'"+
		"\3(\3(\3(\3(\3(\5(\u0168\n(\3)\3)\5)\u016c\n)\3*\3*\3*\3*\3*\3*\3*\7*"+
		"\u0175\n*\f*\16*\u0178\13*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\5-\u0187"+
		"\n-\3.\3.\3.\5.\u018c\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01ad\n/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\7\61\u01b8\n\61\f\61\16\61\u01bb\13"+
		"\61\3\62\3\62\3\62\2\13\4\6\b\f\16\20*R`\63\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\2\u01ce\2d"+
		"\3\2\2\2\4f\3\2\2\2\6z\3\2\2\2\b\u0088\3\2\2\2\n\u00a5\3\2\2\2\f\u00a7"+
		"\3\2\2\2\16\u00b2\3\2\2\2\20\u00bd\3\2\2\2\22\u00ca\3\2\2\2\24\u00cc\3"+
		"\2\2\2\26\u00d1\3\2\2\2\30\u00d7\3\2\2\2\32\u00db\3\2\2\2\34\u00e2\3\2"+
		"\2\2\36\u00ed\3\2\2\2 \u00f8\3\2\2\2\"\u00fa\3\2\2\2$\u00fe\3\2\2\2&\u0104"+
		"\3\2\2\2(\u0106\3\2\2\2*\u010a\3\2\2\2,\u011c\3\2\2\2.\u011e\3\2\2\2\60"+
		"\u0126\3\2\2\2\62\u0128\3\2\2\2\64\u0131\3\2\2\2\66\u0133\3\2\2\28\u0135"+
		"\3\2\2\2:\u013f\3\2\2\2<\u0141\3\2\2\2>\u0143\3\2\2\2@\u0145\3\2\2\2B"+
		"\u0149\3\2\2\2D\u014e\3\2\2\2F\u0150\3\2\2\2H\u0152\3\2\2\2J\u015a\3\2"+
		"\2\2L\u0160\3\2\2\2N\u0167\3\2\2\2P\u016b\3\2\2\2R\u016d\3\2\2\2T\u0179"+
		"\3\2\2\2V\u017d\3\2\2\2X\u0186\3\2\2\2Z\u018b\3\2\2\2\\\u01ac\3\2\2\2"+
		"^\u01ae\3\2\2\2`\u01b2\3\2\2\2b\u01bc\3\2\2\2de\5\34\17\2e\3\3\2\2\2f"+
		"g\b\3\1\2gh\5\2\2\2hw\3\2\2\2ij\f\7\2\2jk\7\27\2\2kv\5\2\2\2lm\f\6\2\2"+
		"mn\7\3\2\2nv\5\2\2\2op\f\5\2\2pq\7\63\2\2qv\5\2\2\2rs\f\4\2\2st\7\13\2"+
		"\2tv\5\2\2\2ui\3\2\2\2ul\3\2\2\2uo\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2x\5\3\2\2\2yw\3\2\2\2z{\b\4\1\2{|\5\4\3\2|\u0085\3\2\2\2}"+
		"~\f\5\2\2~\177\7%\2\2\177\u0084\5\4\3\2\u0080\u0081\f\4\2\2\u0081\u0082"+
		"\7\26\2\2\u0082\u0084\5\4\3\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\7\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0088\u0089\b\5\1\2\u0089\u008a\5\6\4\2\u008a\u009f"+
		"\3\2\2\2\u008b\u008c\f\t\2\2\u008c\u008d\7\5\2\2\u008d\u009e\5\6\4\2\u008e"+
		"\u008f\f\b\2\2\u008f\u0090\7\t\2\2\u0090\u009e\5\6\4\2\u0091\u0092\f\7"+
		"\2\2\u0092\u0093\7.\2\2\u0093\u009e\5\6\4\2\u0094\u0095\f\6\2\2\u0095"+
		"\u0096\7\64\2\2\u0096\u009e\5\6\4\2\u0097\u0098\f\5\2\2\u0098\u0099\7"+
		"\62\2\2\u0099\u009e\5\6\4\2\u009a\u009b\f\4\2\2\u009b\u009c\7\7\2\2\u009c"+
		"\u009e\5\6\4\2\u009d\u008b\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0091\3\2"+
		"\2\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\t\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a6\5\n\6\2\u00a4\u00a6"+
		"\5\b\5\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\13\3\2\2\2\u00a7"+
		"\u00a8\b\7\1\2\u00a8\u00a9\5\n\6\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\f\4"+
		"\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ae\5\n\6\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\r\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\b\1\2\u00b3\u00b4\5\f\7\2\u00b4\u00ba"+
		"\3\2\2\2\u00b5\u00b6\f\4\2\2\u00b6\u00b7\7-\2\2\u00b7\u00b9\5\f\7\2\u00b8"+
		"\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\17\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\b\t\1\2\u00be\u00bf"+
		"\5$\23\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\7\25\2\2"+
		"\u00c2\u00c4\5$\23\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\21\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\5\20\t\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3"+
		"\2\2\2\u00cb\23\3\2\2\2\u00cc\u00cd\7;\2\2\u00cd\u00ce\7\30\2\2\u00ce"+
		"\u00cf\5\22\n\2\u00cf\u00d0\7\16\2\2\u00d0\25\3\2\2\2\u00d1\u00d2\7<\2"+
		"\2\u00d2\27\3\2\2\2\u00d3\u00d8\7\67\2\2\u00d4\u00d8\78\2\2\u00d5\u00d8"+
		"\79\2\2\u00d6\u00d8\7:\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00dc\7\65\2"+
		"\2\u00da\u00dc\7\66\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\33\3\2\2\2\u00dd\u00de\5\36\20\2\u00de\u00df\7\31\2\2\u00df\u00e0\5N"+
		"(\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3\5\36\20\2\u00e2\u00dd\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\35\3\2\2\2\u00e4\u00ee\7;\2\2\u00e5\u00ee\5\30\r"+
		"\2\u00e6\u00ee\5\32\16\2\u00e7\u00ee\5\26\f\2\u00e8\u00ee\5\24\13\2\u00e9"+
		"\u00ea\7\30\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7\16\2\2\u00ec\u00ee\3"+
		"\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\37\3\2\2"+
		"\2\u00ef\u00f9\7\20\2\2\u00f0\u00f9\7 \2\2\u00f1\u00f9\7\24\2\2\u00f2"+
		"\u00f9\7\r\2\2\u00f3\u00f9\7\60\2\2\u00f4\u00f9\7/\2\2\u00f5\u00f9\7\23"+
		"\2\2\u00f6\u00f9\7\36\2\2\u00f7\u00f9\7,\2\2\u00f8\u00ef\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2"+
		"\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00fb\7;\2\2\u00fb\u00fc\5 \21\2\u00fc"+
		"\u00fd\5$\23\2\u00fd#\3\2\2\2\u00fe\u00ff\5\16\b\2\u00ff%\3\2\2\2\u0100"+
		"\u0101\7;\2\2\u0101\u0102\7\25\2\2\u0102\u0105\5&\24\2\u0103\u0105\7;"+
		"\2\2\u0104\u0100\3\2\2\2\u0104\u0103\3\2\2\2\u0105\'\3\2\2\2\u0106\u0107"+
		"\7;\2\2\u0107\u0108\7\20\2\2\u0108\u0109\5$\23\2\u0109)\3\2\2\2\u010a"+
		"\u010b\b\26\1\2\u010b\u010c\5(\25\2\u010c\u0112\3\2\2\2\u010d\u010e\f"+
		"\3\2\2\u010e\u010f\7\25\2\2\u010f\u0111\5(\25\2\u0110\u010d\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113+\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0116\7\34\2\2\u0116\u011d\5*\26\2\u0117\u0118"+
		"\7\34\2\2\u0118\u0119\5&\24\2\u0119\u011a\7\31\2\2\u011a\u011b\5N(\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0115\3\2\2\2\u011c\u0117\3\2\2\2\u011d-\3\2\2\2"+
		"\u011e\u011f\7\'\2\2\u011f\u0120\5\66\34\2\u0120\u0121\5T+\2\u0121/\3"+
		"\2\2\2\u0122\u0123\5.\30\2\u0123\u0124\5\60\31\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0125\3\2\2\2\u0127\61\3\2\2"+
		"\2\u0128\u0129\7\32\2\2\u0129\u012a\5\66\34\2\u012a\u012b\5T+\2\u012b"+
		"\u012c\5\60\31\2\u012c\u012d\5\64\33\2\u012d\63\3\2\2\2\u012e\u012f\7"+
		"\17\2\2\u012f\u0132\5T+\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\65\3\2\2\2\u0133\u0134\5\16\b\2\u0134\67\3\2\2\2"+
		"\u0135\u0136\7&\2\2\u0136\u0137\5:\36\2\u0137\u0138\7(\2\2\u0138\u0139"+
		"\5<\37\2\u0139\u013a\7(\2\2\u013a\u013b\5> \2\u013b\u013c\5T+\2\u013c"+
		"9\3\2\2\2\u013d\u0140\5$\23\2\u013e\u0140\5,\27\2\u013f\u013d\3\2\2\2"+
		"\u013f\u013e\3\2\2\2\u0140;\3\2\2\2\u0141\u0142\5$\23\2\u0142=\3\2\2\2"+
		"\u0143\u0144\5J&\2\u0144?\3\2\2\2\u0145\u0146\7)\2\2\u0146\u0147\5B\""+
		"\2\u0147\u0148\5T+\2\u0148A\3\2\2\2\u0149\u014a\5$\23\2\u014aC\3\2\2\2"+
		"\u014b\u014c\7\35\2\2\u014c\u014f\5$\23\2\u014d\u014f\7\35\2\2\u014e\u014b"+
		"\3\2\2\2\u014e\u014d\3\2\2\2\u014fE\3\2\2\2\u0150\u0151\7\61\2\2\u0151"+
		"G\3\2\2\2\u0152\u0153\7\b\2\2\u0153I\3\2\2\2\u0154\u015b\5,\27\2\u0155"+
		"\u015b\5\"\22\2\u0156\u015b\5D#\2\u0157\u015b\5F$\2\u0158\u015b\5H%\2"+
		"\u0159\u015b\5$\23\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156"+
		"\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"K\3\2\2\2\u015c\u0161\5T+\2\u015d\u0161\5\62\32\2\u015e\u0161\58\35\2"+
		"\u015f\u0161\5@!\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u015f\3\2\2\2\u0161M\3\2\2\2\u0162\u0168\7\33\2\2\u0163"+
		"\u0168\7+\2\2\u0164\u0168\7#\2\2\u0165\u0168\7\4\2\2\u0166\u0168\7\21"+
		"\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168O\3\2\2\2\u0169\u016c\5N(\2\u016a"+
		"\u016c\7\"\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cQ\3\2\2\2"+
		"\u016d\u0176\b*\1\2\u016e\u016f\f\5\2\2\u016f\u0170\5J&\2\u0170\u0171"+
		"\7(\2\2\u0171\u0175\3\2\2\2\u0172\u0173\f\4\2\2\u0173\u0175\5L\'\2\u0174"+
		"\u016e\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177S\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a"+
		"\7\37\2\2\u017a\u017b\5R*\2\u017b\u017c\7\n\2\2\u017cU\3\2\2\2\u017d\u017e"+
		"\5N(\2\u017e\u017f\5&\24\2\u017fW\3\2\2\2\u0180\u0181\5V,\2\u0181\u0182"+
		"\7(\2\2\u0182\u0183\5X-\2\u0183\u0187\3\2\2\2\u0184\u0187\5V,\2\u0185"+
		"\u0187\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2"+
		"\2\2\u0187Y\3\2\2\2\u0188\u0189\7\31\2\2\u0189\u018c\5P)\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018a\3\2\2\2\u018c[\3\2\2\2\u018d"+
		"\u018e\7$\2\2\u018e\u018f\7\6\2\2\u018f\u0190\7\30\2\2\u0190\u0191\7\16"+
		"\2\2\u0191\u01ad\5T+\2\u0192\u0193\7$\2\2\u0193\u0194\7;\2\2\u0194\u0195"+
		"\7\30\2\2\u0195\u0196\5X-\2\u0196\u0197\7\16\2\2\u0197\u0198\5Z.\2\u0198"+
		"\u0199\5T+\2\u0199\u01ad\3\2\2\2\u019a\u019b\7$\2\2\u019b\u019c\7;\2\2"+
		"\u019c\u019d\7\30\2\2\u019d\u019e\5X-\2\u019e\u019f\7\16\2\2\u019f\u01a0"+
		"\5Z.\2\u01a0\u01a1\7(\2\2\u01a1\u01ad\3\2\2\2\u01a2\u01a3\7$\2\2\u01a3"+
		"\u01a4\7;\2\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6\5X-\2\u01a6\u01a7\7\16"+
		"\2\2\u01a7\u01a8\5Z.\2\u01a8\u01a9\7!\2\2\u01a9\u01aa\5\26\f\2\u01aa\u01ab"+
		"\7(\2\2\u01ab\u01ad\3\2\2\2\u01ac\u018d\3\2\2\2\u01ac\u0192\3\2\2\2\u01ac"+
		"\u019a\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ad]\3\2\2\2\u01ae\u01af\7\f\2\2"+
		"\u01af\u01b0\5\26\f\2\u01b0\u01b1\7(\2\2\u01b1_\3\2\2\2\u01b2\u01b9\b"+
		"\61\1\2\u01b3\u01b4\f\5\2\2\u01b4\u01b8\5\\/\2\u01b5\u01b6\f\4\2\2\u01b6"+
		"\u01b8\5^\60\2\u01b7\u01b3\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baa\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01bd\5`\61\2\u01bdc\3\2\2\2$uw\u0083\u0085\u009d\u009f"+
		"\u00a5\u00af\u00ba\u00c5\u00ca\u00d7\u00db\u00e2\u00ed\u00f8\u0104\u0112"+
		"\u011c\u0126\u0131\u013f\u014e\u015a\u0160\u0167\u016b\u0174\u0176\u0186"+
		"\u018b\u01ac\u01b7\u01b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}