package s21204_00;

class Tv {
	//TV의 속성(멤버변수)
	String color;		//색깔
	boolean power;		//전원상태(on/off)
	int channel;		//채널

	//TV의 기능(메서드)
	void power() { power = !power; }	//TV on off 기능을 하는 매서드
	void channelUp() { ++channel; }		//TV 채널 높이는 기능
	void channelDown() { --channel; }	//TV 채널 낮추는 기능
}

public class S21204_06v1 {

	public static void main(String[] args) {

		Tv t;				//TV인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv();		//TV인스터스를 생성
		
		t.channel = 7;		//TV인스턴스 멤버변수에 값 설정
		t.channelDown();	//TV인스턴스 메서드 호출
		System.out.println("a현재 채널은 " + t.channel + "입니다");
		
		t.channelUp();
		System.out.println("b현재 채널은 " + t.channel + "입니다");
	}

}
