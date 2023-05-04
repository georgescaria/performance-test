package scenarios;

import io.gatling.javaapi.core.ScenarioBuilder;

import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class DiscoverMobileScenario {
    public ScenarioBuilder scenario = scenario("Samsung India - Discover Mobiles")
            .exec(http("Samsung - Discover Mobiles")
                    .get("/mobile/")
                    .check(status().is(200))
            );

    public ScenarioBuilder getScenario() {
        return scenario;
    }
}
