// Generated from C:/Development/coherence-sql/src/main/resources\SqlGrammar.g4 by ANTLR 4.7
package pl.mwojciechowski.coherence.sql.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlGrammarParser}.
 */
public interface SqlGrammarListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#sqlClauses}.
     *
     * @param ctx the parse tree
     */
    void enterSqlClauses(SqlGrammarParser.SqlClausesContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#sqlClauses}.
     *
     * @param ctx the parse tree
     */
    void exitSqlClauses(SqlGrammarParser.SqlClausesContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#sqlClause}.
     *
     * @param ctx the parse tree
     */
    void enterSqlClause(SqlGrammarParser.SqlClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#sqlClause}.
     *
     * @param ctx the parse tree
     */
    void exitSqlClause(SqlGrammarParser.SqlClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#dmlClause}.
     *
     * @param ctx the parse tree
     */
    void enterDmlClause(SqlGrammarParser.DmlClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#dmlClause}.
     *
     * @param ctx the parse tree
     */
    void exitDmlClause(SqlGrammarParser.DmlClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectStatement(SqlGrammarParser.SelectStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectStatement(SqlGrammarParser.SelectStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code unaryOperatorExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryOperatorExpression(SqlGrammarParser.UnaryOperatorExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code unaryOperatorExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryOperatorExpression(SqlGrammarParser.UnaryOperatorExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code primitiveExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveExpression(SqlGrammarParser.PrimitiveExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code primitiveExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveExpression(SqlGrammarParser.PrimitiveExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code column_refExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterColumn_refExpression(SqlGrammarParser.Column_refExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code column_refExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitColumn_refExpression(SqlGrammarParser.Column_refExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code caseExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterCaseExpression(SqlGrammarParser.CaseExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code caseExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitCaseExpression(SqlGrammarParser.CaseExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCallExpression(SqlGrammarParser.FunctionCallExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCallExpression(SqlGrammarParser.FunctionCallExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code bracketExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterBracketExpression(SqlGrammarParser.BracketExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code bracketExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitBracketExpression(SqlGrammarParser.BracketExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code subqueryExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterSubqueryExpression(SqlGrammarParser.SubqueryExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code subqueryExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitSubqueryExpression(SqlGrammarParser.SubqueryExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code binaryOperatorExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterBinaryOperatorExpression(SqlGrammarParser.BinaryOperatorExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code binaryOperatorExpression}
     * labeled alternative in {@link SqlGrammarParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitBinaryOperatorExpression(SqlGrammarParser.BinaryOperatorExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#constantExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConstantExpression(SqlGrammarParser.ConstantExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#constantExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConstantExpression(SqlGrammarParser.ConstantExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#subquery}.
     *
     * @param ctx the parse tree
     */
    void enterSubquery(SqlGrammarParser.SubqueryContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#subquery}.
     *
     * @param ctx the parse tree
     */
    void exitSubquery(SqlGrammarParser.SubqueryContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#searchCondition}.
     *
     * @param ctx the parse tree
     */
    void enterSearchCondition(SqlGrammarParser.SearchConditionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#searchCondition}.
     *
     * @param ctx the parse tree
     */
    void exitSearchCondition(SqlGrammarParser.SearchConditionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#searchConditionAnd}.
     *
     * @param ctx the parse tree
     */
    void enterSearchConditionAnd(SqlGrammarParser.SearchConditionAndContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#searchConditionAnd}.
     *
     * @param ctx the parse tree
     */
    void exitSearchConditionAnd(SqlGrammarParser.SearchConditionAndContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#searchConditionNot}.
     *
     * @param ctx the parse tree
     */
    void enterSearchConditionNot(SqlGrammarParser.SearchConditionNotContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#searchConditionNot}.
     *
     * @param ctx the parse tree
     */
    void exitSearchConditionNot(SqlGrammarParser.SearchConditionNotContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterPredicate(SqlGrammarParser.PredicateContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitPredicate(SqlGrammarParser.PredicateContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#queryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterQueryExpression(SqlGrammarParser.QueryExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#queryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitQueryExpression(SqlGrammarParser.QueryExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#union}.
     *
     * @param ctx the parse tree
     */
    void enterUnion(SqlGrammarParser.UnionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#union}.
     *
     * @param ctx the parse tree
     */
    void exitUnion(SqlGrammarParser.UnionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#querySpecification}.
     *
     * @param ctx the parse tree
     */
    void enterQuerySpecification(SqlGrammarParser.QuerySpecificationContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#querySpecification}.
     *
     * @param ctx the parse tree
     */
    void exitQuerySpecification(SqlGrammarParser.QuerySpecificationContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#orderByClause}.
     *
     * @param ctx the parse tree
     */
    void enterOrderByClause(SqlGrammarParser.OrderByClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#orderByClause}.
     *
     * @param ctx the parse tree
     */
    void exitOrderByClause(SqlGrammarParser.OrderByClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#orderByExpression}.
     *
     * @param ctx the parse tree
     */
    void enterOrderByExpression(SqlGrammarParser.OrderByExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#orderByExpression}.
     *
     * @param ctx the parse tree
     */
    void exitOrderByExpression(SqlGrammarParser.OrderByExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#groupByItem}.
     *
     * @param ctx the parse tree
     */
    void enterGroupByItem(SqlGrammarParser.GroupByItemContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#groupByItem}.
     *
     * @param ctx the parse tree
     */
    void exitGroupByItem(SqlGrammarParser.GroupByItemContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#optionClause}.
     *
     * @param ctx the parse tree
     */
    void enterOptionClause(SqlGrammarParser.OptionClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#optionClause}.
     *
     * @param ctx the parse tree
     */
    void exitOptionClause(SqlGrammarParser.OptionClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#option}.
     *
     * @param ctx the parse tree
     */
    void enterOption(SqlGrammarParser.OptionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#option}.
     *
     * @param ctx the parse tree
     */
    void exitOption(SqlGrammarParser.OptionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#selectList}.
     *
     * @param ctx the parse tree
     */
    void enterSelectList(SqlGrammarParser.SelectListContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#selectList}.
     *
     * @param ctx the parse tree
     */
    void exitSelectList(SqlGrammarParser.SelectListContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#selectListElem}.
     *
     * @param ctx the parse tree
     */
    void enterSelectListElem(SqlGrammarParser.SelectListElemContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#selectListElem}.
     *
     * @param ctx the parse tree
     */
    void exitSelectListElem(SqlGrammarParser.SelectListElemContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableSources}.
     *
     * @param ctx the parse tree
     */
    void enterTableSources(SqlGrammarParser.TableSourcesContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableSources}.
     *
     * @param ctx the parse tree
     */
    void exitTableSources(SqlGrammarParser.TableSourcesContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void enterTableSource(SqlGrammarParser.TableSourceContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void exitTableSource(SqlGrammarParser.TableSourceContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableSourceItemJoined}.
     *
     * @param ctx the parse tree
     */
    void enterTableSourceItemJoined(SqlGrammarParser.TableSourceItemJoinedContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableSourceItemJoined}.
     *
     * @param ctx the parse tree
     */
    void exitTableSourceItemJoined(SqlGrammarParser.TableSourceItemJoinedContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void enterTableSourceItem(SqlGrammarParser.TableSourceItemContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void exitTableSourceItem(SqlGrammarParser.TableSourceItemContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#changeTable}.
     *
     * @param ctx the parse tree
     */
    void enterChangeTable(SqlGrammarParser.ChangeTableContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#changeTable}.
     *
     * @param ctx the parse tree
     */
    void exitChangeTable(SqlGrammarParser.ChangeTableContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void enterJoinPart(SqlGrammarParser.JoinPartContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void exitJoinPart(SqlGrammarParser.JoinPartContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableNameWith_hint}.
     *
     * @param ctx the parse tree
     */
    void enterTableNameWith_hint(SqlGrammarParser.TableNameWith_hintContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableNameWith_hint}.
     *
     * @param ctx the parse tree
     */
    void exitTableNameWith_hint(SqlGrammarParser.TableNameWith_hintContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#derivedTable}.
     *
     * @param ctx the parse tree
     */
    void enterDerivedTable(SqlGrammarParser.DerivedTableContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#derivedTable}.
     *
     * @param ctx the parse tree
     */
    void exitDerivedTable(SqlGrammarParser.DerivedTableContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCall(SqlGrammarParser.FunctionCallContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCall(SqlGrammarParser.FunctionCallContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#switchSection}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchSection(SqlGrammarParser.SwitchSectionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#switchSection}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchSection(SqlGrammarParser.SwitchSectionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#switchSearchConditionSection}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchSearchConditionSection(SqlGrammarParser.SwitchSearchConditionSectionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#switchSearchConditionSection}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchSearchConditionSection(SqlGrammarParser.SwitchSearchConditionSectionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#asTableAlias}.
     *
     * @param ctx the parse tree
     */
    void enterAsTableAlias(SqlGrammarParser.AsTableAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#asTableAlias}.
     *
     * @param ctx the parse tree
     */
    void exitAsTableAlias(SqlGrammarParser.AsTableAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableAlias}.
     *
     * @param ctx the parse tree
     */
    void enterTableAlias(SqlGrammarParser.TableAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableAlias}.
     *
     * @param ctx the parse tree
     */
    void exitTableAlias(SqlGrammarParser.TableAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#columnAliasList}.
     *
     * @param ctx the parse tree
     */
    void enterColumnAliasList(SqlGrammarParser.ColumnAliasListContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#columnAliasList}.
     *
     * @param ctx the parse tree
     */
    void exitColumnAliasList(SqlGrammarParser.ColumnAliasListContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#columnAlias}.
     *
     * @param ctx the parse tree
     */
    void enterColumnAlias(SqlGrammarParser.ColumnAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#columnAlias}.
     *
     * @param ctx the parse tree
     */
    void exitColumnAlias(SqlGrammarParser.ColumnAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#expressionList}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionList(SqlGrammarParser.ExpressionListContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#expressionList}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionList(SqlGrammarParser.ExpressionListContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#aggregateWindowedFunction}.
     *
     * @param ctx the parse tree
     */
    void enterAggregateWindowedFunction(SqlGrammarParser.AggregateWindowedFunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#aggregateWindowedFunction}.
     *
     * @param ctx the parse tree
     */
    void exitAggregateWindowedFunction(SqlGrammarParser.AggregateWindowedFunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#allDistinctExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAllDistinctExpression(SqlGrammarParser.AllDistinctExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#allDistinctExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAllDistinctExpression(SqlGrammarParser.AllDistinctExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#tableName}.
     *
     * @param ctx the parse tree
     */
    void enterTableName(SqlGrammarParser.TableNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#tableName}.
     *
     * @param ctx the parse tree
     */
    void exitTableName(SqlGrammarParser.TableNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#funcProcName}.
     *
     * @param ctx the parse tree
     */
    void enterFuncProcName(SqlGrammarParser.FuncProcNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#funcProcName}.
     *
     * @param ctx the parse tree
     */
    void exitFuncProcName(SqlGrammarParser.FuncProcNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#fullColumnName}.
     *
     * @param ctx the parse tree
     */
    void enterFullColumnName(SqlGrammarParser.FullColumnNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#fullColumnName}.
     *
     * @param ctx the parse tree
     */
    void exitFullColumnName(SqlGrammarParser.FullColumnNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#nullNotnull}.
     *
     * @param ctx the parse tree
     */
    void enterNullNotnull(SqlGrammarParser.NullNotnullContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#nullNotnull}.
     *
     * @param ctx the parse tree
     */
    void exitNullNotnull(SqlGrammarParser.NullNotnullContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#scalarFunctionName}.
     *
     * @param ctx the parse tree
     */
    void enterScalarFunctionName(SqlGrammarParser.ScalarFunctionNameContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#scalarFunctionName}.
     *
     * @param ctx the parse tree
     */
    void exitScalarFunctionName(SqlGrammarParser.ScalarFunctionNameContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterDataType(SqlGrammarParser.DataTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitDataType(SqlGrammarParser.DataTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(SqlGrammarParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(SqlGrammarParser.ConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#sign}.
     *
     * @param ctx the parse tree
     */
    void enterSign(SqlGrammarParser.SignContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#sign}.
     *
     * @param ctx the parse tree
     */
    void exitSign(SqlGrammarParser.SignContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#complexId}.
     *
     * @param ctx the parse tree
     */
    void enterComplexId(SqlGrammarParser.ComplexIdContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#complexId}.
     *
     * @param ctx the parse tree
     */
    void exitComplexId(SqlGrammarParser.ComplexIdContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#id}.
     *
     * @param ctx the parse tree
     */
    void enterId(SqlGrammarParser.IdContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#id}.
     *
     * @param ctx the parse tree
     */
    void exitId(SqlGrammarParser.IdContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#simpleId}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleId(SqlGrammarParser.SimpleIdContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#simpleId}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleId(SqlGrammarParser.SimpleIdContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlGrammarParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void enterComparisonOperator(SqlGrammarParser.ComparisonOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlGrammarParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void exitComparisonOperator(SqlGrammarParser.ComparisonOperatorContext ctx);
}