package baekjoon.DFSnBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 1012. 유기농 배추 (BFS)
 */
public class q1012_bfs {
	
	static int t, m, n, k;
	static int[][] arr;
	static boolean[][] visited; 
	static int result;
	static int[][] idx = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	static class Node{
		int x, y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

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
						bfs(new Node(i, j));
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
	}
	
	static void bfs(Node node) {
		visited[node.x][node.y] = true;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			for(int i=0; i<4; i++) {
				int dx = now.x+idx[i][0];
				int dy = now.y+idx[i][1];
				
				if(dx<m && dy<n && dx>-1 && dy>-1 && arr[dx][dy]==1 && !visited[dx][dy]) {
					visited[dx][dy]=true;
					queue.add(new Node(dx, dy));
				}
			}
		}
	}
}
