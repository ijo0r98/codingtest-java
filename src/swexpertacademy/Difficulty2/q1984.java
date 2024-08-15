package swexpertacademy.Difficulty2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1984. 중간 평균값 구하기 
 */
public class q1984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int test_case = 0; test_case<T; test_case++) {
			for(int i=0; i<10; i++) {
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
			
			int sum =0;
			for(int i=1; i<9; i++) {
				sum += list.get(i);
			}
			
			System.out.printf("#%d %d\n", test_case+1, Math.round(sum/8.0));
			list.clear();
		}
		sc.close();
	}
}
