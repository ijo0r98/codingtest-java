package swexpertacademy.Difficulty3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1209. [S/W 문제해결 기본] 2일차 - Sum
 */
public class q1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[100][100];
		for(int tc=0; tc<1; tc++) {
			arr=new int[100][100];
			int n = sc.nextInt();
			int max = 0;
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j]=sc.nextInt();
				}
			}

			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			for(int i=0; i<100; i++) {
				sum1 =0;
				sum2=0;
				for(int j=0; j<100; j++) {
					sum1 += arr[i][j];
					sum2 += arr[j][i];
				}
				sum3 += arr[i][i];
				sum4 += arr[i][99-i];
				max = Math.max(max, Math.max(Math.max(sum3, sum4), Math.max(sum1, sum2)));
			}
			
			System.out.println("#"+n+" "+max);
		}
	}
}
