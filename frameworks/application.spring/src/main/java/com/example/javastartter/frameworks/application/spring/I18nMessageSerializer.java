package com.example.javastartter.frameworks.application.spring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.example.javastartter.frameworks.domain.core.I18nMessage;
import com.example.javastartter.frameworks.domain.core.MessageResolver;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class I18nMessageSerializer extends JsonSerializer<I18nMessage> {

    private final MessageResolver messageResolver;

    public I18nMessageSerializer(MessageResolver messageResolver) {
        this.messageResolver = messageResolver;
    }

    @Override
    public void serialize(I18nMessage value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.format(messageResolver));
    }

}
