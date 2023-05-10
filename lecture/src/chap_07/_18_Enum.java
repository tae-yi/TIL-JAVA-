package chap_07;

import com.sun.security.jgss.GSSUtil;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 ( Enum ) : 특수한 형태의 클래스, 상수들의 묶음
        // 예시
        // 달력 : JAN, FEB, MAR ...
        // 옷 사이즈 : S, M, L, Xl ...
        // OS 종류 : WIN10, WIN11, MACOS, LINUX ...
        // 해상도 : HD, FHD, QHD, UHD ...

        // 문법 : enum 열거체이름 { 상수1이름, 상수2이름 ... }
        // 정의된 열거체 사용방법 : 열거체이름.상수이름

        Resolution resolution = Resolution.HD;
        // resolution 이라는 열거형은 HD라는 값을 가지게 됨
        System.out.println(resolution); // HD

        resolution = Resolution.FHD;
        System.out.println(resolution); // FHD

        System.out.print("동영상 녹화 품질: ");
        switch (resolution) {
            case HD:
                System.out.println("일반 화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        // valueOf()메소드 : 전달된 문자열과 일치하는 해당 열거체의 상수 반환
        System.out.println(resolution);

        System.out.println(" --------------------------- ");

        // 반복문을 이용한 열거형의 값과 순서를 알아보기
        for (Resolution myRes : Resolution.values()) {
            // values()메소드 : 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환
            // 자바의 모든 열거체에 컴파일러가 자동으로 추가해주는 메소드
            System.out.println(myRes.name() + " : " + myRes.ordinal());
            // ordinal()메소드 : 열거체 정의에서 정의된 순서 반환
            // name()메소드 : 해당 열거체 상수의 이름 반환
        }

        System.out.println(" --------------------------- ");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }



    }
}

        // 선언 방법 : ' enum 열거형 클래스 이름 '
        enum Resolution {
            // 열거형의 값들 대문자로 정의
            HD(12980), FHD(1920), UHD(3840); // ④ 각각의 상수에 width값 넣어주기

            // 각각의 상수가 가지는 진짜값이나 내포하고 있는 값을 알고 싶을 때?
            // ① 값을 저장할 변수 선언
            private final int width;

            // ② 값 정의
            Resolution(int width) {
                this.width = width;
            }

            // ③ 값을 사용하기위해 getter 만들어 주기
            public int getWidth() {
                return width;
            }


}
