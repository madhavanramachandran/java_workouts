package co.edu.madr.edx.ALGS201x.queue;

public class TestQueue {

	public static void main(String[] args) {
		QueueWithArray queue = new QueueWithArray(5);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		
		queue.dequeue();
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
