import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("지금부터 0 ~ 255 사이에서 숫자를 하나 뽑겠습니다.");
        System.out.println("여러분은 제가 뽑은 숫자를 맞춰야 합니다.");

        Random random = new Random();
        int randomNumber = random.nextInt(256);

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 8; i++){
            System.out.println((8 - i) + "번의 기회가 있습니다.");

            System.out.println("추측한 숫자를 입력하세요.");
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

            if(randomNumber == guess){
                System.out.println("짝짝짝. 정답입니다.");
                break;
            } else if(randomNumber < guess){
                System.out.println("제가 생각한 숫자가 더 작습니다.");
            } else {
                System.out.println("제가 생각한 숫자가 더 큽니다.");
            }

            if(i == 7){
                System.out.println("더이상 기회가 남지 않았습니다,");
            }
        }

        System.out.println("게임을 종료합니다.");
    }
}
