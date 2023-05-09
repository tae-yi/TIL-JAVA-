package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 : 폴더 구조 ( 자바 클래스들을 비슷한 것들끼리 정리해주는 폴더 )
        // 서로 연관된 클래스들끼리 묶어두는 역할

       // 자바에서 제공하는 랜덤 클래스 사용 ( 어떤 값을 랜덥으로 뽑음 )
        Random random = new Random(); // 랜덤이라는 객체 사용
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 ~ 10미만의 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0미만의 실수 값
        // System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0)); // nextDouble는 범위를 지정할 수 없음

        // 만약 실수에서 범위를 지정해주고 싶다면?
        // 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));
        // 1. (max - min) * random.nextDouble() -> (10-5)*random.nextDouble() -> 0.0 이상 5.0미만의 실수값으로 범위가 변함
        // 2. (min + 0.0 이상 5.0 미만의 실수값 ) -> 5 + 0.0 이상 5.0 미만의 실수값 -> 5.0 이상 10.0 미만의 실수값

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1 ~ 45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        // 1. nextInt(45) : 0이상 45미만의 수
        // 2. nextInt(45) + 1 -> 1 이상 46미만의 수 = 1 이상 45 이하의 수
        
        // 자바에서 제공하는 클래스
        // Math, Scanner, StringBuilder, StringBuffer, StringTokenize 등등,,,
    }
}
