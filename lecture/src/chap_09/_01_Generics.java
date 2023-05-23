package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 Generics : 다양한 타입의 객체를 지원하는 클래스나 인터페이스,메소드를 정의하는 방법
        // 똑같은 동작을 하는 클래스나 메소드를 여러번 만들 필요 없이 한번만 정의 후 여러타입에 지원할수 있도록 함

        // 예시
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        // 배열 데이터를 출력하는 메소드
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println(" --------------------------- ");

        // 제네릭스를 이용한 메소드 호출
        printAnyArray(iArray);
        // 기본자료형은 제네릭스를 바로 사용할 수 없음
        // ▶ Wrapper 클래스로 감싸줘야함 ↓
        // int → Integer.parseInt();
        // double → Double.toString();
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭스를 이용한 메소드 만들기
    // T : Type, K : Key, V : Value, E : Element <>
    private static <T> void  printAnyArray(T[] array) {
        // 서로 다른 타입의 데이터가 들어와도 다 처리를 할 수 있어야 하기 때문에(어떤 자료형일지 모르기 때문에 )
        // (어떤 자료형일지 모르기 때문에 ) <T>라는 값을 씀 ( T : type )
        // 꼭 T가 아니라 원하는 이름으로 해도 되지만 일반적으로 타입을 뜻하는 T로 많이 씀
        for (T t: array) {
            System.out.print(t + " ");

        }
        System.out.println();
    }

    // 일반적인 메소드
    private static void printStringArray(String[] sArray) {
        for (String s:
                sArray) {
            System.out.print(s + " ");

        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d:
                dArray) {
            System.out.print(d+ " ");

        }
        System.out.println();
    }

    // 메소드 정의
    public static void printIntArray(Integer[] iArray) {
        for (int i:
             iArray) {
            System.out.print(i + " "); // 1 2 3 4 5

        }
        System.out.println();
    }
}
