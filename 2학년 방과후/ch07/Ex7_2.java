package ch07;

class parent {
	int x = 10;
}

class child extends parent {
	int x = 20;
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}

public class Ex7_2 {
	public static void main(String[] args) {
		child c = new child();
		c.method();
	}
}
