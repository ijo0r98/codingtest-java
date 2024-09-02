package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 24479. 알고리즘 수업 - 깊이 우선 탐색 1
 */
public class q24479_dfs {
	
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
		result  = new int[n+1]; // 배열 선언 시 0으로 초기화 
		
		// 1. 정점 수 만큼 그래프 초기
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 2. 그래프에 간선 정보 저장 (양방향)
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		
		// 깊이 우선 탐
		dfs(r);
		
		for(int i=1; i<=n; i++) {
			System.out.println(result[i]);
		}
	}
	
	static void dfs(int r) {
		visited[r] = true; // 방문 확인
		result[r]=cnt; // 방문 순서 저장
		cnt++;
		Collections.sort(graph.get(r)); // 인접 정점 오름차순 
		for(Integer v : graph.get(r)) {
			if(!visited[v]) { // 인접 정점 중 방문하지 않은 노드 방문 
				dfs(v);
			}
		}
		return ; // 모두 방문했을 때 return 
		
	}
}
