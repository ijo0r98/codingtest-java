package baekjoon;

import java.util.Scanner;

/**
 * 5073. 삼각형과 세 변 
 */
public class q5073 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) break;
			int sum = a+b+c;
			int max = Math.max(a, Math.max(b, c));
			if(max >= sum-max) System.out.println("Invalid");
			else {
				if(a==b && b==c) System.out.println("Equilateral");
				else if(a==b || b==c || a==c) System.out.println("Isosceles");
				else System.out.println("Scalene");
			}
		}

	}

}
