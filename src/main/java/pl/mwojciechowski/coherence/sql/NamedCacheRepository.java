package pl.mwojciechowski.coherence.sql;

import com.google.common.reflect.TypeToken;
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.net.cache.TypeAssertion;
import com.tangosol.util.Filter;
import org.apache.commons.lang3.Validate;

import java.util.Map;
import java.util.Set;

/**
 * @author Michal Wojciechowski
 */
public class NamedCacheRepository<Key, Value> implements Repository<Key, Value> {

    private String cacheName;
    private NamedCache<Key, Value> cache;
    private Class<Key> keyClass;
    private Class<Value> valueClass;

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

    private NamedCache<Key, Value> cache() {
        if (cache == null) {
            CacheFactory.getTypedCache(cacheName, TypeAssertion.withTypes(keyClass, valueClass));
        }
        return cache;
    }
}
