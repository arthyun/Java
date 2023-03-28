import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        // java는 직접 값을 비교하는게 아니라 해당 데이터의 주소로 비교를한다.
        // a == b는 틀린것이다.(문자열 비교 기준)
        System.out.println(a.equals(b));
    }
}
