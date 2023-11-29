package org.example;
/* Section 7, Coding Practice 8 */

public class Main {
    public static void main(String[] args) {
        System.out.println(LeapYearChecker.isLeapYear(2048));
    }

    public class LeapYearChecker {
        public static boolean isLeapYear(int year) {
            if (year <= 0) return false;

            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 4 == 0 && year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}