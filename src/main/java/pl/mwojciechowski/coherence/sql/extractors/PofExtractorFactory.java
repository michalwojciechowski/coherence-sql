package pl.mwojciechowski.coherence.sql.extractors;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.tangosol.io.pof.annotation.PortableProperty;
import com.tangosol.io.pof.reflect.SimplePofPath;
import com.tangosol.util.ValueExtractor;
import com.tangosol.util.extractor.AbstractExtractor;
import com.tangosol.util.extractor.PofExtractor;
import pl.mwojciechowski.coherence.sql.InvalidQueryException;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author Michal Wojciechowski
 */
public class PofExtractorFactory implements ValueExtractorFactory {

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
        List<Integer> indices = Lists.newArrayList();

        for (String property : chainOfProperties) {
            Field field;
            try {
                field = clazz.getDeclaredField(property);
            } catch (NoSuchFieldException e) {
                throw new InvalidQueryException(e);
            }

            PortableProperty portablePropertyAnnotation = field.getAnnotation(PortableProperty.class);
            if (portablePropertyAnnotation == null) {
                throw new InvalidQueryException("");
            }

            // TODO add support for customs codecs some day ;)
            int index = portablePropertyAnnotation.value();
            indices.add(index);
            propertyClass = field.getDeclaringClass();
        }

        return new PofExtractor<>(propertyClass, new SimplePofPath(Ints.toArray(indices)), target);
    }
}
