package s21204_java30;

public class Car {
	static String s = "우리나라 자동차";
	//필드 인스턴스
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//생성자1,2,3,4
	Car() {
	}
	Car(String model) {			//model 로컬변수
		this.model = model;		//this.model 인스턴스 변수
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
