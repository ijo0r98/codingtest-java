package swexpertacademy.Difficulty3;

import java.util.Scanner;

/**
 * 1216. [S/W 문제해결 기본] 3일차 - 회문2
 * 참고 https://cceeun.tistory.com/2
 */
public class q1216 {

	static String[][] arr;
	static int len=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=0; tc<10; tc++) {
			int tcn = sc.nextInt();
			
			arr = new String[100][100];
			len = 0;
			
			for(int i=0; i<100; i++) {
				String[] input = sc.next().split("");
				for(int j=0; j<100; j++) arr[i][j]=input[j];
			}
			
			int end;
			boolean flag=false;
			int i, j, k, n;
			
			// 가로 회문 체크 
			for(n=100; n>=1; n--) {
				for(i=0; i<100-n; i++) {
					for(j=0; j<100-n; j++) {
						flag=false;
						for(k=0; k<n/2; k++) {
							if(j+k>=100 || j+n-k>=100) break;
							if(!arr[i][j+k].equals(arr[i][j+n-k])) break;  
						}
						if(k==n/2) {
							len = Math.max(len, n); 
						}
					}
				}
			}
			
			// 세로 회문 체크 
			for(n=100; n>=1; n--) {
				for(i=0; i<100-n+1; i++) {
					for(j=0; j<100-n; j++) {
						flag=false;
						for(k=0; k<n/2; k++) {
							if(j+k>=100 || j+n-k>=100) break;
							if(!arr[j+k][i].equals(arr[j+n-k][i])) break;  
						}
						if(k==n/2) {
							len = Math.max(len, n);
						}
					}
				}
			}

			
			System.out.printf("#%d %d\n", tcn, len);
		}
	}	
}
