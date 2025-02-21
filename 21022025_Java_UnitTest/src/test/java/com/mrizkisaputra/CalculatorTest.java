package com.mrizkisaputra;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
//import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After");
    }

    @Test
    @EnabledOnOs(value = {OS.MAC, OS.LINUX})
    public void add() {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 5);
        Assertions.assertEquals(10, result);
        System.out.println("finish");
    }

    @Test
    @DisplayName("Divide Exception")
    public void divide() {
        Calculator calculator = new Calculator();

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void test() {
        String env = System.getenv("JAVA_HOMEE");

        Assumptions.assumeTrue(env != null);
    }
}
