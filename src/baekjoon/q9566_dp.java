package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 9566. 돌게임 
 */
public class q9566_dp {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		
		for(int i=4; i<=n; i++) {
			dp[i] = Math.min(dp[i-1], dp[i-3]) + 1;
		}
		
		if(dp[n]%2 == 0) System.out.println("CY");
		else System.out.println("SK");
	}
}
