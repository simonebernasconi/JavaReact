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
		T__3=1, T__2=2, T__1=3, T__0=4, MUL=5, DIV=6, ADD=7, SUB=8, EQUAL=9, DOT=10, 
		AND=11, OR=12, NOT=13, BOOL=14, MAX=15, MIN=16, MAXEQ=17, MINEQ=18, SIZE=19, 
		ISEMPTY=20, CONTAINS=21, COMMA=22, ORDERASC=23, ORDERDESC=24, ORDERASCBOOL=25, 
		ORDERDESCBOOL=26, FILTER=27, AVG=28, SUM=29, ASC=30, DESC=31, ALLTRUE=32, 
		ALLFALSE=33, ID=34, DIGIT=35, DOUBLE=36, STRING=37, WS=38;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "'['", "'('", "'*'", "'/'", "'+'", "'-'", "'=='", 
		"'.'", "'&'", "'|'", "'!'", "BOOL", "'>'", "'<'", "'>='", "'<='", "'size'", 
		"'isEmpty'", "'contains'", "','", "'orderAsc'", "'orderDesc'", "'orderAscBool'", 
		"'orderDescBool'", "'filterBy'", "'avg'", "'sum'", "'isAsc'", "'isDesc'", 
		"'isAllTrue'", "'isAllFalse'", "ID", "DIGIT", "DOUBLE", "STRING", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_seqInt = 2, RULE_listDigit = 3, 
		RULE_seqString = 4, RULE_listString = 5, RULE_seqBool = 6, RULE_listBool = 7, 
		RULE_numExpr = 8, RULE_stringExpr = 9, RULE_boolExpr = 10, RULE_listExpr = 11, 
		RULE_listDigitExpr = 12, RULE_listStringExpr = 13, RULE_listBoolExpr = 14, 
		RULE_identifier = 15, RULE_hostId = 16, RULE_observableId = 17, RULE_method = 18;
	public static final String[] ruleNames = {
		"start", "expression", "seqInt", "listDigit", "seqString", "listString", 
		"seqBool", "listBool", "numExpr", "stringExpr", "boolExpr", "listExpr", 
		"listDigitExpr", "listStringExpr", "listBoolExpr", "identifier", "hostId", 
		"observableId", "method"
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
			setState(38); expression();
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
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); numExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); stringExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); boolExpr(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); listExpr();
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

	public static class SeqIntContext extends ParserRuleContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public SeqIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqIntContext seqInt() throws RecognitionException {
		SeqIntContext _localctx = new SeqIntContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seqInt);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(DIGIT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); match(DIGIT);
				setState(48); match(COMMA);
				setState(49); seqInt();
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
		enterRule(_localctx, 6, RULE_listDigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(3);
			setState(53); seqInt();
			setState(54); match(1);
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

	public static class SeqStringContext extends ParserRuleContext {
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public SeqStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqStringContext seqString() throws RecognitionException {
		SeqStringContext _localctx = new SeqStringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seqString);
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(STRING);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(STRING);
				setState(58); match(COMMA);
				setState(59); seqString();
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
		enterRule(_localctx, 10, RULE_listString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(3);
			setState(63); seqString();
			setState(64); match(1);
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

	public static class SeqBoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public SeqBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqBoolContext seqBool() throws RecognitionException {
		SeqBoolContext _localctx = new SeqBoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_seqBool);
		try {
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); match(BOOL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(BOOL);
				setState(68); match(COMMA);
				setState(69); seqBool();
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
		enterRule(_localctx, 14, RULE_listBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(3);
			setState(73); seqBool();
			setState(74); match(1);
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
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_numExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77); match(DIGIT);
				}
				break;

			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78); match(DOUBLE);
				}
				break;

			case 3:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80); match(4);
				setState(81); numExpr(0);
				setState(82); match(2);
				}
				break;

			case 5:
				{
				_localctx = new AvgSumListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84); listDigitExpr(0);
				setState(85); match(DOT);
				setState(86);
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
				_localctx = new SizeListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); listExpr();
				setState(89); match(DOT);
				setState(90); match(SIZE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(94);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(95);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(96); numExpr(10);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(97);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(98);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(99); numExpr(9);
						}
						break;

					case 3:
						{
						_localctx = new MinMaxMineqMaxeqContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(100);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(101);
						((MinMaxMineqMaxeqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((MinMaxMineqMaxeqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(102); numExpr(8);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_stringExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch (_input.LA(1)) {
			case MUL:
			case ID:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109); identifier();
				}
				break;
			case 4:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110); match(4);
				setState(111); stringExpr(0);
				setState(112); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new StringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
					setState(116);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(117); match(ADD);
					setState(118); stringExpr(4);
					}
					} 
				}
				setState(123);
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
	public static class BoolContext extends BoolExprContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public BoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBool(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_boolExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125); match(NOT);
				setState(126); boolExpr(14);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129); match(4);
				setState(130); boolExpr(0);
				setState(131); match(2);
				}
				break;

			case 5:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); numExpr(0);
				setState(134); match(EQUAL);
				setState(135); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137); stringExpr(0);
				setState(138); match(EQUAL);
				setState(139); stringExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); listExpr();
				setState(142); match(EQUAL);
				setState(143); listExpr();
				}
				break;

			case 8:
				{
				_localctx = new IsAscIsDescIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); listDigitExpr(0);
				setState(146); match(DOT);
				setState(147);
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
				_localctx = new ContainsIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); listDigitExpr(0);
				setState(150); match(DOT);
				setState(151); match(CONTAINS);
				setState(152); match(4);
				setState(153); numExpr(0);
				setState(154); match(2);
				}
				break;

			case 10:
				{
				_localctx = new ContainsStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156); listStringExpr(0);
				setState(157); match(DOT);
				setState(158); match(CONTAINS);
				setState(159); match(4);
				setState(160); stringExpr(0);
				setState(161); match(2);
				}
				break;

			case 11:
				{
				_localctx = new ContainsBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); listBoolExpr();
				setState(164); match(DOT);
				setState(165); match(CONTAINS);
				setState(166); match(4);
				setState(167); boolExpr(0);
				setState(168); match(2);
				}
				break;

			case 12:
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
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(176);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(177);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(178); boolExpr(14);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(179);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(180); match(EQUAL);
						setState(181); boolExpr(10);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 22, RULE_listExpr);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); listDigitExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); listStringExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); listBoolExpr();
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_listDigitExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch (_input.LA(1)) {
			case 3:
				{
				_localctx = new ListDigit_LabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(193); listDigit();
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OrderListIntContext(new ListDigitExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDigitExpr);
						setState(197);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(198); match(DOT);
						setState(199);
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
						setState(200);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(201); match(DOT);
						setState(202); match(FILTER);
						setState(203); match(4);
						setState(204);
						((FilterListIntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((FilterListIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(205); numExpr(0);
						setState(206); match(2);
						}
						break;
					}
					} 
				}
				setState(212);
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

	public final ListStringExprContext listStringExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStringExprContext _localctx = new ListStringExprContext(_ctx, _parentState, _p);
		ListStringExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_listStringExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			switch (_input.LA(1)) {
			case 3:
				{
				_localctx = new ListString_LabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214); listString();
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
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
					setState(218);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(219); match(DOT);
					setState(220);
					((OrderListStringContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ORDERASC || _la==ORDERDESC) ) {
						((OrderListStringContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(225);
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
		enterRule(_localctx, 28, RULE_listBoolExpr);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case 3:
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
		enterRule(_localctx, 30, RULE_identifier);
		try {
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); hostId();
				setState(231); match(DOT);
				setState(232); observableId();
				setState(233); match(DOT);
				setState(234); method();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); observableId();
				setState(237); match(DOT);
				setState(238); method();
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
		enterRule(_localctx, 32, RULE_hostId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 34, RULE_observableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(ID);
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
		enterRule(_localctx, 36, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(ID);
			setState(247); match(4);
			setState(248); match(2);
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
		case 8: return numExpr_sempred((NumExprContext)_localctx, predIndex);

		case 9: return stringExpr_sempred((StringExprContext)_localctx, predIndex);

		case 10: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 12: return listDigitExpr_sempred((ListDigitExprContext)_localctx, predIndex);

		case 13: return listStringExpr_sempred((ListStringExprContext)_localctx, predIndex);
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
		case 0: return 9 >= _localctx._p;

		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean listStringExpr_sempred(ListStringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 13 >= _localctx._p;

		case 5: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\5\bI\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\nj\n\n\f\n\16\nm\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"u\n\13\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13\f\3\r\3\r\3\r\5\r\u00c1\n\r\3"+
		"\16\3\16\3\16\5\16\u00c6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16\16\u00d6\13\16\3\17\3\17\3\17"+
		"\5\17\u00db\n\17\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16\17\u00e3\13\17"+
		"\3\20\3\20\5\20\u00e7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00f3\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\2\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\13\3\2\36\37\3\2\7\b\3"+
		"\2\t\n\3\2\21\24\3\2 !\3\2\"#\3\2\r\16\3\2\31\32\4\2\7\7$$\u010f\2(\3"+
		"\2\2\2\4.\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16H"+
		"\3\2\2\2\20J\3\2\2\2\22^\3\2\2\2\24t\3\2\2\2\26\u00b0\3\2\2\2\30\u00c0"+
		"\3\2\2\2\32\u00c5\3\2\2\2\34\u00da\3\2\2\2\36\u00e6\3\2\2\2 \u00f2\3\2"+
		"\2\2\"\u00f4\3\2\2\2$\u00f6\3\2\2\2&\u00f8\3\2\2\2()\5\4\3\2)\3\3\2\2"+
		"\2*/\5\22\n\2+/\5\24\13\2,/\5\26\f\2-/\5\30\r\2.*\3\2\2\2.+\3\2\2\2.,"+
		"\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\65\7%\2\2\61\62\7%\2\2\62\63\7\30\2\2"+
		"\63\65\5\6\4\2\64\60\3\2\2\2\64\61\3\2\2\2\65\7\3\2\2\2\66\67\7\5\2\2"+
		"\678\5\6\4\289\7\3\2\29\t\3\2\2\2:?\7\'\2\2;<\7\'\2\2<=\7\30\2\2=?\5\n"+
		"\6\2>:\3\2\2\2>;\3\2\2\2?\13\3\2\2\2@A\7\5\2\2AB\5\n\6\2BC\7\3\2\2C\r"+
		"\3\2\2\2DI\7\20\2\2EF\7\20\2\2FG\7\30\2\2GI\5\16\b\2HD\3\2\2\2HE\3\2\2"+
		"\2I\17\3\2\2\2JK\7\5\2\2KL\5\16\b\2LM\7\3\2\2M\21\3\2\2\2NO\b\n\1\2O_"+
		"\7%\2\2P_\7&\2\2Q_\5 \21\2RS\7\6\2\2ST\5\22\n\2TU\7\4\2\2U_\3\2\2\2VW"+
		"\5\32\16\2WX\7\f\2\2XY\t\2\2\2Y_\3\2\2\2Z[\5\30\r\2[\\\7\f\2\2\\]\7\25"+
		"\2\2]_\3\2\2\2^N\3\2\2\2^P\3\2\2\2^Q\3\2\2\2^R\3\2\2\2^V\3\2\2\2^Z\3\2"+
		"\2\2_k\3\2\2\2`a\6\n\2\3ab\t\3\2\2bj\5\22\n\2cd\6\n\3\3de\t\4\2\2ej\5"+
		"\22\n\2fg\6\n\4\3gh\t\5\2\2hj\5\22\n\2i`\3\2\2\2ic\3\2\2\2if\3\2\2\2j"+
		"m\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mk\3\2\2\2no\b\13\1\2ou\5 \21"+
		"\2pq\7\6\2\2qr\5\24\13\2rs\7\4\2\2su\3\2\2\2tn\3\2\2\2tp\3\2\2\2u{\3\2"+
		"\2\2vw\6\13\5\3wx\7\t\2\2xz\5\24\13\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|"+
		"\3\2\2\2|\25\3\2\2\2}{\3\2\2\2~\177\b\f\1\2\177\u0080\7\17\2\2\u0080\u00b1"+
		"\5\26\f\2\u0081\u00b1\7\20\2\2\u0082\u00b1\5 \21\2\u0083\u0084\7\6\2\2"+
		"\u0084\u0085\5\26\f\2\u0085\u0086\7\4\2\2\u0086\u00b1\3\2\2\2\u0087\u0088"+
		"\5\22\n\2\u0088\u0089\7\13\2\2\u0089\u008a\5\22\n\2\u008a\u00b1\3\2\2"+
		"\2\u008b\u008c\5\24\13\2\u008c\u008d\7\13\2\2\u008d\u008e\5\24\13\2\u008e"+
		"\u00b1\3\2\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\13\2\2\u0091\u0092\5"+
		"\30\r\2\u0092\u00b1\3\2\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\f\2\2"+
		"\u0095\u0096\t\6\2\2\u0096\u00b1\3\2\2\2\u0097\u0098\5\32\16\2\u0098\u0099"+
		"\7\f\2\2\u0099\u009a\7\27\2\2\u009a\u009b\7\6\2\2\u009b\u009c\5\22\n\2"+
		"\u009c\u009d\7\4\2\2\u009d\u00b1\3\2\2\2\u009e\u009f\5\34\17\2\u009f\u00a0"+
		"\7\f\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5\24\13"+
		"\2\u00a3\u00a4\7\4\2\2\u00a4\u00b1\3\2\2\2\u00a5\u00a6\5\36\20\2\u00a6"+
		"\u00a7\7\f\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\5"+
		"\26\f\2\u00aa\u00ab\7\4\2\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5\36\20\2"+
		"\u00ad\u00ae\7\f\2\2\u00ae\u00af\t\7\2\2\u00af\u00b1\3\2\2\2\u00b0~\3"+
		"\2\2\2\u00b0\u0081\3\2\2\2\u00b0\u0082\3\2\2\2\u00b0\u0083\3\2\2\2\u00b0"+
		"\u0087\3\2\2\2\u00b0\u008b\3\2\2\2\u00b0\u008f\3\2\2\2\u00b0\u0093\3\2"+
		"\2\2\u00b0\u0097\3\2\2\2\u00b0\u009e\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\6\f\6\3\u00b3\u00b4\t\b"+
		"\2\2\u00b4\u00b9\5\26\f\2\u00b5\u00b6\6\f\7\3\u00b6\u00b7\7\13\2\2\u00b7"+
		"\u00b9\5\26\f\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c1\5\32\16\2\u00be\u00c1\5\34\17\2\u00bf\u00c1"+
		"\5\36\20\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\31\3\2\2\2\u00c2\u00c3\b\16\1\2\u00c3\u00c6\5\b\5\2\u00c4\u00c6"+
		"\5 \21\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00d4\3\2\2\2\u00c7"+
		"\u00c8\6\16\b\3\u00c8\u00c9\7\f\2\2\u00c9\u00d3\t\t\2\2\u00ca\u00cb\6"+
		"\16\t\3\u00cb\u00cc\7\f\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\7\6\2\2\u00ce"+
		"\u00cf\t\5\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7\4\2\2\u00d1\u00d3\3"+
		"\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d8\b\17\1\2\u00d8\u00db\5\f\7\2\u00d9\u00db\5 \21\2\u00da"+
		"\u00d7\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00dd\6\17"+
		"\n\3\u00dd\u00de\7\f\2\2\u00de\u00e0\t\t\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\35\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\5\20\t\2\u00e5\u00e7\5 \21\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00e9\5\"\22"+
		"\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed"+
		"\5&\24\2\u00ed\u00f3\3\2\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\7\f\2\2\u00f0"+
		"\u00f1\5&\24\2\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00ee\3\2"+
		"\2\2\u00f3!\3\2\2\2\u00f4\u00f5\t\n\2\2\u00f5#\3\2\2\2\u00f6\u00f7\7$"+
		"\2\2\u00f7%\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb"+
		"\7\4\2\2\u00fb\'\3\2\2\2\26.\64>H^ikt{\u00b0\u00b8\u00ba\u00c0\u00c5\u00d2"+
		"\u00d4\u00da\u00e1\u00e6\u00f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}