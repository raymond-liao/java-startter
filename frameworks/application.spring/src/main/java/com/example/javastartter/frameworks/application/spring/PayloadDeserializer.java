package com.example.javastartter.frameworks.application.spring;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.example.javastartter.frameworks.domain.core.Payload;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.LinkedHashMap;

import static com.example.javastartter.frameworks.domain.core.Payload.payload;

@JsonComponent
public class PayloadDeserializer extends JsonDeserializer<Payload> {

    @Override
    public Payload deserialize(JsonParser p, DeserializationContext context) throws IOException {
        return payload(p.readValueAs(LinkedHashMap.class));
    }

}
