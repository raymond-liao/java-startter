package com.example.javastartter.frameworks.security.core;

import com.example.javastartter.frameworks.domain.core.Id;

import java.util.Optional;

public interface ContextProvider {

    Optional<Context> get(Id id);

}
