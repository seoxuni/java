/* Section 15, Practice 19 */
public class NumberUtils {

    public int getNumberOfDigits(int number) {
        int sum = 0;

        if (number < 0) return -1;
        if (number == 0) return 1;

        while (number > 0) {
            number /= 10;
            sum++;
        }

        return sum;
    }
}