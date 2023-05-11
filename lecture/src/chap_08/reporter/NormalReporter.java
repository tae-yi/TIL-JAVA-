package chap_08.reporter;

public class NormalReporter implements Reportable {
    // implements 구현하다
    // Reportable인터페이스에서 아직 정의되지 않은 메소드를 이 클래스에서 정의/구현해야함

    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다");
    }
    
    
}
