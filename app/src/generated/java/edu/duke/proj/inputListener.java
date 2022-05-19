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
	 * Enter a parse tree produced by the {@code parensExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParensExp(inputParser.ParensExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParensExp(inputParser.ParensExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(inputParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(inputParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rollExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRollExp(inputParser.RollExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rollExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRollExp(inputParser.RollExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleRollExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSingleRollExp(inputParser.SingleRollExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleRollExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSingleRollExp(inputParser.SingleRollExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExp(inputParser.ConditionalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExp(inputParser.ConditionalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExp(inputParser.ArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExp(inputParser.ArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterValueExp(inputParser.ValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitValueExp(inputParser.ValueExpContext ctx);
}