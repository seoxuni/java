package org.example;
/* Section 7, Coding Practice 7 */

public class Main {
    public static void main(String[] args) {
        System.out.println(SumOfSquares.calculateSumOfSquares(3));
    }

    public class SumOfSquares {
        public static long calculateSumOfSquares(int n) {
            long sum = 0;

            if (n < 0) {
                return -1;
            }

            for (int i = 1; i <= n; i++) {
                sum += i*i;
            }

            return sum;
        }
    }
}