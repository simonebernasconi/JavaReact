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
		T__3=1, T__2=2, T__1=3, T__0=4, MUL=5, DIV=6, ADD=7, SUB=8, EQUAL=9, DOT=10, 
		AND=11, OR=12, NOT=13, BOOL=14, MAX=15, MIN=16, MAXEQ=17, MINEQ=18, SIZE=19, 
		ISEMPTY=20, CONTAINS=21, COMMA=22, ORDERASC=23, ORDERDESC=24, ORDERASCBOOL=25, 
		ORDERDESCBOOL=26, FILTER=27, AVG=28, SUM=29, ASC=30, DESC=31, ALLTRUE=32, 
		ALLFALSE=33, ID=34, DIGIT=35, DOUBLE=36, STRING=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "'['", "'('", "'*'", "'/'", "'+'", "'-'", "'=='", "'.'", 
		"'&'", "'|'", "'!'", "BOOL", "'>'", "'<'", "'>='", "'<='", "'size'", "'isEmpty'", 
		"'contains'", "','", "'orderAsc'", "'orderDesc'", "'orderAscBool'", "'orderDescBool'", 
		"'filterBy'", "'avg'", "'sum'", "'isAsc'", "'isDesc'", "'isAllTrue'", 
		"'isAllFalse'", "ID", "DIGIT", "DOUBLE", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "EQUAL", "DOT", 
		"AND", "OR", "NOT", "BOOL", "MAX", "MIN", "MAXEQ", "MINEQ", "SIZE", "ISEMPTY", 
		"CONTAINS", "COMMA", "ORDERASC", "ORDERDESC", "ORDERASCBOOL", "ORDERDESCBOOL", 
		"FILTER", "AVG", "SUM", "ASC", "DESC", "ALLTRUE", "ALLFALSE", "ID", "DIGIT", 
		"DOUBLE", "STRING", "WS"
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
		case 37: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17t\n"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00fb"+
		"\n#\f#\16#\u00fe\13#\3$\6$\u0101\n$\r$\16$\u0102\3%\7%\u0106\n%\f%\16"+
		"%\u0109\13%\3%\3%\6%\u010d\n%\r%\16%\u010e\3&\6&\u0112\n&\r&\16&\u0113"+
		"\3\'\6\'\u0117\n\'\r\'\16\'\u0118\3\'\3\'\2(\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\2\3"+
		"\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\f\"\"\u0122\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3"+
		"\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25b\3\2\2\2\27d"+
		"\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#y\3"+
		"\2\2\2%|\3\2\2\2\'\177\3\2\2\2)\u0084\3\2\2\2+\u008c\3\2\2\2-\u0095\3"+
		"\2\2\2/\u0097\3\2\2\2\61\u00a0\3\2\2\2\63\u00aa\3\2\2\2\65\u00b7\3\2\2"+
		"\2\67\u00c5\3\2\2\29\u00ce\3\2\2\2;\u00d2\3\2\2\2=\u00d6\3\2\2\2?\u00dc"+
		"\3\2\2\2A\u00e3\3\2\2\2C\u00ed\3\2\2\2E\u00f8\3\2\2\2G\u0100\3\2\2\2I"+
		"\u0107\3\2\2\2K\u0111\3\2\2\2M\u0116\3\2\2\2OP\7_\2\2P\4\3\2\2\2QR\7+"+
		"\2\2R\6\3\2\2\2ST\7]\2\2T\b\3\2\2\2UV\7*\2\2V\n\3\2\2\2WX\7,\2\2X\f\3"+
		"\2\2\2YZ\7\61\2\2Z\16\3\2\2\2[\\\7-\2\2\\\20\3\2\2\2]^\7/\2\2^\22\3\2"+
		"\2\2_`\7?\2\2`a\7?\2\2a\24\3\2\2\2bc\7\60\2\2c\26\3\2\2\2de\7(\2\2e\30"+
		"\3\2\2\2fg\7~\2\2g\32\3\2\2\2hi\7#\2\2i\34\3\2\2\2jk\7v\2\2kl\7t\2\2l"+
		"m\7w\2\2mt\7g\2\2no\7h\2\2op\7c\2\2pq\7n\2\2qr\7u\2\2rt\7g\2\2sj\3\2\2"+
		"\2sn\3\2\2\2t\36\3\2\2\2uv\7@\2\2v \3\2\2\2wx\7>\2\2x\"\3\2\2\2yz\7@\2"+
		"\2z{\7?\2\2{$\3\2\2\2|}\7>\2\2}~\7?\2\2~&\3\2\2\2\177\u0080\7u\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7|\2\2\u0082\u0083\7g\2\2\u0083(\3\2\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7u\2\2\u0086\u0087\7G\2\2\u0087\u0088\7o\2\2"+
		"\u0088\u0089\7r\2\2\u0089\u008a\7v\2\2\u008a\u008b\7{\2\2\u008b*\3\2\2"+
		"\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7c\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093"+
		"\u0094\7u\2\2\u0094,\3\2\2\2\u0095\u0096\7.\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a\7f\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u009d\7C\2\2\u009d\u009e\7u\2\2\u009e\u009f\7e\2\2"+
		"\u009f\60\3\2\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7"+
		"f\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7F\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7e\2\2\u00a9\62\3\2\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7e\2\2"+
		"\u00b2\u00b3\7D\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7f\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7F\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7D\2\2"+
		"\u00c1\u00c2\7q\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7n\2\2\u00c4\66\3\2"+
		"\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7D\2\2\u00cc"+
		"\u00cd\7{\2\2\u00cd8\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7x\2\2\u00d0"+
		"\u00d1\7i\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7w\2\2\u00d4"+
		"\u00d5\7o\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7C\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7e\2\2\u00db>\3\2\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7F\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7u\2\2\u00e1\u00e2\7e\2\2\u00e2@\3\2\2\2\u00e3\u00e4\7k\2"+
		"\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8"+
		"\7n\2\2\u00e8\u00e9\7V\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7w\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7u\2\2\u00ef"+
		"\u00f0\7C\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7H\2\2"+
		"\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7D\3\2\2\2\u00f8\u00fc\t\2\2\2\u00f9\u00fb\t\3\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"F\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103H\3"+
		"\2\2\2\u0104\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010c\5\25\13\2\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fJ\3\2\2\2"+
		"\u0110\u0112\t\3\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114L\3\2\2\2\u0115\u0117\t\5\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\'\2\2\u011bN\3\2\2\2\n\2s\u00fc"+
		"\u0102\u0107\u010e\u0113\u0118";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}