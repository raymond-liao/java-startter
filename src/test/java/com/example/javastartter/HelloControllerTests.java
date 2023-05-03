package com.example.javastartter;

import com.example.javastartter.frameworks.test.web.Documentation;
import org.junit.jupiter.api.Test;

import static com.example.javastartter.frameworks.test.web.Documentation.doc;
import static org.hamcrest.Matchers.is;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;


public class HelloControllerTests extends ApiTest {

    @Test
    public void shouldReturnDefaultHelloMessage() {
        var response = get("/hello?name=abc", document());
        response.statusCode(is(200)).body("id", is("Hello abc!"));
    }


    @Override
    protected Documentation document() {
        return doc("home.hello",
                responseFields(
                        fieldWithPath("id").description("Hello")
                )
        );
    }
}
