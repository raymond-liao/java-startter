package com.example.javastartter;

import com.example.javastartter.frameworks.test.web.Documentation;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class RequestTest extends ApiTest {
    @Test
    public void should_get_default_response() {
        var response = get("/", document());
        response.statusCode(is(200));
        response.body("accessToken", is(not(empty())));
    }

    @Override
    protected Documentation document() {
        return null;
    }
}
