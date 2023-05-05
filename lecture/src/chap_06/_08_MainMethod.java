package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) { // 문자열을 여러개 가진 String배열[]을 전달값으로 받는 메소드
        // main 메소드 : 자바프로그램이 실행될때 가장 처음으로 진입하는 부분
        for (String s: args) {
            System.out.println(s);
        }
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if(args.length == 1) {
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }
        } else {
            System.out.println("사용법) 1 ~ 3 메뉴 중 하나를 입력하세요.");
        }
        
    }
}
