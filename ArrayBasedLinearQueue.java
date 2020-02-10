package udemy.queue;

public class ArrayBasedLinearQueue {

	public static int queue[];
	public static int start;
	public static int end;
	public static int size;

	public String createLinearQueue(int n) {
		queue = new int[n];
		start = -1;
		end = -1;
		size = n;
		return "Create: Linear Queue Created";
	}

	public String enQueue(int data) {
		if (queue != null) {
			if (isFull())
				return "enQueue: Queue is full";
			else {
				queue[++end] = data;
				if (end == 0) {
					start = 0;
				}
			}

			return "enQueue: Data inserted";

		} else {
			return "enQueue: Queue does not exist";
		}
	}

	public String deQueue() {
		if (queue != null) {
			if (isEmpty())
				return "deQueue: Queue is empty";
			else {
				start++;
				return "deQueue: Data removed";
			}
		} else {
			return "deQueue: Queue does not exist";
		}
	}

	public String peek() {
		if (queue != null) {
			if (isEmpty())
				return "peek: Queue is empty";
			else
				return "peek: " + queue[start];
		} else {
			return "peek: Queue does not exist";
		}

	}

	public String delete() {
		if (queue == null) {
			return "Delete: No Queue\'s exist to delete";
		} else {
			queue = null;
			return "Delete: Queue Deleted";
		}
	}

	public void queueElements() {
		if(queue == null){
			System.out.println("Queue does not exist.");
		}else{
			for (int i = start; i <= end; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
		
	}

	public boolean isFull() {
		return end == size - 1;
	}

	public boolean isEmpty() {
		return end == -1;
	}
}
