package ch06;

public class Ex6_15v1 {
	
	static int[][] arr = new int[5][5];
	
	static {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = (int)(Math.random()*23) + 1;
			}
			
			for (int j=0; j<arr.length; j++) {
				for (int k=j+1; k<arr[i].length; k++) {
					if (arr[i][j] == arr[i][k]) {
						j = 9;
						i--;
						break;
					}
				}
				if(j==9) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d " , arr[i][j]);
			}
			System.out.println();
		}
	}
}
