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
		DIGIT=33, DOUBLE=34, STRING=35, LISTDIGIT=36, SEQINT=37, LISTDOUBLE=38, 
		SEQDOUBLE=39, LISTSTRING=40, LISTBOOL=41, WS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'*'", "'/'", "'+'", "'-'", "'=='", "'.'", "'&'", "'|'", 
		"'!'", "BOOL", "'>'", "'<'", "'>='", "'<='", "'size'", "'isEmpty'", "'contains'", 
		"','", "'orderAsc'", "'orderDesc'", "'orderAscBool'", "'orderDescBool'", 
		"'filterBy'", "'avg'", "'sum'", "'isAsc'", "'isDesc'", "'isAllTrue'", 
		"'isAllFalse'", "ID", "DIGIT", "DOUBLE", "STRING", "LISTDIGIT", "SEQINT", 
		"LISTDOUBLE", "SEQDOUBLE", "LISTSTRING", "LISTBOOL", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "EQUAL", "DOT", "AND", "OR", 
		"NOT", "BOOL", "MAX", "MIN", "MAXEQ", "MINEQ", "SIZE", "ISEMPTY", "CONTAINS", 
		"COMMA", "ORDERASC", "ORDERDESC", "ORDERASCBOOL", "ORDERDESCBOOL", "FILTER", 
		"AVG", "SUM", "ASC", "DESC", "ALLTRUE", "ALLFALSE", "ID", "DIGIT", "DOUBLE", 
		"STRING", "LISTDIGIT", "SEQINT", "LISTDOUBLE", "SEQDOUBLE", "LISTSTRING", 
		"LISTBOOL", "WS"
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
		case 41: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2,\u014e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rx\n\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\7!\u00ff\n!\f!\16!\u0102\13!\3\"\6\"\u0105\n\"\r\"\16\"\u0106"+
		"\3#\7#\u010a\n#\f#\16#\u010d\13#\3#\3#\6#\u0111\n#\r#\16#\u0112\3$\6$"+
		"\u0116\n$\r$\16$\u0117\3%\3%\3%\3%\3&\3&\3&\3&\3&\5&\u0123\n&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\5(\u012e\n(\3)\3)\3)\3)\3)\7)\u0135\n)\f)\16)"+
		"\u0138\13)\3)\3)\3*\3*\3*\3*\3*\7*\u0141\n*\f*\16*\u0144\13*\3*\3*\3+"+
		"\6+\u0149\n+\r+\16+\u014a\3+\3+\2,\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1"+
		"!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S"+
		"+\1U,\2\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\f\"\"\u0158\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2"+
		"\17c\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31w\3\2\2"+
		"\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\u0080\3\2\2\2#\u0083\3\2\2\2%"+
		"\u0088\3\2\2\2\'\u0090\3\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u00a4\3"+
		"\2\2\2/\u00ae\3\2\2\2\61\u00bb\3\2\2\2\63\u00c9\3\2\2\2\65\u00d2\3\2\2"+
		"\2\67\u00d6\3\2\2\29\u00da\3\2\2\2;\u00e0\3\2\2\2=\u00e7\3\2\2\2?\u00f1"+
		"\3\2\2\2A\u00fc\3\2\2\2C\u0104\3\2\2\2E\u010b\3\2\2\2G\u0115\3\2\2\2I"+
		"\u0119\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2\2\2O\u012d\3\2\2\2Q\u012f\3\2"+
		"\2\2S\u013b\3\2\2\2U\u0148\3\2\2\2WX\7+\2\2X\4\3\2\2\2YZ\7*\2\2Z\6\3\2"+
		"\2\2[\\\7,\2\2\\\b\3\2\2\2]^\7\61\2\2^\n\3\2\2\2_`\7-\2\2`\f\3\2\2\2a"+
		"b\7/\2\2b\16\3\2\2\2cd\7?\2\2de\7?\2\2e\20\3\2\2\2fg\7\60\2\2g\22\3\2"+
		"\2\2hi\7(\2\2i\24\3\2\2\2jk\7~\2\2k\26\3\2\2\2lm\7#\2\2m\30\3\2\2\2no"+
		"\7v\2\2op\7t\2\2pq\7w\2\2qx\7g\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2"+
		"vx\7g\2\2wn\3\2\2\2wr\3\2\2\2x\32\3\2\2\2yz\7@\2\2z\34\3\2\2\2{|\7>\2"+
		"\2|\36\3\2\2\2}~\7@\2\2~\177\7?\2\2\177 \3\2\2\2\u0080\u0081\7>\2\2\u0081"+
		"\u0082\7?\2\2\u0082\"\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7|\2\2\u0086\u0087\7g\2\2\u0087$\3\2\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7G\2\2\u008b\u008c\7o\2\2\u008c\u008d\7r\2\2"+
		"\u008d\u008e\7v\2\2\u008e\u008f\7{\2\2\u008f&\3\2\2\2\u0090\u0091\7e\2"+
		"\2\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7u\2\2\u0098"+
		"(\3\2\2\2\u0099\u009a\7.\2\2\u009a*\3\2\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7C\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7e\2\2\u00a3,\3\2\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\u00ad\7e\2\2\u00ad.\3\2\2\2\u00ae\u00af\7q\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7C\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7D\2\2"+
		"\u00b7\u00b8\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\60\3\2"+
		"\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7f\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7D\2\2\u00c5\u00c6\7q\2\2"+
		"\u00c6\u00c7\7q\2\2\u00c7\u00c8\7n\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7"+
		"h\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7D\2\2\u00d0\u00d1\7{\2\2\u00d1"+
		"\64\3\2\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7i\2\2\u00d5"+
		"\66\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7o\2\2\u00d9"+
		"8\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7C\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7e\2\2\u00df:\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7F\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7u\2\2"+
		"\u00e5\u00e6\7e\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7u\2"+
		"\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed"+
		"\7V\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		">\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7C\2\2\u00f4"+
		"\u00f5\7n\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7H\2\2\u00f7\u00f8\7c\2\2"+
		"\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb@\3\2\2"+
		"\2\u00fc\u0100\t\2\2\2\u00fd\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101B\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0105\t\4\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107D\3\2\2\2\u0108\u010a"+
		"\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\5\21"+
		"\t\2\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113F\3\2\2\2\u0114\u0116\t\3\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118H\3\2\2\2\u0119\u011a\7]\2\2\u011a\u011b\5K&\2\u011b\u011c"+
		"\7_\2\2\u011cJ\3\2\2\2\u011d\u0123\5C\"\2\u011e\u011f\5C\"\2\u011f\u0120"+
		"\7.\2\2\u0120\u0121\5K&\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0123L\3\2\2\2\u0124\u0125\7]\2\2\u0125\u0126\5O(\2\u0126"+
		"\u0127\7_\2\2\u0127N\3\2\2\2\u0128\u012e\5E#\2\u0129\u012a\5E#\2\u012a"+
		"\u012b\7.\2\2\u012b\u012c\5O(\2\u012c\u012e\3\2\2\2\u012d\u0128\3\2\2"+
		"\2\u012d\u0129\3\2\2\2\u012eP\3\2\2\2\u012f\u0130\7]\2\2\u0130\u0136\5"+
		"G$\2\u0131\u0132\5)\25\2\u0132\u0133\5G$\2\u0133\u0135\3\2\2\2\u0134\u0131"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7_\2\2\u013aR\3\2\2\2\u013b"+
		"\u013c\7]\2\2\u013c\u0142\5\31\r\2\u013d\u013e\5)\25\2\u013e\u013f\5\31"+
		"\r\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7_\2\2\u0146T\3\2\2\2\u0147\u0149\t\5\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\b+\2\2\u014dV\3\2\2\2\16\2w\u0100\u0106\u010b"+
		"\u0112\u0117\u0122\u012d\u0136\u0142\u014a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}