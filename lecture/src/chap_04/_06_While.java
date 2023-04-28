package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While ( 명확한 횟수가 없을 때 ), 조건이 참인 동안 반복 수행
        // 수영장 한바퀴
        int distance= 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리
        
        // while (조건) { 수행명령 }  -> 조건을 만족하는(참인 동안 ) 동안 수행 명령 반복
        while (move < distance) { // 현재 이동거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 발차기 한번 할때 마다 3미터 이동
        }
        System.out.println("도착하였습니다.");

        // 무한 루프 -> 무한 반복되지 않도록 주의하기 ( 탈출 조건을 꼭 만들어 줘야 함 )
        move = 0;
        while (move < distance) { // 현재 이동거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착하였습니다.");
        
    }
}
