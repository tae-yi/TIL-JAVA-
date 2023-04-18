package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I LIKE Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 확인
        System.out.println(s.length()); // 29
        
        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환
        
        // 포함 관계 indexof
        System.out.println(s.contains("Java")); // Java라는 문자가 포함되어 있는지 확인 // 포함된다면 true, 포함되지 않는다면 false
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치정보 7 //  찾는 문자의 위치 정보 확인 // 문자열의 시작은 0부터 시작
        System.out.println(s.indexOf("C#")); // 존재하지 않는 문자열일 경우 -1 반환
        System.out.println(s.indexOf("and")); // 중복되는 문자열일 경우 처음 나오는 문자열을 기준으로 위치 정보 반환 (12)
        System.out.println(s.lastIndexOf("and"));// 중복되는 문자열 중 가장 마지막에 위치하는 문자열 위치 정보 반환(23)
        // 문장이 어떤 말로 시작하는지, 어떤 문자열로 끝이 나는지 확인
        System.out.println(s.startsWith("I LIKE")); // 이 문자열로 시작하면 true ( 아니면 false )
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true ( 아니면 false )
    }
}
