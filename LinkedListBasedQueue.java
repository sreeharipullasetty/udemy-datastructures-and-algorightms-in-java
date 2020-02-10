package udemy.queue;

import udemy.linkedlist.Node;

public class LinkedListBasedQueue {
	Node start, end;

	public String createLinearQueue(int n) {
		Node node = new Node(n, null);
		start = node;
		end = node;
		return "Create: Linear Queue Created";
	}

	public String enQueue(int data) {
		if (start != null) {
			Node node = new Node(data, null);
			end.reference = node;
			end = end.reference;
			return "enQueue: Data inserted";

		} else {
			return "enQueue: Queue does not exist";
		}
	}

	public String deQueue() {
		if (start != null) {
			if (isEmpty())
				return "deQueue: Queue is empty";
			else {
				start = start.reference;
				return "deQueue: Data removed";
			}
		} else {
			return "deQueue: Queue does not exist";
		}
	}

	public String peek() {
		if (start != null) {
			if (isEmpty())
				return "peek: Queue is empty";
			else
				return "peek: " + start.data;
		} else {
			return "peek: Queue does not exist";
		}

	}

	public String delete() {
		if (start == null) {
			return "Delete: No Queue\'s exist to delete";
		} else {
			start = null;
			return "Delete: Queue Deleted";
		}
	}

	public void queueElements() {
		if (start == null) {
			System.out.println("Queue does not exist.");
		} else {
			Node pointer = start;
			while (pointer != null) {
				System.out.println(pointer.data);
				pointer = pointer.reference;
			}
		}

	}

	public boolean isEmpty() {
		return start == null;
	}
}
