package chap_08.camera;

public class FactoryCam extends Camera {

    @Override
    public void showMainFeature() { // Camera클래스를 상속받기때문에 Camera클래스의 추상메소드를 구현해야 객체를 만들 수 있음
        System.out.println("화재 감지"); 
    }
}
