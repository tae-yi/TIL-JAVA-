package chap_07.camera;

public class SpeedCam extends Camera { // 자식 클래스

    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicencePlate();

    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicencePlate() {
        // 번호판 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation : 주석
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호 인식");
    }
}
