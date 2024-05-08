package s21204_00;

public class S21204_01v4 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		double result = x / y;
		
		System.out.println("result_0 : " +result);
		System.out.println("result_1 : " + (double) x / y);
		System.out.println("result_2 : " + x / (double) y);
		System.out.println("result_3 : " + (double) x / (double) y );
	}

}
