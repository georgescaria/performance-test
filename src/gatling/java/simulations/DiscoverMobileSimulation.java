package simulations;

import httpConnect.HttpSetup;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;
import scenarios.DiscoverMobileScenario;
import scenarios.HomePageScenario;

import static io.gatling.javaapi.core.CoreDsl.rampConcurrentUsers;

public class DiscoverMobileSimulation extends Simulation {

    {

        HttpProtocolBuilder httpProtocol = new HttpSetup().getHttpProtocolBuilder();

        ScenarioBuilder scn = new DiscoverMobileScenario().getScenario();

        int users =Integer.getInteger("users", 1);
        int rampUsers = Integer.getInteger("rampInSecs", 1);
        long durationInSeconds = Long.getLong("durationInMins",0) * 60;

        setUp(scn.injectClosed(rampConcurrentUsers(rampUsers).to(users).during(durationInSeconds)).protocols(httpProtocol));
    }

}
