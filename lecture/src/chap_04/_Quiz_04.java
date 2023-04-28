package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산 프로그램
        // 주차요금 : 시간당 4,000원 ( 일일 최대 요금 30,000원 )
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 5; // 주차 시간
        boolean isSmallCar = true; // 경차 여부
        boolean withDisablePerson = false; // 장애인차량 여부

        int fee = hour * 4000; // 주차 정산 요금 ( 시간당 4000원 곱하기 )

        // 30,000원 초과시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }
        
        // 경차 또는 장애인 차량인 경오 50% 할인
        if (isSmallCar || withDisablePerson) {
            fee = fee / 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차요금은 " + fee + " 원 입니다.");
    }
}
