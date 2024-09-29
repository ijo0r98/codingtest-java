package baekjoon;

import java.util.*;

/**
 * 1920. 수 찾기 
 */
public class q1920 {

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
		
//		Collections.sort(a);
		Arrays.sort(a);
		int start=0, end=n-1, mid=n/2;
		for(int i=0; i<m; i++) {
			ans=0;
			if(a[0]<=find[i] && a[n-1]>=find[i]) findA(start, end, mid, find[i]);
			System.out.println(ans);
		}
		
		
	} 
 	
 	static void findA(int start, int end, int mid, int x) {
 		if(start<0 || end >= n || start>=end) return;
 		
 		if(a[mid]==x || a[end]==x || a[start]==x) {
 			ans=1;
 			return;
 		} else if(a[mid]<x) {
 			findA(mid+1, end, (mid+end)/2, x);
 		} else {
 			findA(start, mid-1, (mid+start)/2, x);
 		}
 	}
}
