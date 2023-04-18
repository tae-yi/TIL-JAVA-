package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번호에서 생년월일 및 성별까지만 출력
        String idNum = "901231-1234567"; //주민등록번호 13자리
    
        // 내가 푼 방법
        System.out.println(idNum.substring(idNum.indexOf("9"),idNum.lastIndexOf("2")));

        // 다른 방법 ①
        System.out.println(idNum.substring(0, 8)); // 0 위치부터 8 위치 직전까지

        // 다른 방법 ②
        System.out.println(idNum.substring(0, idNum.indexOf("-")+2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
