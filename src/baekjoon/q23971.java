package baekjoon;

import java.util.Scanner;

/**
 * 23971. ZOAC 4
 * 
 */
public class q23971 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float h = sc.nextFloat();
		float w = sc.nextFloat();
		float n = sc.nextFloat();
		float m = sc.nextFloat();
		
		n += 1; // 사람 포함 실제로 차지하는 칸의 수 
		m += 1;
		
		int ans = (int)(Math.ceil(h/n)*Math.ceil(w/m));
		System.out.println(ans);  
	}
}
