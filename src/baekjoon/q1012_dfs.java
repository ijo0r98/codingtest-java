package baekjoon;

import java.util.Scanner;

/**
 * 1012. 유기농 배추 (DFS)  
 */
public class q1012_dfs {
	
	static int t, m, n, k;
	static int[][] arr;
	static boolean[][] visited; 
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt(); // test case
		
		for(int tc=0; tc<t; tc++) {
			result = 0;
			
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			
			arr = new int[m][n];
			visited = new boolean[m][n];
			for(int i=0; i<k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y]=1;
			}
			
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(arr[i][j]==1 && !visited[i][j]) {
						dfs(i, j);
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
	}
	
	static void dfs(int x, int y) {
		if(visited[x][y]) return;
		visited[x][y]=true;
		
		if(x>0 && arr[x-1][y]==1) dfs(x-1, y);
		if(y>0 && arr[x][y-1]==1) dfs(x, y-1);
		if(x<m-1 && arr[x+1][y]==1) dfs(x+1, y);
		if(y<n-1 && arr[x][y+1]==1) dfs(x, y+1);
		
	}
}
