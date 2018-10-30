package co.edu.madr.edx.ALGS201x.queue;

import java.util.Arrays;

public class CircularQueueWithArray {
	
	private int[] dataArray;
	
	private int readIndex;
	
	private int writeIndex;
	
	private int size;
	
	private int getAndIncreaseWriteIndex() {
		return (writeIndex++) % size; 
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CircularQueueWithArray [dataArray=");
		builder.append(Arrays.toString(dataArray));
		builder.append("]");
		return builder.toString();
	}

	private int getAndIncreaseReadIndex() {
		return (readIndex++) % size; 
	}
	
	public CircularQueueWithArray(int size) {
		this.size = size;
		dataArray = new int[this.size];
	}

	public boolean isFull() {
		return false;
	}
	
	public boolean isEmpty() {
		return readIndex == writeIndex;
	}
	
	public void enqueue(int e) {
		dataArray[getAndIncreaseWriteIndex()] = e;
	}
	
	public int dequeue() {
		int temp = dataArray[getAndIncreaseReadIndex()];
		System.out.println("In Dequeue:: " + temp);
		return temp; 
	}
	
	

}
