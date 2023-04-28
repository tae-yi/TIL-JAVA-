package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체거리 25m
        int move = 0; // 현재 이동거리 0m
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복분 #1 --- ");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");
        System.out.println(" --- 반복분 #2 --- ");

        // Do While 반복문
        // do { } while (조건);
        // 조건 상관없이 일단 do{}를 수행하고 나서 while(조건)을 확인해서 반복할지 결정
        // 최소 한번은 do{}를 실행
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");

    }
}
