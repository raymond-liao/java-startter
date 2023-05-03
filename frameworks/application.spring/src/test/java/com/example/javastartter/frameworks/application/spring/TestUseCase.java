package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.application.core.UseCase;
import com.example.javastartter.frameworks.security.core.Authorities;

@UseCase(requiredAuthorities = Authorities.ANONYMOUS)
public class TestUseCase {

    public String execute(String input) {
        return String.format("executed with '%s'", input);
    }

}
