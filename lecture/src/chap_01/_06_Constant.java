package chap_01;

import java.sql.SQLOutput;

public class _06_Constant {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; //국가 번호
        // KR_COUNTRY_CODE = "+8282" // 상수는 값 변경할 수 없음

        System.out.println(KR_COUNTRY_CODE);
        
        // 상수를 사용하는 경우
        // ① 변하지 않는 수학 값
        final double PI = 3.141592; // 원주율
        
        // ② 생년월일과 같은 인적사항
        final String DATE_OF_BIRTH = "2001-12-31"; // 생년월일
    }
}
