package co.edu.madr.edx.ALGS201x.tree.binarytree;

public class BinaryTree<T extends Number> {

	public BinaryTree(T root) {
		this.root = new BinaryTreeNode<T>(root);
	}

	private BinaryTreeNode<T> root;

	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}
	
	/**
	 * Common Methods for Binary Tree;
	 */
	public void addNode(T value) {
		root = addNode(root, value);
	}
	
	private BinaryTreeNode<T> addNode(BinaryTreeNode<T> node, T value) {
		if (null == node) {
			return new BinaryTreeNode<T>(value);
		}
		if (value.intValue() < node.getValue().intValue()) {
			node.setLeftNode(addNode(node.getLeftNode(), value));
		} else if (value.intValue() > node.getValue().intValue()) {
			node.setRightNode(addNode(node.getRightNode(), value));
		} else {
			return node;
		}
		return node;
	}

}
