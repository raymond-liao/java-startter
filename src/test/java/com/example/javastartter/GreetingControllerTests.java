package com.example.javastartter;

import com.example.javastartter.frameworks.test.web.Documentation;
import org.junit.jupiter.api.Test;

import static com.example.javastartter.frameworks.test.web.Documentation.doc;
import static org.hamcrest.Matchers.is;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;

public class GreetingControllerTests extends ApiTest {
    @Test
    public void shouldReturnGreetingValue() {
        var response = get("/greeting", document());
        response.statusCode(is(200)).body("value", is("Greeting, hello world"));
    }

    @Override
    protected Documentation document() {
        return doc("greeting",
                responseFields(
                        fieldWithPath("value").description("Greeting value")
                )
        );
    }
}
