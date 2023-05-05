package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) { // 정수값을 반환하는 메소드
        int result = number * number;
        return result;
        //메소드를 호출하면서 어떤 값을 전달하고 전달될 값을 통해서 메소드안의 연산을 수행
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드
        int retval = getPower(2); // 반환값을 받기위한 변수 정의
        System.out.println(retval);

        retval = getPower(3);
        System.out.println(retval); // 3 * 3 = 9

        retval = getPowerByExp(3,3);
        System.out.println(retval); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2,3)); // 출력문 안에서 메소드를 바로 출력해도 됨


    }

}
