package co.edu.madr.edx.ALGS201x.linkedlist.doublylinkedlist;

public class DNode<T> {

	private T data;

	private DNode<T> previous;

	private DNode<T> next;

	public DNode() {

	}

	public DNode(T data) {
		this.data = data;
		previous = null;
		next = null;
	}

	public T getData() {
		return data;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "DNode [previous=" + (getPrevious() != null ? getPrevious().getData() : null) + ", data="
				+ this.getData() + ", next=" + (getNext() != null ? getNext().getData() : null) + "]";
	}

}
