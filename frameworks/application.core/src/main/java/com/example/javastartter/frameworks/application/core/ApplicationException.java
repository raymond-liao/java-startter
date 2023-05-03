package com.example.javastartter.frameworks.application.core;

import com.example.javastartter.frameworks.domain.core.DomainException;
import com.example.javastartter.frameworks.domain.core.MessageResolver;

public class ApplicationException extends RuntimeException {

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public String format(MessageResolver messageResolver) {
        if (getCause() instanceof DomainException) return ((DomainException) getCause()).format(messageResolver);
        return messageResolver.resolve(getMessage());
    }

    @Override
    public String getMessage() {
        if (getCause() != null) return getCause().getMessage();
        return super.getMessage();
    }

}
