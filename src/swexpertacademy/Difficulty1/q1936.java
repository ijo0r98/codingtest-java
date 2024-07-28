package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q1936 {
	
	public static void main(String[] args) {
		
		// 가위는 1, 바위는 2, 보는 3
		/**
		 * 1 가위 < 2 바위
		 * 1 가위 > 3 보
		 * 2 바위 < 3 보
		 * 2 바위 > 1 가위
		 * 3 보 < 1 가위
		 * 3 보 > 2 바위   
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)) System.out.println("A");
		else System.out.println("B");
	}

}
