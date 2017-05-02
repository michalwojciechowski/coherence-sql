package pl.mwojciechowski.coherence.sql.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author Michal Wojciechowski
 */
public interface EmptyVisitor<T> extends SqlGrammarVisitor<T> {

    @Override
    default T visitSqlClauses(SqlGrammarParser.SqlClausesContext ctx) {
        return null;
    }

    @Override
    default T visitSqlClause(SqlGrammarParser.SqlClauseContext ctx) {
        return null;
    }

    @Override
    default T visitDmlClause(SqlGrammarParser.DmlClauseContext ctx) {
        return null;
    }

    @Override
    default T visitSelectStatement(SqlGrammarParser.SelectStatementContext ctx) {
        return null;
    }

    @Override
    default T visitUnaryOperatorExpression(SqlGrammarParser.UnaryOperatorExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitPrimitiveExpression(SqlGrammarParser.PrimitiveExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitCaseExpression(SqlGrammarParser.CaseExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitFunctionCallExpression(SqlGrammarParser.FunctionCallExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitColumnRefExpression(SqlGrammarParser.ColumnRefExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitBracketExpression(SqlGrammarParser.BracketExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitSubqueryExpression(SqlGrammarParser.SubqueryExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitBinaryOperatorExpression(SqlGrammarParser.BinaryOperatorExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitConstantExpression(SqlGrammarParser.ConstantExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitSubquery(SqlGrammarParser.SubqueryContext ctx) {
        return null;
    }

    @Override
    default T visitSearchCondition(SqlGrammarParser.SearchConditionContext ctx) {
        return null;
    }

    @Override
    default T visitSearchConditionAnd(SqlGrammarParser.SearchConditionAndContext ctx) {
        return null;
    }

    @Override
    default T visitSearchConditionNot(SqlGrammarParser.SearchConditionNotContext ctx) {
        return null;
    }

    @Override
    default T visitPredicate(SqlGrammarParser.PredicateContext ctx) {
        return null;
    }

    @Override
    default T visitQueryExpression(SqlGrammarParser.QueryExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitUnion(SqlGrammarParser.UnionContext ctx) {
        return null;
    }

    @Override
    default T visitQuerySpecification(SqlGrammarParser.QuerySpecificationContext ctx) {
        return null;
    }

    @Override
    default T visitOrderByClause(SqlGrammarParser.OrderByClauseContext ctx) {
        return null;
    }

    @Override
    default T visitOrderByExpression(SqlGrammarParser.OrderByExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitGroupByItem(SqlGrammarParser.GroupByItemContext ctx) {
        return null;
    }

    @Override
    default T visitOptionClause(SqlGrammarParser.OptionClauseContext ctx) {
        return null;
    }

    @Override
    default T visitOption(SqlGrammarParser.OptionContext ctx) {
        return null;
    }

    @Override
    default T visitSelectList(SqlGrammarParser.SelectListContext ctx) {
        return null;
    }

    @Override
    default T visitSelectListElem(SqlGrammarParser.SelectListElemContext ctx) {
        return null;
    }

    @Override
    default T visitTableSources(SqlGrammarParser.TableSourcesContext ctx) {
        return null;
    }

    @Override
    default T visitTableSource(SqlGrammarParser.TableSourceContext ctx) {
        return null;
    }

    @Override
    default T visitTableSourceItemJoined(SqlGrammarParser.TableSourceItemJoinedContext ctx) {
        return null;
    }

    @Override
    default T visitTableSourceItem(SqlGrammarParser.TableSourceItemContext ctx) {
        return null;
    }

    @Override
    default T visitChangeTable(SqlGrammarParser.ChangeTableContext ctx) {
        return null;
    }

    @Override
    default T visitJoinPart(SqlGrammarParser.JoinPartContext ctx) {
        return null;
    }

    @Override
    default T visitTableNameWithHint(SqlGrammarParser.TableNameWithHintContext ctx) {
        return null;
    }

    @Override
    default T visitDerivedTable(SqlGrammarParser.DerivedTableContext ctx) {
        return null;
    }

    @Override
    default T visitFunctionCall(SqlGrammarParser.FunctionCallContext ctx) {
        return null;
    }

    @Override
    default T visitSwitchSection(SqlGrammarParser.SwitchSectionContext ctx) {
        return null;
    }

    @Override
    default T visitSwitchSearchConditionSection(SqlGrammarParser.SwitchSearchConditionSectionContext ctx) {
        return null;
    }

    @Override
    default T visitAsTableAlias(SqlGrammarParser.AsTableAliasContext ctx) {
        return null;
    }

    @Override
    default T visitTableAlias(SqlGrammarParser.TableAliasContext ctx) {
        return null;
    }

    @Override
    default T visitColumnAliasList(SqlGrammarParser.ColumnAliasListContext ctx) {
        return null;
    }

    @Override
    default T visitColumnAlias(SqlGrammarParser.ColumnAliasContext ctx) {
        return null;
    }

    @Override
    default T visitExpressionList(SqlGrammarParser.ExpressionListContext ctx) {
        return null;
    }

    @Override
    default T visitAggregateWindowedFunction(SqlGrammarParser.AggregateWindowedFunctionContext ctx) {
        return null;
    }

    @Override
    default T visitAllDistinctExpression(SqlGrammarParser.AllDistinctExpressionContext ctx) {
        return null;
    }

    @Override
    default T visitTableName(SqlGrammarParser.TableNameContext ctx) {
        return null;
    }

    @Override
    default T visitFuncProcName(SqlGrammarParser.FuncProcNameContext ctx) {
        return null;
    }

    @Override
    default T visitFullColumnName(SqlGrammarParser.FullColumnNameContext ctx) {
        return null;
    }

    @Override
    default T visitNullNotnull(SqlGrammarParser.NullNotnullContext ctx) {
        return null;
    }

    @Override
    default T visitScalarFunctionName(SqlGrammarParser.ScalarFunctionNameContext ctx) {
        return null;
    }

    @Override
    default T visitDataType(SqlGrammarParser.DataTypeContext ctx) {
        return null;
    }

    @Override
    default T visitConstant(SqlGrammarParser.ConstantContext ctx) {
        return null;
    }

    @Override
    default T visitSign(SqlGrammarParser.SignContext ctx) {
        return null;
    }

    @Override
    default T visitComplexId(SqlGrammarParser.ComplexIdContext ctx) {
        return null;
    }

    @Override
    default T visitId(SqlGrammarParser.IdContext ctx) {
        return null;
    }

    @Override
    default T visitSimpleId(SqlGrammarParser.SimpleIdContext ctx) {
        return null;
    }

    @Override
    default T visitComparisonOperator(SqlGrammarParser.ComparisonOperatorContext ctx) {
        return null;
    }

    @Override
    default T visit(ParseTree tree) {
        return null;
    }


    @Override
    default T visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    default T visitErrorNode(ErrorNode node) {
        return null;
    }
}
