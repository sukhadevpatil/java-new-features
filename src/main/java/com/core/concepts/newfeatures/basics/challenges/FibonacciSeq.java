package com.core.concepts.newfeatures.basics.challenges;

public class FibonacciSeq {

    public static void main(String[] args) {

        printFibonacciSeq(10);

    }

    private static void printFibonacciSeq(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i =1; i<= count; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }
}
