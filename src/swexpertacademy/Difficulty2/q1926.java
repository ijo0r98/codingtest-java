package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 1926. 간단한 369 게임 
 * 
 * JAVA 문자열에서 특정 문자 수 세기 - 참고 https://hianna.tistory.com/540
 */
public class q1926 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			String s = Integer.toString(i);
			String s_tmp = s;
			
			// 3 
			s=s.replace("3", "");
			// 6
			s=s.replace("6", "");
			// 9
			s=s.replace("9", "");
//			System.out.printf("###### %s %s\n", s_tmp, s);
			
			// 3, 6, 9 개수 (replace 이용하여 계산)
			int cnt = s_tmp.length()-s.length();
			
			if(cnt==0) {
				System.out.print(i+" ");
			} else {
//				System.out.print("-".repeat(cnt)+" "); // java 11
				for(int j=0;j<cnt;j++) System.out.print("-");
				System.out.print(" ");
			}
		}
	}

}
