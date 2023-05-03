package com.example.javastartter.frameworks.domain.core;

public class AuthenticationException extends DomainException {

    public AuthenticationException(I18nMessage message) {
        super(message);
    }

}
