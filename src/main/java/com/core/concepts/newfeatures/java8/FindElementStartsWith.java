package com.core.concepts.newfeatures.java8;

import java.util.Arrays;
import java.util.List;

public class FindElementStartsWith {

    //Find element starts with
    public static void main(String[] args) {
        int[] numbers = { 2, 52, 11, 21, 19, 22, 35, 50, 101};

        List<String> values = Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf)
                .filter(str -> str.startsWith("1"))
                .toList();

        System.out.println(values);
    }
}
