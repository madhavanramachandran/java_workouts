/**
 * 
 */
package co.edu.madr.edx.ALGS201x.stack;

import java.util.LinkedList;

/**
 * @author madr
 *
 */
public class StackWithLinkedList {

	
	private int top;
	
	private int stackSize;
	
	private LinkedList<?> stackList;
	
	public StackWithLinkedList() {
		this.top = -1;
		this.stackList = new LinkedList<>();
	}
	
	private boolean isStackEmpty() {
		return this.top == -1;
	}
	
	private boolean isStackFull() {
		return this.top == this.stackSize -1;
	}
	
	private void resizeStack() {
		
	}
}
