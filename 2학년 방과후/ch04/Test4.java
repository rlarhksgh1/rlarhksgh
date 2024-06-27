package ch04;

public class Test4 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum += i;
			System.out.println(i + " ");
		}
		System.out.println("sum: " + sum);
		
		int i = 1;
		int sum1 = 0;
		while(i<=10) {
			System.out.println(i + ",");
			sum1 += i;
			i++;
			
		}
		System.out.println("sum1: " + sum1);
	}

}
