package com.example.javastartter.frameworks.domain.core;

public class BadAccessTokenException extends AuthenticationException {

    public BadAccessTokenException() {
        super(I18nMessage.message("error.bad-token"));
    }

}
