package chap_09.coffee;

public class Coffee <T>{ // 제네릭 사용
    public T name; // 어떤 타입이 들어올지 모르기 때문에 T

    public Coffee (T name) {
        this.name = name;

    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
