package s21204_00;

import java.io.IOException;

public class S21204_01v6Test {

	public static void main(String[] args) throws Exception {
		
		
		int KeyCode;
		
		while(true) {
		
			System.out.println("키코드 입력");
		
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);
			if(KeyCode == 113) {
				break;
			}
		}
		System.out.println("종료");

	}

}
