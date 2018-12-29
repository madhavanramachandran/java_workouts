package co.interview.datastructures.tree.binarytree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(50);
		binaryTree.addNode(23);
		binaryTree.addNode(75);
		binaryTree.addNode(756);
		System.out.println(binaryTree.getRoot());
	}

}

