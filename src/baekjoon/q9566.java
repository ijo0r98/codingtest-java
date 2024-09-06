package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 9566. 돌게임 
 */
public class q9566 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 1개 또는 3개 
		// 1+1=2 / 1+3=4 / 3+1=4 / 3+3-4
		// 짝수개일때 마지막을 가져간 CY 승리, 홀수개일때 다시 차례 돌아온 SK 승리 
		System.out.println((n%2)==1 ? "SK" : "CY");
		
	}
}
