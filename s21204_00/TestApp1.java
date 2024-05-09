package s21204_00;

import java.util.Scanner;
import java.util.Stack;

public class TestApp1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		// 스택의 수를 입력
		int[] A = new int[N];		//입력된 수만큼 배열 생성
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();		//스택 생성
		StringBuffer bf = new StringBuffer();		//스트링 버퍼 생성
		int num = 1;
		boolean result = true;
		
		for (int i = 0; i < A.length; i++) {
			int su = A[i];		// 현재 수열의 수
			if (su >= num) {	// 현재 수열 값 >= 오름차순 자연수 : 값이 같아 질 때까지 push()수행
				while (su >= num) {	//push()
					stack.push(num++);
					bf.append("+\n");	
				}
				stack.pop();
				bf.append("-\n");
			} else {	//현재 수열 값 < 오름차순 자연수 : pop()을 수행하여 수열 원소를 꺼냅니다
				int n = stack.pop();
				// 스택의 가장 위의 수가 만드어야 하는 수열의 수 보다 크다면 수열 출력 불가능
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if (result) System.out.println(bf.toString());
	}
 }
