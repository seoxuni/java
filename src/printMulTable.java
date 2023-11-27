package org.example;
/* Section 4, Step 07 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }

    private static void printMultiplicationTable(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}