/**
 * 
 */
package co.edu.madr.edx.ALGS201x.linkedlist.singlylinkedlist;

/**
 * @author Abinaya
 *
 */
public class Node<T> {

	private T key;

	private Node<T> pointer;

	public Node() {

	}

	public Node(T key) {
		this(key, null);
	}

	public Node(T key, Node<T> pointer) {
		super();
		this.setKey(key);
		this.setPointer(pointer);
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public Node<T> getPointer() {
		return pointer;
	}

	public void setPointer(Node<T> pointer) {
		this.pointer = pointer;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + "]";
	}
	
	

}
