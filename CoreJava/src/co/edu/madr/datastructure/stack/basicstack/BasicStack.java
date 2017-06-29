package co.edu.madr.datastructure.stack.basicstack;

import java.util.Arrays;

/**
 * 
 * @author Abinaya
 * Defined as Last In First Out (LIFO) 
 * Push: new element added at the top
 * Pop: remove the last element added
 * Peek: returns the top element without removing it
 */
public class BasicStack {

	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public BasicStack(int size) {
		this.stackSize = size;
		this.stackArray = new int[size];
		this.top = -1;
	}
	
	public void push(int entry) throws Exception {
		if(isStackFull()) {
			throw new Exception("Stack full. Cannot add more items");
		}
		this.stackArray[++top] = entry;
	}
	
	public int pop() throws Exception {
		if(isStackEmpty()) {
			throw new Exception("Stack is empty");
		}
		return this.stackArray[top--];
	}
	
	public int peek() throws Exception {
		if(isStackEmpty()) {
			throw new Exception("Stack is empty");
		}
		return this.stackArray[top];
	}
	
	public boolean isStackEmpty() {
		return top == -1;
	}
	
	public boolean isStackFull() {
		return this.stackSize-1 == top;
	}

	@Override
	public String toString() {
		return "BasicStack [stackSize=" + stackSize + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top
				+ "]";
	}
}
