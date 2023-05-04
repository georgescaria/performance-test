package httpConnect;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;

public class HttpSetup {
    private final HttpProtocolBuilder httpProtocolBuilder;

    public HttpSetup() {

        String region = System.getProperty("region");
        httpProtocolBuilder = http
                .baseUrl("https://www.samsung.com/" + region + "/");
    }

    public HttpProtocolBuilder getHttpProtocolBuilder() {
        return httpProtocolBuilder;
    }
}
