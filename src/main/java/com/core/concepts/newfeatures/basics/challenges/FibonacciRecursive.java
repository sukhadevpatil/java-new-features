package com.core.concepts.newfeatures.basics.challenges;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int input = 10;
        System.out.println("Find Fibonacci for input = " + 10);

        for(int i =0; i < input; i++) {
            System.out.print(STR."\{fibonacci(i)}, ");
        }
    }

    private static int fibonacci(int num) {

        if(num <= 1) {
            return num;
        }

        return fibonacci(num -1) + fibonacci(num-2);
    }
}
