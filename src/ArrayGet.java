import java.util.Arrays;

public class ArrayGet {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        /*
        System.out.println(days[0]);
        System.out.println(days[6]);

        // 배열의 길이 -> length
        System.out.println(days.length);

        days[0] = "일";
        //반복문 응용
        for (int i = 0; i < days.length; i++){
            System.out.println(days[i] + "요일");
        }

        //forEach문 -> for(타입선언 day : 배열명)
        for (String day : days){
            System.out.println(day + "요일");
        }

        //배열에 값 추가하기 -> copyOf()
        String[] days2 = Arrays.copyOf(days, 8);
        days2[7] = "새로운 날짜";

        for(String day : days2){
            System.out.println(day);
        }

        //배열을 통째로 출력하는 법 -> Arrays.toString(배열명)
        System.out.println(Arrays.toString(days));
        */

        //객체 배열은? -> 자바스크립트와는 다르게 여러 객체들을 중괄호로 감싼다.
        String[][] days3 = {
                {"월", "화", "수", "목", "금", "토", "일1"},
                {"월", "화", "수", "목", "금", "토", "일2"},
                {"월", "화", "수", "목", "금", "토", "일3"},
        };
        System.out.println(Arrays.toString(days3[0]));
        System.out.println(Arrays.toString(days3[1]));
        System.out.println(Arrays.toString(days3[2]));
    }
}
