package sort;

public class SelectionSort {
   public static void main(String[] args) {
      int dim[] = {4,5,7,2,3,1};
      
      System.out.println("Array Length : " + dim.length);
      System.out.println("source : ");
      System.out.println(java.util.Arrays.toString(dim));
      
      for(int i=0;i < dim.length; i++) {
         // 배열 크기만큼 반복을 돌림
         // min 라는 정수값에 i값을 넣어줌.
         int min = i;
         // 그렇다면 min 에는 현재 index 값이 들어있음
         // j에는 현재 index 값보다 1큰 index값이 들어있음.
         for(int j= i+1;j < dim.length; j++) {
            // j index값이랑 j+1 index랑 비교를 함.
            if(dim[j] < dim[min]) {
               // 템프로 값을 섞어줌 
               min = j;
               }
            }
         int temp = dim[i];
         dim[i] = dim[min];
         dim[min] = temp;
         System.out.println("pass-" + i);
         System.out.println(java.util.Arrays.toString(dim));
         } 
         System.out.println("result : ");
         System.out.println(java.util.Arrays.toString(dim));
      }
   }
