package com.example.javastartter.frameworks.test.web;

import com.example.javastartter.frameworks.security.core.ContextProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

    @Bean
    public ContextProvider contextProvider() {
        return new MockContextProvider();
    }

}
