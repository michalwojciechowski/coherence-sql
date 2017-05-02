package pl.mwojciechowski.coherence.sql;

/**
 * @author Michal Wojciechowski
 */
public class InvalidConfigurationException extends RuntimeException {

    public InvalidConfigurationException(String message) {
        super(message);
    }

    public InvalidConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidConfigurationException(Throwable cause) {
        super(cause);
    }

    protected InvalidConfigurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
