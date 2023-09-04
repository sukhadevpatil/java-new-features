package com.core.concepts.newfeatures.java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {

    /**
     * To reduce the boilerplate with some commonly used Stream collectors,
     * such as Collectors.toList and Collectors.toSet
     * @param args
     */
    public static void main(String[] args) {
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        //old way
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(ints);

        //more concise
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
        System.out.println(intsEquivalent);
    }
}
