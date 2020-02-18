package udemy.binarysearchtree;

public class BinarySearchTreeDemo {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.createBST(12);
		bst.insertIntoBST(5);
		bst.insertIntoBST(3);
		bst.insertIntoBST(4);
		bst.preOrder();
		bst.inOrder();
		bst.postOrder();
		bst.levelOrder();
		bst.insertIntoBST(2);
		bst.insertIntoBST(18);
		bst.insertIntoBST(16);
		bst.insertIntoBST(15);
		bst.insertIntoBST(14);
		bst.insertIntoBST(13);
		bst.levelOrder();
		System.out.println(bst.find(21));
		System.out.println(bst.find(12));
		bst.deleteNode(12);
		bst.preOrder();
		bst.deleteBinarySearchTree();
		bst.postOrder();
	}
}
