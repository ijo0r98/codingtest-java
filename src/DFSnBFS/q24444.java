package DFSnBFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 24444. 알고리즘 수업 - 너비 우선 탐색 1 
 */
public class q24444 {
	
	static int n, m, r;
	static int cnt = 1;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static boolean[] visited;
	static int[] result; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt();
		
		visited = new boolean[n+1];
		result = new int[n+1];
		
		// 그래프 노드 수 만큼 초기화 
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 그래프 간선 정보 저장 (양방향) 
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		
		for(int i=1; i<=n; i++) {
			Collections.sort(graph.get(i));
		}
		
		bfs(r);
		
		for(int i=1; i<=n; i++) System.out.println(result[i]);
	}
	
	static void bfs(int r) {
		visited[r] = true;
		result[r] = cnt;
		cnt++;
		
		// Queue 자료형 활용 
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(r);
		while(!queue.isEmpty()) {
			int now = queue.poll(); 
			
			// 해당 노드와 간선으로 연결된 모든 노드 탐색 
			for(Integer v: graph.get(now)) {
				// 선입선출로 특정 노드에 연결된 모든 노드 먼저 탐색 후 다음 노드(간선)로 이동 
				if(!visited[v])  {
					queue.add(v);
					visited[v] = true;
					result[v] = cnt;
					cnt++;
				}
			}
		}
	}
}
