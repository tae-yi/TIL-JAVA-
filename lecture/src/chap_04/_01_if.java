package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 If
        // 조건이 참일 경우
        int hour = 10; // 오전 10시

        /* if문 형식
        if ( 조건 )
        ... 수행할 명령 ... */

        if(hour < 14) // 조건문이 참이면 아래의 수행할 명령을 실행함
            System.out.println("아이스 아메리카노 +1"); // 수행할 명령이 하나라면 중괄호 생략 가능
            System.out.println("샷 추가");
        System.out.println("커피 주문 완료");
        
        // if 문 내에서 2개 이상의 문장을 실행할 때는 중괄호{}로 감싸줘야한다 ( 생략 불가 )
        int hour1 = 10;
        if(hour1 < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        } // 여기까지가 if 문
        System.out.println("커피 주문 완료");
        
        // 조건이 거짓일 경우
        int hour2 = 15; // 오후 3시
        if (hour2 < 14)
            System.out.println("아이스 아케리카노 +1"); // 조건이 거짓으로 출력 x
            System.out.println("샷 추가"); // 출력 o
        System.out.println("커피 주문 완료"); // 출력 o

        // 2가지 조건을 함께 비교 ( 오후 2시, 모닝커피를 마시지 않은 경우 )
        int hour3 = 10;
        boolean morningCoffee = false; // 모닝커피
        if (hour3 < 14 && morningCoffee == false) { // hour3 < 14 && !morningCoffee 이렇게도 작성 가능
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

    }
}
