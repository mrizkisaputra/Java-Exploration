package com.mrizkisaputra;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    @Test
    public void createStream() {
        Stream<String> stream = Stream.of("a", "b", "c");
    }

    @Test
    public void createStreamFromArray() {
        Stream<String> stream = Arrays.stream(new String[] {"aa", "bb", "cc"});

    }

    @Test
    public void createStreamFromList() {
        List<String> fruits = List.of("apple", "orange", "banana", "mango", "lemon");

        fruits.stream()
                .map(fruit -> fruit.toUpperCase())
                .map(fruit -> "Fruit "+ fruit)
                .forEach(fruit -> {
                    System.out.println(fruit);
                });
    }


}
