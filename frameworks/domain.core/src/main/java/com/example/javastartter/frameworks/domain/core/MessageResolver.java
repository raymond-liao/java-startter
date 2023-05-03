package com.example.javastartter.frameworks.domain.core;

public interface MessageResolver {

    String resolve(String code, Object... args);

}
