package pl.mwojciechowski.coherence.sql.antlr;

import com.google.common.collect.Lists;
import pl.mwojciechowski.coherence.sql.remote.JoinStatement;
import pl.mwojciechowski.coherence.sql.remote.Query;
import pl.mwojciechowski.coherence.sql.remote.SelectStatement;
import pl.mwojciechowski.coherence.sql.repository.Repository;

import java.util.List;

/**
 * @author Michal Wojciechowski
 */
public class QueryVisitor extends SqlGrammarBaseVisitor {

    private final ExpressionEvaluator expressionEvaluator;

    private boolean firstTimeEncounteredRepository;
    private List<JoinStatement> joins;
    private Query.QueryBuilder queryBuilder;

    public QueryVisitor(ExpressionEvaluator expressionEvaluator) {
        this.expressionEvaluator = expressionEvaluator;
        this.firstTimeEncounteredRepository = true;
        this.joins = Lists.newArrayList();
        this.queryBuilder = Query.builder().joinStatements(joins);
    }

    public Query.QueryBuilder getQueryBuilder() {
        return queryBuilder;
    }

    @Override
    public Object visitTableSourceItem(SqlGrammarParser.TableSourceItemContext ctx) {
        String repositoryExpression = ctx.tableNameWithHint().tableName().getText();
        Repository<?, ?> repository = expressionEvaluator.supplyRepository(repositoryExpression);

        if (firstTimeEncounteredRepository) {
            queryBuilder.selectStatement(new SelectStatement(repository.provideFactory()));
            firstTimeEncounteredRepository = false;
        } else {
            joins.add(new JoinStatement(repository.provideFactory()));
        }

        return super.visitTableSourceItem(ctx);
    }
}
