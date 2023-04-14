package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자 : 어떤 조건을 만족하면 이 값을 넣고, 그 조건을 만족하지 않으면 저 값을 넣음
        // " 결과(가 저장될 변수) = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값) "
        // 조건이 참이면 참의 결과값이 결과에 들어가고, 조건이 거짓이면 거짓의 결과값이 결과에 들어감
        
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        // (x > y)가 참이면 x가 max에 들어가고, 거짓이면 y가 max에 들어감
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        // (x == y)가 참이면 true, 아니면 false가 b의 값으로 들어감
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);
        
    }
}
