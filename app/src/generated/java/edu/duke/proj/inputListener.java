// Generated from edu/duke/proj/input.g4 by ANTLR 4.5
package edu.duke.proj;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link inputParser}.
 */
public interface inputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link inputParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(inputParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(inputParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputParser#roll}.
	 * @param ctx the parse tree
	 */
	void enterRoll(inputParser.RollContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputParser#roll}.
	 * @param ctx the parse tree
	 */
	void exitRoll(inputParser.RollContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputParser#simpleRoll}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRoll(inputParser.SimpleRollContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputParser#simpleRoll}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRoll(inputParser.SimpleRollContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(inputParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(inputParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOp(inputParser.ArithmeticOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOp(inputParser.ArithmeticOpContext ctx);
}