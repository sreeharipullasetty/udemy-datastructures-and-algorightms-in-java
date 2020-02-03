package udemy.linkedlist;

public class CircularLinkedListDemo {
	public static void main(String args[]) {
		CircularLinkedList objList = new CircularLinkedList();
		objList.CreateCircularLinkedList(1);
		objList.traversal();
		System.out.println(objList.add(2));
		objList.traversal();
		System.out.println(objList.add(3));
		objList.traversal();
		System.out.println(objList.add(4));
		objList.traversal();
		System.out.println(objList.add(5));
		objList.traversal();
		System.out.println(objList.add(6));
		objList.traversal();
		System.out.println(objList.add(7));
		objList.traversal();
		System.out.println(objList.add(8));
		objList.traversal();
		System.out.println(objList.add(9));
		objList.traversal();
		System.out.println(objList.find(7));
		objList.traversal();
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
