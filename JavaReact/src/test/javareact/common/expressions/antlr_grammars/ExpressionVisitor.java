// Generated from antlr_grammars/Expression.g4 by ANTLR 4.1
package test.javareact.common.expressions.antlr_grammars;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExpressionParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(@NotNull ExpressionParser.DoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AndOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(@NotNull ExpressionParser.AndOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBool(@NotNull ExpressionParser.IdBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull ExpressionParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNum(@NotNull ExpressionParser.EqualNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull ExpressionParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#hostId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostId(@NotNull ExpressionParser.HostIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(@NotNull ExpressionParser.ConcatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualString(@NotNull ExpressionParser.EqualStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensBool(@NotNull ExpressionParser.ParensBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull ExpressionParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull ExpressionParser.MulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#observableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableId(@NotNull ExpressionParser.ObservableIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNum(@NotNull ExpressionParser.IdNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdString(@NotNull ExpressionParser.IdStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensString(@NotNull ExpressionParser.ParensStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ExpressionParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#MinMaxMineqMaxeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinMaxMineqMaxeq(@NotNull ExpressionParser.MinMaxMineqMaxeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(@NotNull ExpressionParser.EqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull ExpressionParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensNum(@NotNull ExpressionParser.ParensNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull ExpressionParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ExpressionParser.IdentifierContext ctx);
}