package Basics;

public class Factoral {

        public static int factorial(int n) {

            if (n == 0) {
                return 1;

            } else {
                return n * factorial(n - 1);
            }
        }

        public static void main(String[] args) {
            int number = 5; // Change this to the number for which you want to calculate the factorial.
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }
    }

