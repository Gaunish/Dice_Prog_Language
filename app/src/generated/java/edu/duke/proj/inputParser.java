// Generated from edu/duke/proj/input.g4 by ANTLR 4.5
package edu.duke.proj;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, ID=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_roll = 1, RULE_simpleRoll = 2, RULE_exp = 3, RULE_arithmeticOp = 4;
	public static final String[] ruleNames = {
		"prog", "roll", "simpleRoll", "exp", "arithmeticOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "input.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public inputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				exp(0);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class RollContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(inputParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inputParser.INT, i);
		}
		public TerminalNode ID() { return getToken(inputParser.ID, 0); }
		public RollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterRoll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitRoll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitRoll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollContext roll() throws RecognitionException {
		RollContext _localctx = new RollContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_roll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(INT);
			setState(17);
			match(ID);
			setState(18);
			match(INT);
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

	public static class SimpleRollContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(inputParser.ID, 0); }
		public TerminalNode INT() { return getToken(inputParser.INT, 0); }
		public SimpleRollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleRoll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterSimpleRoll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitSimpleRoll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitSimpleRoll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleRollContext simpleRoll() throws RecognitionException {
		SimpleRollContext _localctx = new SimpleRollContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleRoll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(ID);
			setState(21);
			match(INT);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext leftExp;
		public Token value;
		public ArithmeticOpContext op;
		public ExpContext rightExp;
		public RollContext roll() {
			return getRuleContext(RollContext.class,0);
		}
		public TerminalNode INT() { return getToken(inputParser.INT, 0); }
		public SimpleRollContext simpleRoll() {
			return getRuleContext(SimpleRollContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(24);
				roll();
				}
				break;
			case 2:
				{
				setState(25);
				((ExpContext)_localctx).value = match(INT);
				}
				break;
			case 3:
				{
				setState(26);
				simpleRoll();
				}
				break;
			case 4:
				{
				setState(27);
				match(T__0);
				setState(28);
				exp(0);
				setState(29);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					_localctx.leftExp = _prevctx;
					_localctx.leftExp = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(33);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(34);
					((ExpContext)_localctx).op = arithmeticOp();
					setState(35);
					((ExpContext)_localctx).rightExp = exp(3);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ArithmeticOpContext extends ParserRuleContext {
		public Token mul;
		public Token div;
		public Token plus;
		public Token minus;
		public ArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmeticOp);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((ArithmeticOpContext)_localctx).mul = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((ArithmeticOpContext)_localctx).div = match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				((ArithmeticOpContext)_localctx).plus = match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				((ArithmeticOpContext)_localctx).minus = match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\"\n\5\3\5\3\5\3"+
		"\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\6\3\6\3\6\3\6\5\6\61\n\6\3\6\2\3\b\7"+
		"\2\4\6\b\n\2\2\65\2\17\3\2\2\2\4\22\3\2\2\2\6\26\3\2\2\2\b!\3\2\2\2\n"+
		"\60\3\2\2\2\f\16\5\b\5\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\23\7\t\2\2\23\24\7\n\2\2\24\25"+
		"\7\t\2\2\25\5\3\2\2\2\26\27\7\n\2\2\27\30\7\t\2\2\30\7\3\2\2\2\31\32\b"+
		"\5\1\2\32\"\5\4\3\2\33\"\7\t\2\2\34\"\5\6\4\2\35\36\7\3\2\2\36\37\5\b"+
		"\5\2\37 \7\4\2\2 \"\3\2\2\2!\31\3\2\2\2!\33\3\2\2\2!\34\3\2\2\2!\35\3"+
		"\2\2\2\")\3\2\2\2#$\f\4\2\2$%\5\n\6\2%&\5\b\5\5&(\3\2\2\2\'#\3\2\2\2("+
		"+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2\2\2+)\3\2\2\2,\61\7\5\2\2-\61\7"+
		"\6\2\2.\61\7\7\2\2/\61\7\b\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60"+
		"/\3\2\2\2\61\13\3\2\2\2\6\17!)\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}