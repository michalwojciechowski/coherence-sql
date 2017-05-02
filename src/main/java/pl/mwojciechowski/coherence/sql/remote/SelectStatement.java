package pl.mwojciechowski.coherence.sql.remote;

import lombok.AllArgsConstructor;
import pl.mwojciechowski.coherence.sql.repository.RepositoryFactory;

/**
 * @author Michal Wojciechowski
 */
@AllArgsConstructor
public class SelectStatement<Key, Value> {
    private RepositoryFactory<Key, Value> repositoryFactory;
}
