package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 나코 매장
        System.out.println("안녕하세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("안녕하세요. 나코입니다.");
        System.out.println("안녕하세요. 나코입니다.");
        System.out.println("안녕하세요. 나코입니다.");
        System.out.println("안녕하세요. 나코입니다.");
        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println(" ---- 반복문 사용 ---- ");

        // 반복문 For 사용
        // 단축키 fori
        // for ( 선언; 조건; 증감) { 수행명령 } -> ( 이 값을 증감 시키면서 조건이 참인 동안에 계속해서 수행명령 반복 )
        // 선언 : 값을 선언해줌
        for (int i = 0; i < 10; i++ ) { // for문 안에서 i라는 변수를 만들고 초기값을 0으로 설정
            System.out.println("어서오세요. 나코입니다." + i);
        }

        // 짝수만 출력
        // 0, 2, 4, 6, 8 출력
        for (int i = 0; i < 10; i+= 2) {
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈

        // 홀수만 출력
        // 1, 3, 5, 7, 9 출력
        for (int j = 1; j < 10; j += 2) {
            System.out.print(j);
        }

        System.out.println(); // 줄바꿈

        // 거꾸로 숫자 출력
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1 부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1 부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }

}
