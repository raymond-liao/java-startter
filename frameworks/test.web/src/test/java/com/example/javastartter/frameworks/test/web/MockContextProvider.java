package com.example.javastartter.frameworks.test.web;

import com.example.javastartter.frameworks.domain.core.Id;
import com.example.javastartter.frameworks.security.core.Context;
import com.example.javastartter.frameworks.security.core.ContextProvider;

import java.util.Optional;

public class MockContextProvider implements ContextProvider {

    @Override
    public Optional<Context> get(Id id) {
        return GlobalTestContext.token().orElse(Id.EMPTY).equals(id) ? GlobalTestContext.context() : Optional.empty();
    }

}
