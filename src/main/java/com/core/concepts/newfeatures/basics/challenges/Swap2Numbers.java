package com.core.concepts.newfeatures.basics.challenges;

public class Swap2Numbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(STR."Before Swapping :: a = \{a} & b = \{b}");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(STR."After Swapping :: a = \{a} & b = \{b}");
    }
}
