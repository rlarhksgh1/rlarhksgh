package ch04;

public class test01 {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : (score >= 70) ? 'C' : 'F');
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
