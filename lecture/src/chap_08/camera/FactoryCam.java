package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    // Detectable, Reportable 인터페이스의 기능을 사용할 수 있게됨

    private Detectable detector; // 객체
    private Reportable reporter; // 객체

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() { // Camera클래스를 상속받기때문에 Camera클래스의 추상메소드를 구현해야 객체를 만들 수 있음
        System.out.println("화재 감지"); 
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }

}
