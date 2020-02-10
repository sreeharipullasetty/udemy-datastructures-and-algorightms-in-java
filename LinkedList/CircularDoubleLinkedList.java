package udemy.linkedlist;

public class CircularDoubleLinkedList {
	Dnode head, tail;

	public void CreateDoubleLinkedList(int nodeValue) {
		head = null;
		tail = null;
		Dnode node = new Dnode(nodeValue, null, null);
		head = node;
		tail = node;
		head.next = node;
		head.prev = node;
	}

	public String InsertDoubleLinkedList(int nodeValue, int location) {
		Dnode node = new Dnode(nodeValue, null, null);
		if (!isDoubleLinkedListExist()) {
			return "Insertion: Failed (Error: Linked List not exist.)";
		} else if (location == 0) {
			node.next = head;
			node.prev = head;
			head.next = node;
			head.prev = node;
			head = head.prev;
		} else if (location == sizeOfDoubleLinkedList()) {
			node.next = tail.next;
			tail.next = node;
			node.prev = tail;
			head.prev = node;
			tail = tail.next;
		} else {
			Dnode pointer = head;
			for (int i = 0; i < location - 1; i++) {
				pointer = pointer.next;
			}
			node.next = pointer.next;
			node.prev = pointer;
			pointer.next.prev = node;
			pointer.next = node;
		}
		return "Insertion success";
	}

	public String remove(int location) {
		if (!isDoubleLinkedListExist()) {
			return "Insertion: Failed (Error: Linked List not exist.)";
		} else if (location == 0) {
			head = head.next;
			head.prev = tail;
			tail.next = head;
			return "Node Removed.";
		} else if (location == sizeOfDoubleLinkedList()) {
			tail = tail.prev;
			tail.next = head;
			head.prev = tail;
			return "Node Removed.";
		} else if (location >= sizeOfDoubleLinkedList() || location < 0) {
			return "Error: Location not exists.";
		} else {
			Dnode pointer = head;
			for (int i = 0; i < location - 1; i++) {
				pointer = pointer.next;
			}
			pointer.next.next.prev = pointer;
			pointer.next = pointer.next.next;
			return "Node Removed.";
		}
	}

	public String removeDoubleLinkedList() {
		if (isDoubleLinkedListExist()) {
			Dnode pointer = tail.prev;
			while (pointer != null) {
				pointer.next = null;
				if(pointer == head)
					break;
				pointer = pointer.prev;
			}
			
			head = null;
			tail = null;
			return "LinkedList removed.";
		}
		return null;
	}

	public String addFirst(int nodeValue) {
		return InsertDoubleLinkedList(nodeValue, 0);
	}

	public String addLast(int nodeValue) {
		return InsertDoubleLinkedList(nodeValue, sizeOfDoubleLinkedList());
	}

	public String add(int nodeValue) {
		return InsertDoubleLinkedList(nodeValue, sizeOfDoubleLinkedList());
	}

	public String find(int nodeValue) {
		Dnode pointer = head;
		while (pointer != null) {
			if (pointer.data == nodeValue)
				return "Value is exist.";
			if(pointer == tail)
				break;
			pointer = pointer.next;
		}
		return "Value doesn\'t exist.";
	}

	public void traversal() {
		Dnode pointer = head;
		System.out.println(" ----------- Traversal ------------ ");
		while (pointer != null) {
			System.out.println(pointer.data);
			if(pointer == tail)
				break;
			pointer = pointer.next;
		}
	}

	public boolean isDoubleLinkedListExist() {
		return head != null;
	}

	public int sizeOfDoubleLinkedList() {
		Dnode pointer = head;
		int listSize = 0;
		while (pointer != tail) {
			listSize++;
			pointer = pointer.next;
		}
		return ++listSize;
	}
}
