package co.edu.madr.edx.ALGS201x.linkedlist.doublylinkedlist;

public class DoublyLinkedList<T> {

	private DNode<T> head;

	private int size;

	public DoublyLinkedList() {

	}

	private DNode<T> findLastNode() {
		DNode<T> lastNode = head;
		while (null != lastNode.getNext()) {
			lastNode = lastNode.getNext();
		}
		return lastNode;
	}

	public boolean isEmpty() {
		return null == head;
	}

	public void addFirst(T data) {
		DNode<T> newNode = new DNode<T>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			head.setPrevious(newNode);
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	public void addLast(T data) {
		if (isEmpty()) {
			addFirst(data);
		} else {
			DNode<T> lastNode = findLastNode();
			DNode<T> newNode = new DNode<T>(data);
			lastNode.setNext(newNode);
			newNode.setPrevious(lastNode);
			size++;
		}
	}

	public void add(int index, T data) {
		if (isEmpty()) {
			addFirst(data);
		} else if (index == size) {
			addLast(data);
		} else if (index > 0) {
			DNode<T> idxNode = head;
			DNode<T> newNode = new DNode<T>(data);
			for (int i = 1; i <= index; i++) {
				idxNode = head.getNext();
			}
			DNode<T> idxNextNode = idxNode.getNext();
			idxNextNode.setPrevious(newNode);
			newNode.setNext(idxNextNode);
			idxNode.setNext(newNode);
			head = idxNode;
			size++;
		}
	}

	public void deleteFirst() {
		head = head.getNext();
		head.setPrevious(null);
		size--;
	}

	public void deleteLast() {
		DNode<T> currentNode = head;
		DNode<T> previousLast = null;
		while (null != currentNode.getNext()) {
			previousLast = currentNode;
			currentNode = currentNode.getNext();
		}
		previousLast.setNext(null);
		size--;
	}

	public void delete(int index) {
		if (index == 1) {
			deleteFirst();
		} else if (index == size) {
			deleteLast();
		} else {
			DNode<T> idxNode = head;
			for (int i = 1; i < index; i++) {
				idxNode = idxNode.getNext();
			}
			DNode<T> idxNextNode = idxNode.getNext();
			DNode<T> idxPreviousNode = idxNode.getPrevious();
			idxNextNode.setPrevious(idxPreviousNode);
			idxPreviousNode.setNext(idxNextNode);
			size--;
		}
	}

	public int search(T data) {
		if (!isEmpty()) {
			DNode<T> temp = head;
			int dataIdx = 0;
			while (temp != null) {
				if (temp.getData().equals(data)) {
					return dataIdx;
				}
				temp = temp.getNext();
				dataIdx++;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoublyLinkedList [head=");
		DNode<T> temp = head;
		builder.append(temp).append(", ");
		while (null != temp.getNext()) {
			builder.append(temp.getNext()).append(", ");
			temp = temp.getNext();
		}
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

}
