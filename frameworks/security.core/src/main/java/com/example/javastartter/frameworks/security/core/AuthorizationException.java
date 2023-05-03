package com.example.javastartter.frameworks.security.core;

import com.example.javastartter.frameworks.domain.core.DomainException;
import com.example.javastartter.frameworks.domain.core.I18nMessage;

public class AuthorizationException extends DomainException {

    public AuthorizationException(I18nMessage message) {
        super(message);
    }

}
