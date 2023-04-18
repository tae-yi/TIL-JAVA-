package chap_03;

import java.sql.SQLOutput;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 ( Escape Sequence, Escape Charater, Special Character )
        // 자바에서 문자열을 사용할 때 어떤 약속이 되어있는 특별한 기능을 하는 문자

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // ① \n 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // ② \t : 탭만큼 띄우는 기능
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");
        
        // ③ \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");
        
        // ④ \" : 큰따옴표
        // 단비가 "냐옹"이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");
        
        // ⑤ \' : 작은따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\'라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?'라는 표정을 지었어요"); // 큰따옴표 안에 작은따옴표료 감쌀수 있기때문에 \'로 쓰지 않아도 가능
        // ▶ 그래서 char 변수에 값을 줄 때 작은따옴표를 넣고싶을 때 사용
        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
