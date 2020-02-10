package udemy.queue;

public class ArrayBasedCircularQueue {
	public static int queue[];
	public static int start;
	public static int end;
	public static int size;
	public static int queueSize = -1;

	public String createLinearQueue(int n) {
		queue = new int[n];
		start = -1;
		end = -1;
		size = n;
		return "Create: Circular Queue Created";
	}

	public String enQueue(int data) {
		if (queue != null) {
			if (isFull())
				return "enQueue: Queue is full";
			else {
				if (end == -1) {
					start = 0;
				}
				++end;
				++queueSize;
				if (end == size)
					end = end % size;
				queue[end] = data;

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
				--queueSize;
				if (start == size)
					start = start % size;
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
		if (queue == null) {
			System.out.println("Queue does not exist.");
		} else {
			int counter = 0;
			int pointer = start;
			while (counter <= queueSize) {
				if (queue[pointer % size] != 0)
					System.out.print(queue[pointer % size] + " ");
				pointer++;
				counter++;
			}
			System.out.println();
		}

	}

	public boolean isFull() {
		if (end - start == size - 1 || start - end == size - 1)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		return end == -1;
	}

}
