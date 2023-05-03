package com.example.javastartter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public Map<String, String> hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return Map.of("id", String.format("Hello %s!", name));
    }
}
