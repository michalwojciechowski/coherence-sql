package pl.mwojciechowski.coherence.sql.extractors;

import com.google.common.collect.Lists;
import com.tangosol.util.ValueExtractor;
import com.tangosol.util.extractor.AbstractExtractor;
import com.tangosol.util.extractor.ChainedExtractor;
import com.tangosol.util.extractor.ReflectionExtractor;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.text.WordUtils;
import pl.mwojciechowski.coherence.sql.InvalidQueryException;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Michal Wojciechowski
 */
public class ReflectionExtractorFactory implements ValueExtractorFactory {

    @Override
    public <T> ValueExtractor provideExtractorForKey(Class<T> keyClass, List<String> chainOfProperties) {
        return provideExtractorForValue(keyClass, AbstractExtractor.KEY, chainOfProperties);
    }

    @Override
    public <T> ValueExtractor provideExtractorForValue(Class<T> valueClass, List<String> chainOfProperties) {
        return provideExtractorForValue(valueClass, AbstractExtractor.VALUE, chainOfProperties);
    }

    private <T> ValueExtractor provideExtractorForValue(Class<T> clazz, int target, List<String> chainOfProperties) {
        Class<?> propertyClass = clazz;
        List<ValueExtractor> chainedExtractors = Lists.newArrayList();

        for (String property : chainOfProperties) {
            Class<?> finalPropertyClass = propertyClass;

            Optional<Method> matchingMethod = Stream.of(property,
                    "get" + WordUtils.capitalize(property),
                    "is" + WordUtils.capitalize(property))
                    .map(token -> MethodUtils.getMatchingMethod(finalPropertyClass, token))
                    .findFirst();

            Method method = matchingMethod.orElseThrow(
                    () -> new InvalidQueryException(
                            String.format("Cannot find appropriate method for property [%s] on class [%s]",
                                    property, finalPropertyClass)));

            ReflectionExtractor extractor = new ReflectionExtractor(method.getName());
            chainedExtractors.add(extractor);
            propertyClass = method.getDeclaringClass();
        }

        return new ChainedExtractor(chainedExtractors.toArray(new ValueExtractor[chainedExtractors.size()]));
    }
}
