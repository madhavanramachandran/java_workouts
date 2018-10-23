/**
 * 
 */
package co.edu.madr.edx.ALGS201x.stack;

import co.edu.madr.edx.ALGS201x.linkedlist.singlylinkedlist.SinglyLinkedListHeadOnly;

/**
 * @author madr
 *
 */
public class StackWithLinkedList implements IStack{

	private SinglyLinkedListHeadOnly<Integer> stackList;
	
	public StackWithLinkedList() {
		this.stackList = new SinglyLinkedListHeadOnly<>();
	}

	@Override
	public boolean isStackEmpty() {
		return this.stackList.isEmpty();
	}

	@Override
	public void push(int e) {
		this.stackList.addLast(e);
	}

	@Override
	public int pop() {
		int temp = this.stackList.getLast();
		this.stackList.deleteLast();
		return temp;
	}

	@Override
	public int peek() {
		return this.stackList.getLast();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StackWithLinkedList [stackList=");
		builder.append(stackList);
		builder.append("]");
		return builder.toString();
	}
}
