  package s21204_00;

public class S21204_02 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		
		System.out.println("결과1 :" + Math.round(pi));
		
		System.out.println("결과2 :" + pi);
		
		System.out.println("결과3 :" + (pi*1000));
		
		System.out.println("결과4 :" + (Math.round((pi*1000))));
		
		System.out.println("결과5 :" + (((double)Math.round((pi*1000))/1000)));
		
		System.out.println("결과6 :" +(((int) (pi*1000)/ 1000.0)));
		
		

	}

}
