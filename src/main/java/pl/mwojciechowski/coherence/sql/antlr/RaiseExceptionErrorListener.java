package pl.mwojciechowski.coherence.sql.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import pl.mwojciechowski.coherence.sql.InvalidQueryException;

/**
 * Allows to override default ANTLR behaviour and inform the user about the enountered errors in the actually parsed
 * SQL query.
 *
 * @author Michal Wojciechowski
 * @see SqlParser#parse(String)
 */
public class RaiseExceptionErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String humanReadableMessage = String.format("Unrecognized token at line [%s] and position [%s]:  [%s]",
                line, charPositionInLine, msg);

        throw new InvalidQueryException(humanReadableMessage, e);
    }
}
