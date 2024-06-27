package test000;

public class Random {

	public static void main(String[] args) {
		//0.0 ~ 1.0 사이의 실수 난수 구하기
		for (int i = 1; i <= 5; i++) {
			System.out.println(Math.random());
		}
		
		for (int i = 1; i <= 5; i++) {   
			int n = (int) (Math.random() * 10) + 1; 
			System.out.println(n);
		}	
	}

}
