package s21204_00;
//클래스 정의
	class Circle {
		int radius;				//자료형 필드 반지름
		String color;			//자료형 필드 색상
		double calcArea() {		//반환형 메소드
			return 3.14 * radius * radius;	//해당 값 리턴
		}
	}
public class S21204_99_ValueClassTest {

	public static void main(String[] args) {
		
		Circle a;						//참조 변수 선언
		a = new Circle();				//객체 생성
		a.radius = 100;					//객체 필드 접근
		a.color = "Blus";				//객체 필드 접근
		double area = a.calcArea();		//객체 메도스 접근
		System.out.println("a필드색상: " + a.color + "원의 면적= " +area);
		
		Circle b;						
		b = new Circle();			
		b.radius = 20;					
		b.color = "white";				
		area = b.calcArea();		
		System.out.println("b필드색상: " + b.color + "원의 면적= " +area);
		
		Circle c;						
		c = new Circle();				
		area = c.calcArea();		
		System.out.println("c필드색상: " + c.color + "원의 면적= " +area);

	}

}
