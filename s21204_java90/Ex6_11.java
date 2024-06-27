package s21204_java90;

class Data_1 { 	//Data_1() { }; //compile 시 class 파일에 자동 생성
	int value;
}

class Data_2 {
	int value;
	
	Data_2() {  }; 	//기본 생성자 없으면 error
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); //compile error발생
	}

}
