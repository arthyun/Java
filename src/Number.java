public class Number {
    public static void main(String[] args) {
        //정수형
        byte byteInteger = 10;
        short shortInteger = 20;
        int intInteger = 30;
        long longInteger = 40;

        int sum = byteInteger + shortInteger;
        int sum2 = shortInteger + intInteger;
        long sum3 = intInteger + longInteger;
        long sum4 = byteInteger + longInteger;

        //실수형
        //float 사용법 -> 숫자 뒤에 f를 붙임.
        float floatNumber = 1.2f;
        double doubleNumber = 4.3;
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum);

        //문자형
        char character = 'l';
        System.out.println(character);
    }
}
