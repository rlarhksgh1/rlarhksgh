package ch06;

class MyMath1 {
	double a,b;
	
	double add() {
		return a + b;
	}
	static double add(double a, double b) {
		return a + b;
	}
}

public class Ex6_9Test {

	public static void main(String[] args) {
		System.out.println(MyMath1.add(200.9, 100.8));
		MyMath1 mm = new MyMath1();
		mm.a = 200.9;
		mm.b = 100.7;
		System.out.println(mm.add());	
	}
}
