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
		T__0=1, ADD=2, SUB=3, MUL=4, DIV=5, COLON=6, COMMA=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, INT=12, ROLLKEY=13, DEFTYPEKEY=14, DEFFUNKEY=15, 
		ID=16, WS=17;
	public static final int
		RULE_prog = 0, RULE_exp = 1, RULE_roll = 2, RULE_singleRoll = 3, RULE_defTypeBody = 4, 
		RULE_defType = 5, RULE_fields = 6, RULE_defFun = 7;
	public static final String[] ruleNames = {
		"prog", "exp", "roll", "singleRoll", "defTypeBody", "defType", "fields", 
		"defFun"
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			exp(0);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensExpContext extends ExpContext {
		public TerminalNode LPAREN() { return getToken(inputParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(inputParser.RPAREN, 0); }
		public ParensExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterParensExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitParensExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitParensExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(inputParser.ID, 0); }
		public VarExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDefExpContext extends ExpContext {
		public DefTypeContext defType() {
			return getRuleContext(DefTypeContext.class,0);
		}
		public TypeDefExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterTypeDefExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitTypeDefExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitTypeDefExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilExpContext extends ExpContext {
		public NilExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterNilExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitNilExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitNilExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpContext extends ExpContext {
		public ExpContext leftExp;
		public Token op;
		public ExpContext rightExp;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MUL() { return getToken(inputParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(inputParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(inputParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(inputParser.SUB, 0); }
		public ArithmeticExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterArithmeticExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitArithmeticExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitArithmeticExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollExpContext extends ExpContext {
		public RollContext roll() {
			return getRuleContext(RollContext.class,0);
		}
		public RollExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterRollExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitRollExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitRollExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleRollExpContext extends ExpContext {
		public SingleRollContext singleRoll() {
			return getRuleContext(SingleRollContext.class,0);
		}
		public SingleRollExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterSingleRollExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitSingleRollExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitSingleRollExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunDefExpContext extends ExpContext {
		public DefFunContext defFun() {
			return getRuleContext(DefFunContext.class,0);
		}
		public FunDefExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterFunDefExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitFunDefExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitFunDefExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpContext extends ExpContext {
		public ExpContext cond;
		public ExpContext opt1;
		public ExpContext opt2;
		public TerminalNode COLON() { return getToken(inputParser.COLON, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ConditionalExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterConditionalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitConditionalExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitConditionalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExpContext extends ExpContext {
		public Token value;
		public TerminalNode INT() { return getToken(inputParser.INT, 0); }
		public ValueExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitValueExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitValueExp(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new RollExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				roll();
				}
				break;
			case 2:
				{
				_localctx = new SingleRollExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				singleRoll();
				}
				break;
			case 3:
				{
				_localctx = new ParensExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(LPAREN);
				setState(22);
				exp(0);
				setState(23);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new VarExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ValueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				((ValueExpContext)_localctx).value = match(INT);
				}
				break;
			case 6:
				{
				_localctx = new TypeDefExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				defType();
				}
				break;
			case 7:
				{
				_localctx = new FunDefExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				defFun();
				}
				break;
			case 8:
				{
				_localctx = new NilExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpContext(new ExpContext(_parentctx, _parentState));
						((ArithmeticExpContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(32);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(33);
						((ArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(34);
						((ArithmeticExpContext)_localctx).rightExp = exp(10);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpContext(new ExpContext(_parentctx, _parentState));
						((ArithmeticExpContext)_localctx).leftExp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(35);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(36);
						((ArithmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ArithmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(37);
						((ArithmeticExpContext)_localctx).rightExp = exp(9);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExpContext(new ExpContext(_parentctx, _parentState));
						((ConditionalExpContext)_localctx).cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(38);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(39);
						match(T__0);
						setState(40);
						((ConditionalExpContext)_localctx).opt1 = exp(0);
						setState(41);
						match(COLON);
						setState(42);
						((ConditionalExpContext)_localctx).opt2 = exp(7);
						}
						break;
					}
					} 
				}
				setState(48);
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

	public static class RollContext extends ParserRuleContext {
		public Token times;
		public Token sides;
		public TerminalNode ROLLKEY() { return getToken(inputParser.ROLLKEY, 0); }
		public List<TerminalNode> INT() { return getTokens(inputParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(inputParser.INT, i);
		}
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
		enterRule(_localctx, 4, RULE_roll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((RollContext)_localctx).times = match(INT);
			setState(50);
			match(ROLLKEY);
			setState(51);
			((RollContext)_localctx).sides = match(INT);
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

	public static class SingleRollContext extends ParserRuleContext {
		public Token sides;
		public TerminalNode ROLLKEY() { return getToken(inputParser.ROLLKEY, 0); }
		public TerminalNode INT() { return getToken(inputParser.INT, 0); }
		public SingleRollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRoll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterSingleRoll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitSingleRoll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitSingleRoll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleRollContext singleRoll() throws RecognitionException {
		SingleRollContext _localctx = new SingleRollContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleRoll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ROLLKEY);
			setState(54);
			((SingleRollContext)_localctx).sides = match(INT);
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

	public static class DefTypeBodyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(inputParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(inputParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(inputParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(inputParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(inputParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(inputParser.COMMA, i);
		}
		public DefTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterDefTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitDefTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitDefTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTypeBodyContext defTypeBody() throws RecognitionException {
		DefTypeBodyContext _localctx = new DefTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(56);
				match(ID);
				setState(57);
				match(COLON);
				setState(58);
				match(ID);
				setState(59);
				match(COMMA);
				}
				}
				setState(64);
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

	public static class DefTypeContext extends ParserRuleContext {
		public TerminalNode DEFTYPEKEY() { return getToken(inputParser.DEFTYPEKEY, 0); }
		public TerminalNode ID() { return getToken(inputParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(inputParser.LBRACE, 0); }
		public DefTypeBodyContext defTypeBody() {
			return getRuleContext(DefTypeBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(inputParser.RBRACE, 0); }
		public DefTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterDefType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitDefType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitDefType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTypeContext defType() throws RecognitionException {
		DefTypeContext _localctx = new DefTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(DEFTYPEKEY);
			setState(66);
			match(ID);
			setState(67);
			match(LBRACE);
			setState(68);
			defTypeBody();
			setState(69);
			match(RBRACE);
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

	public static class FieldsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(inputParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(inputParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(inputParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(inputParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(inputParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(inputParser.COMMA, i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(COLON);
			setState(73);
			match(ID);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(74);
				match(COMMA);
				setState(75);
				match(ID);
				setState(76);
				match(COLON);
				setState(77);
				match(ID);
				}
				}
				setState(82);
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

	public static class DefFunContext extends ParserRuleContext {
		public TerminalNode DEFFUNKEY() { return getToken(inputParser.DEFFUNKEY, 0); }
		public TerminalNode ID() { return getToken(inputParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(inputParser.LPAREN, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(inputParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(inputParser.LBRACE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(inputParser.RBRACE, 0); }
		public DefFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).enterDefFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputListener ) ((inputListener)listener).exitDefFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof inputVisitor ) return ((inputVisitor<? extends T>)visitor).visitDefFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFunContext defFun() throws RecognitionException {
		DefFunContext _localctx = new DefFunContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(DEFFUNKEY);
			setState(84);
			match(ID);
			setState(85);
			match(LPAREN);
			setState(86);
			fields();
			setState(87);
			match(RPAREN);
			setState(88);
			match(LBRACE);
			setState(89);
			exp(0);
			setState(90);
			match(RBRACE);
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
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\2\3\4\n\2\4\6\b\n\f\16\20\2\4\3\2\6\7\3\2\4\5"+
		"b\2\22\3\2\2\2\4 \3\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n@\3\2\2\2\fC\3\2"+
		"\2\2\16I\3\2\2\2\20U\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\b\3\1\2"+
		"\25!\5\6\4\2\26!\5\b\5\2\27\30\7\n\2\2\30\31\5\4\3\2\31\32\7\13\2\2\32"+
		"!\3\2\2\2\33!\7\22\2\2\34!\7\16\2\2\35!\5\f\7\2\36!\5\20\t\2\37!\3\2\2"+
		"\2 \24\3\2\2\2 \26\3\2\2\2 \27\3\2\2\2 \33\3\2\2\2 \34\3\2\2\2 \35\3\2"+
		"\2\2 \36\3\2\2\2 \37\3\2\2\2!\60\3\2\2\2\"#\f\13\2\2#$\t\2\2\2$/\5\4\3"+
		"\f%&\f\n\2\2&\'\t\3\2\2\'/\5\4\3\13()\f\b\2\2)*\7\3\2\2*+\5\4\3\2+,\7"+
		"\b\2\2,-\5\4\3\t-/\3\2\2\2.\"\3\2\2\2.%\3\2\2\2.(\3\2\2\2/\62\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\7\16\2\2\64"+
		"\65\7\17\2\2\65\66\7\16\2\2\66\7\3\2\2\2\678\7\17\2\289\7\16\2\29\t\3"+
		"\2\2\2:;\7\22\2\2;<\7\b\2\2<=\7\22\2\2=?\7\t\2\2>:\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2A\13\3\2\2\2B@\3\2\2\2CD\7\20\2\2DE\7\22\2\2EF\7\f"+
		"\2\2FG\5\n\6\2GH\7\r\2\2H\r\3\2\2\2IJ\7\22\2\2JK\7\b\2\2KR\7\22\2\2LM"+
		"\7\t\2\2MN\7\22\2\2NO\7\b\2\2OQ\7\22\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\17\3\2\2\2TR\3\2\2\2UV\7\21\2\2VW\7\22\2\2WX\7\n\2\2XY\5\16"+
		"\b\2YZ\7\13\2\2Z[\7\f\2\2[\\\5\4\3\2\\]\7\r\2\2]\21\3\2\2\2\7 .\60@R";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}