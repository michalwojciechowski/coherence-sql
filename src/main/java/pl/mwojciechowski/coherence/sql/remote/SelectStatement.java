package pl.mwojciechowski.coherence.sql.remote;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import pl.mwojciechowski.coherence.sql.repository.RepositoryFactory;

/**
 * @author Michal Wojciechowski
 */
@AllArgsConstructor
@Builder
@ToString
public class SelectStatement<Key, Value> {
    private RepositoryFactory<Key, Value> repositoryFactory;
}
