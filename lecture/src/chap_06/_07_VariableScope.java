package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // System.out.println(number); // 지역변수 , methodA 안에서만 사용 가능
    }

    public static void methodB() {
        int result = 1; // 지역변수 , methodB 안에서만 사용 가능
    }

    public static void main(String[] args) {
        //  사용할수 있는 변수의 범위
        //  지역 변수 : 변수가 선언된 영역{}내에서만 사용 가능
        // 지역변수를 다른 메소드에서 쓰고 싶을경우, 전달값을 이용해서 메소드에 값을 전달하는 방법으로 사용
        int number = 3;  // main영역 내에서 선언된 변수는 main영역 내에서만 사용할 수 있음

        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i); // for문에서 선언된 변수는 for문의 영역 안에서만 사용 가능
        }
        // System.out.println(i);

    }
}
