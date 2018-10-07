/**
 * 
 */
package co.edu.madr.edx.ALGS201x.stack;

/**
 * @author madr
 *
 *         Pros: All operations are constant. Cons: Potentially wasted memory if
 *         we initialize with large values and using less of it.
 */
public class StackWithArray {

	private final int DEFAULT_SIZE = 10;

	private int top;
	private int stackSize;
	private int[] stackArray;

	private boolean isStackEmpty() {
		return top == -1;
	}

	private boolean isStackFull() {
		return top == this.stackSize - 1;
	}

	public StackWithArray() {
		this.top = -1;
		this.stackSize = DEFAULT_SIZE;
		this.stackArray = new int[this.stackSize];
	}

	public StackWithArray(int size) {
		this.top = -1;
		this.stackSize = size;
		this.stackArray = new int[this.stackSize];
	}

	public int size() {
		return this.stackSize;
	}

	public void push(int e) {
		if (isStackFull()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		// First increase the top and assign the value
		this.stackArray[++this.top] = e;
	}

	/**
	 * Will remove and return the element at the top;
	 */
	public int pop() {
		if (isStackEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return this.stackArray[this.top--];
	}

	/**
	 * Will just return the top element without removing it.
	 * 
	 * @return
	 */
	public int peek() {
		if (isStackEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return this.stackArray[this.top];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack[");
		for (int i = 0; i < this.top; i++) {
			builder.append(this.stackArray[i] + ", ");
		}
		builder.append("]");
		return builder.toString();
	}

}
