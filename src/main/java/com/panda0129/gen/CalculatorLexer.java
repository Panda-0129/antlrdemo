package com.panda0129.gen;// Generated from /Users/panda_0129/Documents/Learn/编译原理/antlrdemo/src/main/Calculator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, LPAREN=5, RPAREN=6, ID=7, INT=8, EQ=9, SEMI=10, 
		COMMENT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MUL", "DIV", "ADD", "SUB", "LPAREN", "RPAREN", "ID", "INT", "EQ", "SEMI", 
		"COMMENT", "WS", "LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", null, null, "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MUL", "DIV", "ADD", "SUB", "LPAREN", "RPAREN", "ID", "INT", "EQ", 
		"SEMI", "COMMENT", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b/\n\b\f\b\16\b\62\13\b\3\t\6\t\65\n"+
		"\t\r\t\16\t\66\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fA\n\f\f\f\16\fD\13"+
		"\f\3\f\5\fG\n\f\3\f\5\fJ\n\f\3\f\3\f\3\r\6\rO\n\r\r\r\16\rP\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\2\35\2\3\2\6\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\4\2C\\c|\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2"+
		"\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21\64\3\2\2\2\238\3\2\2\2\25:\3\2"+
		"\2\2\27<\3\2\2\2\31N\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37 \7,\2\2 \4\3\2"+
		"\2\2!\"\7\61\2\2\"\6\3\2\2\2#$\7-\2\2$\b\3\2\2\2%&\7/\2\2&\n\3\2\2\2\'"+
		"(\7*\2\2(\f\3\2\2\2)*\7+\2\2*\16\3\2\2\2+\60\5\33\16\2,/\5\33\16\2-/\5"+
		"\35\17\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\20\3\2\2\2\62\60\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\22\3\2\2\289\7?\2\29\24\3\2\2\2:;\7=\2\2"+
		";\26\3\2\2\2<=\7\61\2\2=>\7\61\2\2>B\3\2\2\2?A\n\3\2\2@?\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2EG\7\17\2\2FE\3\2\2\2FG\3"+
		"\2\2\2GI\3\2\2\2HJ\7\f\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\f\2\2L\30"+
		"\3\2\2\2MO\t\4\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2R"+
		"S\b\r\2\2S\32\3\2\2\2TU\t\5\2\2U\34\3\2\2\2VW\t\2\2\2W\36\3\2\2\2\n\2"+
		".\60\66BFIP\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}