package com.core.concepts.newfeatures.java8.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurances {
    public static void main(String[] args) {
        String str = "Hello World";
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
