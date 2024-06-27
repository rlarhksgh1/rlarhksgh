package ch06;

class Name {
	static void print() {
		System.out.println("나는 정말할 수 있습니다.");
	}

	void print2() {
		System.out.println("이 프로그램 또한 설명을 잘 할 수 있습니다.");
	}
}

public class Ex6_71 {

	public static void main(String[] args) {
		Name.print();

		Name name = new Name();
		name.print2();
	}
}
