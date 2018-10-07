/**
 * 
 */
package co.edu.madr.edx.ALGS201x.linkedlist;

/**
 * @author Abinaya
 *
 */
public class Node<T> {
	
	private T key;
	
	private Node<T> pointer;
	
	public Node() {
		setKey(null);
		setPointer(null);
	}
	
	public Node(T key, Node<T> pointer) {
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
		StringBuilder builder = new StringBuilder();
		builder.append("Node [");
		Node<T> current = this;
		do {
			builder.append(current.key).append(",");
			current = current.pointer;
		} while(current != null);
		/*Node<T> current = this;
		do {
			builder.append("[key=").append(current.key).append(", pointer=").append(current.pointer);
			current = pointer;
		} while(current != null);*/
		
		builder.append("]");
		return builder.toString();
	}


}
