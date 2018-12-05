package co.edu.madr.others;

import java.util.Stack;

public class RemoveEvenChars {

	public static void main(String[] args) {
		//String str = "aaabbcccdaabbbccccaba";
		String str = "aaabbccccaaaeefee";
		resolveString(str);

	}

	private static void resolveString(String str) {
		char[] charArr = str.toCharArray();
		Stack<Character> stack = new Stack<>();

		Stack<CharD> count_stack = new Stack<>();

		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			char currentChar = charArr[i];
			stack.push(currentChar);
			count++;

			if (i == charArr.length - 1 || currentChar != charArr[i + 1]) {
				count_stack.push(new CharD(currentChar, count));
				int tempCount = count;
				count = 0;
				if (tempCount % 2 == 0) {
					removeCountTimesFromStack(stack, tempCount);
					count_stack.pop();
					if (!count_stack.isEmpty() && i < charArr.length - 1) {
						CharD card = count_stack.peek();
						if (card.getCharacter() == charArr[i + 1]) {
							count = card.getCount();
							count_stack.pop();
						}
					}
				}
			}
		}
		System.out.println(stack);
		System.out.println(count_stack);
	}

	private static void removeCountTimesFromStack(Stack<Character> stack, int count) {
		for (int i = 0; i < count; i++) {
			stack.pop();
		}
	}
}

class CharD {
	public CharD(char character) {
		this(character, 1);
	}

	public CharD(char character, int count) {
		this.character = character;
		this.count = count;
	}

	private char character;

	private int count;

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CharD [character=" + character + ", count=" + count + "]";
	}
	
	
}