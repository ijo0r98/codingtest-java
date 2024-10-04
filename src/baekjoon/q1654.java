package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1654. 랜선 자르기 
 */
public class q1654 {

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
		
		find(1, max, (1+max)/2);
		
		br.close();
	}

	static void find(long s, long e, long mid) {
		
		if(s>e) {
			System.out.println(s);
			return;
		}
		
		long cnt=0;
		for(int i=0; i<k; i++) cnt += lines[i]/mid;
		
		if(cnt<n) e = mid-1;
		else s = mid+1;
		
		find(s, e, (s+e)/2);
	}
}
