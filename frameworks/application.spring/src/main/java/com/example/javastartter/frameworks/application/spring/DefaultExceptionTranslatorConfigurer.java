package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.domain.core.AggregateNotFoundException;
import com.example.javastartter.frameworks.domain.core.AuthenticationException;
import com.example.javastartter.frameworks.domain.core.BadAccessTokenException;
import com.example.javastartter.frameworks.domain.core.BadInputException;
import com.example.javastartter.frameworks.security.core.AuthorizationException;
import org.springframework.stereotype.Component;

@Component
public class DefaultExceptionTranslatorConfigurer implements ExceptionTranslatorConfigurer {

    @Override
    public void config(ExceptionTranslator translator) {
        translator.map(AggregateNotFoundException.class, Http404Exception::new);
        translator.map(AuthenticationException.class, Http401Exception::new);
        translator.map(BadAccessTokenException.class, Http401Exception::new);
        translator.map(AuthorizationException.class, Http403Exception::new);
        translator.map(BadInputException.class, Http400Exception::new);
    }

}
