package swexpertacademy.Difficulty3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1208. [S/W 문제해결 기본] 1일차 - Flatten
 */
public class q1208_v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = new ArrayList<Integer>();
		for(int tc=1; tc<=10; tc++) {
			int n = sc.nextInt();
			arr.clear();
			for(int i=0; i<100; i++) arr.add(sc.nextInt());
			
			Collections.sort(arr);
			for(int i=0; i<n; i++) {
				if(arr.get(99)==arr.get(0)) break;
				arr.set(99, arr.get(99)-1);
				arr.set(0, arr.get(0)+1);
				Collections.sort(arr);
			}
			System.out.println("#"+tc+" "+(arr.get(99)-arr.get(0)));
		}
	}
}
