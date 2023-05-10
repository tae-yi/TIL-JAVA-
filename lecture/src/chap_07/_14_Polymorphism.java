package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성 (Polymorphism)

        // 상속은 IS-A관계
        // class Person : 사람;
        // class Student extends Person : 학생 (학생은 사람이다.Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 살마이다. Teacher is a Person)

        // 다형성 : 부모클래스로 서로다른 형태의 객체를 만들 수 있음
        // 부모클래스는 부모클래스 객체, 부모클래스는 상속받는 자식클래스의 객체를 만들 수 있고
        // 부모 클래스는 또다른 자식클래스의 객체를 만들 수 있음


        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println(" --------------------------- ");

        // 다형성의 이점
        // 1. 객체도 배열로 관리할 수 있음
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();
        }
        System.out.println(" --------------------------- ");

        // 부모 클래스로 자식클래스의 객체를 만들었을 때 문제점
        // 부모클래스에 있는 메소드만 접근을 할 수 있어서 자식클래스의 메소드에는 접근할 수 없음
        // 해결방법 : A instanceof B -> 형변환
        // ▶ instanceof를 통해서 A객체가 B클래스로부터 만들어진 객체(인스턴스)인지를 확인하고 true이면
        // ▶ 형변환을 통해서 그 클래스의 메소드에 접근할 수 있다
        // A instanceof B : ' A객체가 B라는 클래스로부터 만들어진 객체이면 '

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }
        
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire(); // (형변환하려는 클래스이름)객체명
            // -> factoryCam객체는 FactoryCam이라는 클래스로 형변환해주고 .찍고 각각의 객체의 주요기능(메소드)사용 가능
        }
        
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
        }

        // 참고
        // 자바는 기본적으로 모든 자바 클래스는 object라는 클래스를 상속하고 있음
        // 그렇기 때문에 object배열을 쓰게되면 어떤 형태이던 간에 모든 클래스 객체를 집어넣어서 한꺼번에 관리할 수 있음
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}


