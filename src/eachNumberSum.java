package org.example;
/* 문제: https://cloudstudying.kr/studies/55 | 각 자리수의 합, 자바 1000제 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int firstNum = num / 100;
        int secondNum = (num % 100) / 10;
        int thirdNum = num % 10;

        int total = firstNum + secondNum + thirdNum;
        System.out.println(total);
    }
}