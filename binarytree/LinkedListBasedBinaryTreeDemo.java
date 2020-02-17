package udemy.binarytree;

public class LinkedListBasedBinaryTreeDemo {
	public static void main(String args[]){
		LinkedListBasedBinaryTree bt = new LinkedListBasedBinaryTree();
		bt.create(5);
		bt.create(6);
		bt.create(7);
		bt.create(8);
		bt.create(9);
		bt.create(10);
		bt.create(11);
		bt.create(12);
		bt.create(13);
		bt.preOrder();
		bt.inOrder();
		bt.postOrder();
		bt.levelOrder();
		System.out.println(bt.find(15));
		System.out.println(bt.find(13));
		System.out.println(bt.deleteNode(2));
		System.out.println(bt.deleteNode(6));
		bt.deleteBinaryTree();
		bt.levelOrder();
	}
}
