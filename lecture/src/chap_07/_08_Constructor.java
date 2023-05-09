package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        // Constructor 생성자 : 객체가 만들어 질 때 자동으로 호출되는 메소드
        // 만드는 방법 : 클래스명과 똑같이 적어줌, 반환형 따로 없음 ▶ ' 클래스명() {} '
        // 생성자도 오버로딩 가능

        // 이 객체가 만들어 질 때 반드시 해야되는 동작을 명시하거나,
        // 클래스에 정의되어있는 인스턴스 변수들의 값을 설정하는 등의 초기화 작업을 하고 싶을 때 생성자 사용
        BlackBox b1 = new BlackBox(); // 생성자1 
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println(" ------------------------ ");

        BlackBox b2 = new BlackBox("하양이", "UHD", 30000, "화이트"); // 생성자2
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
        // ▶ 생성자를 따로 정의해서 한번에 값을 전달받고, 그 값들을 인스턴스 변수에 직접 집어넣거나, 다른 초기작업을 생성자내에서 할 수 있음
        
        
    }
}
