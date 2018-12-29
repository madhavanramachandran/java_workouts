package co.edu.codinginterview.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackOfPlates_3_3 {

	public static void main(String[] args) {
		

	}
	
}

class SetOfStack {
	Map<Integer, Stack<Integer>> stackMap = new HashMap<>();
	
	final int maxPerStackSize = 2;
	
	int stackNum;
	
	public SetOfStack() {
		stackMap.put(0, new Stack<Integer>());
		stackNum = 0;
	}
	
	public void push(int data) {
		stackMap.get(stackNum).push(data);
		int currSize = stackMap.get(stackNum).size();
		if (currSize == maxPerStackSize) {
			stackMap.put(++stackNum, new Stack<>());
		}
	}
	
	public Integer pop() {
		return popAt(stackNum);
	}
	
	public Integer popAt(int index) {
		return stackMap.get(index).pop();
	}
	
}
