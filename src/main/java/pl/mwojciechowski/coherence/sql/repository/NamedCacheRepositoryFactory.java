package pl.mwojciechowski.coherence.sql.repository;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author Michal Wojciechowski
 */
@Portable
@AllArgsConstructor
@ToString
public class NamedCacheRepositoryFactory<Key, Value> implements RepositoryFactory<Key, Value> {

    @PortableProperty(value = 0)
    private NamedCacheRepository<Key, Value> namedCacheRepository;

    @Override
    public Repository<Key, Value> get() {
        return namedCacheRepository;
    }
}
