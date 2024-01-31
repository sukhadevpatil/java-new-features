package com.core.concepts.newfeatures.basics.challenges;

import java.util.stream.Stream;

public class Factorial {
    public static void main(String[] args) {
        Stream.of(2,3,4,5,6).forEach(val -> {
            System.out.println(STR."Factorial of \{val} = \{factorial(val)}");
        });
    }

    private static int factorial(Integer val) {
        if(val == 1) {
            return 1;
        }

        return val * factorial(val-1);
    }
}
