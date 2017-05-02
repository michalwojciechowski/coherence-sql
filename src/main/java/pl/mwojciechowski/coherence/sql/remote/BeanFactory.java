package pl.mwojciechowski.coherence.sql.remote;

import com.tangosol.util.function.Remote;

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

    class DefaultFallbackBeanFactory implements BeanFactory {

        @Override
        public <T> T provideBeanByName(String beanName) {
            return null;
        }
    }
}
