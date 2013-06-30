// Generated from /mnt/disk3/NetBeansProjects/SimpleANTLR/core/src/org/daimor/mLexer.g4 by ANTLR 4.0

    package org.daimor; 

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Label=1, ID=2, INT=3, EOL=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"Label", "ID", "INT", "EOL", "WS"
	};
	public static final String[] ruleNames = {
		"Label", "ID", "INT", "EOL", "WS"
	};


	public mLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mLexer.g4"; }

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
		case 0: Label_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Label_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return Label_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Label_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return (getCharPositionInLine()==0);
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\4\7&\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3"+
		"\3\7\3\23\n\3\f\3\16\3\26\13\3\3\4\6\4\31\n\4\r\4\16\4\32\3\5\6\5\36\n"+
		"\5\r\5\16\5\37\3\6\6\6#\n\6\r\6\16\6$\2\7\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\3\2\7\4C\\c|\5\62;C\\c|\3\62;\4\f\f\17\17\4\13\13\"\")\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\20\3\2"+
		"\2\2\7\30\3\2\2\2\t\35\3\2\2\2\13\"\3\2\2\2\r\16\6\2\2\2\16\17\5\5\3\2"+
		"\17\4\3\2\2\2\20\24\t\2\2\2\21\23\t\3\2\2\22\21\3\2\2\2\23\26\3\2\2\2"+
		"\24\22\3\2\2\2\24\25\3\2\2\2\25\6\3\2\2\2\26\24\3\2\2\2\27\31\t\4\2\2"+
		"\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\b\3\2\2\2"+
		"\34\36\t\5\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 "+
		"\n\3\2\2\2!#\t\6\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\f\3\2"+
		"\2\2\7\2\24\32\37$";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}