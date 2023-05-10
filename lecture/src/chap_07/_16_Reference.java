package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조 Reference
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean ...)
        // 소문자로 시작
        // 기본 자료형은 배열로 선언을 하는데 값을 지정해주지 않으면 기본적으로 설정되는 값이 있음
        // 기본자료형은 메소드를 가질 수 없음

        int[] i = new int[3];
        System.out.println(i[0]); // 0
        

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, 객체 ...
        // 대문자로 시작
        // 참조 자료형은 값을 따로 지정하지 않으면  null이 기본값
        // 참조 자료형은 메소드를 가질 수 있음
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

        System.out.println(" ----------------------------- ");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10
        b = 30;
        System.out.println(a); // 10
        System.out.println(b); // 30
        
        // a와 b는 별도로 움직임

        System.out.println(" ----------------------------- ");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2 = c1; // c2가 c1이 참조하고 있는 객체를 참조하게 됨
        // ▶ c1의 값을 c2에 그대로 넣는게 아니라, c1이 참조하고 있는 내용을 c2도 참조하도록 하게 되는 것
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1
        c2.name="고장난 카메라"; // c2가 c1의 객체를 참조하고 있기때문의 c1이 참조하고 있는 객체의 이름이 바뀜
        System.out.println(c1.name); // 고장난 카메라
        System.out.println(c2.name); // 고장난 카메라
        
        // c2에 c1을 집어넣은 후 c1과 c2가 함께 변동됨
        // c2라는 객체는 어딘가에 만들어져 있는 객체를 참조하기 때문
        System.out.println(" ----------------------------- ");
        changeName(c2); 
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // 잘못된 카메라

        // 참조 관계를 끊고 싶으면?
        c2 = null;
        System.out.println(c2.name); // nullPointException오류 ( 빈값이므로 )
    }

    public static void changeName(Camera camera) { // camera객체도 c2가 참조하고 있는 c1객체를 참조하게 됨
        camera.name = "잘못된 카메라"; // c1이 참조하고 있는 객체의 이름이 바뀌게 됨
    }
}
