package chap_06;
    // 전달값 : parameter
    // 메소드는 경우에 따라서 어떤 값을 전달해서 그 값을 가지고 내부적으로 수행함

public class _02_Parameter {

    // 거듭제곱을 계산하는 메소드 ( 2 → 2 * 2 = 4 )
    // 전달값이 있는 메소드
    public static void power(int number) {
        // 변수 number를 Parameter, 매개변수라고 함
        // 소괄호()안에는 값을 정의해줄수 있는데 그 값은 메소드에서 필요로 하는 값을 받는 것
        // number라는 정수형 변수의 값을 power메소드안의 실행문에 대입해서 수행

        int result = number * number;
        System.out.println(number + " 의 2승은 " + result);
    }


    // 메소드의 전달값이 여러개인 경우
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // ()안에 들어가는 값을 Asrgument, 인수라고 한다
        power(2); // 2 * 2 = 4
        // 2라는 값을 전달하면서 파워라는 메소드를 호출하는데, 전달받은 2는 number에 저장됨
        power(3);

        powerByExp(2,3); // 2 * 2 * 2 = 8
        powerByExp(3,3); // 3 * 3 * 3 = 27
        powerByExp(10,0); // 1


    }
}
