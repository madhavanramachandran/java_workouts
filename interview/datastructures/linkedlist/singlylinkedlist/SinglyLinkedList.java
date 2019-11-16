
/**
 * 
 */
package co.interview.datastructures.linkedlist.singlylinkedlist;

/**
 * @author madr
 *
 */
public class SinglyLinkedList<T> {

	private Node<T> head;

	private Node<T> tail;

	private int size;

	private Node<T> findLastNode() {
		return tail.getPointer();
	}

	/**
	 * Default Constructor
	 */
	public SinglyLinkedList() {
		head = new Node<T>();
		tail = new Node<T>();
	}

	public void add(T data) {
		if (isEmpty()) {
			addFirst(data);
		} else {
			addLast(data);
		}
	}

	public void add(int index, T data) {
		if (index == 0) {
			addFirst(data);
		} else if (index == size) {
			addLast(data);
		} else if (index > 0 && index < size) {
			Node<T> idxNode = head.getPointer();
			for (int i = 0; i < index - 1; i++) {
				idxNode = idxNode.getPointer();
			}
			Node<T> newNode = new Node<T>(data);
			Node<T> temp = idxNode.getPointer();
			newNode.setPointer(temp);
			idxNode.setPointer(newNode);
		}
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		// If no data is present
		if (isEmpty()) {
			head.setPointer(newNode);
			tail.setPointer(newNode);
		} else {
			Node<T> temp = head.getPointer();
			newNode.setPointer(temp);
			head.setPointer(newNode);
		}
		size++;
	}

	public void addLast(T data) {
		// If no data is present
		if (isEmpty()) {
			addFirst(data);
		} else {
			Node<T> newNode = new Node<T>(data);
			Node<T> temp = findLastNode();
			temp.setPointer(newNode);
			tail.setPointer(newNode);
		}
		size++;
	}

	public void deleteFirst() {
		if (size == 1) {
			head.setPointer(null);
			tail.setPointer(null);
		} else if (size > 1) {
			Node<T> deleteNode = head.getPointer();
			Node<T> temp = deleteNode.getPointer();
			head.setPointer(temp);
			deleteNode = null;
			size--;
		}
	}

	public void deleteLast() {
		if (size == 1) {
			deleteFirst();
		} else if (size > 1) {
			Node<T> temp = head.getPointer();
			Node<T> previousLast = null;
			while (temp.getPointer() != null) {
				if (temp.getPointer().getPointer() == null) {
					previousLast = temp.getPointer();
				}
				temp = temp.getPointer();
			} 
			tail.setPointer(previousLast);
		}
		size--;
	}

	public T getFirst() {
		if (null != head.getPointer()) {
			return head.getPointer().getKey();
		}
		return null;
	}

	public T getLast() {
		Node<T> temp = findLastNode();
		if (temp != null) {
			return temp.getKey();
		}
		return null;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SinglyLinkedList:: [");
		Node<T> temp = head.getPointer();
		while (temp != null) {
			builder.append(temp).append(", ");
			temp = temp.getPointer();
		}
		builder.append("]");
		return builder.toString();
	}

}
