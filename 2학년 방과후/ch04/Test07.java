package ch04;

public class Test07 {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println(score + "점은" + grade + "등급입니다.");
	}	

}
