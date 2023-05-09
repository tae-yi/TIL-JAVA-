package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        // Getter & Setter : 이상한 값이 들어간다던지하는 값을 설정하면서 일어날수 있는 오류를 줄일 수 있음
        // 값을 가져오는 과정에서도 값이 없다거나 이상할때의 대안으로 줄 수 있는 값을 설정 할 수 있음 ( 필드 값에 부적절한 값이 대입되는 것을 막기 위해 )
        // Getter : 값을 가지고 오는 메소드
        // Setter : 값을 설정하는 메소드
        // 객체지향 프로그래밍에서 객체 데이터는 객체 외부에서 접근하는것을 막음 ( 외부에서 변경시 객체의 무결성 깨짐 )
        // 따라서 객체 지향 프로그래밍에서는 메소드를 통한 데이터 변경방법 선호
        // 데이터는 외부에서 접근하지 않도록 막고, 메소드는 공개해서 외부에서 메소드를 통해 데이터에 접근하도록 유도 )-> setter

        // 외부에서 객체의 데이터를 읽을때
        // 객체 외부에서 객체 필드값을 사용하기 부적절한 경우 메소드로 필드값을 가공 후 외부로 전달 -> Getter

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인행사 -5,000
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println(" -------------------------- ");
        
        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격은 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
