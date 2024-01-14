package com.core.concepts.newfeatures.basics.files;

import org.junit.platform.commons.util.ClassLoaderUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UsingResourceStream {

    public static void main(String[] args) throws IOException {
        try(InputStream inputStream = ClassLoaderUtils.getDefaultClassLoader().getResourceAsStream("resourceInputFile.txt")) {
            assert inputStream != null;
            try(Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(reader)) {
                bufferedReader.lines().forEach(System.out::println);
            }
        }
    }
}
