package swexpertacademy.Difficulty1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class q1933 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		Set<Integer> ansSet = new HashSet<Integer>();
		for(int i=1; i<T; i++) {
			if(T%i==0) {
				ansSet.add(i);
				ansSet.add(T/i);
			}
		}
		List<Integer> ansList = new ArrayList<Integer>(ansSet);
		Collections.sort(ansList);
		for(int i=0;i<ansList.size();i++) System.out.print(ansList.get(i)+" ");
	}
}
