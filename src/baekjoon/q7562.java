package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 7562. 나이트의 이동 
 * 최단거리 - BFS
 */
public class q7562 {
	
	static int t, n;
	static class Point{
		int x;
		int y;
		public Point() {}
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int[][] moved = {{1, 2}, {2, 1}, {1, -2}, {2, -1}, {-1, -2}, {-2, -1}, {-1, 2}, {-2, 1}};

	static boolean visited[][];
	static Point start, end;
	static int count;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		for(int tc=0; tc<t; tc++) {
			n = sc.nextInt(); // 한 판의 길이
			
			visited = new boolean[n][n];
			start = new Point();
			end = new Point();
			count = 0;
			 
			
			start.x = sc.nextInt();
			start.y = sc.nextInt();
			end.x = sc.nextInt();
			end.y = sc.nextInt();
			
//			bfs(start);
			
			System.out.println(bfs(start));
		}
		
	}
	
	static int bfs(Point start) {
		visited[start.x][start.y]=true;
		
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(start);
		
		while(!queue.isEmpty()) {
			Point now = queue.poll();
			System.out.printf("%d %d\n", now.x, now.y);
			if(now.x==end.x && now.y==end.y) break;
			
			for(int i=0; i<8; i++) {
				int mx = moved[i][0] + now.x;
				int my = moved[i][1] + now.y;
				if(mx >= n || mx < 0 || my >= n || my <0) break;
				if(mx == end.x && my == end.y) {
					return count;
				}
				if(!visited[mx][my]) {
					queue.add(new Point(mx, my));
					visited[mx][my]=true;
					count++;
				}
			}
		}
		
		return count;
	}
}
