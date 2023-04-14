package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이기구 탑승 여부 확인
        // 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용

        // ①
        int tall = 121;
        String ok = (tall >= 120) ? "키가 " + tall + "cm 이므로 탑승 가능합니다" : "키가 " + tall + "cm 이므로 탑승 불가능합니다";
        System.out.println(ok);

        tall = 115;
        ok = (tall >= 120) ? "키가 " + tall + "cm 이므로 탑승 가능합니다" : "키가 " + tall + "cm 이므로 탑승 불가능합니다";
        System.out.println(ok);

        // ②
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);



    }
}
