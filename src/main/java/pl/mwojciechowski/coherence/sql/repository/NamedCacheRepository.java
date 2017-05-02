package pl.mwojciechowski.coherence.sql.repository;

import com.google.common.reflect.TypeToken;
import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.net.cache.TypeAssertion;
import com.tangosol.util.Filter;
import org.apache.commons.lang3.Validate;
import pl.mwojciechowski.coherence.sql.annotations.PofConstructor;
import pl.mwojciechowski.coherence.sql.codecs.ClassCodec;

import java.util.Map;
import java.util.Set;

/**
 * @author Michal Wojciechowski
 */
@Portable
public class NamedCacheRepository<Key, Value> implements Repository<Key, Value> {

    @PortableProperty(value = 0)
    private String cacheName;

    @PortableProperty(value = 1, codec = ClassCodec.class)
    private Class<Key> keyClass;

    @PortableProperty(value = 2, codec = ClassCodec.class)
    private Class<Value> valueClass;

    private transient NamedCache<Key, Value> cache;

    @PofConstructor
    public NamedCacheRepository() {
        // Do nothing
    }

    /**
     * Constructor available only for classes directly extending {@link NamedCacheRepository}.
     */
    protected NamedCacheRepository(String cacheName) {
        /* The following lines prevent me from calling the parent constructor */
        TypeToken<Key> keyTypeToken = new TypeToken<Key>(getClass()) {
        };
        TypeToken<Value> valueTypeToken = new TypeToken<Value>(getClass()) {
        };
        internalConstructor(cache.getCacheName(), (Class<Key>) keyTypeToken.getRawType(), (Class<Value>) valueTypeToken.getRawType());
    }

    public NamedCacheRepository(String cacheName, Class<Key> keyClass, Class<Value> valueClass) {
        internalConstructor(cache.getCacheName(), keyClass, valueClass);
    }

    public NamedCacheRepository(NamedCache<Key, Value> cache, Class<Key> keyClass, Class<Value> valueClass) {
        this.cache = Validate.notNull(cache, "namedCache cannot be null");
        internalConstructor(cache.getCacheName(), keyClass, valueClass);
    }

    private void internalConstructor(String cacheName, Class<Key> keyClass, Class<Value> valueClass) {
        this.cacheName = Validate.notEmpty(cacheName, "cacheName cannot be empty");
        this.keyClass = Validate.notNull(keyClass, "keyClass cannot be null");
        this.valueClass = Validate.notNull(valueClass, "valueClass cannot be null");
    }

    @Override
    public Class<Key> getKeyClass() {
        return keyClass;
    }

    @Override
    public Class<Value> getValueClass() {
        return valueClass;
    }

    @Override
    public Set<Key> keySet(Filter filter) {
        return cache().keySet(filter);
    }

    @Override
    public Set<Map.Entry<Key, Value>> entrySet(Filter filter) {
        return cache().entrySet(filter);
    }

    @Override
    public RepositoryFactory<Key, Value> provideFactory() {
        return new NamedCacheRepositoryFactory<>(this);
    }

    private NamedCache<Key, Value> cache() {
        if (cache == null) {
            CacheFactory.getTypedCache(cacheName, TypeAssertion.withTypes(keyClass, valueClass));
        }
        return cache;
    }
}
