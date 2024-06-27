package test000;

public class OverloadingEx02 {
	// 전역변수
	String name;
	String company = "성일정보고";
	String model = "2학년12반";
	String number = "비공개";
	// 생성자
	public OverloadingEx02(String name) {
		this.name = name;
	}
	// 생성자 오버로딩
	public OverloadingEx02(String name, String number) {
		this.name = name;
		this.number = number;
	}
	// 매소드
	public void print() {
		System.out.println("이름 : "+name+"\n학교 : "+company+
                "\n학번 : "+ model+ " \n핸폰 : "+number);

	}
	public static void main(String[] args) {
		// 첫번째 생성자 호출
		OverloadingEx02 ctor = new OverloadingEx02("권원태");
		ctor.print();
		System.out.println();
		
		// 두번째 생성자 호출 오버로딩+오버라이딩
		OverloadingEx02 ctor2 = new OverloadingEx02("천경호", "010-0101-1234");
		ctor2.company = ctor2.company + "반장";
		ctor2.print();
		System.out.println();
		
		// 세번째 생성자 호출
		OverloadingEx02 ctor3 = new OverloadingEx02("이주선");
		ctor3.company = ctor3.company + "부반장";
		ctor3.print();
	}

}
