package com.example.javastartter;

import com.example.javastartter.frameworks.domain.core.Id;
import com.example.javastartter.frameworks.security.core.Context;
import com.example.javastartter.frameworks.security.core.ContextProvider;
import com.example.javastartter.frameworks.test.web.GlobalTestContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomContextProvider implements ContextProvider {
    @Override
    public Optional<Context> get(Id id) {
        return GlobalTestContext.context();
    }
}
