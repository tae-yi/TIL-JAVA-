package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 추상 클래스 AbstractClass

        // 데이터 추상화 ( Data Abstraction )
        // : 몰라도되는 디테일한 부분은 숨기고 꼭 필요한 정보만 공개하도록 하는 과정
        // 추상클래스나 인터페이스를 통해서 데이터 추상화를 가능하게 함

        // abstract 키워드를 통해서 만들 수 있는 것
        // ① 추상 클래스 : 아직 완성되지 않은 클래스 -> 완성되지 않은 모호한 상태라 객체로 만들 수 없음
        // 추상클래스를 상속받은 자식 클래스에서는 객체를 만들 수 있음
        // 추상클래스에는 추상메소드를 만들수도 있고 안만들수도 있음
        // 추상클래스에 추상메소드가 있으면 자식클래스에서는 반드시 추상메소드를 구현해야함
        
        // ② 추상 메소드 : 추상클래스 또는 인터페이스에서만 사용 가능한 껍데기만 있는 메소드
        

        // Camera camera = new Camera(); // 추상클래스라 객체를 만들 수 없음
        FactoryCam factoryCam = new FactoryCam(); // 자식클래스라 객체 만들 수 있음
        // Camera factoryCam = new FactoryCam(); // 상속받는 클래스로 관리할 수도 있음
        factoryCam.showMainFeature();


        SpeedCam speedCam = new SpeedCam(); // 자식클래스라 객체 만들 수 있음
        // Camera speedCam = new SpeedCam(); // 상속받는 클래스로 관리할 수도 있음
        speedCam.showMainFeature();

        
    }
}
