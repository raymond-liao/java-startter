package com.example.javastartter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@MockitoSettings(strictness = Strictness.LENIENT)
public class GreetingTests {
    private @Mock GreetingService service;

    @BeforeEach
    void setUp() {
        Mockito.when(service.greet()).thenReturn(Map.of("value", "result"));
    }

    @Test
    public void shouldReturnGreetingValue() {
        GreetingController greetingController = new GreetingController(service);
        assertThat(Map.of("value", "result"), is(greetingController.greeting()));
    }
}