package chap_01;

public class _Quiz_01 { // 버스 도착 정보 출력
    public static void main(String[] args) {
        // 버스 번호
        String busNumber = "상암08";

        // 남은 시간
        int remainingTime = 3;

        // 남은 거리
        double remainingDistance = 1.2;

        // 결과 출력
        System.out.println(busNumber + "번 버스");
        System.out.println("약 " + remainingTime + "분 후 도착");
        System.out.println("남은 거리 " + remainingDistance + "km");
    }
}
