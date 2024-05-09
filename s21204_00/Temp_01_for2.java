package s21204_00;

import java.io.IOException;

public class Temp_01_for2 {

	public static void main(String[] args) throws IOException {
		int keycode;
		for (;true;) {
			keycode = System.in.read();
			System.out.println("keycode:" + keycode);
			if(keycode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
