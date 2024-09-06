package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 11723. 집합 
 */
public class q11723 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		Set<Integer> s = new HashSet<Integer>(); 
		String input;
		int x = 0;
		
		for(int i=0; i<m; i++) {
			input = sc.next();
			if(!input.equals("all") && !input.equals("empty")) {
				x = sc.nextInt();
			}
			
			switch(input) {
			case "add" : 
				s.add(x);
				break;
			case "remove" : 
				if(s.contains(x)) s.remove(x);
				break;
			case "check" :
				if(s.contains(x)) System.out.println("1");
				else System.out.println("0");
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
	}
}

