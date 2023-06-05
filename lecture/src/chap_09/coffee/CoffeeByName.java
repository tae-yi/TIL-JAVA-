package chap_09.coffee;

public class CoffeeByName {
    public Object name;
    // object클래스는 모든 클래스의 조상클래스로 따로 상속하지 않아도 자동으로 상속을 하게 되어있음

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
