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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, MUL=6, DIV=7, ADD=8, SUB=9, DOT=10, 
		MIN=11, MAX=12, NOT=13, EQUAL=14, AND=15, OR=16, AVG=17, SUM=18, ASC=19, 
		DESC=20, ALLTRUE=21, ALLFALSE=22, ID=23, STRING=24, DIGIT=25, DOUBLE=26, 
		BOOL=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "','", "'['", "'('", "'*'", "'/'", "'+'", "'-'", 
		"'.'", "'<'", "'>'", "'!'", "'=='", "'&'", "'|'", "'Avg'", "'Sum'", "'orderAsc'", 
		"'orderDesc'", "'isAllTrue'", "'isAllFalse'", "ID", "STRING", "DIGIT", 
		"DOUBLE", "BOOL", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_stringExpr = 2, RULE_numExpr = 3, 
		RULE_boolExpr = 4, RULE_listExpr = 5, RULE_listDigit = 6, RULE_listDouble = 7, 
		RULE_listString = 8, RULE_listBool = 9, RULE_seqInt = 10, RULE_seqDouble = 11, 
		RULE_seqString = 12, RULE_seqBool = 13, RULE_listDigitExpr = 14, RULE_listDoubleExpr = 15, 
		RULE_listStringExpr = 16, RULE_listBoolExpr = 17, RULE_identifier = 18, 
		RULE_hostId = 19, RULE_observableId = 20, RULE_method = 21;
	public static final String[] ruleNames = {
		"start", "expression", "stringExpr", "numExpr", "boolExpr", "listExpr", 
		"listDigit", "listDouble", "listString", "listBool", "seqInt", "seqDouble", 
		"seqString", "seqBool", "listDigitExpr", "listDoubleExpr", "listStringExpr", 
		"listBoolExpr", "identifier", "hostId", "observableId", "method"
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
			setState(44); expression();
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumExpressionContext extends ExpressionContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public NumExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNumExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46); stringExpr(0);
				}
				break;

			case 2:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47); numExpr(0);
				}
				break;

			case 3:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48); boolExpr(0);
				}
				break;

			case 4:
				_localctx = new ListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49); listExpr();
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
	public static class BaseStrContext extends StringExprContext {
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public BaseStrContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBaseStr(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_stringExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new BaseStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53); match(STRING);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54); identifier();
				}
				break;
			case 5:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); match(5);
				setState(56); stringExpr(0);
				setState(57); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new StringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
					setState(61);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(62); match(ADD);
					setState(63); stringExpr(5);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_numExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70); match(DIGIT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); match(DOUBLE);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72); identifier();
				}
				break;
			case 5:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73); match(5);
				setState(74); numExpr(0);
				setState(75); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(79);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(80);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(81); numExpr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(82);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(83);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(84); numExpr(6);
						}
						break;
					}
					} 
				}
				setState(89);
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
	public static class MinMaxContext extends BoolExprContext {
		public Token op;
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(ExpressionParser.MIN, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode MAX() { return getToken(ExpressionParser.MAX, 0); }
		public MinMaxContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMinMax(this);
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
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91); match(NOT);
				setState(92); boolExpr(10);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95); match(5);
				setState(96); boolExpr(0);
				setState(97); match(2);
				}
				break;

			case 5:
				{
				_localctx = new MinMaxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99); numExpr(0);
				setState(100);
				((MinMaxContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MIN || _la==MAX) ) {
					((MinMaxContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(101); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103); numExpr(0);
				setState(104); match(EQUAL);
				setState(105); numExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107); stringExpr(0);
				setState(108); match(EQUAL);
				setState(109); stringExpr(0);
				}
				break;

			case 8:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111); listExpr();
				setState(112); match(EQUAL);
				setState(113); listExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(117);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(118);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(119); boolExpr(10);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(120);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(121); match(EQUAL);
						setState(122); boolExpr(5);
						}
						break;
					}
					} 
				}
				setState(127);
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
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
	 
		public ListExprContext() { }
		public void copyFrom(ListExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListStringExpressionContext extends ListExprContext {
		public ListStringExprContext listStringExpr() {
			return getRuleContext(ListStringExprContext.class,0);
		}
		public ListStringExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDigitExpressionContext extends ListExprContext {
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public ListDigitExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDoubleExpressionContext extends ListExprContext {
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public ListDoubleExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDoubleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListBoolExpressionContext extends ListExprContext {
		public ListBoolExprContext listBoolExpr() {
			return getRuleContext(ListBoolExprContext.class,0);
		}
		public ListBoolExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listExpr);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ListDigitExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128); listDigitExpr();
				}
				break;

			case 2:
				_localctx = new ListDoubleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129); listDoubleExpr();
				}
				break;

			case 3:
				_localctx = new ListStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130); listStringExpr();
				}
				break;

			case 4:
				_localctx = new ListBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131); listBoolExpr();
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

	public static class ListDigitContext extends ParserRuleContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public ListDigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDigit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDigitContext listDigit() throws RecognitionException {
		ListDigitContext _localctx = new ListDigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listDigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(4);
			setState(135); seqInt(0);
			setState(136); match(1);
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

	public static class ListDoubleContext extends ParserRuleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public ListDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDouble; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDoubleContext listDouble() throws RecognitionException {
		ListDoubleContext _localctx = new ListDoubleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(4);
			setState(139); seqDouble(0);
			setState(140); match(1);
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

	public static class ListStringContext extends ParserRuleContext {
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public ListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStringContext listString() throws RecognitionException {
		ListStringContext _localctx = new ListStringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(4);
			setState(143); seqString(0);
			setState(144); match(1);
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

	public static class ListBoolContext extends ParserRuleContext {
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public ListBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBoolContext listBool() throws RecognitionException {
		ListBoolContext _localctx = new ListBoolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(4);
			setState(147); seqBool(0);
			setState(148); match(1);
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

	public static class SeqIntContext extends ParserRuleContext {
		public int _p;
		public SeqIntContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqIntContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqInt; }
	 
		public SeqIntContext() { }
		public void copyFrom(SeqIntContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqIntSeqIntContext extends SeqIntContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public SeqIntSeqIntContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntSeqInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqIntDigitContext extends SeqIntContext {
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public SeqIntDigitContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqIntIdentifierListIntContext extends SeqIntContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqIntIdentifierListIntContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntIdentifierListInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqIntSeqIntIdListIntContext extends SeqIntContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqIntSeqIntIdListIntContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntSeqIntIdListInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqIntContext seqInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqIntContext _localctx = new SeqIntContext(_ctx, _parentState, _p);
		SeqIntContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_seqInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new SeqIntDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151); match(DIGIT);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqIntIdentifierListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new SeqIntSeqIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(155);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(156); match(3);
						setState(157); match(DIGIT);
						}
						break;

					case 2:
						{
						_localctx = new SeqIntSeqIntIdListIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(158);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(159); match(3);
						setState(160); identifier();
						}
						break;
					}
					} 
				}
				setState(165);
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

	public static class SeqDoubleContext extends ParserRuleContext {
		public int _p;
		public SeqDoubleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqDoubleContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqDouble; }
	 
		public SeqDoubleContext() { }
		public void copyFrom(SeqDoubleContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqDoubleSeqDoubleIdListDoubleContext extends SeqDoubleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqDoubleSeqDoubleIdListDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleSeqDoubleIdListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqDoubleDoubleContext extends SeqDoubleContext {
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public SeqDoubleDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqDoubleIdentifierListDoubleContext extends SeqDoubleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqDoubleIdentifierListDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleIdentifierListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqDoubleSeqDoubleContext extends SeqDoubleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public SeqDoubleSeqDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleSeqDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqDoubleContext seqDouble(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqDoubleContext _localctx = new SeqDoubleContext(_ctx, _parentState, _p);
		SeqDoubleContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_seqDouble);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new SeqDoubleDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167); match(DOUBLE);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqDoubleIdentifierListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new SeqDoubleSeqDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(171);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(172); match(3);
						setState(173); match(DOUBLE);
						}
						break;

					case 2:
						{
						_localctx = new SeqDoubleSeqDoubleIdListDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(174);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(175); match(3);
						setState(176); identifier();
						}
						break;
					}
					} 
				}
				setState(181);
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

	public static class SeqStringContext extends ParserRuleContext {
		public int _p;
		public SeqStringContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqStringContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqString; }
	 
		public SeqStringContext() { }
		public void copyFrom(SeqStringContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqStringStringContext extends SeqStringContext {
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public SeqStringStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringSeqStringContext extends SeqStringContext {
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public SeqStringSeqStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringSeqString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringSeqStringIdListStringContext extends SeqStringContext {
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqStringSeqStringIdListStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringSeqStringIdListString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringIdentifierListStringContext extends SeqStringContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqStringIdentifierListStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringIdentifierListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqStringContext seqString(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqStringContext _localctx = new SeqStringContext(_ctx, _parentState, _p);
		SeqStringContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_seqString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new SeqStringStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183); match(STRING);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqStringIdentifierListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new SeqStringSeqStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(187);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(188); match(3);
						setState(189); match(STRING);
						}
						break;

					case 2:
						{
						_localctx = new SeqStringSeqStringIdListStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(190);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(191); match(3);
						setState(192); identifier();
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class SeqBoolContext extends ParserRuleContext {
		public int _p;
		public SeqBoolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqBoolContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqBool; }
	 
		public SeqBoolContext() { }
		public void copyFrom(SeqBoolContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqBoolSeqBoolContext extends SeqBoolContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public SeqBoolSeqBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolSeqBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolBoolContext extends SeqBoolContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public SeqBoolBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolIdentifierListBoolContext extends SeqBoolContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqBoolIdentifierListBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolIdentifierListBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolSeqBoolIdListBoolContext extends SeqBoolContext {
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SeqBoolSeqBoolIdListBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolSeqBoolIdListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqBoolContext seqBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqBoolContext _localctx = new SeqBoolContext(_ctx, _parentState, _p);
		SeqBoolContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_seqBool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch (_input.LA(1)) {
			case BOOL:
				{
				_localctx = new SeqBoolBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199); match(BOOL);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqBoolIdentifierListBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new SeqBoolSeqBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(203);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(204); match(3);
						setState(205); match(BOOL);
						}
						break;

					case 2:
						{
						_localctx = new SeqBoolSeqBoolIdListBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(206);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(207); match(3);
						setState(208); identifier();
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ListDigitExprContext extends ParserRuleContext {
		public ListDigitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDigitExpr; }
	 
		public ListDigitExprContext() { }
		public void copyFrom(ListDigitExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListDigit_LabelContext extends ListDigitExprContext {
		public ListDigitContext listDigit() {
			return getRuleContext(ListDigitContext.class,0);
		}
		public ListDigit_LabelContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigit_Label(this);
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

	public final ListDigitExprContext listDigitExpr() throws RecognitionException {
		ListDigitExprContext _localctx = new ListDigitExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listDigitExpr);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new ListDigit_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214); listDigit();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215); identifier();
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

	public static class ListDoubleExprContext extends ParserRuleContext {
		public ListDoubleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDoubleExpr; }
	 
		public ListDoubleExprContext() { }
		public void copyFrom(ListDoubleExprContext ctx) {
			super.copyFrom(ctx);
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
	public static class ListDouble_LabelContext extends ListDoubleExprContext {
		public ListDoubleContext listDouble() {
			return getRuleContext(ListDoubleContext.class,0);
		}
		public ListDouble_LabelContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDouble_Label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDoubleExprContext listDoubleExpr() throws RecognitionException {
		ListDoubleExprContext _localctx = new ListDoubleExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listDoubleExpr);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new ListDouble_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218); listDouble();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219); identifier();
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

	public static class ListStringExprContext extends ParserRuleContext {
		public ListStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStringExpr; }
	 
		public ListStringExprContext() { }
		public void copyFrom(ListStringExprContext ctx) {
			super.copyFrom(ctx);
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
	public static class ListString_LabelContext extends ListStringExprContext {
		public ListStringContext listString() {
			return getRuleContext(ListStringContext.class,0);
		}
		public ListString_LabelContext(ListStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListString_Label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStringExprContext listStringExpr() throws RecognitionException {
		ListStringExprContext _localctx = new ListStringExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listStringExpr);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new ListString_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222); listString();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223); identifier();
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
	public static class ListBool_LabelContext extends ListBoolExprContext {
		public ListBoolContext listBool() {
			return getRuleContext(ListBoolContext.class,0);
		}
		public ListBool_LabelContext(ListBoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBool_Label(this);
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
		enterRule(_localctx, 34, RULE_listBoolExpr);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new ListBool_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); listBool();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227); identifier();
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
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); hostId();
			setState(231); match(DOT);
			setState(232); observableId();
			setState(233); match(DOT);
			setState(234); method();
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
		enterRule(_localctx, 38, RULE_hostId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 40, RULE_observableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(ID);
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
		enterRule(_localctx, 42, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(ID);
			setState(241); match(5);
			setState(242); match(2);
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
		case 2: return stringExpr_sempred((StringExprContext)_localctx, predIndex);

		case 3: return numExpr_sempred((NumExprContext)_localctx, predIndex);

		case 4: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 10: return seqInt_sempred((SeqIntContext)_localctx, predIndex);

		case 11: return seqDouble_sempred((SeqDoubleContext)_localctx, predIndex);

		case 12: return seqString_sempred((SeqStringContext)_localctx, predIndex);

		case 13: return seqBool_sempred((SeqBoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stringExpr_sempred(StringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean seqInt_sempred(SeqIntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return 2 >= _localctx._p;

		case 6: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 6 >= _localctx._p;

		case 2: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean seqBool_sempred(SeqBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return 2 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 9 >= _localctx._p;

		case 4: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean seqDouble_sempred(SeqDoubleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return 2 >= _localctx._p;

		case 8: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean seqString_sempred(SeqStringContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return 2 >= _localctx._p;

		case 10: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\36\u00f7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\7\4C"+
		"\n\4\f\4\16\4F\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6v\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\7\3\7\3"+
		"\7\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u009c\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\16\3\16\3\16\5\16\u00bc"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13"+
		"\16\3\17\3\17\3\17\5\17\u00cc\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00d4\n\17\f\17\16\17\u00d7\13\17\3\20\3\20\5\20\u00db\n\20\3\21\3\21"+
		"\5\21\u00df\n\21\3\22\3\22\5\22\u00e3\n\22\3\23\3\23\5\23\u00e7\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2\b\t\3"+
		"\2\n\13\3\2\r\16\3\2\21\22\4\2\b\b\31\31\u0107\2.\3\2\2\2\4\64\3\2\2\2"+
		"\6=\3\2\2\2\bO\3\2\2\2\nu\3\2\2\2\f\u0086\3\2\2\2\16\u0088\3\2\2\2\20"+
		"\u008c\3\2\2\2\22\u0090\3\2\2\2\24\u0094\3\2\2\2\26\u009b\3\2\2\2\30\u00ab"+
		"\3\2\2\2\32\u00bb\3\2\2\2\34\u00cb\3\2\2\2\36\u00da\3\2\2\2 \u00de\3\2"+
		"\2\2\"\u00e2\3\2\2\2$\u00e6\3\2\2\2&\u00e8\3\2\2\2(\u00ee\3\2\2\2*\u00f0"+
		"\3\2\2\2,\u00f2\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\65\5\6\4\2\61\65\5\b\5"+
		"\2\62\65\5\n\6\2\63\65\5\f\7\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2"+
		"\2\64\63\3\2\2\2\65\5\3\2\2\2\66\67\b\4\1\2\67>\7\32\2\28>\5&\24\29:\7"+
		"\7\2\2:;\5\6\4\2;<\7\4\2\2<>\3\2\2\2=\66\3\2\2\2=8\3\2\2\2=9\3\2\2\2>"+
		"D\3\2\2\2?@\6\4\2\3@A\7\n\2\2AC\5\6\4\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GH\b\5\1\2HP\7\33\2\2IP\7\34\2\2JP\5&\24"+
		"\2KL\7\7\2\2LM\5\b\5\2MN\7\4\2\2NP\3\2\2\2OG\3\2\2\2OI\3\2\2\2OJ\3\2\2"+
		"\2OK\3\2\2\2PY\3\2\2\2QR\6\5\3\3RS\t\2\2\2SX\5\b\5\2TU\6\5\4\3UV\t\3\2"+
		"\2VX\5\b\5\2WQ\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2"+
		"\2\2[Y\3\2\2\2\\]\b\6\1\2]^\7\17\2\2^v\5\n\6\2_v\7\35\2\2`v\5&\24\2ab"+
		"\7\7\2\2bc\5\n\6\2cd\7\4\2\2dv\3\2\2\2ef\5\b\5\2fg\t\4\2\2gh\5\b\5\2h"+
		"v\3\2\2\2ij\5\b\5\2jk\7\20\2\2kl\5\b\5\2lv\3\2\2\2mn\5\6\4\2no\7\20\2"+
		"\2op\5\6\4\2pv\3\2\2\2qr\5\f\7\2rs\7\20\2\2st\5\f\7\2tv\3\2\2\2u\\\3\2"+
		"\2\2u_\3\2\2\2u`\3\2\2\2ua\3\2\2\2ue\3\2\2\2ui\3\2\2\2um\3\2\2\2uq\3\2"+
		"\2\2v\177\3\2\2\2wx\6\6\5\3xy\t\5\2\2y~\5\n\6\2z{\6\6\6\3{|\7\20\2\2|"+
		"~\5\n\6\2}w\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\13\3\2\2\2\u0081\177\3\2\2\2\u0082\u0087\5\36\20\2\u0083"+
		"\u0087\5 \21\2\u0084\u0087\5\"\22\2\u0085\u0087\5$\23\2\u0086\u0082\3"+
		"\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\r\3\2\2\2\u0088\u0089\7\6\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\3\2"+
		"\2\u008b\17\3\2\2\2\u008c\u008d\7\6\2\2\u008d\u008e\5\30\r\2\u008e\u008f"+
		"\7\3\2\2\u008f\21\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0092\5\32\16\2\u0092"+
		"\u0093\7\3\2\2\u0093\23\3\2\2\2\u0094\u0095\7\6\2\2\u0095\u0096\5\34\17"+
		"\2\u0096\u0097\7\3\2\2\u0097\25\3\2\2\2\u0098\u0099\b\f\1\2\u0099\u009c"+
		"\7\33\2\2\u009a\u009c\5&\24\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\u00a5\3\2\2\2\u009d\u009e\6\f\7\3\u009e\u009f\7\5\2\2\u009f\u00a4"+
		"\7\33\2\2\u00a0\u00a1\6\f\b\3\u00a1\u00a2\7\5\2\2\u00a2\u00a4\5&\24\2"+
		"\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\b\r\1\2\u00a9\u00ac\7\34\2\2\u00aa\u00ac\5&\24\2\u00ab\u00a8\3"+
		"\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00b5\3\2\2\2\u00ad\u00ae\6\r\t\3\u00ae"+
		"\u00af\7\5\2\2\u00af\u00b4\7\34\2\2\u00b0\u00b1\6\r\n\3\u00b1\u00b2\7"+
		"\5\2\2\u00b2\u00b4\5&\24\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\16\1\2\u00b9\u00bc\7\32\2\2\u00ba"+
		"\u00bc\5&\24\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00c5\3\2"+
		"\2\2\u00bd\u00be\6\16\13\3\u00be\u00bf\7\5\2\2\u00bf\u00c4\7\32\2\2\u00c0"+
		"\u00c1\6\16\f\3\u00c1\u00c2\7\5\2\2\u00c2\u00c4\5&\24\2\u00c3\u00bd\3"+
		"\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\b\17\1"+
		"\2\u00c9\u00cc\7\35\2\2\u00ca\u00cc\5&\24\2\u00cb\u00c8\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\6\17\r\3\u00ce\u00cf\7"+
		"\5\2\2\u00cf\u00d4\7\35\2\2\u00d0\u00d1\6\17\16\3\u00d1\u00d2\7\5\2\2"+
		"\u00d2\u00d4\5&\24\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\35\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\5\16\b\2\u00d9\u00db\5&\24\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00d9\3\2\2\2\u00db\37\3\2\2\2\u00dc\u00df\5\20\t\2\u00dd"+
		"\u00df\5&\24\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df!\3\2\2\2"+
		"\u00e0\u00e3\5\22\n\2\u00e1\u00e3\5&\24\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00e7\5\24\13\2\u00e5\u00e7\5&\24\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7%\3\2\2\2\u00e8\u00e9\5(\25\2"+
		"\u00e9\u00ea\7\f\2\2\u00ea\u00eb\5*\26\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed"+
		"\5,\27\2\u00ed\'\3\2\2\2\u00ee\u00ef\t\6\2\2\u00ef)\3\2\2\2\u00f0\u00f1"+
		"\7\31\2\2\u00f1+\3\2\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\7\7\2\2\u00f4"+
		"\u00f5\7\4\2\2\u00f5-\3\2\2\2\34\64=DOWYu}\177\u0086\u009b\u00a3\u00a5"+
		"\u00ab\u00b3\u00b5\u00bb\u00c3\u00c5\u00cb\u00d3\u00d5\u00da\u00de\u00e2"+
		"\u00e6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}