package com.example.javastartter.frameworks.domain.core;

public interface PasswordEncoder {

    boolean matches(String plain, String encrypted);

    String encode(String secret);

}
