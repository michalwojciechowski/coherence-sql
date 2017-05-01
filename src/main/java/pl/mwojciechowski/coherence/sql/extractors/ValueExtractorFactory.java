package pl.mwojciechowski.coherence.sql.extractors;

import com.tangosol.util.ValueExtractor;

import java.util.List;

/**
 * @author Michal Wojciechowski
 */
public interface ValueExtractorFactory {

    <T> ValueExtractor provideExtractorForKey(Class<T> keyClass, List<String> chainOfProperties);

    <T> ValueExtractor provideExtractorForValue(Class<T> valueClass, List<String> chainOfProperties);
}
