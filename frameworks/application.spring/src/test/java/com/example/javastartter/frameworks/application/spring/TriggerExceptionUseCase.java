package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.application.core.UseCase;
import com.example.javastartter.frameworks.security.core.Authorities;

@UseCase(requiredAuthorities = Authorities.ANONYMOUS)
public class TriggerExceptionUseCase {

    public void execute(RuntimeException e) {
        throw e;
    }

}
