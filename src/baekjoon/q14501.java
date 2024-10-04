package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 14501. 퇴사 
 */
public class q14501 {

	static int n;
	static int[][] arr;
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n=Integer.parseInt(br.readLine());
		arr = new int [n][2];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int total, day;
		int d, t;
		for(int i=0; i<n; i++) {
			System.out.printf("== i=%d, arr=(%d, %d)\n",i, arr[i][0],arr[i][1]);
			day = arr[i][0] + i;
			if(day<n) total = arr[i][1];
			else break;
			
			while((day<n) && (day+arr[day][0]<n)) {
				System.out.printf("day=%d day+arr[day][0]=%d total=%d, arr=(%d, %d) \n",day,day+arr[day][0],total,arr[day][0],arr[day][1]);
				total += (arr[day][1]);
				day += arr[day][0];
				 
				
			}
			System.out.printf("## day=%d total=%d\n",day, total);
			ans = Math.max(ans, total);
		}
		
		System.out.println(ans);
		
		br.close();
	}
}
