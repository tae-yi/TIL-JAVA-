package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유 ( 언제 메소드를 사용하는지 )

        // 예제1) 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 2 * 2 = 4

        // 예제2) 3의 3승을 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 * 3 = 27

        // 예제3) 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16

        // 반복되는 코드의 중복 최소화
        // 예제 1,2,3을 getPower메소드를 이용해서 만들기
        System.out.println(getPower(2,2)); // 2의 2승
        System.out.println(getPower(3, 3)); // 3의 3승
        System.out.println(getPower(4, 2)); // 4의 2승

    }
}
