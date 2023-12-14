package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;   // 자동 형변환 long -> int
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
