package pl.mwojciechowski.coherence.sql.antlr;

import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import static java.lang.System.currentTimeMillis;

/**
 * Main access point for parsing SQL query & transforming it into more object oriented representation.
 *
 * @author Michal Wojciechowski
 */
@Log4j2
public class SqlParser {

    /**
     * @throws InvalidQueryException if the given query contains invalid characters or is incomplete
     */
    public SqlGrammarParser.SelectStatementContext parse(String query) {
        log.trace("About to parse [{}]", query);
        long now = currentTimeMillis();

        CharStream input = CharStreams.fromString(query);
        SqlGrammarLexer lexer = new SqlGrammarLexer(input);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        SqlGrammarParser parser = new SqlGrammarParser(tokenStream);

        parser.removeErrorListeners();
        parser.addErrorListener(new RaiseExceptionErrorListener());

        SqlGrammarParser.SelectStatementContext result = parser.selectStatement();

        log.trace("Successfully parsed [{}] into [{}] in [{}ms]",
                query, result.toStringTree(parser), currentTimeMillis() - now);

        return result;
    }
}
