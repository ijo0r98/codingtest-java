package baekjoon.DFSnBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 2178. 미로 탐색 
 * DFS가 아닌 BFS로 풀것 !!
 * 
 * ** BFS 최단 경로 구할 때 !!
 */
public class q2178_bfs {
	
	static int n, m;
	static int[][] arr;
	static boolean[][] visited;
	
	static int[][] idx = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	static class Node {
		int x, y;
		public Node(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // row
		m = sc.nextInt(); // col
		
		visited = new boolean[n][m];
		arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String[] s = sc.next().split("");
			for(int j=0; j<s.length; j++) {
				arr[i][j]=Integer.parseInt(s[j]);
			}
 		} 
		
		bfs(new Node(0, 0));
		
//		printArr();
		
		System.out.println(arr[n-1][m-1]);
	}
	
	
	static void bfs(Node node) {
		visited[node.x][node.y]=true;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			for(int i=0; i<4; i++) {
				int dx = now.x+idx[i][0];
				int dy = now.y+idx[i][1];
				
				if(dx<n && dy<m && dx>=0 && dy>=0 && arr[dx][dy]==1 && !visited[dx][dy]) {
					visited[dx][dy] = true;
					queue.add(new Node(dx, dy));
					arr[dx][dy] = arr[now.x][now.y]+1;
				}
			}
		}
	}
	
	static void printArr() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%d(%d, %d) ",arr[i][j], i, j);
			}
			System.out.println("");
		}
	}
}
