package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManipulasiFileTest {
    @Test
    public void mengaksesFile() {
        Path path = Path.of("./pom.xml");
        Assertions.assertFalse(path.isAbsolute());
        Assertions.assertTrue(Files.exists(path));
    }

    @Test
    public void createFile() {
        try {
            Path path = Files.createFile(Path.of("file.txt"));
            Assertions.assertTrue(Files.exists(path));
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void deleteFile() {
        try {
            boolean ok = Files.deleteIfExists(Path.of("./file.txt"));
            Assertions.assertTrue(ok);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
