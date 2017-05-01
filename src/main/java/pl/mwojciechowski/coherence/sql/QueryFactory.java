package pl.mwojciechowski.coherence.sql;

import lombok.AllArgsConstructor;
import pl.mwojciechowski.coherence.sql.antlr.SqlGrammarParser;
import pl.mwojciechowski.coherence.sql.antlr.SqlParser;

/**
 * @author Michal Wojciechowski
 */
@AllArgsConstructor
public class QueryFactory {

    private SqlParser sqlParser;

    public Result<Tuple> execute(String query) {

        SqlGrammarParser.SelectStatementContext statement = sqlParser.parse(query);
//        statement.accept(null);

        return null;
    }
}
