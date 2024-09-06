package baekjoon;

import java.util.Scanner;

/**
 * 7568. 덩치 
 */
public class q7568 {
	
	static int[] rank;
	static class Body{
		int h, w;
		public Body() {}
		public Body(int h, int w){
			this.h=h;
			this.w=w;
		}
	}
	static Body[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new Body[n];
		rank = new int[n]; // 0으로 초기화 
		for(int i=0; i<n; i++) {
			arr[i]=new Body();
			arr[i].h=sc.nextInt();
			arr[i].w=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) { // 비교 기준 
			for(int j=0; j<n; j++) { // 상대 
				if(i==j) continue;
				if((arr[i].h < arr[j].h) && arr[i].w < arr[j].w) rank[i]++;
			}
		}
		
		for(int i=0; i<n; i++) System.out.print(rank[i]+1+" ");
	}
}
