package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속 : 부모클래스에서 제공되는 모든것들을 자식클래스에서 가져다 쓴다
        // 상속은 한 부모(하나의 부모 클래스)로부터만 가능 ▶ 여러개 안됨
        // 자식클래스명 extends 부모클래스명

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicencePlate();
    }
}
