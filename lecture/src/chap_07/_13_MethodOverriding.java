package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 :자식 클래스에서 부모클래스의 메소드를 덮어쓰는 동작
        // 부모클래스에 정의되어있는 메소드를 자식클래스에서 재정의
        // 자식클래스가 부모클래스의 메소드를 덮어쓰기 때문에 같은 이름의 메소드임에도 객체마다 서로 다른 동작을 할 수 있게 됨

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        

    }
}
