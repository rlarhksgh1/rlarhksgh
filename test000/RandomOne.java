package test000;

import java.util.Scanner;

public class RandomOne {

	public static void main(String[] args) {
		int luckyNum;
		int index = 0;
		int[] arrayNum = new int[100];
		int[] arrayOk = new int[6];
		//정수를 1~9 범위 내에서 입력 받는다
		for (; true;) {
			System.out.println("좋아하는 숫자를 입력하세요(1~9)");
			Scanner scanner = new Scanner(System.in);
			luckyNum = scanner.nextInt();
			if (luckyNum < 1 || luckyNum > 9) {
				System.out.println("숫자는 1~9 범위 입니다");
				continue;
			}						
			break;
		}
		//Random 발생한 자료를 정수화
		for (;true;) {
			int n = (int) (Math.random() * 45 + 1);
			if (index >= 100) {
				break;
			}
			//정수화 숫자는 1~45 범위 내
			if (n < 1 || n > 45) {
				continue;
			}
			arrayNum[index++] = n;
		}
		//입력 받은 숫자를 인데스로 생성된 100개의 숫자에서 선택
		//입력 받은 숫자를 시작으로 더해 가며 5개를 선택
		index = luckyNum;
		
		
		//같은 값일 경우 다른 값으로 변경
		for(int i=1; i<arrayOk.length; i++) {
			for(int j=0; j<i; j++) {
				while(arrayOk[i]==arrayOk[j]) {
					arrayOk[i] = arrayNum[index++];
					j= 0;
				}
			}
		}
		//Bubble sort
		for (int i=1; i<arrayOk.length; i++) {
			for (int j=0; j<arrayOk.length - i; j++) {
				if (arrayOk[j] > arrayOk[j + 1]) {
					int temp = arrayOk[j + 1];
					arrayOk[j + 1] = arrayOk[j];
					arrayOk[j] = temp;
				}
			}
		}
		//결과 출력
		System.out.println("");
		for (int i=0; i<arrayOk.length; i++) {
			System.out.print(arrayOk[i] + " ");
		}
	}

}
