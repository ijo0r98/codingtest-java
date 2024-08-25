package swexpertacademy.Difficulty3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1208. [S/W 문제해결 기본] 1일차 - Flatten
 */
public class q1208_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = new ArrayList<Integer>();
		for(int tc=1; tc<=1; tc++) {
			int n = sc.nextInt();
			arr.clear();
			for(int i=0; i<100; i++) arr.add(sc.nextInt());
			int max = Collections.max(arr);
			int min =  Collections.min(arr);
			for(int i=0; i<n; i++) {
//				System.out.println(max+" "+min+" "+i);
				if(max == min) break;
				int maxIdx = arr.indexOf(max);
				int minIdx = arr.indexOf(min);
				arr.set(maxIdx, max-1);
				arr.set(minIdx, min+1);
				max = Collections.max(arr);
				min =  Collections.min(arr);
			}
			System.out.println("#"+tc+" "+(max-min));
		}
	}
}
