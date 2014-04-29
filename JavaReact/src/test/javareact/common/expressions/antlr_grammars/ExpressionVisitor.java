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
	 * Visit a parse tree produced by {@link ExpressionParser#Double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(@NotNull ExpressionParser.DoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ExpressionParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listDigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDigit(@NotNull ExpressionParser.ListDigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull ExpressionParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBool(@NotNull ExpressionParser.IdBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AllTrueFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTrueFalse(@NotNull ExpressionParser.AllTrueFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNum(@NotNull ExpressionParser.EqualNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AvgSumListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgSumListInt(@NotNull ExpressionParser.AvgSumListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListString(@NotNull ExpressionParser.IdListStringContext ctx);

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
	 * Visit a parse tree produced by {@link ExpressionParser#ContainsBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsBool(@NotNull ExpressionParser.ContainsBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualString(@NotNull ExpressionParser.EqualStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListDigit_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDigit_Label(@NotNull ExpressionParser.ListDigit_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListBool(@NotNull ExpressionParser.IdListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#seqString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqString(@NotNull ExpressionParser.SeqStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull ExpressionParser.MulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdString(@NotNull ExpressionParser.IdStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#OrderListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderListString(@NotNull ExpressionParser.OrderListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#MinMaxMineqMaxeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinMaxMineqMaxeq(@NotNull ExpressionParser.MinMaxMineqMaxeqContext ctx);

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
	 * Visit a parse tree produced by {@link ExpressionParser#listBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBool(@NotNull ExpressionParser.ListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#FilterListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterListInt(@NotNull ExpressionParser.FilterListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListString(@NotNull ExpressionParser.ListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(@NotNull ExpressionParser.ListExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AndOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(@NotNull ExpressionParser.AndOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ContainsInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsInt(@NotNull ExpressionParser.ContainsIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#seqInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqInt(@NotNull ExpressionParser.SeqIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualBool(@NotNull ExpressionParser.EqualBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ContainsString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsString(@NotNull ExpressionParser.ContainsStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull ExpressionParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#OrderListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderListInt(@NotNull ExpressionParser.OrderListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListString_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListString_Label(@NotNull ExpressionParser.ListString_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IsAscIsDescInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsAscIsDescInt(@NotNull ExpressionParser.IsAscIsDescIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualList(@NotNull ExpressionParser.EqualListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensBool(@NotNull ExpressionParser.ParensBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListInt(@NotNull ExpressionParser.IdListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull ExpressionParser.NotContext ctx);

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
	 * Visit a parse tree produced by {@link ExpressionParser#ListBool_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBool_Label(@NotNull ExpressionParser.ListBool_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#seqBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqBool(@NotNull ExpressionParser.SeqBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull ExpressionParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ExpressionParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SizeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeList(@NotNull ExpressionParser.SizeListContext ctx);
}