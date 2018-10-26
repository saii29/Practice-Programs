package javatut.practice;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	static int minReversals(String s) {
		if(s.length() % 2 != 0)
			return -1;
		
		Stack<Integer> st = new Stack<>();
		char chars[] = s.toCharArray();
		int counter = 0;
		for(char c:chars) {
			if(c == '}' && st.isEmpty()) {
				counter++;
				st.push(1);
			} else if (c == '{'){
				st.push(1);
			} else if (c == '}') {
				st.pop();
			}
		}
		return counter + (st.size()/2);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=0; i<T; i++) {
			System.out.println(minReversals(s.next()));
		}
	}
}
