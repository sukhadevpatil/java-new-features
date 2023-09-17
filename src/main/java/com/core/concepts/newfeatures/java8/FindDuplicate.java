package com.core.concepts.newfeatures.java8;

import org.apache.logging.log4j.util.Strings;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicate {

    /**
     * Find all duplicate elements
     * @param args
     */
    public static void main(String[] args) {
        String text = "I love Java technologies";

        Map<String, Long> data1 = Stream.of(text.split("")).filter(Strings::isNotBlank)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(data1);

        List<String> data = Stream.of(text.split("")).filter(Strings::isNotBlank)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(val -> val.getValue() > 1)
                                .map(Map.Entry :: getKey)
                                        .toList();

        System.out.println(data);

        List<String> uniqueElements = Stream.of(text.split("")).filter(Strings::isNotBlank)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(val -> val.getValue() == 1)
                .map(Map.Entry :: getKey)
                .toList();

        System.out.println(uniqueElements);
    }
}
