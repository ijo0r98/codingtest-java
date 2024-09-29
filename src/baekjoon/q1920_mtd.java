package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1920. 수 찾기 > 라이브러리 활용 버전 
 */
public class q1920_mtd {

	static int[] a;
	static int[] find;
	static int ans=0;
	static int n, m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		a = new int[n];
		for(int i=0; i<n; i++) a[i]=sc.nextInt();
		m = sc.nextInt();
		find = new int[m];
		for(int i=0; i<m; i++) find[i]=sc.nextInt();
		
		Arrays.sort(a);
		for(int i=0; i<m; i++) {
			ans=(Arrays.binarySearch(a, find[i]) <0 ? 0 : 1);
			System.out.println(ans);
		}
	}
}
