package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "임태이";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");
        
        double score = 90.5;
        char grade = 'A'; // 한글자는 char , 소문자 (' ')로 작성
        name = "강백호"; // 값 업데이트
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);
        
        double d = 3.14123456789; // 소수점을 포함하는 실수값을 적으면 기본적으로 double로 인식함
        float f = 3.14123456789F; // float는 double만큼 정밀한 값을 넣을 수 없음 // 실수를 float형으로 사용하려면 값 뒤에 F or f 적어줌
        System.out.println(d);
        System.out.println(f);
        
        long l = 1000000000000L; // int 보다 큰값인 long 자료형으로 사용하려면 값 뒤에 L or l 적어줌
        l = 1_000_000_000_000L; // 가독성을 위해 언더바(_)로 구분해 줄 수 있음 

    }
}
