// Generated from antlr_grammars/Expression.g4 by ANTLR 4.1
package test.javareact.common.expressions.antlr_grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, MUL=6, DIV=7, ADD=8, SUB=9, DOT=10, 
		MIN=11, MAX=12, NOT=13, EQUAL=14, AND=15, OR=16, AVG=17, SUM=18, ASC=19, 
		DESC=20, ALLTRUE=21, ALLFALSE=22, ID=23, STRING=24, DIGIT=25, DOUBLE=26, 
		BOOL=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "','", "'['", "'('", "'*'", "'/'", "'+'", "'-'", "'.'", 
		"'<'", "'>'", "'!'", "'=='", "'&'", "'|'", "'Avg'", "'Sum'", "'orderAsc'", 
		"'orderDesc'", "'isAllTrue'", "'isAllFalse'", "ID", "STRING", "DIGIT", 
		"DOUBLE", "BOOL", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "DOT", 
		"MIN", "MAX", "NOT", "EQUAL", "AND", "OR", "AVG", "SUM", "ASC", "DESC", 
		"ALLTRUE", "ALLFALSE", "ID", "STRING", "DIGIT", "DOUBLE", "BOOL", "WS"
	};


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\7\30\u008f\n\30\f\30\16\30\u0092\13\30\3\31\3\31"+
		"\6\31\u0096\n\31\r\31\16\31\u0097\3\31\3\31\3\32\6\32\u009d\n\32\r\32"+
		"\16\32\u009e\3\33\7\33\u00a2\n\33\f\33\16\33\u00a5\13\33\3\33\3\33\6\33"+
		"\u00a9\n\33\r\33\16\33\u00aa\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u00b6\n\34\3\35\6\35\u00b9\n\35\r\35\16\35\u00ba\3\35\3\35\2"+
		"\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\2\3\2\7\4\2C\\"+
		"c|\5\2\62;C\\c|\6\2\"\"\62;C\\c|\3\2\62;\4\2\13\f\"\"\u00c4\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3"+
		"\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3"+
		"\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35"+
		"U\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#\\\3\2\2\2%`\3\2\2\2\'d\3\2\2\2)m\3\2"+
		"\2\2+w\3\2\2\2-\u0081\3\2\2\2/\u008c\3\2\2\2\61\u0093\3\2\2\2\63\u009c"+
		"\3\2\2\2\65\u00a3\3\2\2\2\67\u00b5\3\2\2\29\u00b8\3\2\2\2;<\7_\2\2<\4"+
		"\3\2\2\2=>\7+\2\2>\6\3\2\2\2?@\7.\2\2@\b\3\2\2\2AB\7]\2\2B\n\3\2\2\2C"+
		"D\7*\2\2D\f\3\2\2\2EF\7,\2\2F\16\3\2\2\2GH\7\61\2\2H\20\3\2\2\2IJ\7-\2"+
		"\2J\22\3\2\2\2KL\7/\2\2L\24\3\2\2\2MN\7\60\2\2N\26\3\2\2\2OP\7>\2\2P\30"+
		"\3\2\2\2QR\7@\2\2R\32\3\2\2\2ST\7#\2\2T\34\3\2\2\2UV\7?\2\2VW\7?\2\2W"+
		"\36\3\2\2\2XY\7(\2\2Y \3\2\2\2Z[\7~\2\2[\"\3\2\2\2\\]\7C\2\2]^\7x\2\2"+
		"^_\7i\2\2_$\3\2\2\2`a\7U\2\2ab\7w\2\2bc\7o\2\2c&\3\2\2\2de\7q\2\2ef\7"+
		"t\2\2fg\7f\2\2gh\7g\2\2hi\7t\2\2ij\7C\2\2jk\7u\2\2kl\7e\2\2l(\3\2\2\2"+
		"mn\7q\2\2no\7t\2\2op\7f\2\2pq\7g\2\2qr\7t\2\2rs\7F\2\2st\7g\2\2tu\7u\2"+
		"\2uv\7e\2\2v*\3\2\2\2wx\7k\2\2xy\7u\2\2yz\7C\2\2z{\7n\2\2{|\7n\2\2|}\7"+
		"V\2\2}~\7t\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080,\3\2\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7u\2\2\u0083\u0084\7C\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7n\2\2\u0086\u0087\7H\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2"+
		"\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b.\3\2\2\2\u008c\u0090\t\2"+
		"\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\60\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0095\7)\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\7)\2\2\u009a\62\3\2\2\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\64"+
		"\3\2\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a8\5\25\13\2\u00a7\u00a9\t\5\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\66\3\2\2"+
		"\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7w\2\2\u00af\u00b6"+
		"\7g\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b6\7g\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b0\3\2\2"+
		"\2\u00b68\3\2\2\2\u00b7\u00b9\t\6\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\b\35\2\2\u00bd:\3\2\2\2\n\2\u0090\u0097\u009e\u00a3\u00aa\u00b5"+
		"\u00ba";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}