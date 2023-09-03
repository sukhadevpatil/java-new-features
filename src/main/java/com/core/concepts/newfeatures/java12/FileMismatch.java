package com.core.concepts.newfeatures.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {

    /**
     * mismatch method in the nio.file.Files utility class
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //####################################################################
        //create two identical files and try to find a mismatch. The return value should be -1L
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 Article");
        Files.writeString(filePath2, "Java 12 Article");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println(mismatch);
        //####################################################################
        //The mismatch method should return 8L as it's the first different byte
        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12 Article");
        Files.writeString(filePath4, "Java 12 Tutorial");

        mismatch = Files.mismatch(filePath3, filePath4);
        System.out.println(mismatch);
        //####################################################################
    }
}
