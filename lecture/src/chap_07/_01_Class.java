package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 :  우리가 생각할 수 있는 사물, 동물

        // 객체 지향 프로그래밍 ( OOP : Object-Oriented Programming )
        // 객체들끼리 어우러진 형태로 프로그램을 구성
        // 특징① : 유지보수 용이 ( 작성한 코드의 변경이 필요할 때 편리하다 )
        // 특징② : 높은 재사용성 ( 기존에 작성한 코드를 다른 프로그램이나 다른 프로젝트에서 사용할 때 수월함 )

        // 차량용 블랙박스
        // 모델명, 헤상도, 가격, 색상

        // 우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 20000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 30000;
        String color2 = "화이트";

        // 또다른 제품을 개발?
        BlackBox bbox = new BlackBox(); // 클래스이름 객체이름 = new 클래스이름();
        // 블랙박스라는 클래스로부터 bbox라는 객체를 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();
        // 똑같은 BlackBox라는 설계도를 가지고 bbox2라는 또다른 객체를 생성
        
        // 클래스 : 서로 다른 자료형이지만, 서로 비슷한것들 끼리 모아둔 하나의 형태
        // 클래스 : 설명서, 설계도 ( ex. 종이접기 책 )
        // 객체 : 설계도로부터 만들어진 결과물 ( ex. 종이학 )
        





    }
}
