// Generated from C:/Development/coherence-sql/src/main/resources\SqlGrammar.g4 by ANTLR 4.7
package pl.mwojciechowski.coherence.sql.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#sqlClauses}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlClauses(SqlGrammarParser.SqlClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#sqlClause}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlClause(SqlGrammarParser.SqlClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#dmlClause}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlClause(SqlGrammarParser.DmlClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#selectStatement}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SqlGrammarParser.SelectStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unaryOperatorExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperatorExpression(SqlGrammarParser.UnaryOperatorExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code primitiveExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression(SqlGrammarParser.PrimitiveExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SqlGrammarParser.CaseExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(SqlGrammarParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code columnRefExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRefExpression(SqlGrammarParser.ColumnRefExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(SqlGrammarParser.BracketExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SqlGrammarParser.SubqueryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code binaryOperatorExpression}
	 * labeled alternative in {@link SqlGrammarParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperatorExpression(SqlGrammarParser.BinaryOperatorExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#constantExpression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(SqlGrammarParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#subquery}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SqlGrammarParser.SubqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#searchCondition}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchCondition(SqlGrammarParser.SearchConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#searchConditionAnd}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchConditionAnd(SqlGrammarParser.SearchConditionAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#searchConditionNot}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchConditionNot(SqlGrammarParser.SearchConditionNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#predicate}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SqlGrammarParser.PredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#queryExpression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(SqlGrammarParser.QueryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#union}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(SqlGrammarParser.UnionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#querySpecification}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SqlGrammarParser.QuerySpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#orderByClause}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SqlGrammarParser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#orderByExpression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SqlGrammarParser.OrderByExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#groupByItem}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(SqlGrammarParser.GroupByItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#optionClause}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionClause(SqlGrammarParser.OptionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#option}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(SqlGrammarParser.OptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#selectList}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(SqlGrammarParser.SelectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#selectListElem}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectListElem(SqlGrammarParser.SelectListElemContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableSources}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(SqlGrammarParser.TableSourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableSource}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSource(SqlGrammarParser.TableSourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableSourceItemJoined}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceItemJoined(SqlGrammarParser.TableSourceItemJoinedContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableSourceItem}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceItem(SqlGrammarParser.TableSourceItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#changeTable}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeTable(SqlGrammarParser.ChangeTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#joinPart}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPart(SqlGrammarParser.JoinPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableNameWithHint}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameWithHint(SqlGrammarParser.TableNameWithHintContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#derivedTable}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedTable(SqlGrammarParser.DerivedTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#functionCall}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SqlGrammarParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#switchSection}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSection(SqlGrammarParser.SwitchSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#switchSearchConditionSection}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSearchConditionSection(SqlGrammarParser.SwitchSearchConditionSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#asTableAlias}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTableAlias(SqlGrammarParser.AsTableAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableAlias}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SqlGrammarParser.TableAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#columnAliasList}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliasList(SqlGrammarParser.ColumnAliasListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#columnAlias}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(SqlGrammarParser.ColumnAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#expressionList}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SqlGrammarParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#aggregateWindowedFunction}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(SqlGrammarParser.AggregateWindowedFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#allDistinctExpression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllDistinctExpression(SqlGrammarParser.AllDistinctExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#tableName}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlGrammarParser.TableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#funcProcName}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncProcName(SqlGrammarParser.FuncProcNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#fullColumnName}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(SqlGrammarParser.FullColumnNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#nullNotnull}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(SqlGrammarParser.NullNotnullContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#scalarFunctionName}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionName(SqlGrammarParser.ScalarFunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#dataType}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SqlGrammarParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#constant}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SqlGrammarParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#sign}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SqlGrammarParser.SignContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#complexId}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexId(SqlGrammarParser.ComplexIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#id}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SqlGrammarParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#simpleId}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleId(SqlGrammarParser.SimpleIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link SqlGrammarParser#comparisonOperator}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlGrammarParser.ComparisonOperatorContext ctx);
}