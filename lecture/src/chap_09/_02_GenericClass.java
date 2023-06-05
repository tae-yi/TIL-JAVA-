package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        // 똑같은 동작을 하는 클래스를 여러번 만들 필요 없이 한번만 정의 후 여러 타입에 지원할수 있도록 함

        // 예시 : 커피주문
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println(" -------------------------------- ");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println(" -------------------------------- ");

        int c3Name = (int) c3.name; // object이기 때문에 형변환 해줘야 함
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name; // object이기 때문에 형변환 해줘야 함
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name; ▶ 정수형을 문자형으로 받아오게 하는 오류

        System.out.println(" -------------------------------- ");

        // 제네릭클래스 Coffee이용
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6.name);

        System.out.println(" -------------------------------- ");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println(" --------------------------------- ");
        orderCoffee("김영철");
        orderCoffee(36);

        System.out.println(" --------------------------------- ");
        orderCoffee("김희철", "아메리카노");
        orderCoffee(37,  "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) { // 값 2개이상 넣을 때
        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}
