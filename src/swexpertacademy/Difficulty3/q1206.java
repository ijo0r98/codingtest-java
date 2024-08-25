package swexpertacademy.Difficulty3;

import java.util.Scanner;

/**
 * 1206. [S/W 문제해결 기본] 1일차 - View 
 */
public class q1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] buildings;
		
		for(int tc = 0; tc<10; tc++) {
			int n = sc.nextInt();
			buildings = new int[n];
			
			for(int i=0; i<n; i++) buildings[i]=sc.nextInt();
			int cnt=0;
			int max=0;
			for(int i=2; i<n-2; i++) {
				max = Math.max( Math.max(buildings[i-2], buildings[i-1]), Math.max(buildings[i+1], buildings[i+2]));
				if(buildings[i] > max) {
					cnt += (buildings[i]-max);
				}
			}
			
			System.out.println("#"+(tc+1)+" "+cnt);
		}
	}
}
