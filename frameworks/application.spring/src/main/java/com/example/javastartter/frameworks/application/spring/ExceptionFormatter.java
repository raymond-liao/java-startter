package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.application.core.ApplicationException;
import com.example.javastartter.frameworks.domain.core.MessageResolver;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;

public class ExceptionFormatter {

    private final MessageResolver messageResolver;

    public ExceptionFormatter(MessageResolver messageResolver) {
        this.messageResolver = messageResolver;
    }

    public String format(@Nullable Throwable throwable) {
        if (throwable == null) return StringUtils.EMPTY;
        if (!(throwable instanceof ApplicationException)) return messageResolver.resolve(throwable.getMessage());
        return ((ApplicationException) throwable).format(messageResolver);
    }

}
