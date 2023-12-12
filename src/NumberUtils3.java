/* Section 15, Practice 20 */

public class Main {
    public static void main(String[] args) {
        NumberUtils nu = new NumberUtils();
        System.out.println(nu.getSumOfDigits(1234));    // 1+2+3+4 = 10
    }

    public static class NumberUtils {

        public static int getSumOfDigits(int number) {
            int sum = 0;

            if (number < 0) return -1;
            if (number == 0) return 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            return sum;
        }
    }
}