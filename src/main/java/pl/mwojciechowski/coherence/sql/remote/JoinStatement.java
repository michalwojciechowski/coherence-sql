package pl.mwojciechowski.coherence.sql.remote;

import lombok.AllArgsConstructor;
import pl.mwojciechowski.coherence.sql.repository.RepositoryFactory;

/**
 * @author Michal Wojciechowski
 */
@AllArgsConstructor
public class JoinStatement<Key, Value> {
    private RepositoryFactory<Key, Value> repositoryFactory;
}
