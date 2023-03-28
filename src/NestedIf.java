public class NestedIf {
    public static void main(String[] args) {

        //중첩 if문은 가독성이 좋지않아 선호하지 않음. (구)
        int age = 15;

        /*
        if(age >= 10){
            if(age < 20){
                System.out.println("10대");
            } else {
                System.out.println("10대 아님");
            }
        } else {
            System.out.println("10대 아닙니다.");
        }
         */

        //신 버전 -> &&, ||의 사용법을 알아야함.
        if(age >= 10 && age < 20){
            System.out.println("10대가 맞습니다.");
        } else {
            System.out.println("10대가 아닙니다.");
        }
    }
}
