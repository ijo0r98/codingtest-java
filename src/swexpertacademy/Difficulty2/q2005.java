package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 2005. 파스칼의 삼각형 
 */
public class q2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case=0; test_case<T; test_case++) {
			int n = sc.nextInt();
			
			int[][] arr = new int[n][n];
			
			// 초기화 (가장 처음 수와 마지막 수는 1)
			arr[0][0]=1;
			for(int i=1; i<n ; i++) {
				arr[i][0]=1;
				arr[i][i]=1;
			}
			
			if(n>2) {
				for(int i=2; i<n; i++) {
					for(int j=1; j<i; j++) {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					}
				}
			}
			
			System.out.println("#"+(test_case+1));
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println("");
			}
			
		}
	}

}
