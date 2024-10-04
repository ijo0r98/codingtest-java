package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 13458. 시험 감독 
 */
public class q13458 {

	static long n; //시험장 수 
	static float[] a; //응시자 수 
	static float b, c; // 총감독관이 한 시험장에서 감시할 수 있는 응시자 수, 부감독관이 감시할 수 있는 응시자 수
	static long result=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new float[(int) n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i] = Float.parseFloat(st.nextToken());
		st = new StringTokenizer(br.readLine());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		result = n; // 총감독관
		for(int i=0; i<n; i++) {
			a[i] -= b; // 총감독관 감시 응시자수 제외
			if(a[i]>0) result += Math.ceil((float)(a[i]/c));
		}
		
		System.out.println(result);
		br.close();
	}
}
