package chap_06;

import com.sun.security.jgss.GSSUtil;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메소드를 여러번 선언
        // 조건 1. 전달값(매개변수)의 자료형 타입이 다르거나
        // 조건 2. 전달값(매개변수)의 갯수가 다르거나

        // 이름이 같은 메소드를 여러개를 만듦 ( 입력값의 자료형이 다르거나, 개수가 다르지만 메소드의 이름은 같음 )
        // 메소드의 이름은 똑같지만 매개변수의 자료형(전달값의 자료형)이 다른 메소드를 각각 호출함
        // 매개변수를 int형, String형으로 각각 줬지만 입력값에 따라 각각 메소드를 호출함


        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27
    }
}
