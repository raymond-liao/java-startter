package com.example.javastartter.frameworks.application.spring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.example.javastartter.frameworks.domain.core.ObjectSink;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class ObjectSinkSerializer extends JsonSerializer<ObjectSink> {

    @Override
    public void serialize(ObjectSink value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObject(value.toMap());
    }

}
