package baekjoon;

import java.util.Scanner;

/**
 * 2292. 벌집 
 */
public class q2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		int move = 1;
		while(true) {
			if(n<=move) break;
			move = move+((i+1)*6-6);
			i++;
		}
		System.out.println(i);
		
	}
}
