package pl.mwojciechowski.coherence.sql.remote;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;
import lombok.AllArgsConstructor;
import pl.mwojciechowski.coherence.sql.NamedCacheRepository;
import pl.mwojciechowski.coherence.sql.Repository;

/**
 * @author Michal Wojciechowski
 */
@Portable
@AllArgsConstructor
public class NamedCacheRepositoryFactory<Key, Value> implements RepositoryFactory<Key, Value> {

    @PortableProperty(value = 0)
    private NamedCacheRepository<Key, Value> namedCacheRepository;

    @Override
    public Repository<Key, Value> get() {
        return namedCacheRepository;
    }
}
