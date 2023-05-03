package com.example.javastartter.frameworks.application.spring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.example.javastartter.frameworks.domain.core.Id;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class IdSerializer extends JsonSerializer<Id> {

    @Override
    public void serialize(Id value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.asString());
    }

}
