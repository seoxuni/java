package org.example;
/* Step 28 */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {     /* 제곱수 출력 */
            System.out.printf("%d * %d = %d\n", i, i, i*i);
        }

        for (int i = 2; i <= 10; i+=2) {    /* 짝수 제곱 출력 */
            System.out.printf("%d * %d = %d\n", i, i, i*i);
        }

        for (int i = 1; i <= 10; i+=2) {    /* 홀수 제곱 출력 */
            System.out.printf("%d * %d = %d\n", i, i, i*i);
        }
    }
}