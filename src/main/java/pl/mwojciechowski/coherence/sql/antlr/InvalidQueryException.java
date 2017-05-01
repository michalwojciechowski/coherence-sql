package pl.mwojciechowski.coherence.sql.antlr;

/**
 * Indicates that given SQL query is invalid or incomplete.
 *
 * @author Michal Wojciechowski
 * @see SqlParser#parse(String)
 */
public class InvalidQueryException extends RuntimeException {

    public InvalidQueryException(String message) {
        super(message);
    }

    public InvalidQueryException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidQueryException(Throwable cause) {
        super(cause);
    }
}
