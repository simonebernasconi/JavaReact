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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, MUL=20, DIV=21, ADD=22, SUB=23, DOT=24, MIN=25, 
		MAX=26, NOT=27, EQUAL=28, AND=29, OR=30, AVG=31, SUM=32, ASC=33, DESC=34, 
		ALLTRUE=35, ALLFALSE=36, ID=37, STRING=38, DIGIT=39, DOUBLE=40, BOOL=41, 
		WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "':Bool'", "')'", "','", "'Constant('", "':ListString'", 
		"'Size'", "'['", "'('", "':Num'", "'get('", "':String'", "':ListInt'", 
		"':ListDouble'", "'Last'", "':ListBool'", "'contains'", "'size('", "'contains('", 
		"'*'", "'/'", "'+'", "'-'", "'.'", "'<'", "'>'", "'!'", "'=='", "'&'", 
		"'|'", "'Avg'", "'Sum'", "'orderAsc'", "'orderDesc'", "'isAllTrue'", "'isAllFalse'", 
		"ID", "STRING", "DIGIT", "DOUBLE", "BOOL", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_stringExpr = 2, RULE_numExpr = 3, 
		RULE_boolExpr = 4, RULE_listExpr = 5, RULE_listDigit = 6, RULE_listDouble = 7, 
		RULE_listString = 8, RULE_listBool = 9, RULE_seqInt = 10, RULE_seqDouble = 11, 
		RULE_seqString = 12, RULE_seqBool = 13, RULE_listDigitExpr = 14, RULE_listDoubleExpr = 15, 
		RULE_listStringExpr = 16, RULE_listBoolExpr = 17, RULE_identifierNum = 18, 
		RULE_identifierString = 19, RULE_identifierBool = 20, RULE_identifierListInt = 21, 
		RULE_identifierListBool = 22, RULE_identifierListDouble = 23, RULE_identifierListString = 24, 
		RULE_hostId = 25, RULE_observableId = 26, RULE_method = 27;
	public static final String[] ruleNames = {
		"start", "expression", "stringExpr", "numExpr", "boolExpr", "listExpr", 
		"listDigit", "listDouble", "listString", "listBool", "seqInt", "seqDouble", 
		"seqString", "seqBool", "listDigitExpr", "listDoubleExpr", "listStringExpr", 
		"listBoolExpr", "identifierNum", "identifierString", "identifierBool", 
		"identifierListInt", "identifierListBool", "identifierListDouble", "identifierListString", 
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
			setState(56); expression();
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58); stringExpr(0);
				}
				break;

			case 2:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59); numExpr(0);
				}
				break;

			case 3:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60); boolExpr(0);
				}
				break;

			case 4:
				_localctx = new ListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61); listExpr();
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
	public static class LastListStringContext extends StringExprContext {
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListStringExprContext listStringExpr() {
			return getRuleContext(ListStringExprContext.class,0);
		}
		public LastListStringContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLastListString(this);
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
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new BaseStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65); match(STRING);
				}
				break;

			case 2:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66); identifierString();
				}
				break;

			case 3:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); match(9);
				setState(68); stringExpr(0);
				setState(69); match(3);
				}
				break;

			case 4:
				{
				_localctx = new LastListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); listStringExpr();
				setState(72); match(DOT);
				setState(73); match(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
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
					setState(77);
					if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
					setState(78); match(ADD);
					setState(79); stringExpr(6);
					}
					} 
				}
				setState(84);
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
	public static class LastListDoubleContext extends NumExprContext {
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public LastListDoubleContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLastListDouble(this);
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
	public static class LastListIntContext extends NumExprContext {
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public LastListIntContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLastListInt(this);
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
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86); match(DIGIT);
				}
				break;

			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87); match(DOUBLE);
				}
				break;

			case 3:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); identifierNum();
				}
				break;

			case 4:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89); match(9);
				setState(90); numExpr(0);
				setState(91); match(3);
				}
				break;

			case 5:
				{
				_localctx = new SizeListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); listExpr();
				setState(94); match(DOT);
				setState(95); match(7);
				}
				break;

			case 6:
				{
				_localctx = new AvgSumListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); listDigitExpr();
				setState(98); match(DOT);
				setState(99);
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
				setState(101); listDoubleExpr();
				setState(102); match(DOT);
				setState(103);
				((AvgSumListDoubleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==SUM) ) {
					((AvgSumListDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 8:
				{
				_localctx = new LastListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); listDigitExpr();
				setState(106); match(DOT);
				setState(107); match(15);
				}
				break;

			case 9:
				{
				_localctx = new LastListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); listDoubleExpr();
				setState(110); match(DOT);
				setState(111); match(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(115);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(116);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(117); numExpr(12);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(118);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(119);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(120); numExpr(11);
						}
						break;
					}
					} 
				}
				setState(125);
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
	public static class ConstantListDoubleContext extends BoolExprContext {
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ConstantListDoubleContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitConstantListDouble(this);
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
	public static class ConstantListDigitContext extends BoolExprContext {
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ConstantListDigitContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitConstantListDigit(this);
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
	public static class LastListBoolContext extends BoolExprContext {
		public TerminalNode DOT() { return getToken(ExpressionParser.DOT, 0); }
		public ListBoolExprContext listBoolExpr() {
			return getRuleContext(ListBoolExprContext.class,0);
		}
		public LastListBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLastListBool(this);
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
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127); match(NOT);
				setState(128); boolExpr(20);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); identifierBool();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131); match(9);
				setState(132); boolExpr(0);
				setState(133); match(3);
				}
				break;

			case 5:
				{
				_localctx = new MinMaxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); numExpr(0);
				setState(136);
				((MinMaxContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MIN || _la==MAX) ) {
					((MinMaxContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(137); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139); numExpr(0);
				setState(140); match(EQUAL);
				setState(141); numExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); stringExpr(0);
				setState(144); match(EQUAL);
				setState(145); stringExpr(0);
				}
				break;

			case 8:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147); listExpr();
				setState(148); match(EQUAL);
				setState(149); listExpr();
				}
				break;

			case 9:
				{
				_localctx = new IsAscIsDescIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151); listDigitExpr();
				setState(152); match(DOT);
				setState(153);
				((IsAscIsDescIntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((IsAscIsDescIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 10:
				{
				_localctx = new IsAscIsDescDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155); listDoubleExpr();
				setState(156); match(DOT);
				setState(157);
				((IsAscIsDescDoubleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((IsAscIsDescDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 11:
				{
				_localctx = new ContainsIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); listDigitExpr();
				setState(160); match(DOT);
				setState(161); match(17);
				setState(162); match(9);
				setState(163); numExpr(0);
				setState(164); match(3);
				}
				break;

			case 12:
				{
				_localctx = new ContainsDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166); listDoubleExpr();
				setState(167); match(DOT);
				setState(168); match(17);
				setState(169); match(9);
				setState(170); numExpr(0);
				setState(171); match(3);
				}
				break;

			case 13:
				{
				_localctx = new ContainsStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173); listStringExpr();
				setState(174); match(DOT);
				setState(175); match(17);
				setState(176); match(9);
				setState(177); stringExpr(0);
				setState(178); match(3);
				}
				break;

			case 14:
				{
				_localctx = new ContainsBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); listBoolExpr();
				setState(181); match(DOT);
				setState(182); match(17);
				setState(183); match(9);
				setState(184); boolExpr(0);
				setState(185); match(3);
				}
				break;

			case 15:
				{
				_localctx = new AllTrueFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); listBoolExpr();
				setState(188); match(DOT);
				setState(189);
				((AllTrueFalseContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALLTRUE || _la==ALLFALSE) ) {
					((AllTrueFalseContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 16:
				{
				_localctx = new LastListBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); listBoolExpr();
				setState(192); match(DOT);
				setState(193); match(15);
				}
				break;

			case 17:
				{
				_localctx = new ConstantListDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); listDigitExpr();
				setState(196); match(DOT);
				setState(197); match(5);
				setState(198); numExpr(0);
				setState(199); match(3);
				}
				break;

			case 18:
				{
				_localctx = new ConstantListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); listDoubleExpr();
				setState(202); match(DOT);
				setState(203); match(5);
				setState(204); numExpr(0);
				setState(205); match(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(209);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(210);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(211); boolExpr(20);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(212);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(213); match(EQUAL);
						setState(214); boolExpr(15);
						}
						break;
					}
					} 
				}
				setState(219);
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
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ListDigitExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220); listDigitExpr();
				}
				break;

			case 2:
				_localctx = new ListDoubleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221); listDoubleExpr();
				}
				break;

			case 3:
				_localctx = new ListStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222); listStringExpr();
				}
				break;

			case 4:
				_localctx = new ListBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223); listBoolExpr();
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
			setState(226); match(8);
			setState(227); seqInt(0);
			setState(228); match(1);
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
			setState(230); match(8);
			setState(231); seqDouble(0);
			setState(232); match(1);
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
			setState(234); match(8);
			setState(235); seqString(0);
			setState(236); match(1);
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
			setState(238); match(8);
			setState(239); seqBool(0);
			setState(240); match(1);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_seqInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new SeqIntDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(243); match(DIGIT);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqIntIdentifierListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244); identifierNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new SeqIntSeqIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(247);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(248); match(4);
						setState(249); match(DIGIT);
						}
						break;

					case 2:
						{
						_localctx = new SeqIntSeqIntIdListIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(250);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(251); match(4);
						setState(252); identifierNum();
						}
						break;
					}
					} 
				}
				setState(257);
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
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_seqDouble);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new SeqDoubleDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259); match(DOUBLE);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqDoubleIdentifierListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260); identifierNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new SeqDoubleSeqDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(263);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(264); match(4);
						setState(265); match(DOUBLE);
						}
						break;

					case 2:
						{
						_localctx = new SeqDoubleSeqDoubleIdListDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(266);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(267); match(4);
						setState(268); identifierNum();
						}
						break;
					}
					} 
				}
				setState(273);
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_seqString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new SeqStringStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(275); match(STRING);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqStringIdentifierListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276); identifierString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new SeqStringSeqStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(279);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(280); match(4);
						setState(281); match(STRING);
						}
						break;

					case 2:
						{
						_localctx = new SeqStringSeqStringIdListStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(282);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(283); match(4);
						setState(284); identifierString();
						}
						break;
					}
					} 
				}
				setState(289);
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
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_seqBool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch (_input.LA(1)) {
			case BOOL:
				{
				_localctx = new SeqBoolBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(291); match(BOOL);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqBoolIdentifierListBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292); identifierBool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new SeqBoolSeqBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(295);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(296); match(4);
						setState(297); match(BOOL);
						}
						break;

					case 2:
						{
						_localctx = new SeqBoolSeqBoolIdListBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(298);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(299); match(4);
						setState(300); identifierBool();
						}
						break;
					}
					} 
				}
				setState(305);
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
		enterRule(_localctx, 28, RULE_listDigitExpr);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case 8:
				_localctx = new ListDigit_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306); listDigit();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307); identifierListInt();
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
		enterRule(_localctx, 30, RULE_listDoubleExpr);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case 8:
				_localctx = new ListDouble_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310); listDouble();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311); identifierListDouble();
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
		enterRule(_localctx, 32, RULE_listStringExpr);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case 8:
				_localctx = new ListString_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314); listString();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); identifierListString();
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
		enterRule(_localctx, 34, RULE_listBoolExpr);
		try {
			setState(320);
			switch (_input.LA(1)) {
			case 8:
				_localctx = new ListBool_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318); listBool();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319); identifierListBool();
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
		enterRule(_localctx, 36, RULE_identifierNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); hostId();
			setState(323); match(DOT);
			setState(324); observableId();
			setState(325); match(DOT);
			setState(326); method();
			setState(327); match(10);
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
		enterRule(_localctx, 38, RULE_identifierString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); hostId();
			setState(330); match(DOT);
			setState(331); observableId();
			setState(332); match(DOT);
			setState(333); method();
			setState(334); match(12);
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
		enterRule(_localctx, 40, RULE_identifierBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); hostId();
			setState(337); match(DOT);
			setState(338); observableId();
			setState(339); match(DOT);
			setState(340); method();
			setState(341); match(2);
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
		enterRule(_localctx, 42, RULE_identifierListInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); hostId();
			setState(344); match(DOT);
			setState(345); observableId();
			setState(346); match(DOT);
			setState(347); method();
			setState(348); match(13);
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
		enterRule(_localctx, 44, RULE_identifierListBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); hostId();
			setState(351); match(DOT);
			setState(352); observableId();
			setState(353); match(DOT);
			setState(354); method();
			setState(355); match(16);
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
		enterRule(_localctx, 46, RULE_identifierListDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); hostId();
			setState(358); match(DOT);
			setState(359); observableId();
			setState(360); match(DOT);
			setState(361); method();
			setState(362); match(14);
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
		enterRule(_localctx, 48, RULE_identifierListString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); hostId();
			setState(365); match(DOT);
			setState(366); observableId();
			setState(367); match(DOT);
			setState(368); method();
			setState(369); match(6);
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
		enterRule(_localctx, 50, RULE_hostId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 52, RULE_observableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(ID);
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
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
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
		enterRule(_localctx, 54, RULE_method);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(375); match(11);
				setState(376); match(3);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
				setState(377); match(18);
				setState(378); match(3);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 3);
				{
				setState(379); match(19);
				setState(380); match(DOUBLE);
				setState(381); match(3);
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
		case 0: return 5 >= _localctx._p;
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
		case 1: return 11 >= _localctx._p;

		case 2: return 10 >= _localctx._p;
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
		case 3: return 19 >= _localctx._p;

		case 4: return 14 >= _localctx._p;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3,\u0183\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3\5\3A"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4"+
		"\7\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"t\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u00da\n\6\f\6\16\6\u00dd\13\6\3\7\3\7\3\7\3\7\5\7\u00e3\n\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u00f8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0100\n\f\f\f\16\f\u0103"+
		"\13\f\3\r\3\r\3\r\5\r\u0108\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0110\n\r"+
		"\f\r\16\r\u0113\13\r\3\16\3\16\3\16\5\16\u0118\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u0120\n\16\f\16\16\16\u0123\13\16\3\17\3\17\3\17\5\17"+
		"\u0128\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0130\n\17\f\17\16\17\u0133"+
		"\13\17\3\20\3\20\5\20\u0137\n\20\3\21\3\21\5\21\u013b\n\21\3\22\3\22\5"+
		"\22\u013f\n\22\3\23\3\23\5\23\u0143\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0181"+
		"\n\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\n\3\2!\"\3\2\26\27\3\2\30\31\3\2\33\34\3\2#$\3\2%&\3\2\37 \4"+
		"\2\26\26\'\'\u019f\2:\3\2\2\2\4@\3\2\2\2\6M\3\2\2\2\bs\3\2\2\2\n\u00d1"+
		"\3\2\2\2\f\u00e2\3\2\2\2\16\u00e4\3\2\2\2\20\u00e8\3\2\2\2\22\u00ec\3"+
		"\2\2\2\24\u00f0\3\2\2\2\26\u00f7\3\2\2\2\30\u0107\3\2\2\2\32\u0117\3\2"+
		"\2\2\34\u0127\3\2\2\2\36\u0136\3\2\2\2 \u013a\3\2\2\2\"\u013e\3\2\2\2"+
		"$\u0142\3\2\2\2&\u0144\3\2\2\2(\u014b\3\2\2\2*\u0152\3\2\2\2,\u0159\3"+
		"\2\2\2.\u0160\3\2\2\2\60\u0167\3\2\2\2\62\u016e\3\2\2\2\64\u0175\3\2\2"+
		"\2\66\u0177\3\2\2\28\u0180\3\2\2\2:;\5\4\3\2;\3\3\2\2\2<A\5\6\4\2=A\5"+
		"\b\5\2>A\5\n\6\2?A\5\f\7\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5"+
		"\3\2\2\2BC\b\4\1\2CN\7(\2\2DN\5(\25\2EF\7\13\2\2FG\5\6\4\2GH\7\5\2\2H"+
		"N\3\2\2\2IJ\5\"\22\2JK\7\32\2\2KL\7\21\2\2LN\3\2\2\2MB\3\2\2\2MD\3\2\2"+
		"\2ME\3\2\2\2MI\3\2\2\2NT\3\2\2\2OP\6\4\2\3PQ\7\30\2\2QS\5\6\4\2RO\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VT\3\2\2\2WX\b\5\1\2Xt\7"+
		")\2\2Yt\7*\2\2Zt\5&\24\2[\\\7\13\2\2\\]\5\b\5\2]^\7\5\2\2^t\3\2\2\2_`"+
		"\5\f\7\2`a\7\32\2\2ab\7\t\2\2bt\3\2\2\2cd\5\36\20\2de\7\32\2\2ef\t\2\2"+
		"\2ft\3\2\2\2gh\5 \21\2hi\7\32\2\2ij\t\2\2\2jt\3\2\2\2kl\5\36\20\2lm\7"+
		"\32\2\2mn\7\21\2\2nt\3\2\2\2op\5 \21\2pq\7\32\2\2qr\7\21\2\2rt\3\2\2\2"+
		"sW\3\2\2\2sY\3\2\2\2sZ\3\2\2\2s[\3\2\2\2s_\3\2\2\2sc\3\2\2\2sg\3\2\2\2"+
		"sk\3\2\2\2so\3\2\2\2t}\3\2\2\2uv\6\5\3\3vw\t\3\2\2w|\5\b\5\2xy\6\5\4\3"+
		"yz\t\4\2\2z|\5\b\5\2{u\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~\t\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\6\1\2\u0081\u0082\7\35\2\2"+
		"\u0082\u00d2\5\n\6\2\u0083\u00d2\7+\2\2\u0084\u00d2\5*\26\2\u0085\u0086"+
		"\7\13\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7\5\2\2\u0088\u00d2\3\2\2\2"+
		"\u0089\u008a\5\b\5\2\u008a\u008b\t\5\2\2\u008b\u008c\5\b\5\2\u008c\u00d2"+
		"\3\2\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\36\2\2\u008f\u0090\5\b\5\2"+
		"\u0090\u00d2\3\2\2\2\u0091\u0092\5\6\4\2\u0092\u0093\7\36\2\2\u0093\u0094"+
		"\5\6\4\2\u0094\u00d2\3\2\2\2\u0095\u0096\5\f\7\2\u0096\u0097\7\36\2\2"+
		"\u0097\u0098\5\f\7\2\u0098\u00d2\3\2\2\2\u0099\u009a\5\36\20\2\u009a\u009b"+
		"\7\32\2\2\u009b\u009c\t\6\2\2\u009c\u00d2\3\2\2\2\u009d\u009e\5 \21\2"+
		"\u009e\u009f\7\32\2\2\u009f\u00a0\t\6\2\2\u00a0\u00d2\3\2\2\2\u00a1\u00a2"+
		"\5\36\20\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\13"+
		"\2\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\7\5\2\2\u00a7\u00d2\3\2\2\2\u00a8"+
		"\u00a9\5 \21\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\7"+
		"\13\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\7\5\2\2\u00ae\u00d2\3\2\2\2\u00af"+
		"\u00b0\5\"\22\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3"+
		"\7\13\2\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5\7\5\2\2\u00b5\u00d2\3\2\2\2"+
		"\u00b6\u00b7\5$\23\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba"+
		"\7\13\2\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\7\5\2\2\u00bc\u00d2\3\2\2\2"+
		"\u00bd\u00be\5$\23\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\t\7\2\2\u00c0\u00d2"+
		"\3\2\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\7\21\2\2"+
		"\u00c4\u00d2\3\2\2\2\u00c5\u00c6\5\36\20\2\u00c6\u00c7\7\32\2\2\u00c7"+
		"\u00c8\7\7\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\7\5\2\2\u00ca\u00d2\3\2"+
		"\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7\32\2\2\u00cd\u00ce\7\7\2\2\u00ce"+
		"\u00cf\5\b\5\2\u00cf\u00d0\7\5\2\2\u00d0\u00d2\3\2\2\2\u00d1\u0080\3\2"+
		"\2\2\u00d1\u0083\3\2\2\2\u00d1\u0084\3\2\2\2\u00d1\u0085\3\2\2\2\u00d1"+
		"\u0089\3\2\2\2\u00d1\u008d\3\2\2\2\u00d1\u0091\3\2\2\2\u00d1\u0095\3\2"+
		"\2\2\u00d1\u0099\3\2\2\2\u00d1\u009d\3\2\2\2\u00d1\u00a1\3\2\2\2\u00d1"+
		"\u00a8\3\2\2\2\u00d1\u00af\3\2\2\2\u00d1\u00b6\3\2\2\2\u00d1\u00bd\3\2"+
		"\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d2"+
		"\u00db\3\2\2\2\u00d3\u00d4\6\6\5\3\u00d4\u00d5\t\b\2\2\u00d5\u00da\5\n"+
		"\6\2\u00d6\u00d7\6\6\6\3\u00d7\u00d8\7\36\2\2\u00d8\u00da\5\n\6\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\13\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e3"+
		"\5\36\20\2\u00df\u00e3\5 \21\2\u00e0\u00e3\5\"\22\2\u00e1\u00e3\5$\23"+
		"\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\r\3\2\2\2\u00e4\u00e5\7\n\2\2\u00e5\u00e6\5\26\f\2\u00e6"+
		"\u00e7\7\3\2\2\u00e7\17\3\2\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00ea\5\30\r"+
		"\2\u00ea\u00eb\7\3\2\2\u00eb\21\3\2\2\2\u00ec\u00ed\7\n\2\2\u00ed\u00ee"+
		"\5\32\16\2\u00ee\u00ef\7\3\2\2\u00ef\23\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1"+
		"\u00f2\5\34\17\2\u00f2\u00f3\7\3\2\2\u00f3\25\3\2\2\2\u00f4\u00f5\b\f"+
		"\1\2\u00f5\u00f8\7)\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u0101\3\2\2\2\u00f9\u00fa\6\f\7\3\u00fa\u00fb\7\6"+
		"\2\2\u00fb\u0100\7)\2\2\u00fc\u00fd\6\f\b\3\u00fd\u00fe\7\6\2\2\u00fe"+
		"\u0100\5&\24\2\u00ff\u00f9\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\27\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0105\b\r\1\2\u0105\u0108\7*\2\2\u0106\u0108\5&\24\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0111\3\2\2\2\u0109\u010a\6\r"+
		"\t\3\u010a\u010b\7\6\2\2\u010b\u0110\7*\2\2\u010c\u010d\6\r\n\3\u010d"+
		"\u010e\7\6\2\2\u010e\u0110\5&\24\2\u010f\u0109\3\2\2\2\u010f\u010c\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\31\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\b\16\1\2\u0115\u0118\7(\2"+
		"\2\u0116\u0118\5(\25\2\u0117\u0114\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0121"+
		"\3\2\2\2\u0119\u011a\6\16\13\3\u011a\u011b\7\6\2\2\u011b\u0120\7(\2\2"+
		"\u011c\u011d\6\16\f\3\u011d\u011e\7\6\2\2\u011e\u0120\5(\25\2\u011f\u0119"+
		"\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\33\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\b\17\1"+
		"\2\u0125\u0128\7+\2\2\u0126\u0128\5*\26\2\u0127\u0124\3\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0131\3\2\2\2\u0129\u012a\6\17\r\3\u012a\u012b\7\6\2\2"+
		"\u012b\u0130\7+\2\2\u012c\u012d\6\17\16\3\u012d\u012e\7\6\2\2\u012e\u0130"+
		"\5*\26\2\u012f\u0129\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\35\3\2\2\2\u0133\u0131\3\2\2"+
		"\2\u0134\u0137\5\16\b\2\u0135\u0137\5,\27\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\37\3\2\2\2\u0138\u013b\5\20\t\2\u0139\u013b\5\60"+
		"\31\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b!\3\2\2\2\u013c\u013f"+
		"\5\22\n\2\u013d\u013f\5\62\32\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2"+
		"\2\u013f#\3\2\2\2\u0140\u0143\5\24\13\2\u0141\u0143\5.\30\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0141\3\2\2\2\u0143%\3\2\2\2\u0144\u0145\5\64\33\2\u0145"+
		"\u0146\7\32\2\2\u0146\u0147\5\66\34\2\u0147\u0148\7\32\2\2\u0148\u0149"+
		"\58\35\2\u0149\u014a\7\f\2\2\u014a\'\3\2\2\2\u014b\u014c\5\64\33\2\u014c"+
		"\u014d\7\32\2\2\u014d\u014e\5\66\34\2\u014e\u014f\7\32\2\2\u014f\u0150"+
		"\58\35\2\u0150\u0151\7\16\2\2\u0151)\3\2\2\2\u0152\u0153\5\64\33\2\u0153"+
		"\u0154\7\32\2\2\u0154\u0155\5\66\34\2\u0155\u0156\7\32\2\2\u0156\u0157"+
		"\58\35\2\u0157\u0158\7\4\2\2\u0158+\3\2\2\2\u0159\u015a\5\64\33\2\u015a"+
		"\u015b\7\32\2\2\u015b\u015c\5\66\34\2\u015c\u015d\7\32\2\2\u015d\u015e"+
		"\58\35\2\u015e\u015f\7\17\2\2\u015f-\3\2\2\2\u0160\u0161\5\64\33\2\u0161"+
		"\u0162\7\32\2\2\u0162\u0163\5\66\34\2\u0163\u0164\7\32\2\2\u0164\u0165"+
		"\58\35\2\u0165\u0166\7\22\2\2\u0166/\3\2\2\2\u0167\u0168\5\64\33\2\u0168"+
		"\u0169\7\32\2\2\u0169\u016a\5\66\34\2\u016a\u016b\7\32\2\2\u016b\u016c"+
		"\58\35\2\u016c\u016d\7\20\2\2\u016d\61\3\2\2\2\u016e\u016f\5\64\33\2\u016f"+
		"\u0170\7\32\2\2\u0170\u0171\5\66\34\2\u0171\u0172\7\32\2\2\u0172\u0173"+
		"\58\35\2\u0173\u0174\7\b\2\2\u0174\63\3\2\2\2\u0175\u0176\t\t\2\2\u0176"+
		"\65\3\2\2\2\u0177\u0178\7\'\2\2\u0178\67\3\2\2\2\u0179\u017a\7\r\2\2\u017a"+
		"\u0181\7\5\2\2\u017b\u017c\7\24\2\2\u017c\u0181\7\5\2\2\u017d\u017e\7"+
		"\25\2\2\u017e\u017f\7*\2\2\u017f\u0181\7\5\2\2\u0180\u0179\3\2\2\2\u0180"+
		"\u017b\3\2\2\2\u0180\u017d\3\2\2\2\u01819\3\2\2\2\35@MTs{}\u00d1\u00d9"+
		"\u00db\u00e2\u00f7\u00ff\u0101\u0107\u010f\u0111\u0117\u011f\u0121\u0127"+
		"\u012f\u0131\u0136\u013a\u013e\u0142\u0180";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}