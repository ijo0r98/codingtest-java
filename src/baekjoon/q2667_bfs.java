package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 2667. 단지 번호 붙이기 (BFS)
 */
public class q2667_bfs {

	static int[][] arr ;
	static List<Integer> result = new ArrayList<Integer>();
	static int cnt = 0;
	static boolean[][] visited;
	static int n;
	
	static int[][] idx = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; 
	
	static class Node {
		int x, y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
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
					bfs(i, j);
					result.add(cnt);
				}
			}
		}
		
		System.out.println(result.size());
		Collections.sort(result);
		for(int i=0; i<result.size(); i++) System.out.println(result.get(i));

	}
	
	static void bfs(int x, int y) {
		visited[x][y]=true;
		cnt++;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(x, y));
		
		while(!queue.isEmpty()) {
			
			Node now = queue.poll();
			
			for(int i=0; i<4; i++) {
				int dx = now.x+idx[i][0];
				int dy = now.y+idx[i][1];
				if(dx<n && dy<n && dx>=0 && dy>=0 && arr[dx][dy]==1 && !visited[dx][dy]) {
					visited[dx][dy] = true;
					cnt++;
					queue.add(new Node(dx, dy));
				}
			}
		}
	}
}
