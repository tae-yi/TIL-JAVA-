package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 상수
        // 역할 : 클래스,변수,메소드 앞에 final을 붙여서 오버라이딩, 값 변경, 클래스 상속을 할 수 없게 함

        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        // actionCam.lens ="표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println(" ------------------------- ");

        SlowActionCam slowActionCam = new SlowActionCam();



    }
}
