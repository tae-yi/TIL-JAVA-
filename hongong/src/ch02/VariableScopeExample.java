package ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 +5; // 변수 v2를 사용할수 없기 때문에 컴파일 에러 발생

	}

}
