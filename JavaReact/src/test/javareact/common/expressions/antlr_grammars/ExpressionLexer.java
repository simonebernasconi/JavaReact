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
		T__1=1, T__0=2, MUL=3, DIV=4, ADD=5, SUB=6, EQUAL=7, DOT=8, AND=9, OR=10, 
		NOT=11, BOOL=12, MAX=13, MIN=14, MAXEQ=15, MINEQ=16, SIZE=17, ISEMPTY=18, 
		CONTAINS=19, COMMA=20, ORDERASC=21, ORDERDESC=22, ORDERASCBOOL=23, ORDERDESCBOOL=24, 
		FILTER=25, AVG=26, SUM=27, ASC=28, DESC=29, ALLTRUE=30, ALLFALSE=31, ID=32, 
		DIGIT=33, DOUBLE=34, STRING=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'*'", "'/'", "'+'", "'-'", "'=='", "'.'", "'&'", "'|'", 
		"'!'", "BOOL", "'>'", "'<'", "'>='", "'<='", "'size'", "'isEmpty'", "'contains'", 
		"','", "'orderAsc'", "'orderDesc'", "'orderAscBool'", "'orderDescBool'", 
		"'filterBy'", "'avg'", "'sum'", "'isAsc'", "'isDesc'", "'isAllTrue'", 
		"'isAllFalse'", "ID", "DIGIT", "DOUBLE", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "EQUAL", "DOT", "AND", "OR", 
		"NOT", "BOOL", "MAX", "MIN", "MAXEQ", "MINEQ", "SIZE", "ISEMPTY", "CONTAINS", 
		"COMMA", "ORDERASC", "ORDERDESC", "ORDERASCBOOL", "ORDERDESCBOOL", "FILTER", 
		"AVG", "SUM", "ASC", "DESC", "ALLTRUE", "ALLFALSE", "ID", "DIGIT", "DOUBLE", 
		"STRING", "WS"
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
		case 35: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\7!\u00f3\n!\f!\16!\u00f6\13!\3"+
		"\"\6\"\u00f9\n\"\r\"\16\"\u00fa\3#\7#\u00fe\n#\f#\16#\u0101\13#\3#\3#"+
		"\6#\u0105\n#\r#\16#\u0106\3$\6$\u010a\n$\r$\16$\u010b\3%\6%\u010f\n%\r"+
		"%\16%\u0110\3%\3%\2&\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\2\3\2\6\4\2C\\c|\5\2\62;C\\c|\3"+
		"\2\62;\4\2\13\f\"\"\u011a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2"+
		"\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2"+
		"\2\25^\3\2\2\2\27`\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2"+
		"\2\2!t\3\2\2\2#w\3\2\2\2%|\3\2\2\2\'\u0084\3\2\2\2)\u008d\3\2\2\2+\u008f"+
		"\3\2\2\2-\u0098\3\2\2\2/\u00a2\3\2\2\2\61\u00af\3\2\2\2\63\u00bd\3\2\2"+
		"\2\65\u00c6\3\2\2\2\67\u00ca\3\2\2\29\u00ce\3\2\2\2;\u00d4\3\2\2\2=\u00db"+
		"\3\2\2\2?\u00e5\3\2\2\2A\u00f0\3\2\2\2C\u00f8\3\2\2\2E\u00ff\3\2\2\2G"+
		"\u0109\3\2\2\2I\u010e\3\2\2\2KL\7+\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2\2"+
		"OP\7,\2\2P\b\3\2\2\2QR\7\61\2\2R\n\3\2\2\2ST\7-\2\2T\f\3\2\2\2UV\7/\2"+
		"\2V\16\3\2\2\2WX\7?\2\2XY\7?\2\2Y\20\3\2\2\2Z[\7\60\2\2[\22\3\2\2\2\\"+
		"]\7(\2\2]\24\3\2\2\2^_\7~\2\2_\26\3\2\2\2`a\7#\2\2a\30\3\2\2\2bc\7v\2"+
		"\2cd\7t\2\2de\7w\2\2el\7g\2\2fg\7h\2\2gh\7c\2\2hi\7n\2\2ij\7u\2\2jl\7"+
		"g\2\2kb\3\2\2\2kf\3\2\2\2l\32\3\2\2\2mn\7@\2\2n\34\3\2\2\2op\7>\2\2p\36"+
		"\3\2\2\2qr\7@\2\2rs\7?\2\2s \3\2\2\2tu\7>\2\2uv\7?\2\2v\"\3\2\2\2wx\7"+
		"u\2\2xy\7k\2\2yz\7|\2\2z{\7g\2\2{$\3\2\2\2|}\7k\2\2}~\7u\2\2~\177\7G\2"+
		"\2\177\u0080\7o\2\2\u0080\u0081\7r\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7{\2\2\u0083&\3\2\2\2\u0084\u0085\7e\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7u\2\2\u008c(\3\2\2\2\u008d\u008e\7.\2\2\u008e"+
		"*\3\2\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7f\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7t\2\2\u0094\u0095\7C\2\2\u0095\u0096\7u\2\2"+
		"\u0096\u0097\7e\2\2\u0097,\3\2\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2"+
		"\2\u009a\u009b\7f\2\2\u009b\u009c\7g\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7F\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7e\2\2\u00a1"+
		".\3\2\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7u\2\2"+
		"\u00a9\u00aa\7e\2\2\u00aa\u00ab\7D\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7n\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7F\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7D\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7D\2\2\u00c4\u00c5\7{\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7x\2\2\u00c8\u00c9\7i\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7w\2\2\u00cc\u00cd\7o\2\2\u00cd8\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7e\2\2"+
		"\u00d3:\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7F\2"+
		"\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7e\2\2\u00da<\3\2"+
		"\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7C\2\2\u00de\u00df"+
		"\7n\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7V\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7w\2\2\u00e3\u00e4\7g\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7n\2\2"+
		"\u00ea\u00eb\7H\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee"+
		"\7u\2\2\u00ee\u00ef\7g\2\2\u00ef@\3\2\2\2\u00f0\u00f4\t\2\2\2\u00f1\u00f3"+
		"\t\3\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5B\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\t\4\2\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fbD\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5\21\t\2\u0103\u0105\t\4\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107F\3\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cH\3\2\2\2\u010d"+
		"\u010f\t\5\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b%\2\2\u0113"+
		"J\3\2\2\2\n\2k\u00f4\u00fa\u00ff\u0106\u010b\u0110";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}