package co.edu.madr.edx.ALGS201x.stack.problems;

import co.edu.madr.edx.ALGS201x.stack.genericstack.GenericStack;

public class StringReversal {
	
	public static void main(String[] args) throws Exception {
		StringReversal r = new StringReversal();
		System.out.println(r.reverseWord("asdf"));
		System.out.println(r.reverseWord("maddy"));
	
	}
	
	public String reverseWord(String word) throws Exception {
		GenericStack<Character> stk = new GenericStack<>(word.length());
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<word.length(); i++) {
			stk.push(word.charAt(i));
		}
		while(!stk.isStackEmpty()) {
			builder.append(stk.pop());
		}
		return builder.toString();
	}

}
