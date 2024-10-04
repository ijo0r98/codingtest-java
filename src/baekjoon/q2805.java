package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 2805. 나무자르기 
 */
public class q2805 {

	static int n, m;
	static int[] trees;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 나무의 수 (1 ≤ N ≤ 1,000,000)
		m = Integer.parseInt(st.nextToken()); // 집으로 가져가려는 나무의 길이 (1 ≤ M ≤ 2,000,000,000)
		trees = new int[n];
		st = new StringTokenizer(br.readLine());
		int idx = 0;
		int min = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		while(st.hasMoreTokens()) {
			trees[idx]=Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[idx]);
			min = Math.min(min, trees[idx]);
			idx++;
		}
		
		long start = 0; // 절단기 높이 0 이상 
		long end = max;
		long mid = (start+end)/2;

		long total;
		while(start<=end) {
			total=0;
			mid = (start+end)/2;
			for(int i=0; i<n; i++) {
				if(trees[i]>mid) total += (trees[i]-mid);
			}
			System.out.printf("s=%d e=%d mid=%d\n", start, end, mid);
			System.out.println(total);
		
			if(total>m) start=mid+1; 
			else end=mid-1;
		}
		System.out.println(start);
		
		br.close();
	}
}
