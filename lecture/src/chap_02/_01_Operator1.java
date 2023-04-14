package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자 ( 계산 )

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 ( 정수 계산일 경우 결과도 정수로 나옴 )
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0 -> % : 나머지 연산자 ( 4를 2로 나눴을 때의 나머지 )
        System.out.println(5 % 2); // 1

        // 우선 순위 연산 조정 ()
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b; // 30
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --

        // val에 1씩 더해주는 방법
        // ① val = val + 1;
        // ② val++; -> 문장의 연산을 먼저 수행하고 나서 val에 1이 더해짐
        // ③ ++val; -> val에 1을 더하는 연산을 하고 나서 다른 문장이 수행
        
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // ++val이 실행되고 sout 실행 -> 11이 연산되고 sout이 실행되서 출력 // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val);
        System.out.println(val++); // val값인 10이 출력되고 나서 ++ 이 실행되기 때문에 출력값은 10
        System.out.println(val); // 11 -> 위에서 10 + 1 이 된 상태

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // --val이 실행되고 sout 실행 -> 9가 연산 연산되고 sout이 실행되서 출력 // 9
        System.out.println(val); // 9 

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // val값인 10이 출력되고 나서 -- 이 실행되기 때문에 출력값은 10
        System.out.println(val); // 9 -> 위에서 10 -1 이 된 상태

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 1 -> 위에서 0 출력 후 1이 된 상태에서 출력됨
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 2 -> 위에서 1 출력 후 2가 된 상태에서 출력됨
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3 -> 위에서 2 출력 후 3이 된 상태

       
        



    }
}
