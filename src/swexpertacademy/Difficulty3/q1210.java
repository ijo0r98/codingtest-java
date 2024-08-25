package swexpertacademy.Difficulty3;

import java.util.Scanner;

/**
 * 1210. [S/W 문제해결 기본] 2일차 - Ladder1
 */
public class q1210 {
	static int[][] arr;
	static boolean[][] visited;
	static int n;
	static int[][] idxs = {{0, -1}, {0, 1}, {-1, 0}}; // 순서 중요!! 좌우 먼저 살핀 뒤 위로 올라감 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			n = sc.nextInt();
			arr = new int[100][100];
			visited = new boolean[100][100];
			
			int x=99;
			int y=99;
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					int input = sc.nextInt();
					if(input==2) {
						x=i;
						y=j;
					}
					arr[i][j]=input;
					
				}
			}
			
			dfs(x, y);
			
		}
	}
	
	public static void dfs(int x, int y) {
//		System.out.printf("x=%d, y=%d \n", x, y);
		visited[x][y]=true;
		if(x==0) {
			System.out.printf("#%d %d\n", n, y);
			return;
		} 
		
		int dx, dy;
		for(int i=0; i<3; i++) {
			dx = x+idxs[i][0];
			dy = y+idxs[i][1];
			if(dx>=0 && dx<100 && dy>=0 && dy<100 && arr[dx][dy]==1 && !visited[dx][dy]) {
				visited[dx][dy]=true;
				dfs(dx, dy);
				return;
			}
		}
	}

}
