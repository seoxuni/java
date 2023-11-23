package org.example;
/* 문제: https://cloudstudying.kr/studies/55 | 급여 계산기, 자바 1000제 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hourSalary = sc.nextInt();
        int workTime = sc.nextInt();

        System.out.printf("%d", hourSalary * workTime);
    }
}