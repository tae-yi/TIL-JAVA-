package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 변산자
        int num = 10;
        num = num + 2;
        System.out.println(num); // 12

        num = num -2;
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 2;
        System.out.println(num); // 10

        num = num % 2;
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 10;
        num += 2; // ' num= num + 2; '와 같은 문장
        System.out.println(num); // 12

        num -= 2; // ' num = num -2; '와 같은 문장
        System.out.println(num); // 10 ( 12 - 2 )

        num *= 2; // ' num = num * 2; ' 와 같은 문장
        System.out.println(num); //  20 ( 10 * 2 )

        num /= 2; // ' num = num / 2; '와 같은 문장
        System.out.println(num); // 10 ( 20 / 2 )

        num %= 2; // ' num = num % 2; '와 같은 문장
        System.out.println(num); // 0 ( 10 % 2 )
    }
}
