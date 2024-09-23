package swexpertacademy.Difficulty4;

import java.util.Scanner;
import java.util.Stack;

/**
 * 1218. [S/W 문제해결 기본] 4일차 - 괄호 짝짓기
 */
public class q1218 {

	static String[][] brackets = {{"(",")"}, {"[","]"}, {"{","}"}, {"<",">"}};
	static Stack<String> stack;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans;
		for(int tc=1; tc<=10; tc++) {
			int _ = sc.nextInt();
			String[] s = sc.next().split("");
			
			stack=new Stack<String>();
			ans = checkPairs(s, stack);
			System.out.printf("#%d %d\n", tc, ans);
		}
	}
	
	static int checkPairs(String[] s, Stack<String> stack) {
		String top;
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<4; j++) {
				if(s[i].equals(brackets[j][0])) {
					stack.push(s[i]);
				}
				
				else if(s[i].equals(brackets[j][1])) {
					top = stack.peek();
					if(top.equals(brackets[j][0])) stack.pop();
					else return 0;
				} 
			}
		}
		return 1;
	}
	
	static void printPairs() {
		for(int i=0; i<stack.size(); i++) System.out.print(stack.get(i));
		System.out.println("");
	}
	
}
