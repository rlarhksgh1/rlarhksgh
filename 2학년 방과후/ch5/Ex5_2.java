package ch5;

public class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		
		int[] score = {98, 100 , 88, 90, 92, 100, 99};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = (double)sum / score.length;
		
		System.out.println("Arry: " +score.length);
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +average);
	}
}
