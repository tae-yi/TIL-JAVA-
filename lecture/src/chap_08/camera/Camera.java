package chap_08.camera;

public abstract class Camera { // 추상클래스 (abstract)
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상메소드
    public abstract void showMainFeature();
    // ▶ 추상클래스에서 정의하는 추상메소드는 선언만해줌 → 상속받는 자식클래스에서 이 메소드를 구현하도록 해줌

}
