package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 14501. 퇴사 (DP) 
 */
public class q14501_2 {

	static int n;
	static int[] tarr;
	static int[] parr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n=Integer.parseInt(br.readLine());
		tarr = new int[n]; // 상담 기간  
		parr = new int[n]; // 금액 
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			tarr[i] = Integer.parseInt(st.nextToken());
			parr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[n+1];
		for(int i=0; i<n; i++) {
			if(i+tarr[i] <=n ) { // i일째 일을 했을 때 기간이 맞는다면 
				// i일의 일을 했을 경우와 안했을 경우 
				dp[i+tarr[i]] = Math.max(dp[i+tarr[i]], dp[i]+parr[i]); 
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		
		System.out.println(dp[n]);
	}
}
