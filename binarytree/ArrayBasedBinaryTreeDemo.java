package udemy.binarytree;

public class ArrayBasedBinaryTreeDemo {
	public static void main(String args[]){
		ArrayBasedBinaryTree bt = new ArrayBasedBinaryTree(9);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.insert(10);
		bt.insert(11);
		bt.insert(12);
		bt.insert(13);
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
