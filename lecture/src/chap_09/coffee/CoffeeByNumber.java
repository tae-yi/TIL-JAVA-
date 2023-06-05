package chap_09.coffee;

public class CoffeeByNumber {
    // 대기번호 저장 변수
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }

}
