package org.example;
/* 문제: https://cloudstudying.kr/studies/55 | 환전하기, 자바 1000제 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euroRate = 1320.48026;
        double dollarRate = 1063.82979;

        int euro = sc.nextInt();
        int dollar = sc.nextInt();

        int total = (int)(euro*euroRate + dollar*dollarRate);
        System.out.printf("%d유로 + %d달러 = %d 원", euro, dollar, total);
    }
}