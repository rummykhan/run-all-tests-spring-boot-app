package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void testNonEmptyStringIsNotNull() {
        Assertions.assertThat("hello").isNotNull();
    }

    @Test
    void testTwoIsGreaterThenOne() {
        Assertions.assertThat(2).isGreaterThan(1);
    }

}
