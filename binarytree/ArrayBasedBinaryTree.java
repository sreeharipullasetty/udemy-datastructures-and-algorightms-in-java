package udemy.binarytree;

public class ArrayBasedBinaryTree {
	public static int[] tree = null;
	public static int start = 0;
	public static int end = 0;
	public static int treeSize;

	public ArrayBasedBinaryTree(int n) {
		tree = new int[n + 1];
		treeSize = n;
		System.out.println("Binary Tree Created.");
	}

	public void insert(int n) {
		if (end == treeSize) {
			System.out.println("Insert: Tree is full.");
		} else {
			tree[++end] = n;
		}
	}

	public void inOrder() {
		if (tree != null) {
			System.out.println("--IN ORDER--");
			inOrderTraversal(1);
			System.out.println("----");
		} else {
			System.out.println("Binary tree does not exist.");
		}
	}

	public void inOrderTraversal(int n) {
		if (n <= treeSize) {
			inOrderTraversal(2 * n);
			System.out.print(tree[n] + " ");
			inOrderTraversal(2 * n + 1);
		}
	}

	public void preOrder() {
		if (tree != null) {
			System.out.println("--PRE ORDER--");
			preOrderTraversal(1);
			System.out.println("----");
		} else {
			System.out.println("Binary tree does not exist.");
		}

	}

	public void preOrderTraversal(int n) {
		if (n <= treeSize) {
			System.out.print(tree[n] + " ");
			preOrderTraversal(2 * n);
			preOrderTraversal(2 * n + 1);
		}
	}

	public void postOrder() {
		if (tree != null) {
			System.out.println("--POST ORDER--");
			postOrderTraversal(1);
			System.out.println("----");
		} else {
			System.out.println("Binary tree does not exist.");
		}

	}

	public void postOrderTraversal(int n) {
		if (n <= treeSize) {
			postOrderTraversal(2 * n);
			postOrderTraversal(2 * n + 1);
			System.out.print(tree[n] + " ");
		}
	}

	public void levelOrder() {
		if (tree != null) {
			System.out.println("--POST ORDER--");
			levelOrderTraversal(1);
			System.out.println("----");
		} else {
			System.out.println("Binary tree does not exist.");
		}

	}

	public void levelOrderTraversal(int n) {
		for (int i = 1; i <= end; i++) {
			System.out.print(tree[i] + " ");
		}
		System.out.println();
	}

	public String find(int n) {
		for (int i = 1; i <= end; i++) {
			if (tree[i] == n) {
				return ("Find: value found.");

			}
		}
		return ("Find: Value not found.");
	}

	public String deleteNode(int n) {
		for (int i = 1; i <= end; i++) {
			if (tree[i] == n) {
				tree[i] = tree[end];
				tree[end] = 0;
				return ("Delete: value deleted.");

			}
		}
		return ("Delete: Value not found.");
	}

	public void deleteBinaryTree() {
		tree = null;
		System.out.println("Tree Deleted");
	}
}
