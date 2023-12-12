/* Section 15, Practice 17 */
public class FactorialCalculator {

    public int calculateFactorial(int number) {
        int sum = 1;

        if (number < 0) return -1;

        for (int i = 1; i <= number; i++) {
            sum *= i;
        }

        return sum;
    }
}
