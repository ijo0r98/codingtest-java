package swexpertacademy.Difficulty2;

import java.util.Scanner;

/**
 * 2007. 패턴 마디의 길이 
 */
public class q2007 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			String s = sc.next();
			
			for(int j=1; j<10; j++) { // 마디 최대 길이 10
				String repeat = s.substring(0, j); // 반복 체크할 마디 지정 
				String repeatCk = s.substring(j, j+j); // 지정한 마디 뒤로부터 반복 체크할 구간 
				
				if(repeat.equals(repeatCk)) {
					System.out.printf("#%d %d\n",i+1, repeat.length());
					break;
				}
			}
		}
	}

}
