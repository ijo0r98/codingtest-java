package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q2019 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		System.out.print("1 ");
		int start = 1;
		for(int i=1; i<=T; i++) {
			System.out.print(2*start+" ");
			start = 2*start;
		}
	}

}
