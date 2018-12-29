package co.edu.madr.edx.ALGS201x.tree.binarytree;

public class BinaryTreeNode<T extends Number> {
	
	public BinaryTreeNode(T value, BinaryTreeNode<T> leftNode, BinaryTreeNode<T> rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	public BinaryTreeNode(T value) {
		this(value, null, null);
	}
	
	private T value;
	
	private BinaryTreeNode<T> leftNode;
	
	private BinaryTreeNode<T> rightNode;

	public T getValue() {
		return value;
	}

	public BinaryTreeNode<T> getLeftNode() {
		return leftNode;
	}

	public BinaryTreeNode<T> getRightNode() {
		return rightNode;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setLeftNode(BinaryTreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}

	public void setRightNode(BinaryTreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		String tree = "";
		 tree += "[value=" + value; 
		 if (null != leftNode) {
			 tree = tree.concat(", leftNode").concat(leftNode.toString());
		 }
		 if (null != rightNode) {
			 tree = tree.concat(", rightNode").concat(rightNode.toString());
		 }
		 tree = tree.concat("]");
		return tree;
	}
	
	

}
