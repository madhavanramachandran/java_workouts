package co.edu.madr.edx.ALGS201x.linkedlist.singlylinkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		TestSinglyLinkedList test = new TestSinglyLinkedList();
		test.doTest();
	}

	private void doTest() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.addFirst(8687);
		list.addFirst(1);
		list.add(1, 999);
		System.out.println(list.size());
		System.out.println(list);
		list.addLast(334);
		list.addFirst(234);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
	}

}
