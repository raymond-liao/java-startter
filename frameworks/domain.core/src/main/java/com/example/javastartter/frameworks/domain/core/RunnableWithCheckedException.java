package com.example.javastartter.frameworks.domain.core;

@FunctionalInterface
public interface RunnableWithCheckedException {
    void run() throws Exception;
}
