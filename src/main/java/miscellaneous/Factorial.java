package miscellaneous;

import java.util.List;
import java.util.stream.IntStream;

public class Factorial {
            public static void main(String[] args) {
                int number = 4; // You can change this value to calculate factorial of another number
                try {
                    int result = factorial(number);
                    System.out.println("Factorial of " + number + " is " + result);
                    System.out.println("=============with stream reduce=============");
                    int result2 = factorial2(number);
                    System.out.println("Factorial of " + number + " is " + result2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            private static int factorial(int val) {
                if (val < 0) {
                    throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
                }
                if (val == 0) {
                    return 1;
                }
                return val * factorial(val - 1);
            }

            private static int factorial2(int val) {
                if (val < 0) {
                    throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
                }
                if (val == 0) {
                    return 1;
                }

                List<Integer> list = IntStream.rangeClosed(1, val).boxed().toList();
                return list.stream().reduce(1, (a, b) -> a*b);
            }
        }