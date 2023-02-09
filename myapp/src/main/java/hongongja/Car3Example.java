package hongongja;

public class Car3Example {

	public static void main(String[] args) {
		Car3 car1 = new Car3(); // 생성자1 선택
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("자가용"); // 생성자2 선택
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();

		Car3 car3 = new Car3("자가용", "빨강"); // 생성자3 선택
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("자가용", "검정", 200); // 생성자4 선택
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		
	}

}
