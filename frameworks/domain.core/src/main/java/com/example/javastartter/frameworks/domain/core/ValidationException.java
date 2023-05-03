package com.example.javastartter.frameworks.domain.core;

public class ValidationException extends DomainException {

    public ValidationException(I18nMessage message) {
        super(message);
    }

}
