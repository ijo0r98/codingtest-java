package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 1654. 랜선 자르기 
 */
public class q1654_2 {

	static int k, n;
	static int[] lines;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		k = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 
		n = Integer.parseInt(st.nextToken()); // 필요한 
		
		lines = new int[k];
		int max = Integer.MIN_VALUE;
		for(int i=0; i<k; i++) {
			lines[i]=Integer.parseInt(br.readLine());
			max = Math.max(max, lines[i]);
		}
		
		long s = 1;
		long e = max;
		long mid = (s+e)/2;
		long cnt=0;
		while(s<=e) {
			mid = (s+e)/2;
			cnt=0;
			for(int i=0; i<k; i++) cnt += lines[i]/mid;
			System.out.printf("s=%d e=%d mid=%d cnt=%d\n", s, e, mid, cnt);
			if(cnt<n) e=mid-1;
			else s=mid+1;
		}
		System.out.println(e);
		
		br.close();
	}
}
