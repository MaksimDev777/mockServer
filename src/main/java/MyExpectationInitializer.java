import org.mockserver.mock.Expectation;
import org.mockserver.server.initialize.ExpectationInitializer;

import java.util.UUID;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class MyExpectationInitializer implements ExpectationInitializer {

    static UUID uuid = UUID.randomUUID();

    @Override
    public Expectation[] initializeExpectations() {
        return new Expectation[]{
                new Expectation(
                        request().
                                withPath("/getGUID")
                )
                .thenRespond(
                        response()
                            .withBody("UUID: " + uuid.toString())
                )
        };
    }
}
