package com.core.concepts.newfeatures.basics.challenges;

import java.util.List;
import java.util.stream.Stream;

public class PalindromeString {

    public static void main(String[] args) {

        Stream.of("level", "radar", "Arora").map(String::toLowerCase).forEach(input -> {
            System.out.println("Is " + input + " Palindrome ? => " + isStringPalindrome(input));
        });

    }

    private static boolean isStringPalindrome(String input) {
        boolean result = true;
        int length = input.length();

        for(int i = 0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length-1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
