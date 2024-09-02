package swexpertacademy.Difficulty3;

import java.util.Scanner;

/**
 * 1213. [S/W 문제해결 기본] 3일차 - String
 */
public class q1213 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count;
		for(int tc=0; tc<10; tc++) {
			int n = sc.nextInt();
			
			count = 0;
			String s1 = sc.next();
			String s2 = sc.next();
			count = (s2.length()-s2.replace(s1, "").length())/s1.length();
			
			System.out.printf("#%d %d\n", n, count);
		}
	}

}
