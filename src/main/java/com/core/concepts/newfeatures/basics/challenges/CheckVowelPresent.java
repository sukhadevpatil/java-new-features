package com.core.concepts.newfeatures.basics.challenges;

public class CheckVowelPresent {
    public static void main(String[] args) {
        String input = "Hello";

        System.out.println(isVowelPresent(input));
    }

    private static boolean isVowelPresent(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
