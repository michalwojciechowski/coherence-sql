package pl.mwojciechowski.coherence.sql.repository;

import com.tangosol.util.function.Remote;

/**
 * @author Michal Wojciechowski
 */
@FunctionalInterface
public interface RepositoryFactory<Key, Value> extends Remote.Supplier<Repository<Key, Value>> {
}
