package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";
        
        // 문자열 변환
        // ① and 를 ,로 변환
        System.out.println(s.replace(" and", ",")); // 문자열변수.replace("바뀌기 전 문자", "바꿀 문자")

        // ② 프로그램의 종류에 대해서만 출력
        // 출력을 원하는 부분의 시작위치와 끝 위치를 지정해줌 substring
        // 주의 : s 변수에 변환 결과가 반영되는 것은 아님
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작 ( 이전 내용은 삭제 )
        System.out.println(s.substring(0, 8)); // 인덱스기준 0번째 위치 부터 8번째 위치 직전까지
        System.out.println(s.substring(s.indexOf("Java"))); // Java의 위치를 찾아서 그 위치부터 시작해서 출력 // 위 문장과 동일
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // s.substring(s.indexof("시작글자"),s.indexof("끝글자"));
        // ▶ 시작위치는 시작 문자열을 포함(Java 포함), 끝위치는 끝문자열을 포함하지 않음( . 포함 x ) = 시작 위치부터 끝문자 "직전"까지 잘라냄

        // ③ 공백 제거
        s = "        I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 불필요한 앞 뒤 공백 제거

        // ④ 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // s1 + .concat(,) + concat(s2) 의 의미
        // ▶ concat(=concatenate) : 괄호 안 문자열을 전부 결합해서 반환해 주는 함수
        // ▶ s1문자열 + .concat()문자열
        // ▶ .concat()을 이어서 작성하면 문자열을 계속 결합 할 수 있음
        

    }
}
