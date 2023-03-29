import java.util.Scanner;

public class PassExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "abc123";

        /*
        System.out.println("비밀번호를 입력해주세요.");
        String input = scanner.nextLine();

        //equals() 숙지 -> 비교를 위해 사용한다.
        while (input.equals(password) != true) {
            System.out.println("비밀번호를 입력해주세요.");
            input = scanner.nextLine();
        }

        //do-while문으로 변경
        do {
            System.out.println("비밀번호를 입력해주세요.");
            input = scanner.nextLine();
        } while (input.equals(password) != true);

        System.out.println("올바른 비밀번호 입니다.");

        //break문 사용법(feat. if문)
        while (true){
            System.out.println("비밀번호를 입력해주세요.");
            input = scanner.nextLine();

            if(input.equals(password)){
                System.out.println("올바른 비밀번호 입니다.");
                break;
            }
        }

        //continue 사용법1
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
        */

        //continue 사용법2
        int i = 0;
        while (i < 10){
            if(i % 2 == 0){
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
