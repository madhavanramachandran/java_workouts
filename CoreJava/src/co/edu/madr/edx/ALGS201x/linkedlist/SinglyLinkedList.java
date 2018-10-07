/**
 * 
 */
package co.edu.madr.edx.ALGS201x.linkedlist;

/**
 * @author madr
 *
 */
public class SinglyLinkedList<T> {

	private Node<T> head;

	private Node<T> tail;
	
	private int size;

	private Node<T> findLastNode() {
		Node<T> currentNode = head;
		if (head != null) {
			while (currentNode.getPointer() != null)
				currentNode = currentNode.getPointer();
		}
		return currentNode;
	}

	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 1;
	}

	public int getSize() {
		return size;
	}
	
	public void add(T data) {
		if(head == null) {
			this.addFirst(data);
		} else {
			Node<T> node = new Node<T>();
			node.setKey(data);
			this.findLastNode().setPointer(node);
			this.tail.setPointer(node);
		}
	}

	public void addFirst(T data) {
		Node<T> n = new Node<T>();
		n.setKey(data);
		// Assigning the pointer already present in the head. This will be pointed from
		// the new entry
		n.setPointer(head);
		head = n;
	}
	

	public T getFirst() {
		if (head != null) {
			return head.getKey();
		}
		return null;
	}

	public void addLast(T data) {
		// Need to traverse to find the last node.
		// current last node pointer points to a new node.
		Node<T> n = new Node<T>();
		n.setKey(data);
		Node<T> currentLastNode = this.findLastNode();
		currentLastNode.setPointer(n);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SinglyLinkedList:: [");
		if(head != null) {
			builder.append(head);	
		}
		builder.append("]");
		return builder.toString();
	}

}
