package org.example;
/* Step 24 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (0 == num % 2) {
            System.out.println("This is even number.");
        }
        else {
            System.out.println("This is odd number.");
        }
    }
}