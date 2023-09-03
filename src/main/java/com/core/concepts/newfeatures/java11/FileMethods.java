package com.core.concepts.newfeatures.java11;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethods {
    /**
     * It's now easier to read and write Strings from files.
     * We can use the new readString and writeString static methods from the Files class:
     */
    public static void main(String[] args) throws IOException {
        String tempDir = System.getProperty("java.io.tmpdir");

        Path filePath = Files.writeString(Files.createTempFile(Path.of(tempDir), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println("Sample text".equals(fileContent));
    }
}
