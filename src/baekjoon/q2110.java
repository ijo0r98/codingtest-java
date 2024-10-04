package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 2110. 공유기 설치 
 */
public class q2110 {

	static int n, c;
	static int[] x; // 집의 좌표 
	static long ans;
 	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 집의 개수 
		c = Integer.parseInt(st.nextToken()); // 공유기 개수
		x = new int[n];
		for(int i=0; i<n; i++) {
			x[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(x);
		
		// 가능한 거리 1 ~ 집 좌표 사이 최대 거리 
		long min = 0;
		long max = x[n-1]-x[0];
		long mid;
		
		int cnt; // 공유기 수
		int loc;
		while(min<=max) {
			cnt = 1; // 설치 대수, 첫번째 집 설치  
			loc = x[0]; // 설치 위치, 첫번째 집 먼저 
			mid = (min+max)/2;
			for(int i=1; i<n; i++) {
				if(x[i] >= mid+loc) {
					// x[i] 다음 집의 위치 >= mid+loc 다음 공유기 설치 위치 
					cnt ++;
					loc = x[i];
				}
			}
			
			if(cnt>=c) {
				ans = mid;
				min = mid+1; // 계획보다 많음으로 간격을 늘림
			}
			else {
				max = mid-1; // 계획보다 적음으로 간격을 줄
			}
		}
		System.out.println(ans);
		
		br.close();
	}
}
