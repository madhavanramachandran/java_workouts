package co.edu.madr.edx.ALGS201x.linkedlist.singlylinkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		TestSinglyLinkedList test = new TestSinglyLinkedList();
		//test.doTest();
		
		test.doSinglyLinkedHeadOnlyTest();
	}

	private void doSinglyLinkedHeadOnlyTest() {
		SinglyLinkedListHeadOnly<Integer> list = new SinglyLinkedListHeadOnly<>();
		list.addFirst(40); list.addFirst(20);
		list.addLast(60);
		list.add(2, 80);
		list.delete(1);
		System.out.println(list);
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
		
		System.out.println("######################################");
		SinglyLinkedList<Integer> delTest = new SinglyLinkedList<>();
		delTest.add(666);
		delTest.add(222);
		System.out.println(delTest);
		delTest.deleteLast();
		System.out.println(delTest);
	}

}
