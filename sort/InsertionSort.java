package sort;

public class InsertionSort {

	public static void main(String[] args) {
	      int dim[] = {7,5,4,3,1};
	      // dim[] 에 숫자를 넣음
	      // Dim[] 이라는 배열을 만듬
	      
	      // for은 돌려서 dim[] 범위를 만큼 반복을 돌림 
	      for(int i=1;i < dim.length; i++) {
	         // j에 i값을 넣어주고 
	         for (int j=i; j>0; j--) {
	            if(dim[j-1] > dim[j]) {
	               
	               
	               int temp = dim[j-1];
	               dim[j-1] = dim[j];
	               dim[j] = temp;
	               
	            }
	         }
	         System.out.println("pass-" + i);
	         System.out.println(java.util.Arrays.toString(dim));
	      } 
	      System.out.println("result : ");
	      System.out.println(java.util.Arrays.toString(dim));

	   }

	}
