package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera{
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reportable) {
        this.reporter = reportable;
    }

    @Override
    public void showMainFeature() { // Camera클래스를 상속받기때문에 Camera클래스의 추상메소드를 구현해야 객체를 만들 수 있음
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        this.detector.detect();
    }

    public void report() {
        this.reporter.report();
    }
}
