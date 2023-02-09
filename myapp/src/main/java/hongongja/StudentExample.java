package hongongja;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // 객체 Student()를 생성 후  변수 s1에 저장함
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
