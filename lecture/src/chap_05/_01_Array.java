package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간 ( 여러 자료들을 한꺼번에 관리하기 위함 )
        // 똑같은 크기를 가지는 같은 자료형의 값 여러개를 저장
        
        // 커피 주문
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나"); // 아메리카노 하나
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");
        
        // 배열을 이용한 커피 주문
        // 배열 선언 첫번째 방법 ( 각각의 위치값 지정 )
//        String[] coffees = new String[4]; // 크기 4에 해당하는 이름이 coffees인 String배열을 선언
//        coffees[0] = "아메리카노"; // coffee배열의 어느 위치에 넣어줄건지 위치값(인덱스값)을 지정해줌 , 인덱스값 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 두번째 방법
        // String coffees[] = new String[4]; // 대괄호에 배열이름 앞,뒤에 있냐 차이

        // 배열 선언 세번째 방법 ( 배열을 만들면서 동시에 값을 지정하는 방법 )
        // [] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
        // ▶ 이때 배열의 크기 따로 명시하지 않음, 중괄호 안의 값만큼의 공간을 만듦
        
        // 배열 선언 네번째 방법
        String[] coffees =  {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 커피주문
        System.out.println(coffees[0] + "하나"); // 아메리카노 하나
        System.out.println(coffees[1] + "하나");
        coffees[2] = "에스프레소"; // 값 변경
        System.out.println(coffees[2] + "하나");
        System.out.println(coffees[3] + "하나");
        System.out.println("주세요");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
