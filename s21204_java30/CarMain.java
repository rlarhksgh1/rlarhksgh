package s21204_java30;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.company  :" +car1.company);
		System.out.println(car1.s);
		car1.s = "kor";
		
		Car car2 = new Car("자가용1");
		System.out.println("car2.company  :" +car2.company);
		System.out.println("car2.model    :" +car2.model);
		System.out.println(car2.s);
		car2.s = "kor";
		
		Car car3 = new Car("자가용2","하얀색");
		System.out.println("car3.company  :" +car3.company);
		System.out.println("car3.model    :" +car3.model);
		System.out.println("car3.color    :" +car3.color);
		System.out.println(car3.s);
		car3.s = "kor";
		
		Car car4 = new Car("레저용","빨강", 200);
		System.out.println("car4.company  :" +car4.company);
		System.out.println("car4.model    :" +car4.model);
		System.out.println("car4.color    :" +car4.color);
		System.out.println("car4.maxSpeed :" +car4.maxSpeed);
		System.out.println(car4.s);
		car4.s = "kor";
	}

}
