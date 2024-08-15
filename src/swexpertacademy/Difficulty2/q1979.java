package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 1979. 어디에 단어가 들어갈 수 있을까 
 */
public class q1979 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			String[][] arr = new String[n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++) arr[i][j] = sc.next();
			
			int ans = 0;
			for(int i=0; i<n; i++) {
				
			}
			
			System.out.printf("#%d %d\n", tc, ans);
		}
		
	}

}
