package com.core.concepts.newfeatures.basics.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * TO read bigger files use the file streaming to handle cpu & memory utilization properly
 */
public class UsingStream {

    public static void main(String[] args) {

        try(Stream<String> lines = Files.lines(Paths.get("inputFile.txt"), StandardCharsets.UTF_8)) {
            lines.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
