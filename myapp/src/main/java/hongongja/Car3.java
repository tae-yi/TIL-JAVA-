package hongongja;

public class Car3 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car3() { //생성자1 
		
	}
	
	Car3(String model) { // 생성자2		
		this.model = model; 
	}
	
	Car3(String model, String color) { // 생성자3
		this.model = model; 
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed) { // 생성자4
		this.model= model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
