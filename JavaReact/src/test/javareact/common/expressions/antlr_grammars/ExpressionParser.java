// Generated from antlr_grammars/Expression.g4 by ANTLR 4.1
package test.javareact.common.expressions.antlr_grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, MUL=3, DIV=4, ADD=5, SUB=6, EQUAL=7, DOT=8, AND=9, OR=10, 
		NOT=11, BOOL=12, MAX=13, MIN=14, MAXEQ=15, MINEQ=16, SIZE=17, ISEMPTY=18, 
		CONTAINS=19, COMMA=20, ORDERASC=21, ORDERDESC=22, ORDERASCBOOL=23, ORDERDESCBOOL=24, 
		FILTER=25, AVG=26, SUM=27, ASC=28, DESC=29, ALLTRUE=30, ALLFALSE=31, ID=32, 
		DIGIT=33, DOUBLE=34, STRING=35, LISTDIGIT=36, SEQINT=37, LISTDOUBLE=38, 
		SEQDOUBLE=39, LISTSTRING=40, LISTBOOL=41, WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'*'", "'/'", "'+'", "'-'", "'=='", "'.'", 
		"'&'", "'|'", "'!'", "BOOL", "'>'", "'<'", "'>='", "'<='", "'size'", "'isEmpty'", 
		"'contains'", "','", "'orderAsc'", "'orderDesc'", "'orderAscBool'", "'orderDescBool'", 
		"'filterBy'", "'avg'", "'sum'", "'isAsc'", "'isDesc'", "'isAllTrue'", 
		"'isAllFalse'", "ID", "DIGIT", "DOUBLE", "STRING", "LISTDIGIT", "SEQINT", 
		"LISTDOUBLE", "SEQDOUBLE", "LISTSTRING", "LISTBOOL", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_numExpr = 2, RULE_stringExpr = 3, 
		RULE_boolExpr = 4, RULE_listExpr = 5, RULE_listDigitExpr = 6, RULE_listDoubleExpr = 7, 
		RULE_listStringExpr = 8, RULE_listBoolExpr = 9, RULE_identifier = 10, 
		RULE_hostId = 11, RULE_observableId = 12, RULE_method = 13;
	public static final String[] ruleNames = {
		"start", "expression", "numExpr", "stringExpr", "boolExpr", "listExpr", 
		"listDigitExpr", "listDoubleExpr", "listStringExpr", "listBoolExpr", "identifier", 
		"hostId", "observableId", "method"
	};

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); expression();
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); numExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); stringExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32); boolExpr(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33); listExpr();
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

	public static class NumExprContext extends ParserRuleContext {
		public int _p;
		public NumExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NumExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_numExpr; }
	 
		public NumExprContext() { }
		public void copyFrom(NumExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class DoubleContext extends NumExprContext {
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public DoubleContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdNumContext extends NumExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdNumContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvgSumListDoubleContext extends NumExprContext {
		public Token op;
		public TerminalNode SUM() { return getToken(ExpressionParser.SUM, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public TerminalNode AVG() { return getToken(ExpressionParser.AVG, 0); }
		public AvgSumListDoubleContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAvgSumListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvgSumListIntContext extends NumExprContext {
		public Token op;
		public TerminalNode SUM() { return getToken(ExpressionParser.SUM, 0); }
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode AVG() { return getToken(ExpressionParser.AVG, 0); }
		public AvgSumListIntContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAvgSumListInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinMaxMineqMaxeqContext extends NumExprContext {
		public Token op;
		public TerminalNode MINEQ() { return getToken(ExpressionParser.MINEQ, 0); }
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode MAXEQ() { return getToken(ExpressionParser.MAXEQ, 0); }
		public TerminalNode MIN() { return getToken(ExpressionParser.MIN, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode MAX() { return getToken(ExpressionParser.MAX, 0); }
		public MinMaxMineqMaxeqContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMinMaxMineqMaxeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends NumExprContext {
		public Token op;
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode SUB() { return getToken(ExpressionParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ExpressionParser.ADD, 0); }
		public AddSubContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensNumContext extends NumExprContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ParensNumContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParensNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends NumExprContext {
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public IntContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeListContext extends NumExprContext {
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode SIZE() { return getToken(ExpressionParser.SIZE, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public SizeListContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSizeList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends NumExprContext {
		public Token op;
		public TerminalNode MUL() { return getToken(ExpressionParser.MUL, 0); }
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ExpressionParser.DIV, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public MulDivContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExprContext numExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExprContext _localctx = new NumExprContext(_ctx, _parentState, _p);
		NumExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_numExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37); match(DIGIT);
				}
				break;

			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); match(DOUBLE);
				}
				break;

			case 3:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40); match(2);
				setState(41); numExpr(0);
				setState(42); match(1);
				}
				break;

			case 5:
				{
				_localctx = new AvgSumListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44); listDigitExpr(0);
				setState(45); match(DOT);
				setState(46);
				((AvgSumListIntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==SUM) ) {
					((AvgSumListIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 6:
				{
				_localctx = new AvgSumListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48); listDoubleExpr(0);
				setState(49); match(DOT);
				setState(50);
				((AvgSumListDoubleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==SUM) ) {
					((AvgSumListDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 7:
				{
				_localctx = new SizeListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52); listExpr();
				setState(53); match(DOT);
				setState(54); match(SIZE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(58);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(59);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(60); numExpr(11);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(61);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(62);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(63); numExpr(10);
						}
						break;

					case 3:
						{
						_localctx = new MinMaxMineqMaxeqContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(64);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(65);
						((MinMaxMineqMaxeqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((MinMaxMineqMaxeqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(66); numExpr(9);
						}
						break;
					}
					} 
				}
				setState(71);
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

	public static class StringExprContext extends ParserRuleContext {
		public int _p;
		public StringExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StringExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
	 
		public StringExprContext() { }
		public void copyFrom(StringExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IdStringContext extends StringExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdStringContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensStringContext extends StringExprContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ParensStringContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParensString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatContext extends StringExprContext {
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExpressionParser.ADD, 0); }
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public ConcatContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringExprContext _localctx = new StringExprContext(_ctx, _parentState, _p);
		StringExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_stringExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case MUL:
			case ID:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73); identifier();
				}
				break;
			case 2:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74); match(2);
				setState(75); stringExpr(0);
				setState(76); match(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new StringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
					setState(80);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(81); match(ADD);
					setState(82); stringExpr(4);
					}
					} 
				}
				setState(87);
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

	public static class BoolExprContext extends ParserRuleContext {
		public int _p;
		public BoolExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BoolExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AndOrContext extends BoolExprContext {
		public Token op;
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public AndOrContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends BoolExprContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public BoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdBoolContext extends BoolExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsIntContext extends BoolExprContext {
		public TerminalNode CONTAINS() { return getToken(ExpressionParser.CONTAINS, 0); }
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ContainsIntContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitContainsInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllTrueFalseContext extends BoolExprContext {
		public Token op;
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode ALLFALSE() { return getToken(ExpressionParser.ALLFALSE, 0); }
		public ListBoolExprContext listBoolExpr() {
			return getRuleContext(ListBoolExprContext.class,0);
		}
		public TerminalNode ALLTRUE() { return getToken(ExpressionParser.ALLTRUE, 0); }
		public AllTrueFalseContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAllTrueFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualNumContext extends BoolExprContext {
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public EqualNumContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualBoolContext extends BoolExprContext {
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public EqualBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsStringContext extends BoolExprContext {
		public TerminalNode CONTAINS() { return getToken(ExpressionParser.CONTAINS, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListStringExprContext listStringExpr() {
			return getRuleContext(ListStringExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ContainsStringContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitContainsString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualListContext extends BoolExprContext {
		public List<ListExprContext> listExpr() {
			return getRuleContexts(ListExprContext.class);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public ListExprContext listExpr(int i) {
			return getRuleContext(ListExprContext.class,i);
		}
		public EqualListContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsAscIsDescIntContext extends BoolExprContext {
		public Token op;
		public TerminalNode DESC() { return getToken(ExpressionParser.DESC, 0); }
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode ASC() { return getToken(ExpressionParser.ASC, 0); }
		public IsAscIsDescIntContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIsAscIsDescInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualStringContext extends BoolExprContext {
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public EqualStringContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsBoolContext extends BoolExprContext {
		public TerminalNode CONTAINS() { return getToken(ExpressionParser.CONTAINS, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListBoolExprContext listBoolExpr() {
			return getRuleContext(ListBoolExprContext.class,0);
		}
		public ContainsBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitContainsBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensBoolContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ParensBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParensBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
		public NotContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsAscIsDescDoubleContext extends BoolExprContext {
		public Token op;
		public TerminalNode DESC() { return getToken(ExpressionParser.DESC, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(ExpressionParser.ASC, 0); }
		public IsAscIsDescDoubleContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIsAscIsDescDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsDoubleContext extends BoolExprContext {
		public TerminalNode CONTAINS() { return getToken(ExpressionParser.CONTAINS, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ContainsDoubleContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitContainsDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState, _p);
		BoolExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_boolExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89); match(NOT);
				setState(90); boolExpr(16);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); match(2);
				setState(94); boolExpr(0);
				setState(95); match(1);
				}
				break;

			case 5:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); numExpr(0);
				setState(98); match(EQUAL);
				setState(99); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); stringExpr(0);
				setState(102); match(EQUAL);
				setState(103); stringExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); listExpr();
				setState(106); match(EQUAL);
				setState(107); listExpr();
				}
				break;

			case 8:
				{
				_localctx = new IsAscIsDescIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); listDigitExpr(0);
				setState(110); match(DOT);
				setState(111);
				((IsAscIsDescIntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((IsAscIsDescIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 9:
				{
				_localctx = new IsAscIsDescDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113); listDoubleExpr(0);
				setState(114); match(DOT);
				setState(115);
				((IsAscIsDescDoubleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((IsAscIsDescDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 10:
				{
				_localctx = new ContainsIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117); listDigitExpr(0);
				setState(118); match(DOT);
				setState(119); match(CONTAINS);
				setState(120); match(2);
				setState(121); numExpr(0);
				setState(122); match(1);
				}
				break;

			case 11:
				{
				_localctx = new ContainsDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124); listDoubleExpr(0);
				setState(125); match(DOT);
				setState(126); match(CONTAINS);
				setState(127); match(2);
				setState(128); numExpr(0);
				setState(129); match(1);
				}
				break;

			case 12:
				{
				_localctx = new ContainsStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131); listStringExpr(0);
				setState(132); match(DOT);
				setState(133); match(CONTAINS);
				setState(134); match(2);
				setState(135); stringExpr(0);
				setState(136); match(1);
				}
				break;

			case 13:
				{
				_localctx = new ContainsBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); listBoolExpr();
				setState(139); match(DOT);
				setState(140); match(CONTAINS);
				setState(141); match(2);
				setState(142); boolExpr(0);
				setState(143); match(1);
				}
				break;

			case 14:
				{
				_localctx = new AllTrueFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); listBoolExpr();
				setState(146); match(DOT);
				setState(147);
				((AllTrueFalseContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALLTRUE || _la==ALLFALSE) ) {
					((AllTrueFalseContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(151);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(152);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(153); boolExpr(16);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(154);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(155); match(EQUAL);
						setState(156); boolExpr(12);
						}
						break;
					}
					} 
				}
				setState(161);
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

	public static class ListExprContext extends ParserRuleContext {
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public ListBoolExprContext listBoolExpr() {
			return getRuleContext(ListBoolExprContext.class,0);
		}
		public ListStringExprContext listStringExpr() {
			return getRuleContext(ListStringExprContext.class,0);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listExpr);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); listDigitExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); listDoubleExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164); listStringExpr(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165); listBoolExpr();
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

	public static class ListDigitExprContext extends ParserRuleContext {
		public int _p;
		public ListDigitExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListDigitExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_listDigitExpr; }
	 
		public ListDigitExprContext() { }
		public void copyFrom(ListDigitExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ListDigitContext extends ListDigitExprContext {
		public TerminalNode LISTDIGIT() { return getToken(ExpressionParser.LISTDIGIT, 0); }
		public ListDigitContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderListIntContext extends ListDigitExprContext {
		public Token op;
		public TerminalNode ORDERDESC() { return getToken(ExpressionParser.ORDERDESC, 0); }
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode ORDERASC() { return getToken(ExpressionParser.ORDERASC, 0); }
		public OrderListIntContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitOrderListInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterListIntContext extends ListDigitExprContext {
		public Token op;
		public TerminalNode MINEQ() { return getToken(ExpressionParser.MINEQ, 0); }
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode MAXEQ() { return getToken(ExpressionParser.MAXEQ, 0); }
		public TerminalNode MIN() { return getToken(ExpressionParser.MIN, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public TerminalNode MAX() { return getToken(ExpressionParser.MAX, 0); }
		public TerminalNode FILTER() { return getToken(ExpressionParser.FILTER, 0); }
		public FilterListIntContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFilterListInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdListIntContext extends ListDigitExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdListIntContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDigitExprContext listDigitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListDigitExprContext _localctx = new ListDigitExprContext(_ctx, _parentState, _p);
		ListDigitExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_listDigitExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch (_input.LA(1)) {
			case LISTDIGIT:
				{
				_localctx = new ListDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169); match(LISTDIGIT);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new OrderListIntContext(new ListDigitExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDigitExpr);
						setState(173);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(174); match(DOT);
						setState(175);
						((OrderListIntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ORDERASC || _la==ORDERDESC) ) {
							((OrderListIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 2:
						{
						_localctx = new FilterListIntContext(new ListDigitExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDigitExpr);
						setState(176);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(177); match(DOT);
						setState(178); match(FILTER);
						setState(179); match(2);
						setState(180);
						((FilterListIntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((FilterListIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(181); numExpr(0);
						setState(182); match(1);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ListDoubleExprContext extends ParserRuleContext {
		public int _p;
		public ListDoubleExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListDoubleExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_listDoubleExpr; }
	 
		public ListDoubleExprContext() { }
		public void copyFrom(ListDoubleExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IdListDoubleContext extends ListDoubleExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdListDoubleContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderListDoubleContext extends ListDoubleExprContext {
		public Token op;
		public TerminalNode ORDERDESC() { return getToken(ExpressionParser.ORDERDESC, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public TerminalNode ORDERASC() { return getToken(ExpressionParser.ORDERASC, 0); }
		public OrderListDoubleContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitOrderListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterListDoubleContext extends ListDoubleExprContext {
		public Token op;
		public TerminalNode MINEQ() { return getToken(ExpressionParser.MINEQ, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public TerminalNode MAXEQ() { return getToken(ExpressionParser.MAXEQ, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public TerminalNode MIN() { return getToken(ExpressionParser.MIN, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public TerminalNode MAX() { return getToken(ExpressionParser.MAX, 0); }
		public TerminalNode FILTER() { return getToken(ExpressionParser.FILTER, 0); }
		public FilterListDoubleContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFilterListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDoubleContext extends ListDoubleExprContext {
		public TerminalNode LISTDOUBLE() { return getToken(ExpressionParser.LISTDOUBLE, 0); }
		public ListDoubleContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDoubleExprContext listDoubleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListDoubleExprContext _localctx = new ListDoubleExprContext(_ctx, _parentState, _p);
		ListDoubleExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_listDoubleExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			switch (_input.LA(1)) {
			case LISTDOUBLE:
				{
				_localctx = new ListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190); match(LISTDOUBLE);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OrderListDoubleContext(new ListDoubleExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDoubleExpr);
						setState(194);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(195); match(DOT);
						setState(196);
						((OrderListDoubleContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ORDERASC || _la==ORDERDESC) ) {
							((OrderListDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 2:
						{
						_localctx = new FilterListDoubleContext(new ListDoubleExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDoubleExpr);
						setState(197);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(198); match(DOT);
						setState(199); match(FILTER);
						setState(200); match(2);
						setState(201);
						((FilterListDoubleContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((FilterListDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(202); numExpr(0);
						setState(203); match(1);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ListStringExprContext extends ParserRuleContext {
		public int _p;
		public ListStringExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListStringExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_listStringExpr; }
	 
		public ListStringExprContext() { }
		public void copyFrom(ListStringExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class OrderListStringContext extends ListStringExprContext {
		public Token op;
		public TerminalNode ORDERDESC() { return getToken(ExpressionParser.ORDERDESC, 0); }
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListStringExprContext listStringExpr() {
			return getRuleContext(ListStringExprContext.class,0);
		}
		public TerminalNode ORDERASC() { return getToken(ExpressionParser.ORDERASC, 0); }
		public OrderListStringContext(ListStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitOrderListString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdListStringContext extends ListStringExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdListStringContext(ListStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListStringContext extends ListStringExprContext {
		public TerminalNode LISTSTRING() { return getToken(ExpressionParser.LISTSTRING, 0); }
		public ListStringContext(ListStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStringExprContext listStringExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStringExprContext _localctx = new ListStringExprContext(_ctx, _parentState, _p);
		ListStringExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_listStringExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			switch (_input.LA(1)) {
			case LISTSTRING:
				{
				_localctx = new ListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211); match(LISTSTRING);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrderListStringContext(new ListStringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_listStringExpr);
					setState(215);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(216); match(DOT);
					setState(217);
					((OrderListStringContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ORDERASC || _la==ORDERDESC) ) {
						((OrderListStringContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(222);
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

	public static class ListBoolExprContext extends ParserRuleContext {
		public ListBoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBoolExpr; }
	 
		public ListBoolExprContext() { }
		public void copyFrom(ListBoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListBoolContext extends ListBoolExprContext {
		public TerminalNode LISTBOOL() { return getToken(ExpressionParser.LISTBOOL, 0); }
		public ListBoolContext(ListBoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdListBoolContext extends ListBoolExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdListBoolContext(ListBoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBoolExprContext listBoolExpr() throws RecognitionException {
		ListBoolExprContext _localctx = new ListBoolExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listBoolExpr);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case LISTBOOL:
				_localctx = new ListBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223); match(LISTBOOL);
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224); identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); hostId();
				setState(228); match(DOT);
				setState(229); observableId();
				setState(230); match(DOT);
				setState(231); method();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); observableId();
				setState(234); match(DOT);
				setState(235); method();
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

	public static class HostIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public HostIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitHostId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostIdContext hostId() throws RecognitionException {
		HostIdContext _localctx = new HostIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hostId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ObservableIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public ObservableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observableId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitObservableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableIdContext observableId() throws RecognitionException {
		ObservableIdContext _localctx = new ObservableIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_observableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(ID);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ID);
			setState(244); match(2);
			setState(245); match(1);
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
		case 2: return numExpr_sempred((NumExprContext)_localctx, predIndex);

		case 3: return stringExpr_sempred((StringExprContext)_localctx, predIndex);

		case 4: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 6: return listDigitExpr_sempred((ListDigitExprContext)_localctx, predIndex);

		case 7: return listDoubleExpr_sempred((ListDoubleExprContext)_localctx, predIndex);

		case 8: return listStringExpr_sempred((ListStringExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listDigitExpr_sempred(ListDigitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean stringExpr_sempred(StringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;
		}
		return true;
	}
	private boolean listDoubleExpr_sempred(ListDoubleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean listStringExpr_sempred(ListStringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 15 >= _localctx._p;

		case 5: return 11 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3,\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4F\n\4\f\4"+
		"\16\4I\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\3\5\7\5V\n\5\f\5"+
		"\16\5Y\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0098\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\7\3\7\3\7\3\7\5\7\u00a9"+
		"\n\7\3\b\3\b\3\b\5\b\u00ae\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\t\3\t\3\t\5\t\u00c3\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d0\n\t\f\t\16\t\u00d3\13"+
		"\t\3\n\3\n\3\n\5\n\u00d8\n\n\3\n\3\n\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0"+
		"\13\n\3\13\3\13\5\13\u00e4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00f0\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\2\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\13\3\2\34\35\3\2\5\6\3\2\7\b\3\2\17\22"+
		"\3\2\36\37\3\2 !\3\2\13\f\3\2\27\30\4\2\5\5\"\"\u0115\2\36\3\2\2\2\4$"+
		"\3\2\2\2\6:\3\2\2\2\bP\3\2\2\2\n\u0097\3\2\2\2\f\u00a8\3\2\2\2\16\u00ad"+
		"\3\2\2\2\20\u00c2\3\2\2\2\22\u00d7\3\2\2\2\24\u00e3\3\2\2\2\26\u00ef\3"+
		"\2\2\2\30\u00f1\3\2\2\2\32\u00f3\3\2\2\2\34\u00f5\3\2\2\2\36\37\5\4\3"+
		"\2\37\3\3\2\2\2 %\5\6\4\2!%\5\b\5\2\"%\5\n\6\2#%\5\f\7\2$ \3\2\2\2$!\3"+
		"\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\b\4\1\2\';\7#\2\2(;\7$\2\2)"+
		";\5\26\f\2*+\7\4\2\2+,\5\6\4\2,-\7\3\2\2-;\3\2\2\2./\5\16\b\2/\60\7\n"+
		"\2\2\60\61\t\2\2\2\61;\3\2\2\2\62\63\5\20\t\2\63\64\7\n\2\2\64\65\t\2"+
		"\2\2\65;\3\2\2\2\66\67\5\f\7\2\678\7\n\2\289\7\23\2\29;\3\2\2\2:&\3\2"+
		"\2\2:(\3\2\2\2:)\3\2\2\2:*\3\2\2\2:.\3\2\2\2:\62\3\2\2\2:\66\3\2\2\2;"+
		"G\3\2\2\2<=\6\4\2\3=>\t\3\2\2>F\5\6\4\2?@\6\4\3\3@A\t\4\2\2AF\5\6\4\2"+
		"BC\6\4\4\3CD\t\5\2\2DF\5\6\4\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3\2\2\2JK\b\5\1\2KQ\5\26\f\2LM\7\4\2"+
		"\2MN\5\b\5\2NO\7\3\2\2OQ\3\2\2\2PJ\3\2\2\2PL\3\2\2\2QW\3\2\2\2RS\6\5\5"+
		"\3ST\7\7\2\2TV\5\b\5\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\t\3\2"+
		"\2\2YW\3\2\2\2Z[\b\6\1\2[\\\7\r\2\2\\\u0098\5\n\6\2]\u0098\7\16\2\2^\u0098"+
		"\5\26\f\2_`\7\4\2\2`a\5\n\6\2ab\7\3\2\2b\u0098\3\2\2\2cd\5\6\4\2de\7\t"+
		"\2\2ef\5\6\4\2f\u0098\3\2\2\2gh\5\b\5\2hi\7\t\2\2ij\5\b\5\2j\u0098\3\2"+
		"\2\2kl\5\f\7\2lm\7\t\2\2mn\5\f\7\2n\u0098\3\2\2\2op\5\16\b\2pq\7\n\2\2"+
		"qr\t\6\2\2r\u0098\3\2\2\2st\5\20\t\2tu\7\n\2\2uv\t\6\2\2v\u0098\3\2\2"+
		"\2wx\5\16\b\2xy\7\n\2\2yz\7\25\2\2z{\7\4\2\2{|\5\6\4\2|}\7\3\2\2}\u0098"+
		"\3\2\2\2~\177\5\20\t\2\177\u0080\7\n\2\2\u0080\u0081\7\25\2\2\u0081\u0082"+
		"\7\4\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\3\2\2\u0084\u0098\3\2\2\2\u0085"+
		"\u0086\5\22\n\2\u0086\u0087\7\n\2\2\u0087\u0088\7\25\2\2\u0088\u0089\7"+
		"\4\2\2\u0089\u008a\5\b\5\2\u008a\u008b\7\3\2\2\u008b\u0098\3\2\2\2\u008c"+
		"\u008d\5\24\13\2\u008d\u008e\7\n\2\2\u008e\u008f\7\25\2\2\u008f\u0090"+
		"\7\4\2\2\u0090\u0091\5\n\6\2\u0091\u0092\7\3\2\2\u0092\u0098\3\2\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\u0095\7\n\2\2\u0095\u0096\t\7\2\2\u0096\u0098\3"+
		"\2\2\2\u0097Z\3\2\2\2\u0097]\3\2\2\2\u0097^\3\2\2\2\u0097_\3\2\2\2\u0097"+
		"c\3\2\2\2\u0097g\3\2\2\2\u0097k\3\2\2\2\u0097o\3\2\2\2\u0097s\3\2\2\2"+
		"\u0097w\3\2\2\2\u0097~\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u008c\3\2\2\2"+
		"\u0097\u0093\3\2\2\2\u0098\u00a1\3\2\2\2\u0099\u009a\6\6\6\3\u009a\u009b"+
		"\t\b\2\2\u009b\u00a0\5\n\6\2\u009c\u009d\6\6\7\3\u009d\u009e\7\t\2\2\u009e"+
		"\u00a0\5\n\6\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\13\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a9\5\16\b\2\u00a5\u00a9\5\20\t\2\u00a6\u00a9\5\22\n"+
		"\2\u00a7\u00a9\5\24\13\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\b\b\1\2"+
		"\u00ab\u00ae\7&\2\2\u00ac\u00ae\5\26\f\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00bc\3\2\2\2\u00af\u00b0\6\b\b\3\u00b0\u00b1\7\n\2\2\u00b1"+
		"\u00bb\t\t\2\2\u00b2\u00b3\6\b\t\3\u00b3\u00b4\7\n\2\2\u00b4\u00b5\7\33"+
		"\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7\t\5\2\2\u00b7\u00b8\5\6\4\2\u00b8"+
		"\u00b9\7\3\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b2\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\17\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\t\1\2\u00c0\u00c3\7(\2\2"+
		"\u00c1\u00c3\5\26\f\2\u00c2\u00bf\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00d1"+
		"\3\2\2\2\u00c4\u00c5\6\t\n\3\u00c5\u00c6\7\n\2\2\u00c6\u00d0\t\t\2\2\u00c7"+
		"\u00c8\6\t\13\3\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cb\7"+
		"\4\2\2\u00cb\u00cc\t\5\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7\3\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c7\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\21\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\b\n\1\2\u00d5\u00d8\7*\2\2\u00d6\u00d8\5\26\f\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00de\3\2\2\2\u00d9\u00da\6\n"+
		"\f\3\u00da\u00db\7\n\2\2\u00db\u00dd\t\t\2\2\u00dc\u00d9\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\23\3\2\2"+
		"\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\7+\2\2\u00e2\u00e4\5\26\f\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\25\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6"+
		"\u00e7\7\n\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7\n\2\2\u00e9\u00ea\5"+
		"\34\17\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\5\32\16\2\u00ec\u00ed\7\n\2\2"+
		"\u00ed\u00ee\5\34\17\2\u00ee\u00f0\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00eb"+
		"\3\2\2\2\u00f0\27\3\2\2\2\u00f1\u00f2\t\n\2\2\u00f2\31\3\2\2\2\u00f3\u00f4"+
		"\7\"\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"\u00f8\7\3\2\2\u00f8\35\3\2\2\2\26$:EGPW\u0097\u009f\u00a1\u00a8\u00ad"+
		"\u00ba\u00bc\u00c2\u00cf\u00d1\u00d7\u00de\u00e3\u00ef";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}