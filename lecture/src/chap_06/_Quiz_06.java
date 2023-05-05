package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // subString()을 이용하면 문자열의 일부를 자를 수 있음
//        for (int i = 0; i < data.length() - index; i++) { // 비공개시작 위치
//            hiddenData += "*";
//        }
        for (int i = 0; i < data.length() - index ; i++) { // 비공개시작 위치
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램 작성
        
        // 개인정보를 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작 처리
        // 각 정보는 아래 위치부터 비공개 적용
        // 이름 : 두번째 글자
        // 주민등록번호 : 9번째 글자
        // 전화번호 : 10번째 글자

        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
