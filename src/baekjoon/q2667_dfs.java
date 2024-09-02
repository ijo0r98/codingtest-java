package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 2667. 단지 번호 붙이기 (DFS)
 */
public class q2667_dfs {

	static int[][] arr ;
	static List<Integer> result = new ArrayList<Integer>();
	static int cnt = 0;
	static boolean[][] visited;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n][n];
		visited = new boolean[n][n];

		for(int i=0; i<n; i++) {
			String[] s = sc.next().split("");
			for(int j=0; j<s.length; j++) {
				arr[i][j]= Integer.parseInt(s[j]);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				cnt=0;
				if(arr[i][j]==1 && !visited[i][j]) {
					
					dfs(i, j);
					result.add(cnt);
				}
			}
		}
		
		System.out.println(result.size());
		Collections.sort(result);
		for(int i=0; i<result.size(); i++) System.out.println(result.get(i));

	}
	
	static void dfs(int x, int y) {
		if(visited[x][y]) return;
		visited[x][y]=true;
		cnt++;
		
		if(x<n-1 && arr[x+1][y]==1) dfs(x+1, y);
		if(x>0 && arr[x-1][y]==1) dfs(x-1, y);
		if(y>0 && arr[x][y-1]==1) dfs(x, y-1);
		if(y<n-1 && arr[x][y+1]==1) dfs(x, y+1);
		
	}
}
