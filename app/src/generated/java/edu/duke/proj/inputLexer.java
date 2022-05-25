// Generated from edu/duke/proj/input.g4 by ANTLR 4.5
package edu.duke.proj;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inputLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, SUB=3, MUL=4, DIV=5, COLON=6, COMMA=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, INT=12, ROLLKEY=13, DEFTYPEKEY=14, DEFFUNKEY=15, 
		ID=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ADD", "SUB", "MUL", "DIV", "COLON", "COMMA", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "INT", "ROLLKEY", "DEFTYPEKEY", "DEFFUNKEY", "ID", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "'+'", "'-'", "'*'", "'/'", "':'", "','", "'('", "')'", "'{'", 
		"'}'", null, null, "'deftype'", "'deffun'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ADD", "SUB", "MUL", "DIV", "COLON", "COMMA", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "INT", "ROLLKEY", "DEFTYPEKEY", "DEFFUNKEY", "ID", 
		"WS"
	};
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


	public inputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "input.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\6\r=\n\r\r\r\16\r>\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7"+
		"\21T\n\21\f\21\16\21W\13\21\3\22\6\22Z\n\22\r\22\16\22[\3\22\3\22\2\2"+
		"\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23\3\2\7\3\2\62;\3\2ff\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2"+
		"\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\25\67\3\2\2\2\27"+
		"9\3\2\2\2\31<\3\2\2\2\33@\3\2\2\2\35B\3\2\2\2\37J\3\2\2\2!Q\3\2\2\2#Y"+
		"\3\2\2\2%&\7A\2\2&\4\3\2\2\2\'(\7-\2\2(\6\3\2\2\2)*\7/\2\2*\b\3\2\2\2"+
		"+,\7,\2\2,\n\3\2\2\2-.\7\61\2\2.\f\3\2\2\2/\60\7<\2\2\60\16\3\2\2\2\61"+
		"\62\7.\2\2\62\20\3\2\2\2\63\64\7*\2\2\64\22\3\2\2\2\65\66\7+\2\2\66\24"+
		"\3\2\2\2\678\7}\2\28\26\3\2\2\29:\7\177\2\2:\30\3\2\2\2;=\t\2\2\2<;\3"+
		"\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\32\3\2\2\2@A\t\3\2\2A\34\3\2\2\2"+
		"BC\7f\2\2CD\7g\2\2DE\7h\2\2EF\7v\2\2FG\7{\2\2GH\7r\2\2HI\7g\2\2I\36\3"+
		"\2\2\2JK\7f\2\2KL\7g\2\2LM\7h\2\2MN\7h\2\2NO\7w\2\2OP\7p\2\2P \3\2\2\2"+
		"QU\t\4\2\2RT\t\5\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\"\3\2\2"+
		"\2WU\3\2\2\2XZ\t\6\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2"+
		"\2\2]^\b\22\2\2^$\3\2\2\2\6\2>U[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}