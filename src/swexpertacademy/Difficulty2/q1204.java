package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 */
public class q1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] arr = new int[1000];
		
		for(int tc=0; tc<t; tc++) {
			int idx = sc.nextInt();
			
			arr = new int[101];
			for(int i=0; i<1000; i++) {
				
				int n = sc.nextInt();
				arr[n]+=1;
			}
			
			
			int max = arr[0];
			int result = 0;
			for(int i=1; i<101; i++) {
				if(max<arr[i]) {
					max = arr[i];
					result = i;
				}
				if(max==arr[i]) {
					result = Math.max(result, i);
				}
			}
			
			System.out.printf("#%d %d\n",idx, result);
		}
		
		
	}
}
