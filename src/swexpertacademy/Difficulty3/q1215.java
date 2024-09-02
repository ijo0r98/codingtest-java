package swexpertacademy.Difficulty3;

import java.util.Scanner;

/**
 * 1215. [S/W 문제해결 기본] 3일차 - 회문1
 */
public class q1215 {

	static String[][] arr;
	static int count;
	static boolean flag;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc=0; tc<10; tc++) {
			int n = sc.nextInt(); // 회문의 길이 
			
			arr = new String[8][8];
			
			for(int i=0; i<8; i++) {
				String[] input = sc.next().split("");

				for(int j=0; j<8; j++) arr[i][j] = input[j];
			}
			
			count = 0;
			
			int k;
			for(int i=0; i<8; i++) {
				for(int j=0; j<9-n; j++) {
					int end=n+j-1; // 회문 길이 end
					for(k=0; k<n/2; k++) {
						if(!arr[i][j+k].equals(arr[i][end-k])) break;
					}
					if(k==n/2) count++;
				}
			}
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<9-n; j++) {
					int end=n+j-1; // 회문 길이 end
					for(k=0; k<n/2; k++) {
						if(!arr[j+k][i].equals(arr[end-k][i])) break;
					}
					if(k==n/2) count++;
				}
			}
			
			System.out.printf("#%d %d\n", tc+1, count);
		}
	}
}
