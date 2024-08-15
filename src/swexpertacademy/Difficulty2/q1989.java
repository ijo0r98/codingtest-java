package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 1989. 초심자의 회문 검사 
 */
public class q1989 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int testCase=0; testCase<T; testCase++) {
			String s = sc.next();
			int ck = 1;
			for(int i=0; i<s.length()/2; i++) {
				if(s.charAt(i) != s.charAt(s.length()-i-1)) {
					ck = 0;
					break;
				}
			}
			System.out.printf("#%d %d\n",testCase+1,ck);
		}
		
	}
}
