package co.edu.madr.edx.ALGS201x;

import java.util.Scanner;
import java.util.Stack;

/**
 * Check the String is balanced or Not
 * @author madr
 *
 */
public class EdxStackStringBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input string containg only [,(,{,},),]");
		String str = scanner.nextLine();
		EdxStackStringBalance o = new EdxStackStringBalance();
		try {
			if(o.isStringBalanced(str)) {
				System.out.println(str + " is balanced");
			} else {
				System.out.println(str + " is NOT balanced");
			}
		} finally {
			scanner.close();
		}
	}

	/**
	 * Assuming str contains onl '[', '(', '{', and corresponding couterparts
	 * 
	 * @param str
	 *            String to be validated
	 * @return
	 */
	private boolean isStringBalanced(String str) {
		if (null != str && str.length() > 0) {
			Stack<Character> stack = new Stack<Character>();
			char[] strCharArr = str.toCharArray();
			for (char c : strCharArr) {
				if (c == '[' || c == '(' || c == '{') {
					stack.push(c);
				} else {
					if(stack.isEmpty()) return false;
					char top = stack.pop();
					if((top == '[' && c !=  ']') ||
							(top == '(' && c !=  ')') || 
							(top == '{' && c !=  '}')) {
						return false;
					}
				}
			}
			return stack.isEmpty();
		}
		return false;
	}

}
