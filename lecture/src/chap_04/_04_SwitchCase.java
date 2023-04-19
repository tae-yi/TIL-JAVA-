package chap_04;

import com.sun.security.jgss.GSSUtil;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그외 : 자학금 대상 아님

        // If Else 문을 이용 ( 여러 조건 또는 범위에 해당하는 조건 )
        int ranking = 4; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");


        // Switch Case 문을 이용 ( 명확한 케이스가 있는 경우 )
        /* Switch Case문의 형식
        switch ( 표현 ) {
            표현에 들어가는 경우들 나열
            case A : ... 수행할 명령 ... break;
            case B : ... 수행할 명령 ...
            default: ... 수행할 명령 ...
        } */
        ranking = 1;
        switch (ranking) {
            case 1: // ranking이 1인 경우
                System.out.println("전액 장학금");
                break; // break를 적지 않으면 하위 케이스들이 전부 출력됨
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2와 3 을 통합
        ranking = 2;
        switch (ranking) {
            case 1: // ranking이 1인 경우
                System.out.println("전액 장학금");
                break; // break를 적지 않으면 하위 케이스들이 전부 출력됨
            case 2: // break문이 없으면 다음 케이스의 출력문이 수행됨
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1: // 1등급의 경우 break문이 맨 마지막에 있으니까 그 전까지 계속 출력되기 때문에 10000원
                price += 1000; // pice = price + 1000;
            case 2: // 2등급의 경우 case2부터 break까지 수행되므로 9000원
                price += 1000;
            case 3: // 3등급의 경우 case3부터 break까지 수행되므로 8000원
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
    }
}
