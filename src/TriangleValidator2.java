package org.example;
/* Section 7, Coding Practice 6 */

public class Main {
    public static void main(String[] args) {
        System.out.println(TriangleValidator.isRightAngled(3,4,5));
    }

    public class TriangleValidator {
        public static boolean isRightAngled(int side1, int side2, int side3) {
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                return false;
            }

            boolean case1 = side1*side1 + side2*side2 == side3*side3;
            boolean case2 = side1*side1 + side3*side3 == side2*side2;
            boolean case3 = side2*side2 + side3*side3 == side1*side1;

            if (case1 == true || case2 == true || case3 == true) {
                return true;
            } else {
                return false;
            }
        }
    }
}