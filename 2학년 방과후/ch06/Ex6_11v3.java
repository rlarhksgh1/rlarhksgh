package ch06;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {}
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_11v3 {

	public static void main(String[] args) {
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		//Car c = new Car("white","auto",4);
		
		System.out.println("color: " + c.color + " gearType: " + c.gearType + " door: " + c.door);
	}

}
