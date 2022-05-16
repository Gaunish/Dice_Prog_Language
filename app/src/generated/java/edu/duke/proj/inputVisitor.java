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
	 * Visit a parse tree produced by {@link inputParser#roll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoll(inputParser.RollContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputParser#simpleRoll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRoll(inputParser.SimpleRollContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(inputParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link inputParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOp(inputParser.ArithmeticOpContext ctx);
}