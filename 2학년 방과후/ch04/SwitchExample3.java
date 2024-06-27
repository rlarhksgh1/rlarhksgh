package ch04;

public class SwitchExample3 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
				
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			
			default:
				System.out.println("손님입니다.");
 		}
		
		String sgrade = "B";
		int score1 = 0;
		
		switch(sgrade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		
		default:
			score1 = 60;
		}
		System.out.println("score1: " + score1);
	}

}
