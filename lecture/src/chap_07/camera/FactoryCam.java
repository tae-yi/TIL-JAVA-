package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스 ( 상속 : 자식클래스명 extends 부모클래스명

    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장카메라"); // 부모클래스의 생성자에 바로 접근
    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
        // recordVideo가 호출되면 먼저 super.(= 부모클래스에 있는 ) recordVideo()동작을 수행하고 나서 detectFire()수행
        // 자식클래스에서 오버라이딩을 하긴 하지만, 부모클래스의 메소드를 완전 뒤바꾸는 것이 아니라 
        // 부모클래스의 내용을 그대로 쓰면서 추가적인 기능을 사용하겠다
    }



    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        // 주요 기능 소개
        System.out.println(this.name + " 의 주요기능 : 화재감지");
    }
}
