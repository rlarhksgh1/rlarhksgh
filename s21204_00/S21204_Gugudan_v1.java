package s21204_00;

import java.util.*;
import java.io.*;

public class S21204_Gugudan_v1 {

	public static void main(String[] args) throws Exception {
		
		int x, y;
		Random r = new Random();
		
		x = Math.abs(r.nextInt() % 9) + 1;
		y = Math.abs(r.nextInt() % 9) + 1;
		int num = x*y;
		
		System.out.println();
		System.out.println("* 구구단 " + x + "단에 대한 문제입니다");
		System.out.println();
		
		System.out.println(x +" * "+ y + " = ");
		
			Scanner scan = new Scanner(System.in);
			int inputNum = scan.nextInt();
			
			if(num==inputNum) {
				System.out.println("맞았습니다!");
			} else {
				System.out.println("틀렸습니다. 정답은 "+ num +"입니다.");
			}
		
	}

}
