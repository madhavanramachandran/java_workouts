package co.interview.datastructures.queue;

public class TestQueue {

	public static void main(String[] args) {
		TestQueue testQueue = new TestQueue();
		//testQueue.testQueueWithArray();
		
		CircularQueueWithArray queue = new CircularQueueWithArray(5);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		System.out.println(queue);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.isEmpty());
		System.out.println(queue);
	}

	private void testQueueWithArray() {
		QueueWithArray queue = new QueueWithArray(5);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.peek());
		System.out.println(queue);
		
	}

}
