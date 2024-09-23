package swexpertacademy.Difficulty3;

import java.util.Scanner;

/**
 * 1217. [S/W 문제해결 기본] 4일차 - 거듭 제
 */
public class q1217 {
	
	static int a, b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.printf("#%d %d\n", n, pow(a, b, 1));
		} 
	}
	
	static int pow(int a, int b, int i) {
		if(i==b) {
			return a;
		} else {
			i++;
			return a*pow(a, b, i++);
			
		}
	
	}
}
