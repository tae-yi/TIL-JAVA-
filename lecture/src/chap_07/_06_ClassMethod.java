package chap_07;

public class _06_ClassMethod {
    // 클래스 메소드 : static 키워드가 붙은 메소드는 클래스 메소드, 모든 객체에 공통적으로 적용
    // 객체가 만들어 지지 않고도 '클래스이름.메소드이름' 으로 바로 접근 가능
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        // 클래스 메소드도 클래스이름을 가지고 직접 접근할 수 있음
        BlackBox.callServiceCenter();

        // static으로 선언한 클래스변수는 static 메소드에서 바로 사용할 수 있음
        // 그런데 modelName같은 인스턴스 변수는 객체가 만들어져야 만들어지는 변수이기 때문에 static 클래스 변수 내에서는 직접 접근할 수 없음
        // 그래서 클래스메소드를 사용하는 경우는 메소드내에서 인스턴스 변수의 사용이 필요 없는 경우 사용

        String s = String.valueOf(3);
    }
}
