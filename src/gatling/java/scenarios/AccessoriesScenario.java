package scenarios;

import io.gatling.javaapi.core.ScenarioBuilder;

import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class AccessoriesScenario {
    public ScenarioBuilder scenario = scenario("Samsung - Accessories")
            .exec(http("Samsung - Accessories")
                    .get("/accessories/")
                    .check(status().is(200))
            );

    public ScenarioBuilder getScenario() {
        return scenario;
    }
}
