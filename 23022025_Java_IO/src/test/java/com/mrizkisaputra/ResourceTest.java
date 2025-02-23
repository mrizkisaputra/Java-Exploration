package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResourceTest {
    @Test
    public void mengaksesDenganKelasFile() {
        File file = new File("./pom.xml");

        Assertions.assertEquals("pom.xml", file.getName());
        Assertions.assertTrue(file.exists());
    }

    @Test
    public void mengaksesDenganKelasPath() {
        Path path = Path.of("./pom.xml");
        Assertions.assertTrue(Files.exists(path));
    }


}
