package s21204_00;

public class PrintfSungjuk {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String hakbun = "21204";
		int kor = 98;
		int eng = 91;
		int mat = 100;
		int tot = kor + eng + mat;
		double ave = tot / 3.;
		
		
		
		System.out.println("성명   학번   국어   영어   수학   총점   평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s %4s %3d %4d %5d %5d %6.1f  \n", 
		  				  name, hakbun, kor, eng, mat, tot,ave);
		
		String name1 = "차이점";
	    String hakbun1 = "21299";
	    int kor1 = 100;
	    int eng1 = 99;
	    int mat1 = 96;
	    int sum1 = kor1 + eng1 + mat1;
	    double ave1 = sum1 / 3.;
	    
	    System.out.printf("%s %6s %-4d %4d %-4d %-4d %-5.1f \n",
	            name1, hakbun1, kor1, eng1, mat1, sum1, ave1);
		
	}

}
