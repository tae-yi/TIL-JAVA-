package chap_07;

public class BlackBox { // 메인메소드 필요 없이 변수들 정의
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 넘버
    
    // 이 값들을 인스턴스 변수, 필드라고 함
    // 인스턴스 변수들은 각각 클래스로 부터 만들어진 객체들마다 서로 다른 값을 가질 수 있음

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false;  // 자동 신고 기능
    // ▶ static을 붙이면 클래스 변수 ( 클래스 내의 클래스 변수 ) : 이 클래스로 만들어지는 모든 객체에 똑같이 공통적으로 적용됨
    // ▶ 접근 방법 : '객체. ' 으로 접근할 수도 있지만, 일반적으로 '클래스명.클래스변수명' 방법으로 접근함
    // static 안붙은건 인스턴스 변수 ( 서로 다른 객체에서 서로 다른 값들을 가짐 )

    // 생성자 만드는 법 : 클래스명() {}
    BlackBox() { // 생성자1
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++ counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) { // 생성자2
//        this(); // 기본 생성자 호출
//        // 기본생성자에 바로 접근해서 기본생성자의 동작을 수행하고 나서 아래의 동작들을 수행함
//        // 생성자2로 접근하고싶으면 this("모델명","해상도"...);로 접근하면 됨
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }


    // 메소드 : 클래스 내에서 기능을 정의해서 기능을 클래스로부터 만들어진 객체가 사용하도록 할 수 있음
    void autoReport() { // 자동으로 신고하는 기능의 메소드
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }

    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + " GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if( type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
            return 10;
    }

    // showDateTime : 날짜 정보 표시 여부
    // showSpeed :속도 정보 표시 여부
    // min : 영상 기록 단위 ( 분 )
    void recode(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    
    void recode() { // recode 메소드 오버로딩
        recode(true,true,5); // recode()를 호출하면 기본값으로 나오도록 함
        // recode메소드가 호출될 때 메소드안의 기존 recode 메소드를 새롭게 호출하면서, 기존메소드의 동작을 수행함
        // 메소드의 똑같은 동작은 여러번 정의하지 않고 새롭게 메소드를 호출하는데, 그때 값만 기본적으로 정의된 값을 던져줌

    }
    static void callServiceCenter() { // 클래스 메소드, 모든 객체에 공통적으로 적용
        System.out.println("서비스 센터 (1588 - 0000) 로 연결합니다.");
    }


     void appendModelName(String modelName) {
        // 모델네임을 추가하는 메소드, 'String modelName' 으로 전달되는 모델네임을 원래 가지고 있는 모델네임에 추가
        // modelName += modelName; // 앞은 인스턴스 변수, 뒤는 파라미터 전달값으로 다른 변수지만 이름이 같아서 오류
        // 이처럼 인스턴스변수와전달값의 이름이 똑같은 경우 클래스가 가지고 있는 인스턴스변수를 명시하고 싶은 경우 this.을 붙여줌
         this.modelName += modelName; // this.을 붙이면 클래스의 인스턴스변수에 직접 바로 접근 할 수 있음
    }
    // Getter & Setter
    String getModelName() { // 모델 네임을 가져오는 메소드
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }
    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }

}
