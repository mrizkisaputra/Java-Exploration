package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManipulasiDirectoryTest {
    @Test
    public void test1() {
        try {
            Path path = Files.createDirectory(Path.of("model"));
            Assertions.assertTrue(Files.isDirectory(path));

        } catch (IOException e) {

        }
    }

    @Test
    public void test2() throws IOException {
        Files.createDirectories(Path.of("internal/user/expense"));

    }

    @Test
    public void test3() {

    }
}
