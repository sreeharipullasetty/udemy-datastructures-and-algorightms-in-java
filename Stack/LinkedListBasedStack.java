package udemy.stack;

import udemy.linkedlist.Node;

public class LinkedListBasedStack {
	Node head;

	public String createStack() {
		head = null;
		return "Create: stack created";
	}

	public String push(int n) {
		System.out.print("Push: ");
		Node node = new Node(n, null);
		if (head == null) {
			head = node;
		} else {
			node.reference = head;
			head = node;
		}
		return "Item Pushed to Stack";
	}

	public String pop() {
		System.out.print("Pop: ");
		if (isEmpty()) {
			return "Stack is Empty";
		}
		int temp = head.data;
		head = head.reference;
		return "Item: " + temp;
	}

	public String peek() {
		System.out.print("Peek: ");
		if (isEmpty()) { 
			return "Stack is Empty";
		}
		return "Item: " + head.data;
	}

	public String deleteStack() {
		System.out.print("Delete: ");
		head = null;
		return "Stack is Deleted";
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public void stackElements() {
		System.out.println("Elements: ");
		Node pointer = head;
		while(pointer!=null){
			System.out.println(pointer.data);
			pointer = pointer.reference;
		}
	}
}
