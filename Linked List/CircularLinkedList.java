package udemy.linkedlist;

public class CircularLinkedList {
	Node head, tail;

	public void CreateCircularLinkedList(int nodeValue) {
		head = null;
		tail = null;
		Node node = new Node(nodeValue, null);
		head = node;
		tail = node;
		head.reference = head;
	}

	public String insertLinkedList(int nodeValue, int location) {
		Node node = new Node(nodeValue, null);
		if (!isCircularLinkedListExist()) {
			return "Insertion: Failed (Error: Linked List not exist.)";
		} else if (location == 0) {
			node.reference = head;
			head = node;
			tail.reference = head;
		} else if (location == circularLinkedListSize()) {
			tail.reference = node;
			tail = node;
			tail.reference = head;
		} else {
			Node pointer = head;
			for (int i = 0; i < location - 1; i++) {
				pointer = pointer.reference;
			}
			node.reference = pointer.reference;
			pointer.reference = node;
		}

		return "Insertion: Success";
	}

	public String remove(int location) {
		Node pointer = head;
		if (isCircularLinkedListExist()) {
			if (location >= circularLinkedListSize() || location < 0) {
				return "Error: Location not exists.";
			}
			if (location == 0) {
				if (circularLinkedListSize() == 1)
					tail = null;
				pointer = pointer.reference;
				head = pointer;
				tail.reference = head;
				return "Node Removed.";
			} else {
				for (int i = 0; i < location - 1; i++) {
					pointer = pointer.reference;
				}
				if (pointer.reference == tail)
					tail = pointer;
				pointer.reference = pointer.reference.reference;
				return "Node Removed.";
			}
		}
		return "Error: Linked List not exist.";
	}

	public String removeLinkedList() {
		if (isCircularLinkedListExist()) {
			head = null;
			tail = null;
			return "LinkedList removed.";
		}
		return null;
	}

	public String removeFirst() {
		return remove(0);
	}

	public String removeLast() {
		return remove(circularLinkedListSize() - 1);
	}

	public String addFirst(int nodeValue) {
		return insertLinkedList(nodeValue, 0);
	}

	public String addLast(int nodeValue) {
		return insertLinkedList(nodeValue, circularLinkedListSize());
	}

	public String add(int nodeValue) {
		return insertLinkedList(nodeValue, circularLinkedListSize());
	}

	public void traversal() {
		Node pointer = head;
		System.out.println(" ----------- Traversal ------------ ");

		while (pointer != null) {
			System.out.println(pointer.data);
			if (pointer == tail)
				break;
			pointer = pointer.reference;
		}

	}

	public String find(int nodeValue) {
		Node pointer = head;
		while (pointer != null) {
			if (pointer.data == nodeValue)
				return "Value is exist.";
			if (pointer == tail)
				return "vlaue doesn't exist.";
			pointer = pointer.reference;
		}
		return "Value doesn\'t exist.";
	}

	public boolean isCircularLinkedListExist() {
		return head != null;
	}

	public int circularLinkedListSize() {
		Node pointer = head;
		int listSize = 0;
		while (pointer.reference != null && pointer != tail) {
			pointer = pointer.reference;
			listSize++;
		}
		return ++listSize;
	}
}
