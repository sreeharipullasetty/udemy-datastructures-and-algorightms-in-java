package udemy.linkedlist;

public class CircularDoubleLinkedListDemo {
	public static void main(String args[]) {
		CircularDoubleLinkedList obj = new CircularDoubleLinkedList();
		obj.CreateDoubleLinkedList(5);
		obj.traversal();
		System.out.println(obj.InsertDoubleLinkedList(6, 0));
		obj.traversal();
		System.out.println(obj.InsertDoubleLinkedList(7, 2));
		obj.traversal();
		System.out.println(obj.InsertDoubleLinkedList(8, 1));
		obj.traversal();
		System.out.println(obj.InsertDoubleLinkedList(9, 2));
		obj.traversal();
		System.out.println(obj.find(3));
		obj.traversal();
		System.out.println(obj.find(5));
		obj.traversal();
		System.out.println(obj.remove(2));
		obj.traversal();
		System.out.println(obj.remove(0));
		obj.traversal();
		System.out.println(obj.remove(4));
		obj.traversal();
		System.out.println(obj.remove(3));
		obj.traversal();
		System.out.println(obj.removeDoubleLinkedList());
		obj.traversal();
	}
}
