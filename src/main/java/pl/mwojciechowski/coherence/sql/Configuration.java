package pl.mwojciechowski.coherence.sql;

import com.tangosol.util.function.Remote;
import lombok.AllArgsConstructor;
import lombok.Builder;
import pl.mwojciechowski.coherence.sql.extractors.*;

/**
 * @author Michal Wojciechowski
 */
@Builder
@AllArgsConstructor
public class Configuration {

    private Remote.Function<String, Object> beanFactory;
    private ValueExtractorFactory valueExtractorFactory;

    public Configuration(Remote.Function<String, Object> beanFactory) {
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
