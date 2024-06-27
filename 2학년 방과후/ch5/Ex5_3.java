package ch5;

public class Ex5_3 {
	public static void main(String[] args) {
		int[] score = {98, 11, 88, 90, 92, 75, 12, 77, 100};
		
		int max = score[0];
		int min = score[0];
		
		for (int i=1; i<score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
