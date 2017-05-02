package pl.mwojciechowski.coherence.sql;

import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.Validate;
import pl.mwojciechowski.coherence.sql.antlr.ExpressionEvaluator;
import pl.mwojciechowski.coherence.sql.antlr.SqlParser;
import pl.mwojciechowski.coherence.sql.extractors.*;
import pl.mwojciechowski.coherence.sql.remote.BeanFactory;

/**
 * @author Michal Wojciechowski
 */
@Builder
@Getter
public class Configuration {

    private BeanFactory beanFactory;
    private SqlParser sqlParser;
    private ExpressionEvaluator expressionEvaluator;
    private ValueExtractorFactory valueExtractorFactory;

    public Configuration(BeanFactory beanFactory) {
        this(beanFactory, null, null, null);
    }

    public Configuration(BeanFactory beanFactory,
                         SqlParser sqlParser,
                         ExpressionEvaluator expressionEvaluator,
                         ValueExtractorFactory valueExtractorFactory) {

        this.beanFactory = Validate.notNull(beanFactory, "beanFactory cannot be null");
        this.sqlParser = sqlParser == null ? defaultSqlParser() : sqlParser;
        this.expressionEvaluator = expressionEvaluator == null ? defaultExpressionEvaluator(beanFactory) : expressionEvaluator;
        this.valueExtractorFactory = valueExtractorFactory == null ? defaultExtractorFactory() : valueExtractorFactory;
    }

    public static ValueExtractorFactory defaultExtractorFactory() {
        return new RootPropertiesExtractorFactory(
                new OptimisticExtractorFactory(
                        new ReflectionExtractorFactory(),
                        new PofExtractorFactory())
        );
    }

    public static SqlParser defaultSqlParser() {
        return new SqlParser();
    }

    public static ExpressionEvaluator defaultExpressionEvaluator(BeanFactory beanFactory) {
        return new ExpressionEvaluator(beanFactory);
    }
}
