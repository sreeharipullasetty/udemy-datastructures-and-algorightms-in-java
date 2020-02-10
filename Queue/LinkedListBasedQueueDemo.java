package udemy.queue;

public class LinkedListBasedQueueDemo {
	public static void main(String args[]){
		LinkedListBasedQueue queue = new LinkedListBasedQueue();
		System.out.println(queue.enQueue(3));
		System.out.println(queue.createLinearQueue(4));
		queue.queueElements();
		System.out.println(queue.enQueue(5));
		queue.queueElements();
		System.out.println(queue.enQueue(6));
		queue.queueElements();
		System.out.println(queue.enQueue(7));
		queue.queueElements();
		System.out.println(queue.enQueue(8));
		queue.queueElements();
		System.out.println(queue.enQueue(9));
		queue.queueElements();
		System.out.println(queue.deQueue());
		queue.queueElements();
		System.out.println(queue.peek());
		queue.queueElements();
		System.out.println(queue.delete());
		queue.queueElements();

	}
}
