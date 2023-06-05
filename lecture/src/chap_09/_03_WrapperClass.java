package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래버 (Wrapper) 클래스 
        // int, double 같은 기본 자료형들을 객체형태로 만들어서 사용하는 것 ( 대문자 첫글자로 시작 )
        // 클래스이기 때문에 기능들을 제공해 줌

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double  d= 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println(" ------------------------ ");
        
        // 래퍼 클래스 제공 기능
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 int로 바꿔서 형변환해줌
        System.out.println(c.charValue());

        System.out.println(" ------------------------ ");
        // 정수 → 문자열
       String s = i.toString();
        System.out.println(s);

    }
}
