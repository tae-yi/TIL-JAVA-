package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));// 두 문자열이 똑같은지 비교 // 문자열 내용이 같으면  true, 다르면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // 대소문자 구문으로 false

        // 대소문자 구분없이 문자열 내용이 같은지 여부 체크관계없이 내용이 똑같으면 true 반환
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        // ① 식당 벽에 붙은 화장실 비밀번호 정보 ( 참조 )
        s1 = "1234";
        s2 = "1234";
        // ▶ 두 값이 같아서 너도 여기 값을 가져다 써! 하는 상황
        // ▶ ( 두 값이 같기 때문에 같은 번지에 있는 값을 두 변수가 참조하게됨, 서로 참조하는 값 같음 )
        System.out.println(s1.equals(s2)); // true // 내용 비교
        System.out.println(s1 == s2); // true // 참조가 같은지 비교
        
        // ② 각각의 손님들에게 화장실 비밀번호를 각각 적어서 나눠준 것
        s1 = new String("1234");
        s2 = new String("1234");
        // ▶ 값은 같지만 개별적으로 값이 저장됨 ( 서로 참조 하는 값이 다름 )
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        // ▶ Java에서 일반적으로 문자열 내용을 비교할 때는 등호를 쓰지말고 equals를 써야한다.

    }
}
