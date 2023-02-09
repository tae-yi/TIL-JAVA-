package hongongja;

public class CarExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car(); // Car클래스로부터 변수myCar선언하고 Car()객체 만듬 // Car클래스의 필드 사용 가능
		
		// 필드값 읽기
		System.out.println("제작회사: " +myCar.company); 
		System.out.println("모델명: " +myCar.model);
		System.out.println("색깔: " +myCar.color);
		System.out.println("최고속도: " +myCar.maxSpeed);
		System.out.println("현재속도: " +myCar.speed); // 기본값 0이 저장됨
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
