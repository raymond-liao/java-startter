package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.security.core.ContextProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class TestApplication {

    @Bean
    public ContextProvider contextProvider() {
        return token -> Optional.empty();
    }

}
