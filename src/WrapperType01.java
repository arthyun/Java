public class WrapperType01 {
    public static void main(String[] args) {
          Integer integerNumber = 3;
//        long longNumber = 3L;
//        float floatNumber = 3.0f;
//        double doubleNumber = 3.0d;
//        boolean booleanValue = true;

        //변형시켜보자
        float floatNumber = integerNumber.floatValue();
        double doubleNumber = integerNumber.doubleValue();
        String stringNumber = integerNumber.toString();

        System.out.println(integerNumber);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(stringNumber);
    }
}
