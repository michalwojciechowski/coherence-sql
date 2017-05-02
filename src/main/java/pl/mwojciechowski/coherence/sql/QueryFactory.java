package pl.mwojciechowski.coherence.sql;

import lombok.extern.log4j.Log4j2;
import pl.mwojciechowski.coherence.sql.antlr.ExpressionEvaluator;
import pl.mwojciechowski.coherence.sql.antlr.QueryVisitor;
import pl.mwojciechowski.coherence.sql.antlr.SqlGrammarParser;
import pl.mwojciechowski.coherence.sql.antlr.SqlParser;
import pl.mwojciechowski.coherence.sql.remote.Query;

/**
 * @author Michal Wojciechowski
 */
@Log4j2
public class QueryFactory {

    private Configuration configuration;

    public QueryFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public Result<Tuple> execute(String rawQuery) {

        log.trace("About to parse sql query: [{}]", rawQuery);
        SqlParser sqlParser = configuration.getSqlParser();
        SqlGrammarParser.SelectStatementContext statement = sqlParser.parse(rawQuery);

        log.trace("About to review the object oriented representation of the query: [{}]", statement);
        ExpressionEvaluator expressionEvaluator = configuration.getExpressionEvaluator();
        QueryVisitor visitor = new QueryVisitor(expressionEvaluator);
        statement.accept(visitor);

        log.trace("About to build a fully operative query");
        Query.QueryBuilder queryBuilder = visitor.getQueryBuilder();
        Query query = queryBuilder.build();

        return null;
    }
}
