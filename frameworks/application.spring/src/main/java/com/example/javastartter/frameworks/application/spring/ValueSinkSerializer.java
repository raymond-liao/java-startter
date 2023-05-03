package com.example.javastartter.frameworks.application.spring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.example.javastartter.frameworks.domain.core.ValueSink;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class ValueSinkSerializer extends JsonSerializer<ValueSink> {

    @Override
    public void serialize(ValueSink value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartArray();
        for (Object o : value.toList()) {
            gen.writeObject(o);
        }
        gen.writeEndArray();
    }

}
