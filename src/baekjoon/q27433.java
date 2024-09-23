package baekjoon;

import java.util.Scanner;

/**
 * 27433. 팩토리얼 2 
 */
public class q27433 {

	static int n;
	static long ans=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		fac(0);
		System.out.println(ans);
	}
	
	static void fac(int x) {
		if(x==n) return;
		else {
			x++;
			ans *= (x); 
			fac(x);
		}
	}
}
