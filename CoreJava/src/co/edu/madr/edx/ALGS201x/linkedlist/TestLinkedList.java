package co.edu.madr.edx.ALGS201x.linkedlist;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		TestLinkedList test = new TestLinkedList();
		test.testSinglyLinkedList();
		LinkedList<Integer> temp = new LinkedList<>();
		

	}

	private void testSinglyLinkedList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		System.out.println(list);
		list.addFirst(8687);
		list.addFirst(1);
		System.out.println(list.getSize());
		list.addLast(334);
		System.out.println(list);
	}

}
