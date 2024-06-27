package ch04;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i%2 != 0) {
				continue;
			}
			System.out.println(i + " ");
		}
		
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;
		int result2 = ++y + 10;
		
		System.out.println();
		System.out.println("x: " + x + ", y: " +y);
		System.out.println("x: " + result1);
		System.out.println("y: " + result2);
	}

}
