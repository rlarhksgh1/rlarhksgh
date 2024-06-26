package s21200;

public class printfSungjuk {

	public static void main(String[] args) {
		String name = "홍길동";
		String hakbun = "21200";
		int kor = 98;
		int eng = 91;
		int mat = 100;
		int t = kor + eng + mat;
		double a = t/3;
		
		System.out.println("성명   학번     국어  영어 수학  총점   평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s %-6s %4d %4d %4d %4d %5.1f \n", name, hakbun, kor, eng, mat, t, a);
		
		name = "차이점";
		hakbun = "21299";
		kor = 100;
		eng = 99;
		mat = 96;
		t = kor + eng + mat;
		a = t / 3;
		
		System.out.printf("%s %6s %-4d %4d %-3d %3d %3.1f \n", name, hakbun, kor, eng, mat, t, a);
	}

}
