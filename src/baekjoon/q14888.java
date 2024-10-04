package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 14888. 연산자 끼워넣기 
 */
public class q14888 {

	static int n;
	static int[] a;
	static int[] ops = new int[4];
	static long min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
 	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) ops[i]=Integer.parseInt(st.nextToken());
		
		backTracking(a[0], 1);
		bw.write(max+"\n"+min);
		
		bw.flush();
		bw.close();
		br.close();
	}
 	
 	static void backTracking(int num, int idx) { // 현재 계산중인 숫자, 인덱스(숫자 배열 a) 
 		if(idx==n) {
 			min = Math.min(min, num);
 			max = Math.max(max, num);
 		}
 		
 		for(int i=0; i<4; i++) {
 			if(ops[i]>0) {
 				ops[i]--; // 연산자 사용 
 				switch(i) {
 				case 0: backTracking(num+a[idx], idx+1); break;
 				case 1: backTracking(num-a[idx], idx+1); break;
 				case 2: backTracking(num*a[idx], idx+1); break;
 				case 3: backTracking(num/a[idx], idx+1); break;
 				}
 				ops[i]++; // 재귀 호출 후 개수 원복 
 			}
 		}
 	}
}
