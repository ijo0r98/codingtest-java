package baekjoon;

import java.util.Scanner;

/**
 * 25501. 재귀의 귀재 
 */
public class q25501 {
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			String s = sc.next();
			cnt=0;
			System.out.println(isPalindrome(s, 0, s.length()-1) + " " + cnt);
		}
	}
	
	static int isPalindrome(String s, int l, int r) {
		cnt++;
		if(r<=l) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else return isPalindrome(s, l+1, r-1);
	}
}
