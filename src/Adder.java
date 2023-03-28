import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("첫번째 숫자를 입력하세요.");
            int num1 = scanner.nextInt();
            System.out.println("두번째 숫자를 입력하세요.");
            int num2 = scanner.nextInt();
            System.out.println("두 숫자의 합은 " + (num1 + num2) + "입니다.");
        } catch (Exception e) {
            System.out.println("숫자가 아닌 다른값을 입력하지 마세요.");
        }
    }
}
