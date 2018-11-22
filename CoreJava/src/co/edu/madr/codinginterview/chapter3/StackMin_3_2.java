package co.edu.madr.codinginterview.chapter3;

import java.util.Stack;

public class StackMin_3_2 {

	public static void main(String[] args) {
		StackMin<Integer> stackMin = new StackMin<Integer>();
		// 5, 4, 6, 12, 2, 20
		stackMin.push(5);
		System.out.println("Current min:: " + stackMin.min());
		stackMin.push(4);
		System.out.println("Current min:: " + stackMin.min());
		stackMin.push(6);
		stackMin.push(12);
		System.out.println("Current min:: " + stackMin.min());
		stackMin.push(2);
		System.out.println("Current min:: " + stackMin.min());
		stackMin.push(20);
		
		System.out.println(stackMin);

	}

}

class StackMin<Integer> extends Stack<Integer> {

	Stack<Integer> minStack = new Stack<>();

	public Integer push(Integer data) {
		if (isEmpty()) {
			minStack.push(data);
		} else {
			if ((int) data < (int) minStack.peek()) {
				minStack.push(data);
			}
		}
		return super.push(data);
	}

	public Integer pop() {
		if (!isEmpty()) {
			int value = (int) super.peek();
			if (value == (int) minStack.peek()) {
				minStack.pop();
			}
		}
		return super.pop();
	}

	public Integer min() {
		if (!isEmpty()) {
			return minStack.peek();
		}
		return null;
	}

}
