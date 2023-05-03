package com.example.javastartter;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Greeting, hello world";
    }
}
