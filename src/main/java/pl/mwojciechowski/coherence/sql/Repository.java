package pl.mwojciechowski.coherence.sql;

import com.tangosol.util.Filter;

import java.util.Map;
import java.util.Set;

/**
 * @author Michal Wojciechowski
 */
public interface Repository<Key, Value> {

    Class<Key> getKeyClass();

    Class<Value> getValueClass();

    Set<Key> keySet(Filter filter);

    Set<Map.Entry<Key, Value>> entrySet(Filter filter);
}
