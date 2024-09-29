package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 10816. 숫자 카드 - 다른 버전  
 */
public class q10816_2 {

	static int n, m;
	static int[] arr1, arr2;
	static int[] cnt;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		arr1 = new int[n]; // 상근 
		st = new StringTokenizer(br.readLine());
		int idx=0;
		int max = Integer.MIN_VALUE;
		while(st.hasMoreTokens()) {
			arr1[idx] = Integer.parseInt(st.nextToken());
			idx++;
			max = Math.max(max, arr1[idx]);
		}
		
		m = Integer.parseInt(br.readLine());
		arr2 = new int[m]; // 찾는 카드 
		st = new StringTokenizer(br.readLine());
		idx=0;
		while(st.hasMoreTokens()) {
			arr2[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		cnt = new int[max+1];
		for(int i=0; i<=n; i++) {
			cnt[arr1[i]]++;
		}
		
		for(int i=0; i<m; i++) {
			if(max<arr2[i]) sb.append(0);
			else sb.append(cnt[arr2[i]]);
		}
		System.out.println(sb);
		
		br.close();
	}
}
