package baekjoon.DFSnBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 2606. 바이러스 (bfs) 
 */
public class q2606_bfs {
	
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static boolean[] visited;
	static int cnt=1;
	static int ans=0;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 컴퓨터 수 
		int m = sc.nextInt(); // 네트워크 수
		
		visited=new boolean[n+1];
		
		for(int i=0; i<=n; i++) graph.add(new ArrayList<Integer>());
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		
		bfs(1);
		
		for(int i=2; i<=n; i++) {
			if(visited[i]) {
				ans++;
			}
		}
			
		System.out.println(ans);
	}
	
	static void bfs(int r) {
		visited[r] = true;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(r);
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(Integer v : graph.get(now)) {
				if(!visited[v]) {
					visited[v]=true;
					queue.add(v);	
				}
			}
		}
	}
}
