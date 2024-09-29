package swexpertacademy.Difficulty4;

import java.util.Scanner;

/**
 * 1219. [S/W 문제해결 기본] 4일차 - 길찾기
 */
public class q1219 {
		
	static int[] graph1;
	static int[] graph2;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=0; tc<10; tc++) {
			String[] l1 = sc.nextLine().split(" ");
			int n1 = Integer.parseInt(l1[0]); // test case 
			int n2 = Integer.parseInt(l1[1]); // n
			
			ans=0;
			graph1=new int[100];
			graph2=new int[100];
			
			String s = sc.nextLine();
			String[] nodes = s.split(" ");
			for(int i=0; i<nodes.length/2;i++) {
				
				int key = Integer.parseInt(nodes[i*2]);
				int value = Integer.parseInt(nodes[i*2+1]);
				if(graph1[key]==0) graph1[key]=value;
				else graph2[key]=value;
			}
			
			searchGraph(graph1[0]);
			searchGraph(graph2[0]);
			
			System.out.printf("#%d %d\n", n1, ans);
		}
	}
	
	static void searchGraph(int x) {
		if(x==0) {
			return ;
		}
		if(x==99) {
			ans=1;
			return ;
		}
		
		searchGraph(graph1[x]);
		searchGraph(graph2[x]);
	}
}
