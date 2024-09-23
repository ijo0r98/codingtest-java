package baekjoon;

import java.util.Scanner;

/**
 * 10870. 피보나치 수 5 
 */
public class q10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	
	static int fib(int x) {
		if(x==0) return 0;
		if(x==1) return 1;
		return fib(x-1) + fib(x-2);
		
	}
}
