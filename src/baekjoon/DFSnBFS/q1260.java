package baekjoon.DFSnBFS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 1260. DFS와 BFS 
 */
public class q1260 {
	
	static int n, m, r;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt();
		
		visited = new boolean[n+1];
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		
		// 정점이 작은 것부터 방문 > 오름차순 
		for(int i=0; i<=n; i++) Collections.sort(graph.get(i));
		
		dfs(r);
		
		System.out.println();
		for(int i=0; i<=n; i++) visited[i]=false;
		
		bfs(r);
		
	}
	
	static void dfs(int r) {
		System.out.print(r+" ");
		visited[r]=true;
		
		for(Integer v: graph.get(r)) {
			if(!visited[v]) {
				dfs(v);
			}
		}
		return;
	}
	
	static void bfs(int r) {
		System.out.print(r+" ");
		visited[r]=true;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(r);
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(Integer v : graph.get(now)) {
				if(!visited[v]) {
					System.out.print(v+" ");
					queue.add(v);
					visited[v]=true;
				}
			}
		}
	}
}
