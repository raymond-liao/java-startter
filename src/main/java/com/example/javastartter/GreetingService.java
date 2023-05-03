package com.example.javastartter;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GreetingService {
    public Map<String, String> greet() {
        return Map.of("value", "Greeting, hello world");
    }
}
