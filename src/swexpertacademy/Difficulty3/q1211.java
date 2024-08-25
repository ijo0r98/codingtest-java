package swexpertacademy.Difficulty3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1211. [S/W 문제해결 기본] 2일차 - Ladder2
 */
public class q1211 {
	
	static int[][] arr;
	static boolean[][] visited;
	static int n;
	static int[][] idxs = {{0, -1}, {0, 1}, {-1, 0}};
	
	static List<Integer> ans = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=1; tc++) {
			n = sc.nextInt();
			arr = new int[100][100];
			visited = new boolean[100][100];
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					int input = sc.nextInt();
					arr[i][j]=input;
				}
			}
			
		}
		
		dfs(99, 99);
	}
	
	static void dfs(int x, int y) {
		visited[x][y]=true;
//		System.out.printf("x=%d y=%d\n", x, y);
		
		if(x == 0 ) {
			System.out.printf("#%d %d\n", n, y);
			return;
		}
		
		int dx, dy;
		for(int i=0; i<3; i++) {
			dx = x+idxs[i][0];
			dy = y+idxs[i][1];
			
			if(isIn(dx, dy) && !visited[dx][dy] && arr[dx][dy]==1) {
//				dfs(dx, dy);
				bfs(dx, dy);
			}
		}
	}
	
	static void bfs(int x, int y) {
		visited[x][y] = true;
		
		while(x!=0) {
			
			int dx, dy;
			for(int i=0; i<3; i++) {
				dx = x+idxs[i][0];
				dy = y+idxs[i][1];
				
				if(isIn(dx, dy) && !visited[dx][dy] && arr[dx][dy]==1) {
					
				}
			}
		}
		System.out.printf("#%d %d", n, y);
	}
	
	static boolean isIn(int dx, int dy) {
		if(dx>=0 && dx<100 && dy>=0 && dy<100) return true;
		else return false;
	}
}
