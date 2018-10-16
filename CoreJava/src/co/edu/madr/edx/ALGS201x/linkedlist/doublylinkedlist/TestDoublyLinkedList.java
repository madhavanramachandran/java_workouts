package co.edu.madr.edx.ALGS201x.linkedlist.doublylinkedlist;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		TestDoublyLinkedList obj = new TestDoublyLinkedList();
		//obj.testAddFirst();
		//obj.testAddLast();
		obj.testAdd();
	}

	private void testAdd() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.addFirst(100);
		System.out.println(list);
		list.addLast(125);
		System.out.println(list);
		list.add(2, 200);
		System.out.println(list);
		list.addLast(250);
		System.out.println(list);
		System.out.println(list.search(250));
		
	}

	private void testAddLast() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.addLast(1);
		System.out.println(list);
		list.addLast(2);
		System.out.println(list);
		list.addLast(3);
		System.out.println(list);
		list.addLast(4);
		System.out.println(list);
	}

	private void testAddFirst() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.addFirst(4);
		System.out.println(list);
		list.addFirst(3);
		System.out.println(list);
		list.addFirst(2);
		System.out.println(list);
		list.addFirst(1);
		System.out.println(list);
	}

}
