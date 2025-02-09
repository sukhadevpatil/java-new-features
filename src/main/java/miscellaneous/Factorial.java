package miscellaneous;

        public class Factorial {
            public static void main(String[] args) {
                int number = 4; // You can change this value to calculate factorial of another number
                try {
                    int result = factorial(number);
                    System.out.println("Factorial of " + number + " is " + result);
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
        }