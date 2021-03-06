// Generated from cal.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Const=2, Return=3, Integer=4, Boolean=5, Void=6, Main=7, If=8, 
		Else=9, True=10, False=11, While=12, Skip=13, SemiColon=14, Colon=15, 
		Comma=16, ID=17, NUMBER=18, BOOLEAN=19, L_brace=20, R_brace=21, L_sq_bracket=22, 
		R_sq_bracket=23, Lb=24, Rb=25, MINUS=26, PLUS=27, ASSIGNMENT=28, NOT=29, 
		OR=30, AND=31, EQUAL=32, NOTEQUAL=33, LT=34, LTE=35, GT=36, GTE=37, COMMENT_ML=38, 
		COMMENT_SL=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Variable", "Const", "Return", "Integer", "Boolean", "Void", "Main", 
			"If", "Else", "True", "False", "While", "Skip", "SemiColon", "Colon", 
			"Comma", "ID", "NUMBER", "BOOLEAN", "L_brace", "R_brace", "L_sq_bracket", 
			"R_sq_bracket", "Lb", "Rb", "MINUS", "PLUS", "ASSIGNMENT", "NOT", "OR", 
			"AND", "EQUAL", "NOTEQUAL", "LT", "LTE", "GT", "GTE", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "R", "S", 
			"T", "U", "V", "W", "Letter", "Digit", "NonZero", "UnderScore", "Dot", 
			"COMMENT_ML", "COMMENT_SL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "';'", "':'", "','", null, null, null, "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "'-'", "'+'", "'='", "'~'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Const", "Return", "Integer", "Boolean", "Void", "Main", 
			"If", "Else", "True", "False", "While", "Skip", "SemiColon", "Colon", 
			"Comma", "ID", "NUMBER", "BOOLEAN", "L_brace", "R_brace", "L_sq_bracket", 
			"R_sq_bracket", "Lb", "Rb", "MINUS", "PLUS", "ASSIGNMENT", "NOT", "OR", 
			"AND", "EQUAL", "NOTEQUAL", "LT", "LTE", "GT", "GTE", "COMMENT_ML", "COMMENT_SL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00db\n\22\f\22\16\22\u00de"+
		"\13\22\3\23\5\23\u00e1\n\23\3\23\3\23\3\23\6\23\u00e6\n\23\r\23\16\23"+
		"\u00e7\5\23\u00ea\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u00f5\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3A\7A\u015a\nA\fA\16A\u015d"+
		"\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u0168\nB\fB\16B\u016b\13B\3B\3B\3B"+
		"\3B\3C\6C\u0172\nC\rC\16C\u0173\3C\3C\4\u015b\u0169\2D\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y"+
		"\2{\2}\2\177\2\u0081(\u0083)\u0085*\3\2\33\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2C\\c|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\2\u0167\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2"+
		"\2\5\u008b\3\2\2\2\7\u0091\3\2\2\2\t\u0098\3\2\2\2\13\u00a0\3\2\2\2\r"+
		"\u00a8\3\2\2\2\17\u00ad\3\2\2\2\21\u00b2\3\2\2\2\23\u00b5\3\2\2\2\25\u00ba"+
		"\3\2\2\2\27\u00bf\3\2\2\2\31\u00c5\3\2\2\2\33\u00cb\3\2\2\2\35\u00d0\3"+
		"\2\2\2\37\u00d2\3\2\2\2!\u00d4\3\2\2\2#\u00d6\3\2\2\2%\u00e0\3\2\2\2\'"+
		"\u00f4\3\2\2\2)\u00f6\3\2\2\2+\u00f8\3\2\2\2-\u00fa\3\2\2\2/\u00fc\3\2"+
		"\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2\2\65\u0102\3\2\2\2\67\u0104\3\2\2"+
		"\29\u0106\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010d\3\2\2\2A\u0110"+
		"\3\2\2\2C\u0113\3\2\2\2E\u0116\3\2\2\2G\u0118\3\2\2\2I\u011b\3\2\2\2K"+
		"\u011d\3\2\2\2M\u0120\3\2\2\2O\u0122\3\2\2\2Q\u0124\3\2\2\2S\u0126\3\2"+
		"\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012c\3\2\2\2[\u012e\3\2\2\2]\u0130"+
		"\3\2\2\2_\u0132\3\2\2\2a\u0134\3\2\2\2c\u0136\3\2\2\2e\u0138\3\2\2\2g"+
		"\u013a\3\2\2\2i\u013c\3\2\2\2k\u013e\3\2\2\2m\u0140\3\2\2\2o\u0142\3\2"+
		"\2\2q\u0144\3\2\2\2s\u0146\3\2\2\2u\u0148\3\2\2\2w\u014a\3\2\2\2y\u014c"+
		"\3\2\2\2{\u014e\3\2\2\2}\u0150\3\2\2\2\177\u0152\3\2\2\2\u0081\u0154\3"+
		"\2\2\2\u0083\u0163\3\2\2\2\u0085\u0171\3\2\2\2\u0087\u0088\5s:\2\u0088"+
		"\u0089\5M\'\2\u0089\u008a\5k\66\2\u008a\4\3\2\2\2\u008b\u008c\5Q)\2\u008c"+
		"\u008d\5g\64\2\u008d\u008e\5e\63\2\u008e\u008f\5m\67\2\u008f\u0090\5o"+
		"8\2\u0090\6\3\2\2\2\u0091\u0092\5k\66\2\u0092\u0093\5U+\2\u0093\u0094"+
		"\5o8\2\u0094\u0095\5q9\2\u0095\u0096\5k\66\2\u0096\u0097\5e\63\2\u0097"+
		"\b\3\2\2\2\u0098\u0099\5]/\2\u0099\u009a\5e\63\2\u009a\u009b\5o8\2\u009b"+
		"\u009c\5U+\2\u009c\u009d\5Y-\2\u009d\u009e\5U+\2\u009e\u009f\5k\66\2\u009f"+
		"\n\3\2\2\2\u00a0\u00a1\5O(\2\u00a1\u00a2\5g\64\2\u00a2\u00a3\5g\64\2\u00a3"+
		"\u00a4\5a\61\2\u00a4\u00a5\5U+\2\u00a5\u00a6\5M\'\2\u00a6\u00a7\5e\63"+
		"\2\u00a7\f\3\2\2\2\u00a8\u00a9\5s:\2\u00a9\u00aa\5g\64\2\u00aa\u00ab\5"+
		"]/\2\u00ab\u00ac\5S*\2\u00ac\16\3\2\2\2\u00ad\u00ae\5c\62\2\u00ae\u00af"+
		"\5M\'\2\u00af\u00b0\5]/\2\u00b0\u00b1\5e\63\2\u00b1\20\3\2\2\2\u00b2\u00b3"+
		"\5]/\2\u00b3\u00b4\5W,\2\u00b4\22\3\2\2\2\u00b5\u00b6\5U+\2\u00b6\u00b7"+
		"\5a\61\2\u00b7\u00b8\5m\67\2\u00b8\u00b9\5U+\2\u00b9\24\3\2\2\2\u00ba"+
		"\u00bb\5o8\2\u00bb\u00bc\5k\66\2\u00bc\u00bd\5q9\2\u00bd\u00be\5U+\2\u00be"+
		"\26\3\2\2\2\u00bf\u00c0\5W,\2\u00c0\u00c1\5M\'\2\u00c1\u00c2\5a\61\2\u00c2"+
		"\u00c3\5m\67\2\u00c3\u00c4\5U+\2\u00c4\30\3\2\2\2\u00c5\u00c6\5u;\2\u00c6"+
		"\u00c7\5[.\2\u00c7\u00c8\5]/\2\u00c8\u00c9\5a\61\2\u00c9\u00ca\5U+\2\u00ca"+
		"\32\3\2\2\2\u00cb\u00cc\5m\67\2\u00cc\u00cd\5_\60\2\u00cd\u00ce\5]/\2"+
		"\u00ce\u00cf\5i\65\2\u00cf\34\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1\36\3\2"+
		"\2\2\u00d2\u00d3\7<\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7.\2\2\u00d5\"\3\2"+
		"\2\2\u00d6\u00dc\5w<\2\u00d7\u00db\5w<\2\u00d8\u00db\5y=\2\u00d9\u00db"+
		"\5}?\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd$\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e1\5\65\33\2\u00e0\u00df\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e9\3\2\2\2\u00e2\u00ea\5y=\2\u00e3\u00e5\5{>\2\u00e4"+
		"\u00e6\5y=\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3"+
		"\3\2\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7w\2\2\u00ee\u00f5\7g\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7c\2\2\u00f1"+
		"\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f5\7g\2\2\u00f4\u00eb\3\2\2"+
		"\2\u00f4\u00ef\3\2\2\2\u00f5(\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7*\3\2\2"+
		"\2\u00f8\u00f9\7\177\2\2\u00f9,\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb.\3\2"+
		"\2\2\u00fc\u00fd\7_\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\62\3"+
		"\2\2\2\u0100\u0101\7+\2\2\u0101\64\3\2\2\2\u0102\u0103\7/\2\2\u0103\66"+
		"\3\2\2\2\u0104\u0105\7-\2\2\u01058\3\2\2\2\u0106\u0107\7?\2\2\u0107:\3"+
		"\2\2\2\u0108\u0109\7\u0080\2\2\u0109<\3\2\2\2\u010a\u010b\7~\2\2\u010b"+
		"\u010c\7~\2\2\u010c>\3\2\2\2\u010d\u010e\7(\2\2\u010e\u010f\7(\2\2\u010f"+
		"@\3\2\2\2\u0110\u0111\7?\2\2\u0111\u0112\7?\2\2\u0112B\3\2\2\2\u0113\u0114"+
		"\7#\2\2\u0114\u0115\7?\2\2\u0115D\3\2\2\2\u0116\u0117\7>\2\2\u0117F\3"+
		"\2\2\2\u0118\u0119\7>\2\2\u0119\u011a\7?\2\2\u011aH\3\2\2\2\u011b\u011c"+
		"\7@\2\2\u011cJ\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f\7?\2\2\u011fL\3"+
		"\2\2\2\u0120\u0121\t\2\2\2\u0121N\3\2\2\2\u0122\u0123\t\3\2\2\u0123P\3"+
		"\2\2\2\u0124\u0125\t\4\2\2\u0125R\3\2\2\2\u0126\u0127\t\5\2\2\u0127T\3"+
		"\2\2\2\u0128\u0129\t\6\2\2\u0129V\3\2\2\2\u012a\u012b\t\7\2\2\u012bX\3"+
		"\2\2\2\u012c\u012d\t\b\2\2\u012dZ\3\2\2\2\u012e\u012f\t\t\2\2\u012f\\"+
		"\3\2\2\2\u0130\u0131\t\n\2\2\u0131^\3\2\2\2\u0132\u0133\t\13\2\2\u0133"+
		"`\3\2\2\2\u0134\u0135\t\f\2\2\u0135b\3\2\2\2\u0136\u0137\t\r\2\2\u0137"+
		"d\3\2\2\2\u0138\u0139\t\16\2\2\u0139f\3\2\2\2\u013a\u013b\t\17\2\2\u013b"+
		"h\3\2\2\2\u013c\u013d\t\20\2\2\u013dj\3\2\2\2\u013e\u013f\t\21\2\2\u013f"+
		"l\3\2\2\2\u0140\u0141\t\22\2\2\u0141n\3\2\2\2\u0142\u0143\t\23\2\2\u0143"+
		"p\3\2\2\2\u0144\u0145\t\24\2\2\u0145r\3\2\2\2\u0146\u0147\t\25\2\2\u0147"+
		"t\3\2\2\2\u0148\u0149\t\26\2\2\u0149v\3\2\2\2\u014a\u014b\t\27\2\2\u014b"+
		"x\3\2\2\2\u014c\u014d\t\30\2\2\u014dz\3\2\2\2\u014e\u014f\t\31\2\2\u014f"+
		"|\3\2\2\2\u0150\u0151\7a\2\2\u0151~\3\2\2\2\u0152\u0153\7\60\2\2\u0153"+
		"\u0080\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156\7,\2\2\u0156\u015b\3\2"+
		"\2\2\u0157\u015a\5\u0081A\2\u0158\u015a\13\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7,\2\2\u015f"+
		"\u0160\7\61\2\2\u0160\u0161\3\2\2\2\u0161\u0162\bA\2\2\u0162\u0082\3\2"+
		"\2\2\u0163\u0164\7\61\2\2\u0164\u0165\7\61\2\2\u0165\u0169\3\2\2\2\u0166"+
		"\u0168\13\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\7\f\2\2\u016d\u016e\3\2\2\2\u016e\u016f\bB\2\2\u016f\u0084\3\2"+
		"\2\2\u0170\u0172\t\32\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\bC"+
		"\2\2\u0176\u0086\3\2\2\2\r\2\u00da\u00dc\u00e0\u00e7\u00e9\u00f4\u0159"+
		"\u015b\u0169\u0173\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}