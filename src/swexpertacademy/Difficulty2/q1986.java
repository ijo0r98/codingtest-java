package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 1986. 지그재그 숫자 
 */
public class q1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 0; test_case<T; test_case++) {
			int n = sc.nextInt();
			int sum = 0;
			for(int i=1; i<=n; i++) {
				if(i%2==0) sum-=i;
				else sum+=i;
			}
			System.out.printf("#%d %d\n", test_case+1, sum);
		}
	}
}
