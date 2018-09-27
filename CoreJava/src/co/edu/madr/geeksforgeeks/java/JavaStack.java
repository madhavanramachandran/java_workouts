package co.edu.madr.geeksforgeeks.java;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/java-stack/problem
 * 
 * @author madr
 *
 */
public class JavaStack {

	public static void main(String[] args) {
		String s = "{}(";
		System.out.println(JavaStack.isBalancedString(s));
	}

	private static boolean isBalancedString(String str) {

		Stack<Character> stk = new Stack<Character>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (c == '(' || c == '[' || c == '{') {
				stk.push(c);
			} else {
				if (stk.isEmpty())
					return false;
				char top = stk.pop();
				if ((top == '[' && c != ']') || (top == '(' && c != ')') || (top == '{' && c != '}')) {
					return false;
				}
			}
		}
		return stk.isEmpty();
	}

}
