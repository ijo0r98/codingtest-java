package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 10816. 숫자 카드 2 
 */
public class q10816_1 {

	static int n, m;
	static int[] arr1, arr2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		arr1 = new int[n]; // 상근 
		arr2 = new int[n]; // 찾는 카드 
		st = new StringTokenizer(br.readLine());
		int idx=0;
		while(st.hasMoreTokens()) {
			arr1[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		m = Integer.parseInt(br.readLine());
		idx=0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr2[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		Arrays.sort(arr1);
		
		for(int i=0; i<m; i++) {
			int ans = upper(arr2[i])-lower(arr2[i]);
			sb.append(ans+" ");
		}
		System.out.println(sb);
			
		
		br.close();
	}
	
	static int lower(int x) {
		int start = 0;
		int end = n;
		
		while(start<end) {
			int mid = (start+end)/2;
			if(x <= arr1[mid]) {
				end = mid;
			} else {
				start = mid+1;
			}
		}
		
		return end;
	}
	
	static int upper(int x) {
		int start = 0;
		int end = n;
		
		while(start<end) {
			int mid = (start+end)/2;
			if(x < arr1[mid]) {
				end = mid;
			} else {
				start = mid+1;
			}
		}
		
		return end;
	}
}
