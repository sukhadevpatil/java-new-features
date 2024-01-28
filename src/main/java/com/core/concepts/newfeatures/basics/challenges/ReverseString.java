package com.core.concepts.newfeatures.basics.challenges;

import java.util.Objects;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Welcome to Coding World!";

        String result = reverseString(input);

        System.out.println(result);
    }

    private static String reverseString(String input) {
        if(Objects.isNull(input)) {
            throw new IllegalArgumentException("null is not valid");
        }

        StringBuilder builder = new StringBuilder();
        char[] arr = input.toCharArray();

        for(int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i]);
        }

        return builder.toString();
    }
}
