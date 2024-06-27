package ch07;

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point30 extends Point {
	int z;
	
	Point30(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
}

public class Ex7_4 {

	public static void main(String[] args) {
		Point30 p = new Point30(1,2,3);
		System.out.println("x=" +p.x + ",y=" +p.y+ ",z=" +p.z);
	}

}
