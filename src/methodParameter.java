package org.example;
/* Section 4, Step 04 */

public class Main {
    public static void main(String[] args) {
        sayHelloWorld(3);
    }

    private static void sayHelloWorld(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World!");
        }
    }
}