package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q2043 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int k = sc.nextInt();
		
		int ans = p>k ? p-k : k-p;
		System.out.println(ans+1);
		
	}
	
	
}
