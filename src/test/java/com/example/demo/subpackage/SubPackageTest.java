package com.example.demo.subpackage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SubPackageTest {

    @Test
    public void testAssertOneMultiplyByTwoIsTwo() {
        Assertions.assertThat(1 * 2).isEqualTo(2);
    }

    @Test
    public void testAssertThreeMultiplyByTwoIsSix() {
        Assertions.assertThat(3 * 2).isEqualTo(6);
    }

}
