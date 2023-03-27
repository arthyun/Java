public class VariableExample {
    public static void main(String[] args) {
        //문제풀이
        String name = "홍길동석";
        int age = 50;
        String address = "서울시";

        int winter = 3;
        int daughter = 10;
        boolean result1 = winter == daughter;
        boolean result2 = winter > daughter;
        boolean result3 = winter < daughter;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        String date = "1970/01/23";
        String date1 = date.substring(0, 4);
        String date2 = date.substring(5, 7);
        String date3 = date.substring(8);

        System.out.println(date1);
        System.out.println(date1 + "년 " + date2 + "월 " + date3 + "일");
    }
}
