package pl.mwojciechowski.coherence.sql;

import lombok.Builder;
import pl.mwojciechowski.coherence.sql.extractors.*;

/**
 * @author Michal Wojciechowski
 */
@Builder
public class Configuration {

    private ValueExtractorFactory valueExtractorFactory;

    public Configuration(ValueExtractorFactory valueExtractorFactory) {
        this.valueExtractorFactory = valueExtractorFactory == null ? defaultExtractorFactory() : valueExtractorFactory;
    }

    public ValueExtractorFactory defaultExtractorFactory() {
        return new RootPropertiesExtractorFactory(
                new OptimisticExtractorFactory(
                        new ReflectionExtractorFactory(),
                        new PofExtractorFactory())
        );
    }
}
