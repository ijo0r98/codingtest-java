package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 2001. 파리퇴치 
 * ver1. 완전탐색 
 */
public class q2001_v1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int test_case = 0; test_case<T; test_case++) {
			int n = sc.nextInt(); // 배열 크기 
			int m = sc.nextInt(); // 파리채 구역 크기 
			
			int[][] arr = new int[n][n];
					
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) arr[i][j] = sc.nextInt();
			}
			
			int ans = 0;
			int tmp = 0;
			for(int i=0;i<n-m+1;i++) {
				for(int j=0;j<n-m+1;j++) {
					tmp=0;
					for(int k=0; k<m; k++) {
						for(int l=0; l<m; l++) {
							tmp += arr[i+k][j+l];
						}
					}
					ans = Math.max(ans, tmp);
				}
			}
			System.out.printf("#%d %d\n", test_case+1, ans);
			
		}
		
	}
}
