package co.edu.madr.edx.ALGS201x.linkedlist.singlylinkedlist;

public class SinglyLinkedListHeadOnly<T> {

	private Node<T> head;

	private int size;

	private Node<T> findLastNode() {
		if (null == head)
			return null;
		Node<T> lastNode = head;
		while (null != lastNode.getPointer()) {
			lastNode = lastNode.getPointer();
		}
		return lastNode;
	}

	/**
	 * When head is null, there are no objects
	 */
	public SinglyLinkedListHeadOnly() {
		head = null;
		size = 0;
	}

	public SinglyLinkedListHeadOnly(T data) {
		head = new Node<T>(data);
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setPointer(head);
			head = newNode;
		}
		size++;
	}

	public void addLast(T data) {
		Node<T> lastNode = findLastNode();
		lastNode.setPointer(new Node<T>(data));
		size++;
	}

	public void add(int index, T data) {
		if (index == 0) {
			addFirst(data);
		} else if (index == size - 1) {
			addLast(data);
		} else if (index > 0 && index < size - 1) {
			Node<T> temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getPointer();
			}
			Node<T> newNode = new Node<T>(data, temp.getPointer());
			temp.setPointer(newNode);
			size++;
		}
	}

	public void deleteFirst() {
		if (!isEmpty()) {
			head = head.getPointer();
			size--;
		}
	}

	public void deleteLast() {
		if (size == 1) {
			deleteFirst();
		} else if (!isEmpty()) {
			Node<T> temp = head;
			Node<T> previousLast = null;
			while (null != temp.getPointer()) {
				previousLast = temp;
				temp = temp.getPointer();
			}
			previousLast.setPointer(null);
			size--;
		}
	}

	public void delete(int index) {
		if (index == 0) {
			deleteFirst();
		} else if (index == size - 1) {
			deleteLast();
		} else if (index > 0 && index < size - 1) {
			Node<T> currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getPointer();
			}
			Node<T> deleteNext = currentNode.getPointer().getPointer();
			currentNode.setPointer(deleteNext);
			size--;
			
			
		}
	}

	public boolean isEmpty() {
		return null == head;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SinglyLinkedListHeadOnly [values=");
		Node<T> temp = head;
		while (temp != null) {
			builder.append(temp).append(", ");
			temp = temp.getPointer();
		}
		builder.append("size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

}
