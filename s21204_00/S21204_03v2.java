package s21204_00;

import java.util.Scanner;

public class S21204_03v2 {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
			case 3,4,5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6,7,8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9,10,11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재의 계절은 겨울입니다.");
		}
	}

}
