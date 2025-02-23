package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class ReadAnWriteTest {
    @Test
    public void readAndWriteSmallFile() {
        byte[] data = "Hello World".getBytes();

        Path fileLocation = Path.of("./contoh/helloworld.txt");
        try {
            Files.write(fileLocation, data);
            String read = Files.readString(fileLocation);
            Assertions.assertEquals("Hello World", read);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
