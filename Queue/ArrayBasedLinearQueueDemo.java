package udemy.queue;

public class ArrayBasedLinearQueueDemo {
	public static void main(String args[]) {
		ArrayBasedLinearQueue queue = new ArrayBasedLinearQueue();
		System.out.println(queue.enQueue(3));
		System.out.println(queue.createLinearQueue(10));
		System.out.println(queue.deQueue());
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
