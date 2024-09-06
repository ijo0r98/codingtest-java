package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 11723. 집합 
 */
public class q11723_v2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		Set<Integer> s = new HashSet<Integer>(); 
		String input;
		int x = 0;
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input = st.nextToken();
			if(st.hasMoreTokens()) {
				x = Integer.parseInt(st.nextToken());
			}
			
			switch(input) {
			case "add" : 
				s.add(x);
				break;
			case "remove" : 
				if(s.contains(x)) s.remove(x);
				break;
			case "check" :
				if(s.contains(x)) sb.append("1\n");
				else sb.append("0\n");
				break;
			case "toggle" :
				if(s.contains(x)) s.remove(x);
				else s.add(x);
				break;
			case "all" :
				List<Integer> newList = new ArrayList<>(
						Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
				s = new HashSet<>(newList);
				break;
			case "empty" :
				s.clear();
				break;
			}
		}
		
		System.out.println(sb);
	}
}

