package co.edu.madr.codinginterview.chapter3;

import java.util.Arrays;

public class ThreeInOne_3_1 {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		System.out.println(stack);
		stack.push(0, 10);
		stack.push(1, 20);
		stack.push(2, 30);
		System.out.println(stack);
		stack.pop(2);
		System.out.println(stack);
	}

}

class MyStack {

	int numOfStack = 3;

	int stackSize = 5;

	int[] dataArr = new int[numOfStack * stackSize];

	int[] stackPointerIdx = new int[numOfStack];

	public MyStack(int size) {
		if (size > 0)
			this.stackSize = size;
		dataArr = new int[numOfStack * stackSize];
	}

	public void push(int stackNum, int data) {
		int index = stackNum * stackSize + stackPointerIdx[stackNum];
		dataArr[index] = data;
		stackPointerIdx[stackNum]++;
	}

	public int pop(int stackNum) {
		int index = stackNum * stackSize + stackPointerIdx[stackNum] - 1;
		int data = dataArr[index];
		dataArr[index] = 0;
		stackPointerIdx[stackNum]--;
		return data;
	}

	@Override
	public String toString() {
		return Arrays.toString(dataArr);
	}
}
