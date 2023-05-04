package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees =  {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문을 이용한 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------");

        // 배열의 길이를 이용한 순회 ( .length )
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------");

        // enchanced for ( for-each ) 반복문 ▶ 단축키 : foreach
        // for (배열과 같은 자료형의 변수 : 순회할 변수)
        for (String coffee : coffees) { // coffees라는 배열에 있는 값들을 순회하는데 그때그떄 순회되는 값들을 coffees라는 이름으로 받아서 사용
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
