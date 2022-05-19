// Generated from edu/duke/proj/input.g4 by ANTLR 4.5
package edu.duke.proj;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link inputParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface inputVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link inputParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(inputParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExp(inputParser.ParensExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(inputParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollExp(inputParser.RollExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleRollExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRollExp(inputParser.SingleRollExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExp(inputParser.ConditionalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExp(inputParser.ArithmeticExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExp}
	 * labeled alternative in {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExp(inputParser.ValueExpContext ctx);
}