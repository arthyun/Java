public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("지금 무슨 생각 하나요?");

        //3초 뒤에 아래 코드가 실행되게 함.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("치킨!");
    }
}
