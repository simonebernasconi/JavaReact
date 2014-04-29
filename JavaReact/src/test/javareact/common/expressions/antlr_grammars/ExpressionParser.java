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
		RULE_seqDouble = 4, RULE_listDouble = 5, RULE_seqString = 6, RULE_listString = 7, 
		RULE_seqBool = 8, RULE_listBool = 9, RULE_numExpr = 10, RULE_stringExpr = 11, 
		RULE_boolExpr = 12, RULE_listExpr = 13, RULE_listDigitExpr = 14, RULE_listDoubleExpr = 15, 
		RULE_listStringExpr = 16, RULE_listBoolExpr = 17, RULE_identifier = 18, 
		RULE_hostId = 19, RULE_observableId = 20, RULE_method = 21;
	public static final String[] ruleNames = {
		"start", "expression", "seqInt", "listDigit", "seqDouble", "listDouble", 
		"seqString", "listString", "seqBool", "listBool", "numExpr", "stringExpr", 
		"boolExpr", "listExpr", "listDigitExpr", "listDoubleExpr", "listStringExpr", 
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
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); numExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); stringExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48); boolExpr(0);
				}
				break;

			case 4:
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(DIGIT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(DIGIT);
				setState(54); match(COMMA);
				setState(55); seqInt();
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
			setState(58); match(3);
			setState(59); seqInt();
			setState(60); match(1);
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

	public static class SeqDoubleContext extends ParserRuleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public SeqDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqDouble; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqDoubleContext seqDouble() throws RecognitionException {
		SeqDoubleContext _localctx = new SeqDoubleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seqDouble);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(DOUBLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(DOUBLE);
				setState(64); match(COMMA);
				setState(65); seqDouble();
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
		enterRule(_localctx, 10, RULE_listDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(3);
			setState(69); seqDouble();
			setState(70); match(1);
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
		enterRule(_localctx, 12, RULE_seqString);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(STRING);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(STRING);
				setState(74); match(COMMA);
				setState(75); seqString();
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
		enterRule(_localctx, 14, RULE_listString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(3);
			setState(79); seqString();
			setState(80); match(1);
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
		enterRule(_localctx, 16, RULE_seqBool);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(BOOL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(BOOL);
				setState(84); match(COMMA);
				setState(85); seqBool();
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
		enterRule(_localctx, 18, RULE_listBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(3);
			setState(89); seqBool();
			setState(90); match(1);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_numExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93); match(DIGIT);
				}
				break;

			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94); match(DOUBLE);
				}
				break;

			case 3:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96); match(4);
				setState(97); numExpr(0);
				setState(98); match(2);
				}
				break;

			case 5:
				{
				_localctx = new AvgSumListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); listDigitExpr(0);
				setState(101); match(DOT);
				setState(102);
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
				setState(104); listDoubleExpr(0);
				setState(105); match(DOT);
				setState(106);
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
				setState(108); listExpr();
				setState(109); match(DOT);
				setState(110); match(SIZE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(114);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(115);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(116); numExpr(11);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(117);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(118);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(119); numExpr(10);
						}
						break;

					case 3:
						{
						_localctx = new MinMaxMineqMaxeqContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(120);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(121);
						((MinMaxMineqMaxeqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((MinMaxMineqMaxeqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(122); numExpr(9);
						}
						break;
					}
					} 
				}
				setState(127);
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
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_stringExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch (_input.LA(1)) {
			case MUL:
			case ID:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129); identifier();
				}
				break;
			case 4:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); match(4);
				setState(131); stringExpr(0);
				setState(132); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new StringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
					setState(136);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(137); match(ADD);
					setState(138); stringExpr(4);
					}
					} 
				}
				setState(143);
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_boolExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(145); match(NOT);
				setState(146); boolExpr(16);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); identifier();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); match(4);
				setState(150); boolExpr(0);
				setState(151); match(2);
				}
				break;

			case 5:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); numExpr(0);
				setState(154); match(EQUAL);
				setState(155); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157); stringExpr(0);
				setState(158); match(EQUAL);
				setState(159); stringExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); listExpr();
				setState(162); match(EQUAL);
				setState(163); listExpr();
				}
				break;

			case 8:
				{
				_localctx = new IsAscIsDescIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); listDigitExpr(0);
				setState(166); match(DOT);
				setState(167);
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
				setState(169); listDoubleExpr(0);
				setState(170); match(DOT);
				setState(171);
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
				setState(173); listDigitExpr(0);
				setState(174); match(DOT);
				setState(175); match(CONTAINS);
				setState(176); match(4);
				setState(177); numExpr(0);
				setState(178); match(2);
				}
				break;

			case 11:
				{
				_localctx = new ContainsDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); listDoubleExpr(0);
				setState(181); match(DOT);
				setState(182); match(CONTAINS);
				setState(183); match(4);
				setState(184); numExpr(0);
				setState(185); match(2);
				}
				break;

			case 12:
				{
				_localctx = new ContainsStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); listStringExpr(0);
				setState(188); match(DOT);
				setState(189); match(CONTAINS);
				setState(190); match(4);
				setState(191); stringExpr(0);
				setState(192); match(2);
				}
				break;

			case 13:
				{
				_localctx = new ContainsBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); listBoolExpr();
				setState(195); match(DOT);
				setState(196); match(CONTAINS);
				setState(197); match(4);
				setState(198); boolExpr(0);
				setState(199); match(2);
				}
				break;

			case 14:
				{
				_localctx = new AllTrueFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); listBoolExpr();
				setState(202); match(DOT);
				setState(203);
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
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(207);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(208);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(209); boolExpr(16);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(210);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(211); match(EQUAL);
						setState(212); boolExpr(12);
						}
						break;
					}
					} 
				}
				setState(217);
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
		enterRule(_localctx, 26, RULE_listExpr);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218); listDigitExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); listDoubleExpr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220); listStringExpr(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221); listBoolExpr();
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
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_listDigitExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch (_input.LA(1)) {
			case 3:
				{
				_localctx = new ListDigit_LabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(225); listDigit();
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new OrderListIntContext(new ListDigitExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDigitExpr);
						setState(229);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(230); match(DOT);
						setState(231);
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
						setState(232);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(233); match(DOT);
						setState(234); match(FILTER);
						setState(235); match(4);
						setState(236);
						((FilterListIntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((FilterListIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(237); numExpr(0);
						setState(238); match(2);
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public final ListDoubleExprContext listDoubleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListDoubleExprContext _localctx = new ListDoubleExprContext(_ctx, _parentState, _p);
		ListDoubleExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_listDoubleExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch (_input.LA(1)) {
			case 3:
				{
				_localctx = new ListDouble_LabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(246); listDouble();
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new OrderListDoubleContext(new ListDoubleExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_listDoubleExpr);
						setState(250);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(251); match(DOT);
						setState(252);
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
						setState(253);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(254); match(DOT);
						setState(255); match(FILTER);
						setState(256); match(4);
						setState(257);
						((FilterListDoubleContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << MAXEQ) | (1L << MINEQ))) != 0)) ) {
							((FilterListDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(258); numExpr(0);
						setState(259); match(2);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_listStringExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch (_input.LA(1)) {
			case 3:
				{
				_localctx = new ListString_LabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(267); listString();
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrderListStringContext(new ListStringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_listStringExpr);
					setState(271);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(272); match(DOT);
					setState(273);
					((OrderListStringContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ORDERASC || _la==ORDERDESC) ) {
						((OrderListStringContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(278);
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
			setState(281);
			switch (_input.LA(1)) {
			case 3:
				_localctx = new ListBool_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279); listBool();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280); identifier();
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
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); hostId();
				setState(284); match(DOT);
				setState(285); observableId();
				setState(286); match(DOT);
				setState(287); method();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); observableId();
				setState(290); match(DOT);
				setState(291); method();
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
		enterRule(_localctx, 38, RULE_hostId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
			setState(297); match(ID);
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
			setState(299); match(ID);
			setState(300); match(4);
			setState(301); match(2);
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
		case 10: return numExpr_sempred((NumExprContext)_localctx, predIndex);

		case 11: return stringExpr_sempred((StringExprContext)_localctx, predIndex);

		case 12: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 14: return listDigitExpr_sempred((ListDigitExprContext)_localctx, predIndex);

		case 15: return listDoubleExpr_sempred((ListDoubleExprContext)_localctx, predIndex);

		case 16: return listStringExpr_sempred((ListStringExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6E\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0089\n\r\3\r\3\r\3\r\7\r\u008e\n\r\f\r\16\r\u0091"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00d8\n\16\f\16\16\16\u00db\13\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00e1\n\17\3\20\3\20\3\20\5\20\u00e6\n\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f3\n\20\f\20\16\20\u00f6\13\20\3"+
		"\21\3\21\3\21\5\21\u00fb\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0108\n\21\f\21\16\21\u010b\13\21\3\22\3\22\3\22"+
		"\5\22\u0110\n\22\3\22\3\22\3\22\7\22\u0115\n\22\f\22\16\22\u0118\13\22"+
		"\3\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0128\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\2\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\13\3\2\36\37\3\2\7\b"+
		"\3\2\t\n\3\2\21\24\3\2 !\3\2\"#\3\2\r\16\3\2\31\32\4\2\7\7$$\u0149\2."+
		"\3\2\2\2\4\64\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16N"+
		"\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26r\3\2\2\2\30\u0088\3\2"+
		"\2\2\32\u00cf\3\2\2\2\34\u00e0\3\2\2\2\36\u00e5\3\2\2\2 \u00fa\3\2\2\2"+
		"\"\u010f\3\2\2\2$\u011b\3\2\2\2&\u0127\3\2\2\2(\u0129\3\2\2\2*\u012b\3"+
		"\2\2\2,\u012d\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\65\5\26\f\2\61\65\5\30\r"+
		"\2\62\65\5\32\16\2\63\65\5\34\17\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3"+
		"\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66;\7%\2\2\678\7%\2\289\7\30\2\29;\5"+
		"\6\4\2:\66\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\7\5\2\2=>\5\6\4\2>?\7\3\2"+
		"\2?\t\3\2\2\2@E\7&\2\2AB\7&\2\2BC\7\30\2\2CE\5\n\6\2D@\3\2\2\2DA\3\2\2"+
		"\2E\13\3\2\2\2FG\7\5\2\2GH\5\n\6\2HI\7\3\2\2I\r\3\2\2\2JO\7\'\2\2KL\7"+
		"\'\2\2LM\7\30\2\2MO\5\16\b\2NJ\3\2\2\2NK\3\2\2\2O\17\3\2\2\2PQ\7\5\2\2"+
		"QR\5\16\b\2RS\7\3\2\2S\21\3\2\2\2TY\7\20\2\2UV\7\20\2\2VW\7\30\2\2WY\5"+
		"\22\n\2XT\3\2\2\2XU\3\2\2\2Y\23\3\2\2\2Z[\7\5\2\2[\\\5\22\n\2\\]\7\3\2"+
		"\2]\25\3\2\2\2^_\b\f\1\2_s\7%\2\2`s\7&\2\2as\5&\24\2bc\7\6\2\2cd\5\26"+
		"\f\2de\7\4\2\2es\3\2\2\2fg\5\36\20\2gh\7\f\2\2hi\t\2\2\2is\3\2\2\2jk\5"+
		" \21\2kl\7\f\2\2lm\t\2\2\2ms\3\2\2\2no\5\34\17\2op\7\f\2\2pq\7\25\2\2"+
		"qs\3\2\2\2r^\3\2\2\2r`\3\2\2\2ra\3\2\2\2rb\3\2\2\2rf\3\2\2\2rj\3\2\2\2"+
		"rn\3\2\2\2s\177\3\2\2\2tu\6\f\2\3uv\t\3\2\2v~\5\26\f\2wx\6\f\3\3xy\t\4"+
		"\2\2y~\5\26\f\2z{\6\f\4\3{|\t\5\2\2|~\5\26\f\2}t\3\2\2\2}w\3\2\2\2}z\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0083\b\r\1\2\u0083\u0089\5&\24\2\u0084\u0085"+
		"\7\6\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\4\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008f\3\2\2\2\u008a\u008b"+
		"\6\r\5\3\u008b\u008c\7\t\2\2\u008c\u008e\5\30\r\2\u008d\u008a\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\31"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\16\1\2\u0093\u0094\7\17\2\2"+
		"\u0094\u00d0\5\32\16\2\u0095\u00d0\7\20\2\2\u0096\u00d0\5&\24\2\u0097"+
		"\u0098\7\6\2\2\u0098\u0099\5\32\16\2\u0099\u009a\7\4\2\2\u009a\u00d0\3"+
		"\2\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\13\2\2\u009d\u009e\5\26\f\2"+
		"\u009e\u00d0\3\2\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2"+
		"\5\30\r\2\u00a2\u00d0\3\2\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\7\13\2"+
		"\2\u00a5\u00a6\5\34\17\2\u00a6\u00d0\3\2\2\2\u00a7\u00a8\5\36\20\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\u00aa\t\6\2\2\u00aa\u00d0\3\2\2\2\u00ab\u00ac\5 "+
		"\21\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00d0\3\2\2\2\u00af"+
		"\u00b0\5\36\20\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3"+
		"\7\6\2\2\u00b3\u00b4\5\26\f\2\u00b4\u00b5\7\4\2\2\u00b5\u00d0\3\2\2\2"+
		"\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba"+
		"\7\6\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7\4\2\2\u00bc\u00d0\3\2\2\2"+
		"\u00bd\u00be\5\"\22\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1"+
		"\7\6\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7\4\2\2\u00c3\u00d0\3\2\2\2"+
		"\u00c4\u00c5\5$\23\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8"+
		"\7\6\2\2\u00c8\u00c9\5\32\16\2\u00c9\u00ca\7\4\2\2\u00ca\u00d0\3\2\2\2"+
		"\u00cb\u00cc\5$\23\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\t\7\2\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u0092\3\2\2\2\u00cf\u0095\3\2\2\2\u00cf\u0096\3\2\2\2\u00cf"+
		"\u0097\3\2\2\2\u00cf\u009b\3\2\2\2\u00cf\u009f\3\2\2\2\u00cf\u00a3\3\2"+
		"\2\2\u00cf\u00a7\3\2\2\2\u00cf\u00ab\3\2\2\2\u00cf\u00af\3\2\2\2\u00cf"+
		"\u00b6\3\2\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00cb\3\2"+
		"\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\6\16\6\3\u00d2\u00d3\t\b\2\2\u00d3"+
		"\u00d8\5\32\16\2\u00d4\u00d5\6\16\7\3\u00d5\u00d6\7\13\2\2\u00d6\u00d8"+
		"\5\32\16\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\33\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00e1\5\36\20\2\u00dd\u00e1\5 \21\2\u00de\u00e1\5\"\22"+
		"\2\u00df\u00e1\5$\23\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\b\20\1\2\u00e3"+
		"\u00e6\5\b\5\2\u00e4\u00e6\5&\24\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2"+
		"\2\2\u00e6\u00f4\3\2\2\2\u00e7\u00e8\6\20\b\3\u00e8\u00e9\7\f\2\2\u00e9"+
		"\u00f3\t\t\2\2\u00ea\u00eb\6\20\t\3\u00eb\u00ec\7\f\2\2\u00ec\u00ed\7"+
		"\35\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f0\5\26\f\2\u00f0"+
		"\u00f1\7\4\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00ea\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\37\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\21\1\2\u00f8\u00fb\5\f\7"+
		"\2\u00f9\u00fb\5&\24\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u0109"+
		"\3\2\2\2\u00fc\u00fd\6\21\n\3\u00fd\u00fe\7\f\2\2\u00fe\u0108\t\t\2\2"+
		"\u00ff\u0100\6\21\13\3\u0100\u0101\7\f\2\2\u0101\u0102\7\35\2\2\u0102"+
		"\u0103\7\6\2\2\u0103\u0104\t\5\2\2\u0104\u0105\5\26\f\2\u0105\u0106\7"+
		"\4\2\2\u0106\u0108\3\2\2\2\u0107\u00fc\3\2\2\2\u0107\u00ff\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a!\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u010d\b\22\1\2\u010d\u0110\5\20\t\2\u010e\u0110"+
		"\5&\24\2\u010f\u010c\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0116\3\2\2\2\u0111"+
		"\u0112\6\22\f\3\u0112\u0113\7\f\2\2\u0113\u0115\t\t\2\2\u0114\u0111\3"+
		"\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"#\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011c\5\24\13\2\u011a\u011c\5&\24"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c%\3\2\2\2\u011d\u011e"+
		"\5(\25\2\u011e\u011f\7\f\2\2\u011f\u0120\5*\26\2\u0120\u0121\7\f\2\2\u0121"+
		"\u0122\5,\27\2\u0122\u0128\3\2\2\2\u0123\u0124\5*\26\2\u0124\u0125\7\f"+
		"\2\2\u0125\u0126\5,\27\2\u0126\u0128\3\2\2\2\u0127\u011d\3\2\2\2\u0127"+
		"\u0123\3\2\2\2\u0128\'\3\2\2\2\u0129\u012a\t\n\2\2\u012a)\3\2\2\2\u012b"+
		"\u012c\7$\2\2\u012c+\3\2\2\2\u012d\u012e\7$\2\2\u012e\u012f\7\6\2\2\u012f"+
		"\u0130\7\4\2\2\u0130-\3\2\2\2\32\64:DNXr}\177\u0088\u008f\u00cf\u00d7"+
		"\u00d9\u00e0\u00e5\u00f2\u00f4\u00fa\u0107\u0109\u010f\u0116\u011b\u0127";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}