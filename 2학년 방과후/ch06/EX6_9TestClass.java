package ch06;

class TestClass {
	int iv_num;
	static int cv_num;
	
	void sungilClass20() {
		System.out.println("sungilClass20 매소드에 클래스 변수 출력 : " + cv_num);
	}
	
	int sungilClass22(int num) {
		int result = num * 10;
		if (result > 200) {
			result = result - 200;
		}
		return result;
	};
	String sungilClass24(int num) {
		sungilClass20();
		
		cv_num = 11;
		appPro20();
		
		cv_num = sungilClass22(num);
		String result = "sungilClass24 매소드에 클래스 변수 출력 : " + num;
		if (cv_num > 50) {
			result = "sungilClass24 매소드에 클래스 변수 출력1 : " + (cv_num - 50);
		}
		return result;
	};
	
	void sungilClass29(String str) {
		System.out.println("sungilClass29 매소드에 클래스 변수 출력: " + str);
	}
	
	static void appPro20() {
		System.out.println("appPro20 Static void 매서드 : " + cv_num);
	};
	
	static int appPro22(int num) {
		cv_num = 22 + num;
		appPro20();
		return 100;
	}
	
	static String appPro24(int num) {
		appPro20();
		
		cv_num = appPro22(num);
		String result = "appPro24 static 리턴Str 매서드 : " + cv_num;
		if (num < 10) {
			result = "appPro24 static 리턴Str 매서드10 : " + TestClass.cv_num;
		}
		return result;
	}
}

public class EX6_9TestClass {

	public static void main(String[] args) {
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		
		t1.cv_num = 7;
		String m_str1 = t1.sungilClass24(t1.cv_num);
		System.out.println(m_str1);
		System.out.println("-----------------------------------");

		t1.cv_num = 7;
		String m_str2 = t1.sungilClass24(t2.cv_num);
		System.out.println(m_str2);
		System.out.println("-----------------------------------");
		
		m_str1 = t1.appPro24(t1.cv_num);
		System.out.println(m_str1);
	}

}
