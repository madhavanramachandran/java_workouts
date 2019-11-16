package co.interview.datastructures.stack.genericstack;

import java.util.Arrays;

public class GenericStack<T extends Object> {

	private int stackSize;
	private T[] stackArray;
	private int top;
	
	public GenericStack(int size) {
		this.stackSize = size;
		this.stackArray = (T[]) new Object[size];
		this.top = -1;
	}
	
	public void push(T entry) {
		if(isStackFull()) {
			resizeArray();
		}
		this.stackArray[++top] = entry;
	}
	
	public T pop() throws Exception {
		if(isStackEmpty()) {
			throw new Exception("Empty Stack");
		}
		return this.stackArray[top--];
	}
	
	public T peek() throws Exception {
		if(isStackEmpty()) {
			throw new Exception("Empty Stack");
		}
		return this.stackArray[top];
	}
	
	public void resizeArray() {
		int newSize = this.stackSize * 2;
		T[] newArray = (T[]) new Object[newSize];
		for(int i=0; i<this.stackSize; i++) {
			newArray[i] = this.stackArray[i];
		}
		this.stackArray = newArray;  
		this.stackSize = newSize;
	}
	
	public boolean isStackEmpty() {
		return top == -1;
	}
	
	public boolean isStackFull() {
		return top == this.stackSize-1;
	}

	@Override
	public String toString() {
		return "GenericStack [stackSize=" + stackSize + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top
				+ "]";
	}
}
