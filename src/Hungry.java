public class Hungry {
    public static void main(String[] args) {

        boolean money = true;
        int curMoney = 5000;

        if(money != money){
            System.out.println("순대국을 먹습니다.");
        } else if(curMoney >= 5000){
            System.out.println("육개장을 먹습니다.");
        } else {
            System.out.println("못 먹습니다.");
        }
    }
}
