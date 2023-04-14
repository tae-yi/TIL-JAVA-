package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // ( or : || ) -> 이 중 하나라도 참이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // ( and : && ) -> 조건을 모두 만족해야 true

        // AND 연산자 && ( 조건이 모두 참이어야 true )
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다 -> 두 조건이 모두 참이어야 true
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다 -> false

        // OR 연산자 || ( 조건 중 하나라도 참이면 ture )
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다 -> true
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나, 3은 1보다 작다 -> true
        System.out.println((3 < 3) || (3 < 1)); // 5는 3보다 작거나, 3은 1보다 작다 -> false

        // 논리 부정 연산자 ! : 어떤 식의 값이 true이면 false로, false이면 true로 (반대로) 해줌
        System.out.println(!true); // -> false
        System.out.println(!false); // -> true
        System.out.println(!(5 == 5)); // 5는 5와 같다 (true)의 반대 -> false
        System.out.println(!(5 == 3)); // 5는 3고 같다 (false)의 반대 -> true

        // 불가능한 코드
        // System.out.println(1 < 3 < 5); // 연속적으로 숫자 비교 할 수 없음


    }
}
