package s21204_00;

import java.util.Scanner;

public class S21204_01v7 {

	public static void main(String[] args) {
		int intVal;
		double douVal;
		String strVal;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("1문장을 입력하세요: ");
		strVal = scanner.nextLine();
		
		System.out.println("2정수를 입력하세요: ");
		intVal = scanner.nextInt();
		
		System.out.println("3실수를 입력하세요: ");
		douVal = scanner.nextDouble();
		
		
		System.out.println("1입력한 문장은 " +strVal+ " 입니다");
		System.out.println("2입력한 정수는 " +intVal+ " 입니다");
		System.out.println("3입력한 실수는 " +douVal+ " 입니다");
		scanner.close();
		
		

	}

}
