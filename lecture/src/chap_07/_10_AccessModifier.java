package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        //  캡슐화 ( Encapsulation ) : 필요한 것들 끼리만, 서로 연관된 것들 끼리만 하나의 캡슐에 담음
        // 정보은닉 ( Information hiding ) : 정보를 숨김, 객체내의 변수/메소드의 직접적인 접근을 막고 객체에서 허용해주는 형태로만 접근 가능

        // 접근 제어자 AccessModifier : 접근을 제어 
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근
        // default : ( 아무것도 적지 않았을 때 ) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지내에서접근 가능, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackboxRefublish b1 = new BlackboxRefublish();
        b1.modelName = "까망이";
        b1.setPrice(200000); // price는 제어자가 private이므로 getPrice,setPrice 으로만 접근할 수 있음
        b1.color = "블랙";

        // 할인행사 -5,000
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println(" -------------------------- ");

        BlackboxRefublish b2 = new BlackboxRefublish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격은 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}

// 자바파일 내에는 클래스를 여러개 정의할 수 있는데, public 클래스를 정의하는 경우에는 자바파일명과 똑같아야 한다