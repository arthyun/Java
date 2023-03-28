import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력하세요.");
        System.out.println("1. 치킨 / 2. 순대국 / 3. 스테이크");
        Scanner scanner = new Scanner(System.in);

        //예외처리문 밖에서 우선 변수 선언
        int foodNum;

        try {
            foodNum = scanner.nextInt();
        } catch (Exception e) {
            //아래 switch문의 default가 작동되게끔 0을 줌.
            foodNum = 0;
        }

        switch(foodNum){
            case 1:
                System.out.println("치킨은 25000원 입니다.");
                break;
            case 2:
                System.out.println("순대국은 10000원 입니다.");
                break;
            case 3:
                System.out.println("스테이크는 4만원 입니다.");
                break;
            default:
                System.out.println("음식명을 다시 확인하세요.");
        }
    }
}
