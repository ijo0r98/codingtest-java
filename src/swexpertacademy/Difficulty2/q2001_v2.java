package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 2001. 파리퇴치 
 * ver2 누적합 
 * https://velog.io/@kyungmin/JAVA-%EB%88%84%EC%A0%81%ED%95%A9
 * https://jxxngho.tistory.com/m/116
 *
 */
public class q2001_v2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int test_case = 0; test_case<T; test_case++) {
			int n = sc.nextInt(); // 배열 크기 
			int m = sc.nextInt(); // 파리채 구역 크기 
			
//			int[][] arr = new int[n][n];
			int[][] sum = new int[n+1][n+1]; // 누적합 배열 
			
			// 누적합 배열 초기화  		
			for(int i=0; i<n+1;i++) {
				sum[i][0] = 0;
				sum[0][i] = 0;
			}
			
			
			// 누적합 배열 (현재까지의 모든 수의 합)
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					int input=sc.nextInt();
					sum[i][j] = input + sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1];
				}
			}
			
//			for(int i=0; i<n+1; i++) {
//				for(int j=0; j<n+1; j++) {
//					System.out.printf("%d ",sum[i][j]);
//				}
//				System.out.println("\n");
//			}
			
			int ans=0;
			// 누적합 최대 구하기 
			for(int i=m; i<=n; i++) {
				for(int j=m; j<=n; j++) {
					int tmp = sum[i][j]-sum[i][j-m]-sum[i-m][j]+sum[i-m][j-m];
					ans = Math.max(ans, tmp);
				}
			}
			
			System.out.printf("#%d %d\n", test_case+1, ans);
			
		}
		
	}
}
