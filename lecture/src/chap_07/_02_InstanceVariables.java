package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        // 인스턴스 변수
        
        // 처음 만든 블랙박스
        BlackBox b1 = new BlackBox(); // b1이라는 객체를 만듦
        // 객체가 가진 인스턴스 변수에 접근
        // 블랙박스 클래스로부터 만들어진 b1 객체의 인스턴스 변수에 대해서 각각 값을 지정
        // 객체명.접근할 인스턴스 변수명 = 값;

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("--------------------");

        // 새로운 블랙박스 제품
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 30000;
        b2.color = "화이트";

        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);


    }
}
