package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 24480. 알고리즘 수업 - 깊이 우선 탐색 2
 */
public class q24480_dfs {
	
	static int n, m, r;
	static int cnt = 1;
	static boolean[] visited;
	static int[] result;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt();
		
		visited = new boolean[n+1];
		result = new int[n+1];
		
		for(int i=0; i<n+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		
		dfs(r);
		
		for(int i=1; i<=n; i++) System.out.println(result[i]);
	}
	
	static void dfs(int r) {
		visited[r]=true;
		result[r]=cnt;
		cnt++;
		Collections.sort(graph.get(r), Collections.reverseOrder());
		for(Integer v: graph.get(r)) {
			if(!visited[v]) {
				dfs(v);
			}
		}
		return;
	}

}
