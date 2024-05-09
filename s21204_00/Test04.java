package s21204_00;

public class Test04 {

	public static void main(String[] args) {
		
		int cnt = 0;
		int sum = 0;
		
		do {
			
			sum = sum + cnt;
			cnt++;
			System.out.println("sum : " +sum);
		} while (cnt <= 10);
		
		System.out.println("sum : " +sum);
		
		
	}

}
