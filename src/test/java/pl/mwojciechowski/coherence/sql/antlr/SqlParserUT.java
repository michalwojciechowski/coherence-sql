package pl.mwojciechowski.coherence.sql.antlr;

import org.assertj.core.api.ThrowableAssert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author Michal Wojciechowski
 */
public class SqlParserUT {

    private SqlParser sqlParser = new SqlParser();

    @Test
    public void shouldFailOnInvalidSelectKeyword() {
        // given
        String query = "selectx * from cars";

        // when
        ThrowableAssert.ThrowingCallable when = () -> sqlParser.parse(query);

        // then
        assertThatThrownBy(when).isInstanceOf(InvalidQueryException.class);
    }
}