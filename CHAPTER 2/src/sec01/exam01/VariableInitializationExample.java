package sec01.exam01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		// 변수 value 선언
		int value;    // 변수에 값이 저장되지 않지 않았기 때문에 변수초기화되지 않음
		
		// 변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;  // value가 변수초기화되지 않았기 때문에 오류발생
		
		//변수 result값을 읽고 콘솔에 출력
		System.out.println(result);
	}

}
