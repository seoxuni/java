package org.example;
/* Section 7, Coding Practice 9 */

public class Main {
    public static void main(String[] args) {
        System.out.println(PerfectNumberChecker.isPerfectNumber(28));
    }

    public class PerfectNumberChecker {
        public static boolean isPerfectNumber(int number) {
            int sum = 0;

            if (number <= 0) return false;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}