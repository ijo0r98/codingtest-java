package baekjoon;

import java.util.Scanner;

/**
 * 8979. 올림
 */
public class q8979 {

	static int n, k;
	static int[][] medals;
	static int idx;
	static int rank=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		medals = new int[n+1][3];
		for(int i=0; i<n; i++) {
			idx = sc.nextInt();
			
			medals[idx][0] = sc.nextInt();
			medals[idx][1] = sc.nextInt();
			medals[idx][2] = sc.nextInt();
		}
		
		for(int i=1; i<n+1; i++) {
			if(i==k) continue;
			if(medals[i][0] > medals[k][0]) 
				rank++;
			else if(medals[i][0] == medals[k][0]) 
				if(medals[i][1] > medals[k][1]) 
					rank++;
				else if(medals[i][1] == medals[k][1]) 
					if(medals[i][2] > medals[k][2]) 
						rank++;
		
		}
		
		System.out.println(rank);
	}
}
