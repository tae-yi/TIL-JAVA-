package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 부모클래스의 어떤 것을 자식클래스에서 사용하게 하는 역할
        // 부모클래스의 동작을 수행하고나서 자식클래스에서 원하는 추가적인 동작을 사용
        // 자식클래스에서 오버라이딩을 수행하지만,
        // 부모클래스의 메소드를 완전 뒤바꾸는 것이 아니라 부모클래스의 내용을 그대로 쓰면서 자식클래스의 추가적인 기능을 사용한다는 의미
        // 'super.' 을 통해서 부모클래스의 변수나 메소드에 접근할 수 있음

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println(" -------------------- ");
        speedCam.takePicture();

    }
}
