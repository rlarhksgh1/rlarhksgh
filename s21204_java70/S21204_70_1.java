package s21204_java70;

class Tv {
	int channel;	//채널
	
	//Tv의 기능(메서드)
	void channelUp()	{ ++channel; }	//Tv 채널 높이는 기능
	void channelDown()	{ --channel; }	//Tv 채널 낮추는 기능
}

class SmartTv extends Tv {
	boolean caption = true;
	void displayCaption(String text) {
		if(caption) {	// caption상태가 on(true)일 때만 출력
			System.out.println(text);
		}
	}
}

public class S21204_70_1 {

	public static void main(String[] args) {
		SmartTv sTv = new SmartTv();
		
		sTv.channel = 10;	//조상 클래스로부터 상속받은 멤버
		sTv.channelUp();	//조상 클래스로부터 상복받은 멤버
		System.out.println(sTv.channel);
		sTv.displayCaption("2학년12반 전체");
		//sTv.caption = false;
		sTv.displayCaption("2학년12반 사랑한다 친구야~");
	}

}
