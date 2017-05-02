package pl.mwojciechowski.coherence.sql.remote;

import com.tangosol.util.function.Remote;
import pl.mwojciechowski.coherence.sql.repository.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Michal Wojciechowski
 */
@FunctionalInterface
public interface BeanFactory extends Remote.Function<String, Object> {

    <T> T provideBeanByName(String beanName);

    @Override
    default Object apply(String beanName) {
        return provideBeanByName(beanName);
    }

    class SimpleMap implements BeanFactory {

        private Map<String, Object> beansByName = new HashMap<>();

        public SimpleMap registerRepositories(Repository<?, ?>... repositories) {
            Stream.of(repositories).forEach(repository -> beansByName.put(repository.getDetaultAlias(), repository));
            return this;
        }

        public SimpleMap registerRepository(Repository<?, ?> repository, String... aliases) {
            Stream.concat(Stream.of(repository.getDetaultAlias()), Stream.of(aliases))
                    .forEach(alias -> beansByName.put(alias, repository));
            return this;
        }

        public SimpleMap registerBean(String name, Object bean) {
            beansByName.put(name, bean);
            return this;
        }

        @Override
        public <T> T provideBeanByName(String beanName) {
            return (T) beansByName.get(beanName);
        }
    }
}
