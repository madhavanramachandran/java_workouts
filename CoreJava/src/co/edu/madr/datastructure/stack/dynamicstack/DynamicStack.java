package co.edu.madr.datastructure.stack.dynamicstack;

import java.util.Arrays;

public class DynamicStack {
	
	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public DynamicStack(int size) {
		this.stackSize = size;
		this.stackArray = new int[size];
		this.top = -1;
	}
	
	private void resizeStack() {
		int newSize = this.stackSize * 2;
		int[] newArray = new int[newSize];
		for(int i=0; i<stackSize; i++) {
			newArray[i] = stackArray[i];
		}
		this.stackArray = newArray;
		this.stackSize = newSize;
	}
	
	public void push(int entry) {
		if(isStackFull()) {
			resizeStack();
		}
		this.stackArray[++top] = entry;
	}
	
	public int pop() throws Exception {
		if(isStackEmpty()) {
			throw new Exception("Empty Stack");
		}
		return this.stackArray[top--];
	}
	
	public int peek() throws Exception {
		if(isStackEmpty()) {
			throw new Exception("Empty Stack");
		}
		return this.stackArray[top];
	}
	
	private boolean isStackFull() {
		return top == this.stackSize-1;
	}
	
	private boolean isStackEmpty() {
		return top == -1;
	}

	@Override
	public String toString() {
		return "DynamicStack [stackSize=" + stackSize + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top
				+ "]";
	}

}
