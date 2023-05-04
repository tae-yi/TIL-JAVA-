package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키코드 ( ASCII ) : 정보교환을 위한 미국 표준 코드
        // 아스키코드는 하나의 문자이기 때문에 char로 변수 만듬
        char c = 'A'; // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작.
        System.out.println(c);
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c);
        System.out.println((int)c); // 66

        c++;
        System.out.println(c);
        System.out.println((int)c); // 67

        char d = 'a'; // 97
        System.out.println(d);
        System.out.println((int)d);

        d = 'b'; // 98
        System.out.println(d);
        System.out.println((int)d);

        d++; // 99
        System.out.println(d);
        System.out.println((int)d);

        char e = '0';
        System.out.println(e); // 0
        System.out.println((int)e); // 48

        e = '1';
        System.out.println(e); // 1
        System.out.println((int)e); // 49

        e++;
        System.out.println(e); // 2
        System.out.println((int)e); // 50

        // 영화관 좌석 아스키코드로 작성
        // 세로크기 10 * 가로크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';

        for (int i = 0; i <seats3.length ; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++; // A가 끝나면 B, B가 끝나면 C로 알파벳순으로 넘어감
        }
        // 영화관 좌석 번호 확인

        for (int i = 0; i < seats3.length; i++) { // 세로 기준
            for (int j = 0; j < seats3[i].length; j++) { // 가로 기준
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();

        }
    }
}
