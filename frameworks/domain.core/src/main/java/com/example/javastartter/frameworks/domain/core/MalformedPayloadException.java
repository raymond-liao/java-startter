package com.example.javastartter.frameworks.domain.core;

public class MalformedPayloadException extends DomainException {

    public MalformedPayloadException(I18nMessage message) {
        super(message);
    }

}