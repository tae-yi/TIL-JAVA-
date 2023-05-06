package chap_07;

public class BlackBox { // 메인메소드 필요 없이 변수들 정의
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    // 이 네개값들을 인스턴스 변수, 필드라고 함
    // 인스턴스 변수들은 각각 클래스로 부터 만들어진 객체들마다 서로 다른 값을 가질 수 있음

    static boolean canAutoReport = false;  // 자동 신고 기능
    // ▶ static을 붙이면 클래스 변수 ( 클래스 내의 클래스 변수 ) : 이 클래스로 만들어지는 모든 객체에 똑같이 공통적으로 적용됨
    // 접근 방법 : '객체. ' 으로 접근할 수도 있지만, 일반적으로 '클래스명.클래스변수명' 방법으로 접근함
    
    // static 안붙은건 인스턴스 변수 ( 서로 다른 객체에서 서로 다른 값들을 가짐 )

    


}
