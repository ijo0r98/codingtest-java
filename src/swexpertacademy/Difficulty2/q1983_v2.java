package swexpertacademy.Difficulty2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1983. 조교의 성적 매기기
 * 
 *  탐색하려는 키의 값 저장 
 */
public class q1983_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		double[] scores;
		
		String[] gradelist={"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		
		int T = sc.nextInt();
		for(int test_case=0; test_case<T; test_case++) {
			int n = sc.nextInt(); // 학생 수  
			int k = sc.nextInt(); // 알고 싶은 학생의 번호
			
			double kScore = 0; // 알고 싶은 학생의 점수 저
			
			List<Double> scores = new ArrayList<Double>(); 
			for(int i=0; i<n; i++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int assign = sc.nextInt();
//				scores[i] = 0.35*mid + 0.45*fin + assign*0.2;
				
				double score = 0.35*mid + 0.45*fin + assign*0.2;
				scores.add(score);
				
				if(i==k-1) kScore = score;
			}
			
			Collections.sort(scores, Collections.reverseOrder());
			
			// n/10명의 학생들에게 동일한 평점 부여 
			int tmp = n/10;
			String grade = gradelist[(int)(scores.indexOf(kScore)/tmp)];
			System.out.printf("#%d %s\n", test_case+1, grade);

		}
		sc.close();
	}
}
