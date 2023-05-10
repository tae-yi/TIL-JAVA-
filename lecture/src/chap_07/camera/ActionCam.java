package chap_07.camera;

public final class ActionCam extends Camera { // 클래스 자체를 아예 상속할 수 없게 함(final)
    public final String lens; //= "광각렌즈"; (  어디에서도 값을 변경 할 수 없음 (final), 같은 클래스 내에서도 불가능함 )
    // 선언만해두고 생성자에서 초기화할 수도 있음 ( 생성자는 객체가 만들어지는 시점에 호출되기 때문에 )

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // lens 초기화
    }

    public final void makeVideo() { // 자식클래스에서는 오버라이딩을 할 수 없게됨 (final)
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }

}
