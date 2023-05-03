package com.example.javastartter.frameworks.test.context;

import com.example.javastartter.frameworks.domain.core.GlobalIdGenerator;
import org.junit.jupiter.api.Test;

import static com.example.javastartter.frameworks.domain.core.Id.id;
import static org.assertj.core.api.Assertions.assertThat;

@WithFixedGlobalIdGenerator(value = "a-fixed-id")
public class GlobalIdGeneratorExtensionTest {

    @Test
    void should_be_able_to_reset_id_generator() {
        assertThat(GlobalIdGenerator.nextId()).isEqualTo(id("a-fixed-id"));
        assertThat(GlobalIdGenerator.nextReadableId()).isEqualTo(id("a-fixed-id"));
    }

}