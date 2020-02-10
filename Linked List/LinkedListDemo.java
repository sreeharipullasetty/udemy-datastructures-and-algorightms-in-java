package udemy.linkedlist;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList objList = new LinkedList();
		objList.createLinkedList(1);
		System.out.println(objList.add(2));
		System.out.println(objList.add(3));
		System.out.println(objList.add(4));
		System.out.println(objList.add(5));
		System.out.println(objList.add(6));
		System.out.println(objList.add(7));
		System.out.println(objList.add(8));
		System.out.println(objList.add(9));
		objList.traversal();
		System.out.println(objList.find(7));
		System.out.println(objList.find(17));
		objList.traversal();
		System.out.println(objList.removeFirst());
		objList.traversal();
		System.out.println(objList.removeLast());
		objList.traversal();
		System.out.println(objList.remove(3));
		objList.traversal();
		objList.removeLinkedList();
		objList.traversal();
	}
}
