import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {
    public static void main(String[] args) {
        //사용자가 입력한 값을 받아올 수 있다.
        //아래 코드 실행 후 실행창 내에서 텍스트를 입력해보자.
        Scanner scanner;
        scanner = new Scanner(System.in);

        /*
        //ex1
        String input1 = scanner.nextLine();
        boolean input2 = scanner.hasNextLine();
        System.out.println(input1); //value
        System.out.println(input2); //true
        */

        /*
        //ex2 - next()는 띄어쓰기로 구분해서 2줄로 표현해줌
        String english = scanner.next();
        String korean = scanner.next();
        System.out.println(english);
        System.out.println(korean);
         */

        //Integer.parseInt를 통해 문자를 숫자로 바꿔주기
        //예외처리를 추가해보자 try/catch문 사용
        System.out.println("숫자를 하나 입력해주세요.");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch(Exception e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
    }
}
