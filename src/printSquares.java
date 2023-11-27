package org.example;
/* Section 4, Step 05 */

public class Main {
    public static void main(String[] args) {
        printNumbers(3);
    }

    private static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Squares of %d = %d\n", i, i*i);
        }
    }
}