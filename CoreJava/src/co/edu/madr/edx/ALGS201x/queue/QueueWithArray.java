package co.edu.madr.edx.ALGS201x.queue;

/**
 * Basic Queue of fixed size.
 * 
 * @author madr
 *
 */
public class QueueWithArray {

	private int[] queueArray;

	private int writeIndex;

	private int readIndex;

	public int length;

	public boolean isFull() {
		return queueArray.length == length - 1;
	}

	/**
	 * Default constructor with default size of 10
	 */
	public QueueWithArray() {
		this(10);
	}

	public QueueWithArray(int size) {
		queueArray = new int[size];
	}

	public void enqueue(int e) {
		queueArray[writeIndex++] = e;
		length++;
	}

	public int dequeue() {
		int temp = queueArray[readIndex];
		queueArray[readIndex++] = -1;
		length--;
		System.out.println("Dequeing:: " + temp);
		return temp;
	}

	public Object peek() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("No items in the queue");
		}
		return queueArray[readIndex];
	}

	public boolean isEmpty() {
		return writeIndex == readIndex;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueWithArray [");
		for (int i = readIndex; i < writeIndex; i++) {
			builder.append(queueArray[i]).append(", ");
		}
		builder.append("]");
		return builder.toString();
	}

}
