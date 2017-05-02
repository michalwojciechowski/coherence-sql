package pl.mwojciechowski.coherence.sql;

import org.testng.annotations.Test;
import pl.mwojciechowski.coherence.sql.remote.BeanFactory;
import pl.mwojciechowski.coherence.sql.repository.NamedCacheRepository;

/**
 * @author Michal Wojciechowski
 */
public class QueryFactoryTest {

    @Test
    public void shouldDoSth() {
        // given
        NamedCacheRepository<?, ?> cars = new NamedCacheRepository<>("cars", Integer.class, Integer.class);
        NamedCacheRepository<?, ?> people = new NamedCacheRepository<>("people", Integer.class, Integer.class);
        NamedCacheRepository<?, ?> departments = new NamedCacheRepository<>("departments", Integer.class, Integer.class);

        BeanFactory.SimpleMap beanFactory = new BeanFactory.SimpleMap().registerRepositories(cars, people, departments);

        QueryFactory queryFactory = new QueryFactory(new Configuration(beanFactory));
        String query = "select * from cars c, people join departments d on d.id = c.id";

        // when
        Result<Tuple> result = queryFactory.execute(query);

        // then
    }

}