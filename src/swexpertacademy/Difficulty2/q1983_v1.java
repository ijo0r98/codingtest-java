package swexpertacademy.Difficulty2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * 1983. 조교의 성적 매기기
 * 
 *  map value 정렬 
 */
public class q1983_v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case=0; test_case<T; test_case++) {
			int n = sc.nextInt(); // 학생 수  
			int k = sc.nextInt(); // 알고 싶은 학생의 번호 
			
//			float[] score = new float[n];
			Map<Integer, Float> scoremap=new HashMap<>(); 
			for(int i=0; i<n; i++) {
				float mid = sc.nextFloat();
				float fin = sc.nextFloat();
				float assign = sc.nextFloat();
				float score = (float)((mid*0.35) + (fin*0.45) + (assign*0.2));
				
				scoremap.put(i+1, score);
			}
			
			// map value 기준으로 정렬하기 (내림차순) 
			List<Map.Entry<Integer, Float>> entrylist = new LinkedList<>(scoremap.entrySet());
			entrylist.sort(new Comparator<Map.Entry<Integer, Float>>() {
				@Override
				public int compare(Entry<Integer, Float> o1, Entry<Integer, Float> o2) {
					return (int)(o2.getValue()-o1.getValue());
				}
			});
			
			int grade = 0;
			String[] gradelist={"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
			for(Map.Entry<Integer, Float> entry: entrylist) {
				grade+=1;
//				System.out.println(entry.getKey()+" "+entry.getValue());
				if(entry.getKey()==k) {
//					System.out.println(grade+" "+gradelist[grade-1]);
					System.out.printf("#%d %s\n",test_case+1,gradelist[grade-1]);
				}
			}
		}
	}
}
