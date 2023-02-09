package hongongja;

public class Student { // 클래스 선언 // 라이브러리로서의 코드(필드, 생성자, 메소드)
	
	// 실행하기 위한 코드
	public static void main(String[] args) {
	
	Student s1 = new Student(); // 객체 Student()를 변수 s1에 저장함
	System.out.println("s1 변수가 Student 객체를 참조합니다.");
	
	Student s2 = new Student();
	System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	
	}
}

