package com.core.concepts.newfeatures.java8;

import java.util.Arrays;

public class LongestString {

    //Find the longest string fom the array
    public static void main(String[] args) {
        String[] values = {"Mumbai", "Pune", "Delhi", "London", "Bournemouth"};

        String val = Arrays.stream(values).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();

        System.out.println(val);
    }
}
