package chap_06;

public class _01_Method {
    // 메소드 : 어떤 기능을 하는 코드들의 묶음,어떤 기능을 수행
    // 메소드 정의 ( 메소드는 동작이기 때문에 주로 동사로 이름지음 )
    public static void sayHello() { //sayHello 라는 메소드 선언
        System.out.println("안녕하세요? 메소드입니다.");
    }
    public static void main(String[] args) {
       // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello(); // ▶ 메소드 호출
        sayHello();
        sayHello();
        // 메소드는 한번 정의하면 원하는 만큼 얼마든지 호출 할 수 있음
        System.out.println("메소드 호출 후");

        
    }
}
