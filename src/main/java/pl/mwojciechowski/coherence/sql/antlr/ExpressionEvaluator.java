package pl.mwojciechowski.coherence.sql.antlr;

import pl.mwojciechowski.coherence.sql.InvalidConfigurationException;
import pl.mwojciechowski.coherence.sql.remote.BeanFactory;
import pl.mwojciechowski.coherence.sql.repository.Repository;

/**
 * @author Michal Wojciechowski
 */
public class ExpressionEvaluator {

    private BeanFactory beanFactory;

    public ExpressionEvaluator(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public <Key, Value> Repository<Key, Value> supplyRepository(String expression) {
        Repository result = beanFactory.provideBeanByName(expression);

        if (result == null) {
            throw new InvalidConfigurationException(
                    String.format("Cannot find a repository associate with the given name: [%s]. " +
                            "Are you sure that your configuration is ok?", expression));
        }

        return result;
    }
}
