package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 1697. 숨바꼭질
 * 
 *  미로탐색(2178) 풀이 활용
 *  
 *  참고 https://smartpro.tistory.com/18
 */
public class q1697_bfs {
	
	static int result=0;
	static int[] arr;
	static int n, k;
//	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		// new int[100000] 런타임에러(ArrayIndxOutLOfBounds)
		arr = new int[100001];
//		visited = new boolean[100000];
		
		bfs(n);
		System.out.println(arr[k]-1);
		
//		for(int i=0; i<=k ; i++) System.out.print(arr[i]+"("+i+") ");
	}
	
	static void bfs(int x) {
//		visited[x] = true;
		arr[x]++;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(x);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			if(now==k) break;
			
			// +1
			if(now+1<=100000 && arr[now+1]==0) {
				queue.add(now+1);
				arr[now+1] = arr[now]+1;
			}
			// -1
			// now-1>=1 틀렸습니다 > now-1>=0 통과 
//			if(now-1>=1 && arr[now-1]==0) {
			if(now-1>=0 && arr[now-1]==0) {	
				queue.add(now-1);
				arr[now-1] = arr[now]+1;
			}
			// *2
			if(now*2<=100000 && arr[now*2]==0) {
				queue.add(now*2);
				arr[now*2] = arr[now]+1;
			}
			
		}
	}
}
