package pl.mwojciechowski.coherence.sql.extractors;

import com.tangosol.util.ValueExtractor;
import com.tangosol.util.extractor.IdentityExtractor;
import com.tangosol.util.extractor.KeyExtractor;

import java.util.List;

/**
 * @author Michal Wojciechowski
 */
public class RootPropertiesExtractorFactory implements ValueExtractorFactory {

    private ValueExtractorFactory delegate;

    public RootPropertiesExtractorFactory(ValueExtractorFactory delegate) {
        this.delegate = delegate;
    }

    @Override
    public <T> ValueExtractor provideExtractorForKey(Class<T> keyClass, List<String> chainOfProperties) {
        if (chainOfProperties.isEmpty()) {
            return new KeyExtractor(new IdentityExtractor<>());
        }

        return delegate.provideExtractorForKey(keyClass, chainOfProperties);
    }

    @Override
    public <T> ValueExtractor provideExtractorForValue(Class<T> valueClass, List<String> chainOfProperties) {
        if (chainOfProperties.isEmpty()) {
            return new IdentityExtractor<>();
        }

        return delegate.provideExtractorForValue(valueClass, chainOfProperties);
    }
}
