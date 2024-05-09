package s21204_00;

import java.util.*;
import java.io.*;

public class S21204_Gugudan_Game {

	public static void main(String[] args) throws Exception {
		
		int x, y;
		Random r = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		x = Math.abs(r.nextInt() % 9) + 1;
		y = Math.abs(r.nextInt() % 9) + 1;
		
		if ( args.length > 0) {
			x = Integer.parseInt(args[0]);
		} else {
			String tmp = scan.nextLine();
			x = Integer.parseInt(tmp);
		}
		int num = x*y;
		
		System.out.println();
		System.out.println("* 구구단 " + x + "단에 대한 문제입니다");
		System.out.println();
		
		System.out.println(x +" * "+ y + " = ");
		
		String tmp = scan.nextLine();
		int inputNum = Integer.parseInt(tmp);
			
			if(num==inputNum) {
				System.out.println("맞았습니다!");
			} else {
				System.out.println("틀렸습니다. 정답은 "+ num +"입니다.");
			}
		
	}

}
