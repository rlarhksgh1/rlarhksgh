package s21204_00;

import java.util.Scanner;

public class S21204_03v1 {

	public static void main(String[] args) {
		char grade;
		System.out.println("점수를 입력하세요> ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		 if (score >= 90) {
	         grade = 'A';
	     } else if (score >= 80) {
	         grade = 'B';
	     } else if (score >= 70) {
	         grade = 'C';
	     } else if (score >= 60) {
	         grade = 'D';   
	     } else  {
	         grade = 'F';  
	     }
		
		
		  System.out.println("당신의 학점은 "+grade+"입니다");
	}

}
