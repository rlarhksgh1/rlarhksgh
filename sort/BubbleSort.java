package sort;

public class BubbleSort {

	public static void main(String[] args) {
		 int array[] = {7,5,4,3,1};
	      
	      System.out.println("Array Length : " + array.length);
	      System.out.println("source L ");
	      System.out.println(java.util.Arrays.toString(array));
	      // 버블 : 큰 값을 뒤로 보냄
	      // 5 4 3 1 7
	      // 4 3 1 5 7
	      // 3 1 4 5 7
	      // 1 3 4 5 7
	      
	      for(int i=1;i < array.length;i++) { // 1부터 시작 배열만큼 만큼 반복
	         for(int j=0;j < array.length - i; j++) {
	            // 배열의 인덱스 0부터 배열의 크기까지 반복 하는거임
	            if(array[j] > array[j+1]) {
	               // 인덱스 0번값과 1번값 이랑 비교하는 수 
	               // 0번 값이 더 클시 temp 에 1번값을 너주겠다
	               int temp = array[j+1];  
	               array[j+1] = array[j];
	               array[j] = temp;
	               
	            }
	            
	         }
	         System.out.println("pass-" + i);
	         System.out.println(java.util.Arrays.toString(array));
	         
	      
	         }
	      System.out.println("result : ");
	      System.out.println(java.util.Arrays.toString(array));
	      
	      
	      
	      
	   }

	}
