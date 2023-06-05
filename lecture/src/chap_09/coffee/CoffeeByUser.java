package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{// T :어떤 형태의 타입을 쓰던 상관 없는데, 반드시 User라는 클래스를 상속하는 T를 써야한다는 의미
    // User 또는 VIPUser클래스만 들어올 수 있음
    // 제네릭을 사용하면 어떤 형태든 받아올수있는데
    // 정해진 형태의 클래스 객체만 받겠다 할 경우

    public T user;
    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }


}
