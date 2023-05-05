package chap_06;
    // 반환값 : 메소드를 수행했을 때 메소드에서 어떤값을 어떤 값을 반환해서 처리
    // 메소드 선언 시 static 다음에는 보통 메소드를 수행하고 나서 반환해 줄 반환형태(자료형)를 정의해줘야 함
    // void는 반환값이 없는 메소드라는 뜻

public class _03_Return {
   // 호텔 전화번호
    public static String getPhoneNumber() { // 문자열(String) 형태의 값을 반환하는 메소드라는 뜻
        String phoneNumber = "02-1234-5678"; 
        return phoneNumber;// 반환 키워드 return + 리턴값
        // ▶ getPhoneNumber라는 메소드가 호출되면 메소드 내에서 phoneNumber라는 정보를 반환 해줌
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가"; // 값 자체를 바로 반환할 수도 있음
    }

    // 호텔 액티비티 제공
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }
    
    public static void main(String[] args) {
       
        System.out.println("호텔 전화번호 : " + getPhoneNumber()); // 반환값 바로 사용
        String contactNumber = getPhoneNumber(); // 반환값을 받아서 저장할 변수 contactNumber 선언
        System.out.println("호텔 전화번호 : " + contactNumber);
        
        String address = getAddress(); // 반환값을 받아서 저장할 변수 address 선언
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 액티비티 : " + getActivities()); // 반환값 저장할 변수 선언하지 않고 바로 반환값을 불러서도 사용 가능함
        
    }
}
