package pl.mwojciechowski.coherence.sql.remote;

import com.tangosol.util.function.Remote;
import pl.mwojciechowski.coherence.sql.Repository;

/**
 * @author Michal Wojciechowski
 */
@FunctionalInterface
public interface RepositoryFactory<Key, Value> extends Remote.Supplier<Repository<Key, Value>> {
}
