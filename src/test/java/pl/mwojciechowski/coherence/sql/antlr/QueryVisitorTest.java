package pl.mwojciechowski.coherence.sql.antlr;

import org.testng.annotations.Test;

/**
 * @author Michal Wojciechowski
 */
public class QueryVisitorTest {

    @Test
    public void shouldDoSth() {
        // given
        SqlParser sqlParser = new SqlParser();
        String query = "select * from cars c, people join departments d on d.id = c.id";

        // when
        sqlParser.parse(query);

        // then
    }

}