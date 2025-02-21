package com.mrizkisaputra;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsTest {
    @Test
    public void filteringOperations() {
        List<String> fruits = List.of("apple", "orange", "banana", "mango", "lemon", "watermelon");

        fruits.stream()
                .filter(fruit -> fruit.contains("apple"))
                .forEach(System.out::println);
    }

    @Test
    public void retrievingOperations() {
        List<String> fruits = List.of("apple", "orange", "banana", "mango", "lemon", "watermelon");

        var result = fruits.stream()
                .takeWhile(fruit -> fruit.length() <= 6)
                .limit(2)
                .toList();
        System.out.println(result);
    }


}
