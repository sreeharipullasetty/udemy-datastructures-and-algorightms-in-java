package udemy.linkedlist;

public class Dnode {
	int data;
	Dnode prev;
	Dnode next;

	public Dnode(int data, Dnode prev, Dnode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}
