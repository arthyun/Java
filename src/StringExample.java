public class StringExample {
    public static void main(String[] args) {
        System.out.println("Im String");
        System.out.println('나');
        System.out.println("안녕 나는 \"자바\" 야");
        System.out.println("치킨은 살 안쪄요. \n내가 살 쪄요.");
        //나는 주석입니다.

        String chicken = "치킨은 살 안쪄요!";
        String me = "살은 내가 쪄요";
        System.out.println(chicken);

        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);

        //문자열의 글자 수 세기(정수형) -> length();
        System.out.println(chicken.length());
        System.out.println(me.length());
        System.out.println(chickenAndMe.length());

        //문자열 일부 바꾸기 -> replace("현재값", "수정값") / replaceAll("현재값", "수정값");
        System.out.println(me.replaceAll("내가", "치킨이"));
        System.out.println(me.replace("내가", "현호가"));

        //특정 문자열 잘라내기 -> substring("시작번호", "글자갯수"); 시작번호 부터 글자갯수만큼 출력해라.
        String birthday = "1970/01/01";
        System.out.println(birthday.substring(0, 4));
    }
}
