package co.edu.madr.edx.ALGS201x.linkedlist.doublylinkedlist;

public class DoublyLinkedList<T> {
	
	private DNode<T> head;
	
	private int size;
	
	public DoublyLinkedList() {
		
	}
	
	public void addFirst(T data) {
		DNode<T> newNode = new DNode<T>(data);
		if (null == head) {
			head = newNode;
		} else {
			
		}
		size++;
	}
	
	public void addLast(T data) {
		
	}

}
