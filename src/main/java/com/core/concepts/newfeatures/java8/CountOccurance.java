package com.core.concepts.newfeatures.java8;

import org.apache.logging.log4j.util.Strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurance {

    /**
     * Count the occurrence of each character
     * @param args
     */
    public static void main(String[] args) {

        String text = "i love java technology";

        //Map<String, List<String>> data = Stream.of(text.split("")).collect(Collectors.groupingBy(s -> s));

        Map<String, Long> data = Stream.of(text.split("")).filter(Strings::isNotBlank).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(data);

    }
}
