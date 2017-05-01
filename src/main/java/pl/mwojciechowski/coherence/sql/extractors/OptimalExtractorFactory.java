package pl.mwojciechowski.coherence.sql.extractors;

import com.tangosol.util.ValueExtractor;

import java.util.List;

/**
 * @author Michal Wojciechowski
 */
public class OptimalExtractorFactory implements ValueExtractorFactory {

    private ReflectionExtractorFactory reflectionExtractorFactory;
    private PofExtractorFactory pofExtractorFactory;

    public OptimalExtractorFactory(ReflectionExtractorFactory reflectionExtractorFactory, PofExtractorFactory pofExtractorFactory) {
        this.reflectionExtractorFactory = reflectionExtractorFactory;
        this.pofExtractorFactory = pofExtractorFactory;
    }

    @Override
    public <T> ValueExtractor provideExtractorForKey(Class<T> keyClass, List<String> chainOfProperties) {
        try {
            return pofExtractorFactory.provideExtractorForKey(keyClass, chainOfProperties);
        } catch (Exception e) {
            return reflectionExtractorFactory.provideExtractorForKey(keyClass, chainOfProperties);
        }
    }

    @Override
    public <T> ValueExtractor provideExtractorForValue(Class<T> valueClass, List<String> chainOfProperties) {
        try {
            return pofExtractorFactory.provideExtractorForValue(valueClass, chainOfProperties);
        } catch (Exception e) {
            return reflectionExtractorFactory.provideExtractorForValue(valueClass, chainOfProperties);
        }
    }
}
