package s21204_java90;

public class S21299_string_00 {

	public static void main(String[] args) {
		//string s1 = "우리는 설일정보고 소프트웨어개발과 입니다.";
		String s1 = "123456-8901234 주민등록번호";
		int i = s1.length();//length() 메소드는 문자열 길이(문자의 수)를 리턴한다.
 		
		String s2 = s1.substring(0, 6);
		String s3 = s1.substring(7, 14);
		String s4 = s1.substring(15);
		
		System.out.println("---substring() 메소드의 인덱스 활용---------------");
		System.out.println("s1 :" + s1 + " :길이:" + i);
		System.out.println("s2 :" + s2 + " :길이:" + s2.length());
		System.out.println("s3 :" + s3 + " :길이:" + s3.length());
		System.out.println("s4 :" + s4 + " :길이:" + s4.length());
		
		System.out.println("---substring() 메소드의 인덱스 활용---------------");
			for (int k=0; k < 1; k++) {
				System.out.println(s1.substring(k));
			}
	}

}
