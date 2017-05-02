package pl.mwojciechowski.coherence.sql.remote;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.util.List;

/**
 * @author Michal Wojciechowski
 */
@AllArgsConstructor
@Builder
@ToString
public class Query {

    private SelectStatement selectStatement;
    private List<JoinStatement> joinStatements;
}
