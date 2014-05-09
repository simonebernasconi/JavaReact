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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, MUL=15, DIV=16, ADD=17, SUB=18, 
		DOT=19, MIN=20, MAX=21, NOT=22, EQUAL=23, AND=24, OR=25, AVG=26, SUM=27, 
		ASC=28, DESC=29, ALLTRUE=30, ALLFALSE=31, ID=32, STRING=33, SIMPLESTRING=34, 
		DIGIT=35, SIMPLEDIGIT=36, DOUBLE=37, SIMPLEDOUBLE=38, BOOL=39, WS=40;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "':Bool'", "')'", "','", "':ListString'", "'Size'", 
		"'['", "'('", "':Num'", "':ListInt'", "':String'", "':ListDouble'", "':ListBool'", 
		"'contains'", "'*'", "'/'", "'+'", "'-'", "'.'", "'<'", "'>'", "'!'", 
		"'=='", "'&'", "'|'", "'Avg'", "'Sum'", "'orderAsc'", "'orderDesc'", "'isAllTrue'", 
		"'isAllFalse'", "ID", "STRING", "SIMPLESTRING", "DIGIT", "SIMPLEDIGIT", 
		"DOUBLE", "SIMPLEDOUBLE", "BOOL", "WS"
	};
	public static final int
		RULE_expression = 0, RULE_stringExpr = 1, RULE_numExpr = 2, RULE_boolExpr = 3, 
		RULE_listExpr = 4, RULE_listDigit = 5, RULE_listDouble = 6, RULE_listString = 7, 
		RULE_listBool = 8, RULE_seqInt = 9, RULE_seqDouble = 10, RULE_seqString = 11, 
		RULE_seqBool = 12, RULE_listDigitExpr = 13, RULE_listDoubleExpr = 14, 
		RULE_listStringExpr = 15, RULE_listBoolExpr = 16, RULE_identifierNum = 17, 
		RULE_identifierString = 18, RULE_identifierBool = 19, RULE_identifierListInt = 20, 
		RULE_identifierListBool = 21, RULE_identifierListDouble = 22, RULE_identifierListString = 23, 
		RULE_hostId = 24, RULE_observableId = 25, RULE_method = 26;
	public static final String[] ruleNames = {
		"expression", "stringExpr", "numExpr", "boolExpr", "listExpr", "listDigit", 
		"listDouble", "listString", "listBool", "seqInt", "seqDouble", "seqString", 
		"seqBool", "listDigitExpr", "listDoubleExpr", "listStringExpr", "listBoolExpr", 
		"identifierNum", "identifierString", "identifierBool", "identifierListInt", 
		"identifierListBool", "identifierListDouble", "identifierListString", 
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
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54); stringExpr(0);
				}
				break;

			case 2:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); numExpr(0);
				}
				break;

			case 3:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56); boolExpr(0);
				}
				break;

			case 4:
				_localctx = new ListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57); listExpr();
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
		public IdentifierStringContext identifierString() {
			return getRuleContext(IdentifierStringContext.class,0);
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
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_stringExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new BaseStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61); match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62); identifierString();
				}
				break;
			case 8:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); match(8);
				setState(64); stringExpr(0);
				setState(65); match(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
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
					setState(69);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(70); match(ADD);
					setState(71); stringExpr(5);
					}
					} 
				}
				setState(76);
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
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
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
	public static class MinMaxContext extends NumExprContext {
		public Token op;
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(ExpressionParser.MIN, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode MAX() { return getToken(ExpressionParser.MAX, 0); }
		public MinMaxContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMinMax(this);
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
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78); match(DIGIT);
				}
				break;

			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79); match(DOUBLE);
				}
				break;

			case 3:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80); identifierNum();
				}
				break;

			case 4:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81); match(8);
				setState(82); numExpr(0);
				setState(83); match(3);
				}
				break;

			case 5:
				{
				_localctx = new SizeListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); listExpr();
				setState(86); match(DOT);
				setState(87); match(6);
				}
				break;

			case 6:
				{
				_localctx = new AvgSumListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89); listDigitExpr();
				setState(90); match(DOT);
				setState(91);
				((AvgSumListIntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==SUM) ) {
					((AvgSumListIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 7:
				{
				_localctx = new AvgSumListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); listDoubleExpr();
				setState(94); match(DOT);
				setState(95);
				((AvgSumListDoubleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==SUM) ) {
					((AvgSumListDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(99);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(100);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(101); numExpr(11);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(102);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(103);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(104); numExpr(10);
						}
						break;

					case 3:
						{
						_localctx = new MinMaxContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(105);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(106);
						((MinMaxContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MIN || _la==MAX) ) {
							((MinMaxContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(107); numExpr(9);
						}
						break;
					}
					} 
				}
				setState(112);
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
		public IdentifierBoolContext identifierBool() {
			return getRuleContext(IdentifierBoolContext.class,0);
		}
		public IdBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsIntContext extends BoolExprContext {
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_boolExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114); match(NOT);
				setState(115); boolExpr(16);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117); identifierBool();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118); match(8);
				setState(119); boolExpr(0);
				setState(120); match(3);
				}
				break;

			case 5:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122); numExpr(0);
				setState(123); match(EQUAL);
				setState(124); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126); stringExpr(0);
				setState(127); match(EQUAL);
				setState(128); stringExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); listExpr();
				setState(131); match(EQUAL);
				setState(132); listExpr();
				}
				break;

			case 8:
				{
				_localctx = new IsAscIsDescIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134); listDigitExpr();
				setState(135); match(DOT);
				setState(136);
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
				setState(138); listDoubleExpr();
				setState(139); match(DOT);
				setState(140);
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
				setState(142); listDigitExpr();
				setState(143); match(DOT);
				setState(144); match(14);
				setState(145); match(8);
				setState(146); numExpr(0);
				setState(147); match(3);
				}
				break;

			case 11:
				{
				_localctx = new ContainsDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); listDoubleExpr();
				setState(150); match(DOT);
				setState(151); match(14);
				setState(152); match(8);
				setState(153); numExpr(0);
				setState(154); match(3);
				}
				break;

			case 12:
				{
				_localctx = new ContainsStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156); listStringExpr();
				setState(157); match(DOT);
				setState(158); match(14);
				setState(159); match(8);
				setState(160); stringExpr(0);
				setState(161); match(3);
				}
				break;

			case 13:
				{
				_localctx = new ContainsBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); listBoolExpr();
				setState(164); match(DOT);
				setState(165); match(14);
				setState(166); match(8);
				setState(167); boolExpr(0);
				setState(168); match(3);
				}
				break;

			case 14:
				{
				_localctx = new AllTrueFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); listBoolExpr();
				setState(171); match(DOT);
				setState(172);
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
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(176);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(177);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(178); boolExpr(16);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(179);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(180); match(EQUAL);
						setState(181); boolExpr(12);
						}
						break;
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
		enterRule(_localctx, 8, RULE_listExpr);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ListDigitExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187); listDigitExpr();
				}
				break;

			case 2:
				_localctx = new ListDoubleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188); listDoubleExpr();
				}
				break;

			case 3:
				_localctx = new ListStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189); listStringExpr();
				}
				break;

			case 4:
				_localctx = new ListBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(190); listBoolExpr();
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
		enterRule(_localctx, 10, RULE_listDigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(7);
			setState(194); seqInt(0);
			setState(195); match(1);
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
		enterRule(_localctx, 12, RULE_listDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(7);
			setState(198); seqDouble(0);
			setState(199); match(1);
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
		enterRule(_localctx, 14, RULE_listString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(7);
			setState(202); seqString(0);
			setState(203); match(1);
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
		enterRule(_localctx, 16, RULE_listBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(7);
			setState(206); seqBool(0);
			setState(207); match(1);
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
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
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
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
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
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_seqInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new SeqIntDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210); match(DIGIT);
				}
				break;
			case ID:
				{
				_localctx = new SeqIntIdentifierListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211); identifierNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new SeqIntSeqIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(214);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(215); match(4);
						setState(216); match(DIGIT);
						}
						break;

					case 2:
						{
						_localctx = new SeqIntSeqIntIdListIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(217);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(218); match(4);
						setState(219); identifierNum();
						}
						break;
					}
					} 
				}
				setState(224);
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
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
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
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_seqDouble);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new SeqDoubleDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(226); match(DOUBLE);
				}
				break;
			case ID:
				{
				_localctx = new SeqDoubleIdentifierListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); identifierNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new SeqDoubleSeqDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(230);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(231); match(4);
						setState(232); match(DOUBLE);
						}
						break;

					case 2:
						{
						_localctx = new SeqDoubleSeqDoubleIdListDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(233);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(234); match(4);
						setState(235); identifierNum();
						}
						break;
					}
					} 
				}
				setState(240);
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
		public IdentifierStringContext identifierString() {
			return getRuleContext(IdentifierStringContext.class,0);
		}
		public SeqStringSeqStringIdListStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringSeqStringIdListString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringIdentifierListStringContext extends SeqStringContext {
		public IdentifierStringContext identifierString() {
			return getRuleContext(IdentifierStringContext.class,0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_seqString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new SeqStringStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242); match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new SeqStringIdentifierListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); identifierString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new SeqStringSeqStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(246);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(247); match(4);
						setState(248); match(STRING);
						}
						break;

					case 2:
						{
						_localctx = new SeqStringSeqStringIdListStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(249);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(250); match(4);
						setState(251); identifierString();
						}
						break;
					}
					} 
				}
				setState(256);
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
		public IdentifierBoolContext identifierBool() {
			return getRuleContext(IdentifierBoolContext.class,0);
		}
		public SeqBoolIdentifierListBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolIdentifierListBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolSeqBoolIdListBoolContext extends SeqBoolContext {
		public IdentifierBoolContext identifierBool() {
			return getRuleContext(IdentifierBoolContext.class,0);
		}
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_seqBool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch (_input.LA(1)) {
			case BOOL:
				{
				_localctx = new SeqBoolBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(258); match(BOOL);
				}
				break;
			case ID:
				{
				_localctx = new SeqBoolIdentifierListBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259); identifierBool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new SeqBoolSeqBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(262);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(263); match(4);
						setState(264); match(BOOL);
						}
						break;

					case 2:
						{
						_localctx = new SeqBoolSeqBoolIdListBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(265);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(266); match(4);
						setState(267); identifierBool();
						}
						break;
					}
					} 
				}
				setState(272);
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
		public IdentifierListIntContext identifierListInt() {
			return getRuleContext(IdentifierListIntContext.class,0);
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
		enterRule(_localctx, 26, RULE_listDigitExpr);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case 7:
				_localctx = new ListDigit_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273); listDigit();
				}
				break;
			case ID:
				_localctx = new IdListIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274); identifierListInt();
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
		public IdentifierListDoubleContext identifierListDouble() {
			return getRuleContext(IdentifierListDoubleContext.class,0);
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
		enterRule(_localctx, 28, RULE_listDoubleExpr);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case 7:
				_localctx = new ListDouble_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277); listDouble();
				}
				break;
			case ID:
				_localctx = new IdListDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278); identifierListDouble();
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
		public IdentifierListStringContext identifierListString() {
			return getRuleContext(IdentifierListStringContext.class,0);
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
		enterRule(_localctx, 30, RULE_listStringExpr);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case 7:
				_localctx = new ListString_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281); listString();
				}
				break;
			case ID:
				_localctx = new IdListStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282); identifierListString();
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
		public IdentifierListBoolContext identifierListBool() {
			return getRuleContext(IdentifierListBoolContext.class,0);
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
		enterRule(_localctx, 32, RULE_listBoolExpr);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case 7:
				_localctx = new ListBool_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285); listBool();
				}
				break;
			case ID:
				_localctx = new IdListBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286); identifierListBool();
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

	public static class IdentifierNumContext extends ParserRuleContext {
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
		public IdentifierNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNumContext identifierNum() throws RecognitionException {
		IdentifierNumContext _localctx = new IdentifierNumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifierNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); hostId();
			setState(290); match(DOT);
			setState(291); observableId();
			setState(292); match(DOT);
			setState(293); method();
			setState(294); match(9);
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

	public static class IdentifierStringContext extends ParserRuleContext {
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
		public IdentifierStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierStringContext identifierString() throws RecognitionException {
		IdentifierStringContext _localctx = new IdentifierStringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifierString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); hostId();
			setState(297); match(DOT);
			setState(298); observableId();
			setState(299); match(DOT);
			setState(300); method();
			setState(301); match(11);
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

	public static class IdentifierBoolContext extends ParserRuleContext {
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
		public IdentifierBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierBoolContext identifierBool() throws RecognitionException {
		IdentifierBoolContext _localctx = new IdentifierBoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifierBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); hostId();
			setState(304); match(DOT);
			setState(305); observableId();
			setState(306); match(DOT);
			setState(307); method();
			setState(308); match(2);
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

	public static class IdentifierListIntContext extends ParserRuleContext {
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
		public IdentifierListIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListIntContext identifierListInt() throws RecognitionException {
		IdentifierListIntContext _localctx = new IdentifierListIntContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifierListInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); hostId();
			setState(311); match(DOT);
			setState(312); observableId();
			setState(313); match(DOT);
			setState(314); method();
			setState(315); match(10);
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

	public static class IdentifierListBoolContext extends ParserRuleContext {
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
		public IdentifierListBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListBoolContext identifierListBool() throws RecognitionException {
		IdentifierListBoolContext _localctx = new IdentifierListBoolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifierListBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); hostId();
			setState(318); match(DOT);
			setState(319); observableId();
			setState(320); match(DOT);
			setState(321); method();
			setState(322); match(13);
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

	public static class IdentifierListDoubleContext extends ParserRuleContext {
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
		public IdentifierListDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListDouble; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListDoubleContext identifierListDouble() throws RecognitionException {
		IdentifierListDoubleContext _localctx = new IdentifierListDoubleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierListDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); hostId();
			setState(325); match(DOT);
			setState(326); observableId();
			setState(327); match(DOT);
			setState(328); method();
			setState(329); match(12);
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

	public static class IdentifierListStringContext extends ParserRuleContext {
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
		public IdentifierListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListStringContext identifierListString() throws RecognitionException {
		IdentifierListStringContext _localctx = new IdentifierListStringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifierListString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); hostId();
			setState(332); match(DOT);
			setState(333); observableId();
			setState(334); match(DOT);
			setState(335); method();
			setState(336); match(5);
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
		enterRule(_localctx, 48, RULE_hostId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(ID);
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
		enterRule(_localctx, 50, RULE_observableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(ID);
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
		enterRule(_localctx, 52, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(ID);
			setState(343); match(8);
			setState(344); match(3);
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
		case 1: return stringExpr_sempred((StringExprContext)_localctx, predIndex);

		case 2: return numExpr_sempred((NumExprContext)_localctx, predIndex);

		case 3: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 9: return seqInt_sempred((SeqIntContext)_localctx, predIndex);

		case 10: return seqDouble_sempred((SeqDoubleContext)_localctx, predIndex);

		case 11: return seqString_sempred((SeqStringContext)_localctx, predIndex);

		case 12: return seqBool_sempred((SeqBoolContext)_localctx, predIndex);
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
		case 6: return 2 >= _localctx._p;

		case 7: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 10 >= _localctx._p;

		case 2: return 9 >= _localctx._p;

		case 3: return 8 >= _localctx._p;
		}
		return true;
	}
	private boolean seqBool_sempred(SeqBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return 2 >= _localctx._p;

		case 13: return 1 >= _localctx._p;
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
	private boolean seqDouble_sempred(SeqDoubleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 2 >= _localctx._p;

		case 9: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean seqString_sempred(SeqStringContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return 2 >= _localctx._p;

		case 11: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3*\u015d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b1\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u00b9\n\5\f\5\16\5\u00bc\13\5\3\6\3\6\3\6\3\6\5\6\u00c2\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u00d7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00df\n\13\f"+
		"\13\16\13\u00e2\13\13\3\f\3\f\3\f\5\f\u00e7\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00ef\n\f\f\f\16\f\u00f2\13\f\3\r\3\r\3\r\5\r\u00f7\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r\3\16\3\16\3\16\5\16"+
		"\u0107\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010f\n\16\f\16\16\16\u0112"+
		"\13\16\3\17\3\17\5\17\u0116\n\17\3\20\3\20\5\20\u011a\n\20\3\21\3\21\5"+
		"\21\u011e\n\21\3\22\3\22\5\22\u0122\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\2\35\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\t\3\2\34\35\3\2\21\22"+
		"\3\2\23\24\3\2\26\27\3\2\36\37\3\2 !\3\2\32\33\u0172\2<\3\2\2\2\4E\3\2"+
		"\2\2\6c\3\2\2\2\b\u00b0\3\2\2\2\n\u00c1\3\2\2\2\f\u00c3\3\2\2\2\16\u00c7"+
		"\3\2\2\2\20\u00cb\3\2\2\2\22\u00cf\3\2\2\2\24\u00d6\3\2\2\2\26\u00e6\3"+
		"\2\2\2\30\u00f6\3\2\2\2\32\u0106\3\2\2\2\34\u0115\3\2\2\2\36\u0119\3\2"+
		"\2\2 \u011d\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2\2&\u012a\3\2\2\2(\u0131"+
		"\3\2\2\2*\u0138\3\2\2\2,\u013f\3\2\2\2.\u0146\3\2\2\2\60\u014d\3\2\2\2"+
		"\62\u0154\3\2\2\2\64\u0156\3\2\2\2\66\u0158\3\2\2\28=\5\4\3\29=\5\6\4"+
		"\2:=\5\b\5\2;=\5\n\6\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\3\3\2"+
		"\2\2>?\b\3\1\2?F\7#\2\2@F\5&\24\2AB\7\n\2\2BC\5\4\3\2CD\7\5\2\2DF\3\2"+
		"\2\2E>\3\2\2\2E@\3\2\2\2EA\3\2\2\2FL\3\2\2\2GH\6\3\2\3HI\7\23\2\2IK\5"+
		"\4\3\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP"+
		"\b\4\1\2Pd\7%\2\2Qd\7\'\2\2Rd\5$\23\2ST\7\n\2\2TU\5\6\4\2UV\7\5\2\2Vd"+
		"\3\2\2\2WX\5\n\6\2XY\7\25\2\2YZ\7\b\2\2Zd\3\2\2\2[\\\5\34\17\2\\]\7\25"+
		"\2\2]^\t\2\2\2^d\3\2\2\2_`\5\36\20\2`a\7\25\2\2ab\t\2\2\2bd\3\2\2\2cO"+
		"\3\2\2\2cQ\3\2\2\2cR\3\2\2\2cS\3\2\2\2cW\3\2\2\2c[\3\2\2\2c_\3\2\2\2d"+
		"p\3\2\2\2ef\6\4\3\3fg\t\3\2\2go\5\6\4\2hi\6\4\4\3ij\t\4\2\2jo\5\6\4\2"+
		"kl\6\4\5\3lm\t\5\2\2mo\5\6\4\2ne\3\2\2\2nh\3\2\2\2nk\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q\7\3\2\2\2rp\3\2\2\2st\b\5\1\2tu\7\30\2\2u\u00b1"+
		"\5\b\5\2v\u00b1\7)\2\2w\u00b1\5(\25\2xy\7\n\2\2yz\5\b\5\2z{\7\5\2\2{\u00b1"+
		"\3\2\2\2|}\5\6\4\2}~\7\31\2\2~\177\5\6\4\2\177\u00b1\3\2\2\2\u0080\u0081"+
		"\5\4\3\2\u0081\u0082\7\31\2\2\u0082\u0083\5\4\3\2\u0083\u00b1\3\2\2\2"+
		"\u0084\u0085\5\n\6\2\u0085\u0086\7\31\2\2\u0086\u0087\5\n\6\2\u0087\u00b1"+
		"\3\2\2\2\u0088\u0089\5\34\17\2\u0089\u008a\7\25\2\2\u008a\u008b\t\6\2"+
		"\2\u008b\u00b1\3\2\2\2\u008c\u008d\5\36\20\2\u008d\u008e\7\25\2\2\u008e"+
		"\u008f\t\6\2\2\u008f\u00b1\3\2\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7"+
		"\25\2\2\u0092\u0093\7\20\2\2\u0093\u0094\7\n\2\2\u0094\u0095\5\6\4\2\u0095"+
		"\u0096\7\5\2\2\u0096\u00b1\3\2\2\2\u0097\u0098\5\36\20\2\u0098\u0099\7"+
		"\25\2\2\u0099\u009a\7\20\2\2\u009a\u009b\7\n\2\2\u009b\u009c\5\6\4\2\u009c"+
		"\u009d\7\5\2\2\u009d\u00b1\3\2\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\25"+
		"\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\5\4\3\2\u00a3"+
		"\u00a4\7\5\2\2\u00a4\u00b1\3\2\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7"+
		"\25\2\2\u00a7\u00a8\7\20\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\5\b\5\2\u00aa"+
		"\u00ab\7\5\2\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7"+
		"\25\2\2\u00ae\u00af\t\7\2\2\u00af\u00b1\3\2\2\2\u00b0s\3\2\2\2\u00b0v"+
		"\3\2\2\2\u00b0w\3\2\2\2\u00b0x\3\2\2\2\u00b0|\3\2\2\2\u00b0\u0080\3\2"+
		"\2\2\u00b0\u0084\3\2\2\2\u00b0\u0088\3\2\2\2\u00b0\u008c\3\2\2\2\u00b0"+
		"\u0090\3\2\2\2\u00b0\u0097\3\2\2\2\u00b0\u009e\3\2\2\2\u00b0\u00a5\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\6\5\6\3\u00b3"+
		"\u00b4\t\b\2\2\u00b4\u00b9\5\b\5\2\u00b5\u00b6\6\5\7\3\u00b6\u00b7\7\31"+
		"\2\2\u00b7\u00b9\5\b\5\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\t\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00c2\5\34\17\2\u00be\u00c2\5\36\20\2\u00bf"+
		"\u00c2\5 \21\2\u00c0\u00c2\5\"\22\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\13\3\2\2\2\u00c3"+
		"\u00c4\7\t\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\7\3\2\2\u00c6\r\3\2\2"+
		"\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00ca\7\3\2\2\u00ca"+
		"\17\3\2\2\2\u00cb\u00cc\7\t\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7\3\2"+
		"\2\u00ce\21\3\2\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2"+
		"\7\3\2\2\u00d2\23\3\2\2\2\u00d3\u00d4\b\13\1\2\u00d4\u00d7\7%\2\2\u00d5"+
		"\u00d7\5$\23\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00e0\3\2"+
		"\2\2\u00d8\u00d9\6\13\b\3\u00d9\u00da\7\6\2\2\u00da\u00df\7%\2\2\u00db"+
		"\u00dc\6\13\t\3\u00dc\u00dd\7\6\2\2\u00dd\u00df\5$\23\2\u00de\u00d8\3"+
		"\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\b\f\1"+
		"\2\u00e4\u00e7\7\'\2\2\u00e5\u00e7\5$\23\2\u00e6\u00e3\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00f0\3\2\2\2\u00e8\u00e9\6\f\n\3\u00e9\u00ea\7\6\2\2\u00ea"+
		"\u00ef\7\'\2\2\u00eb\u00ec\6\f\13\3\u00ec\u00ed\7\6\2\2\u00ed\u00ef\5"+
		"$\23\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u00f4\b\r\1\2\u00f4\u00f7\7#\2\2\u00f5\u00f7\5&\24\2\u00f6\u00f3"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u0100\3\2\2\2\u00f8\u00f9\6\r\f\3\u00f9"+
		"\u00fa\7\6\2\2\u00fa\u00ff\7#\2\2\u00fb\u00fc\6\r\r\3\u00fc\u00fd\7\6"+
		"\2\2\u00fd\u00ff\5&\24\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\31\3\2\2"+
		"\2\u0102\u0100\3\2\2\2\u0103\u0104\b\16\1\2\u0104\u0107\7)\2\2\u0105\u0107"+
		"\5(\25\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0110\3\2\2\2\u0108"+
		"\u0109\6\16\16\3\u0109\u010a\7\6\2\2\u010a\u010f\7)\2\2\u010b\u010c\6"+
		"\16\17\3\u010c\u010d\7\6\2\2\u010d\u010f\5(\25\2\u010e\u0108\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\33\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0116\5\f\7\2\u0114\u0116"+
		"\5*\26\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\35\3\2\2\2\u0117"+
		"\u011a\5\16\b\2\u0118\u011a\5.\30\2\u0119\u0117\3\2\2\2\u0119\u0118\3"+
		"\2\2\2\u011a\37\3\2\2\2\u011b\u011e\5\20\t\2\u011c\u011e\5\60\31\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e!\3\2\2\2\u011f\u0122\5\22\n\2"+
		"\u0120\u0122\5,\27\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122#\3"+
		"\2\2\2\u0123\u0124\5\62\32\2\u0124\u0125\7\25\2\2\u0125\u0126\5\64\33"+
		"\2\u0126\u0127\7\25\2\2\u0127\u0128\5\66\34\2\u0128\u0129\7\13\2\2\u0129"+
		"%\3\2\2\2\u012a\u012b\5\62\32\2\u012b\u012c\7\25\2\2\u012c\u012d\5\64"+
		"\33\2\u012d\u012e\7\25\2\2\u012e\u012f\5\66\34\2\u012f\u0130\7\r\2\2\u0130"+
		"\'\3\2\2\2\u0131\u0132\5\62\32\2\u0132\u0133\7\25\2\2\u0133\u0134\5\64"+
		"\33\2\u0134\u0135\7\25\2\2\u0135\u0136\5\66\34\2\u0136\u0137\7\4\2\2\u0137"+
		")\3\2\2\2\u0138\u0139\5\62\32\2\u0139\u013a\7\25\2\2\u013a\u013b\5\64"+
		"\33\2\u013b\u013c\7\25\2\2\u013c\u013d\5\66\34\2\u013d\u013e\7\f\2\2\u013e"+
		"+\3\2\2\2\u013f\u0140\5\62\32\2\u0140\u0141\7\25\2\2\u0141\u0142\5\64"+
		"\33\2\u0142\u0143\7\25\2\2\u0143\u0144\5\66\34\2\u0144\u0145\7\17\2\2"+
		"\u0145-\3\2\2\2\u0146\u0147\5\62\32\2\u0147\u0148\7\25\2\2\u0148\u0149"+
		"\5\64\33\2\u0149\u014a\7\25\2\2\u014a\u014b\5\66\34\2\u014b\u014c\7\16"+
		"\2\2\u014c/\3\2\2\2\u014d\u014e\5\62\32\2\u014e\u014f\7\25\2\2\u014f\u0150"+
		"\5\64\33\2\u0150\u0151\7\25\2\2\u0151\u0152\5\66\34\2\u0152\u0153\7\7"+
		"\2\2\u0153\61\3\2\2\2\u0154\u0155\7\"\2\2\u0155\63\3\2\2\2\u0156\u0157"+
		"\7\"\2\2\u0157\65\3\2\2\2\u0158\u0159\7\"\2\2\u0159\u015a\7\n\2\2\u015a"+
		"\u015b\7\5\2\2\u015b\67\3\2\2\2\34<ELcnp\u00b0\u00b8\u00ba\u00c1\u00d6"+
		"\u00de\u00e0\u00e6\u00ee\u00f0\u00f6\u00fe\u0100\u0106\u010e\u0110\u0115"+
		"\u0119\u011d\u0121";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}