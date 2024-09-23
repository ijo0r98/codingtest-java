package baekjoon;

import java.util.Scanner;

/**
 * 27433. 팩토리얼2 (재귀로 다시 품)
 */
public class q27433_recur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fac(n));
	}
	
	static long fac(long x) {
		if(x==0) return 1;
		return x*fac(x-1);
	}
}
