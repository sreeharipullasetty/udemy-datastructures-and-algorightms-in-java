package udemy.linkedlist;

public class LinkedList {
	Node head, tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void createLinkedList(int nodeValue) {
		head = null;
		tail = null;
		Node node = new Node(nodeValue, null);
		head = node;
		tail = node;
	}

	public String insertLinkedList(int nodeValue, int location) {
		Node node = new Node(nodeValue, null);
		if (!isLinkedListExist()) {
			return "Insertion: Failed (Error: Linked List not exist.)";
		} else if (location == 0) {
			node.reference = head;
			head = node;
		} else if (location == linkedListSize()) {
			tail.reference = node;
			tail = node;
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

	public String addFirst(int nodeValue) {
		return insertLinkedList(nodeValue, 0);
	}

	public String addLast(int nodeValue) {
		return insertLinkedList(nodeValue, linkedListSize());
	}

	public String add(int nodeValue) {
		return insertLinkedList(nodeValue, linkedListSize());
	}

	public void traversal() {
		Node pointer = head;
		System.out.println(" ----------- Traversal ------------ ");
		while (pointer != null) {
			System.out.println(pointer.data);
			pointer = pointer.reference;
		}
	}

	public String remove(int location) {
		Node pointer = head;
		if (isLinkedListExist()) {
			if (location >= linkedListSize() || location < 0) {
				return "Error: Location not exists.";
			}
			if (location == 0) {
				if (linkedListSize() == 1)
					tail = null;
				head = head.reference;
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
	
	public String removeLinkedList(){
		if(isLinkedListExist()){
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
		return remove(linkedListSize() - 1);
	}

	public String find(int nodeValue) {
		Node pointer = head;
		while (pointer != null) {
			if (pointer.data == nodeValue)
				return "Value is exist.";
			pointer = pointer.reference;
		}
		return "Value doesn\'t exist.";
	}

	public boolean isLinkedListExist() {
		return head != null;
	}

	public int linkedListSize() {
		Node pointer = head;
		int listSize = 0;
		while (pointer.reference != null) {
			pointer = pointer.reference;
			listSize++;
		}
		return ++listSize;
	}
}
