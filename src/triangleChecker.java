package org.example;
/* Step 24 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("각 세 개를 입력하세요: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        if (180 == angle1 + angle2 + angle3) {
            System.out.println("This is triangle.");
        }
        else {
            System.out.println("This is not triangle.");
        }
    }
}