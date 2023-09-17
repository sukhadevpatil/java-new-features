package com.core.concepts.newfeatures.java8;

import org.apache.logging.log4j.util.Strings;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatElement {

    public static void main(String[] args) {

        String text = "I love Java technologies";
        text = text.toLowerCase();

        Map<String, Long> data = Stream.of(text.split("")).filter(Strings::isNotBlank).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(data);

        String firstNonRepeatElement = Stream.of(text.split("")).filter(Strings::isNotBlank)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(firstNonRepeatElement);

        String firstRepeatElement = Stream.of(text.split("")).filter(Strings::isNotBlank)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(firstRepeatElement);
    }
}
