package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // 정수형을 실수형(float, double)으로 // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // 실수형(float, double)을 정수형으로 // float, double to int
        float score_f = 93.8F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.9; // 93 + 98
        System.out.println(score); // 191

        score_d = 93 + 98.8; // 93.0 + 98.9
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double // ( 자동 형변환 ) 작은 범위 -> 큰범위

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int ( 수동 형변환 )

        // 숫자를 문자열로 변환
        // ① valueOf : 클래스가 제공해주는 valueOf 기능을 써서 문자열로 변환
        String s1 = String.valueOf(93); // String이라는 클래스가 제공해주는 valueOf기능을 써서 93이라는 정수를 문자열로 바꿔준다

        // ② .toString : 괄호()안에 넣은 값을 문자열로 바꿔주는 기능
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8
        
        // 문자열을 숫자로 변환
        // ① Integer.parseInt()
        int  i = Integer.parseInt("93");
        System.out.println(i); // 93

        // ② Double.parseDouble()
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8
        
        // int error = Integer.parseInt("자바"); // 알맞은 자료형 값을 넣어주지 않으면 오류 발생


    }
}
