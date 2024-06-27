package ch06;

class MyMath2 {
	long a,b;
	
	long add() {return a + b;}
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	long divide() {return a / b;}
	
	static long add(long a, long b) {return a + b;}
	static long subtract(long a, long b) {return a - b;}
	static long multiply(long a, long b) {return a * b;}
	static double divide(long a, long b) {return  a / (double)b;}
}

public class Ex6_9 {

	public static void main(String[] args) {
		System.out.println("static매개변수 a+b: " + MyMath2.add(200L, 100L));
		System.out.println("static매개변수 a-b: " + MyMath2.subtract(200L, 100L));
		System.out.println("static매개변수 a*b: " + MyMath2.multiply(200L, 100L));
		System.out.println("static매개변수 a/b: " + MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println("인스턴스매개변수없음 a+b" + mm.add());
		System.out.println("인스턴스매개변수없음 a-b" + mm.subtract());
		System.out.println("인스턴스매개변수없음 a*b" + mm.multiply());
		System.out.println("인스턴스매개변수없음 a/b" + mm.divide());
	}

}
