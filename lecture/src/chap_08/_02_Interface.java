package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;
import com.sun.security.jgss.GSSUtil;


public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 : 뼈대만 제공하는 구조
        // 키워드 : implements
        // 인터페이스 내에서 만들어지는 모든 메소드는 자동으로 public abstract가 들어감
        // 인터페이스 내에서 만드는 변수는 자동으로 public static final 형태가 됨
        // 상속 ( 키워드 extends ) - 단점 : 부모를 하나만 가질수 있는 단일상속만 가능 → 인터페이스로 해결가능

        // 인터페이스를 구현함으로써 인터페이스를 구현하는 모든 클래스들은 인터페이스자체를 통해서 참조를 할 수 있음
        // 인터페이스 내에 있는 메소드는 인터페이스를 구현하는 클래스들에 항상 구현되어있음
        NormalReporter normalReporter = new NormalReporter();
        // Reportable normalReport = new NormalReporter(); 로도 가능
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println(" -------------------------------------- ");

        Detectable fireDetector = new FireDetector();
        // FireDetector fireDetector = new FireDetector(); 로도 가능
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        // AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector(); 로도 가능
        advancedFireDetector.detect();

        System.out.println(" -------------------------------------- ");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
