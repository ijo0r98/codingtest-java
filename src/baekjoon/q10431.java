package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 10431. 줄세우기 
 */
public class q10431 {
	static int[] arr;
	static int T, num, i;
	static int cnt=0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			
			i=0;
			arr = new int[20];
			cnt = 0;
			while(st.hasMoreTokens()) {
				arr[i]=Integer.parseInt(st.nextToken());
				i++;
			}
			
			for(i=1; i<20; i++) {
				for(int j=0; j<20-i; j++) {
					if(arr[j] > arr[j+1]) swap(j, j+1);
				}
			}
			
			System.out.println(num+" "+cnt);
			
		}
	}
	
	static void swap(int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		cnt++;
	}
}
