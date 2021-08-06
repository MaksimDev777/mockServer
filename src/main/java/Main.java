import org.mockserver.client.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.*;
import static org.mockserver.model.HttpResponse.response;

public class Main {

    public static void main(String[] args) {
        System.setProperty("mockserver.initializationClass", MyExpectationInitializer.class.getName());
        ClientAndServer mockServer = startClientAndServer(1080);
    }
}
