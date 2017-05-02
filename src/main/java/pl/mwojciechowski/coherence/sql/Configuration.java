package pl.mwojciechowski.coherence.sql;

import lombok.AllArgsConstructor;
import lombok.Builder;
import pl.mwojciechowski.coherence.sql.extractors.*;
import pl.mwojciechowski.coherence.sql.remote.BeanFactory;

/**
 * @author Michal Wojciechowski
 */
@Builder
@AllArgsConstructor
public class Configuration {

    private BeanFactory beanFactory;
    private ValueExtractorFactory valueExtractorFactory;

    public Configuration(BeanFactory beanFactory) {
        this(beanFactory, defaultExtractorFactory());
    }

    public static ValueExtractorFactory defaultExtractorFactory() {
        return new RootPropertiesExtractorFactory(
                new OptimisticExtractorFactory(
                        new ReflectionExtractorFactory(),
                        new PofExtractorFactory())
        );
    }
}
