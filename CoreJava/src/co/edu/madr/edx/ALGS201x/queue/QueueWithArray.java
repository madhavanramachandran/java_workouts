package co.edu.madr.edx.ALGS201x.queue;

import java.util.Arrays;

/**
 * Basic Queue of fixed size.
 * 
 * @author madr
 *
 */
public class QueueWithArray {

	private Object[] queueArray;

	private int writeIndex;

	private int readIndex;

	public int length;

	/**
	 * Default constructor with default size of 10
	 */
	public QueueWithArray() {
		this(10);
	}

	public QueueWithArray(int size) {
		queueArray = new Object[size];
	}

	public void enqueue(Object o) {
		if (length < writeIndex) {
			queueArray[writeIndex++] = o;
			length++;
		}
	}

	public Object dequeue() {
		Object temp = queueArray[readIndex];
		queueArray[readIndex++] = null;
		length--;
		return temp;
	}

	public Object peek() {
		return queueArray[readIndex];
	}

	public boolean isEmpty() {
		return writeIndex == readIndex;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueWithArray [queueArray=");
		builder.append(Arrays.toString(queueArray));
		builder.append("]");
		return builder.toString();
	}

}
