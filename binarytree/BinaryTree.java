package udemy.binarytree;

public class BinaryTree {
	public static TreeNode root;
	public static QueueNode start = null;
	public static QueueNode end = null;

	public BinaryTree() {
		root = null;
		System.out.println("Binary Tree Created.");
	}

	public void create(int data) {
		TreeNode tNode = new TreeNode(data, null, null);
		if (root == null) {
			root = tNode;
			enQueue(tNode);
		} else {
			TreeNode pointer = start.node;
			if (pointer.left == null) {
				pointer.left = tNode;
				enQueue(tNode);
			} else {
				pointer.right = tNode;
				enQueue(tNode);
				deQueue();
			}
		}
	}

	public void preOrder() {
		System.out.println("--PRE ORDER--");
		preOrderTraversal(root);
		System.out.println("----");
	}

	public void preOrderTraversal(TreeNode pointer) {
		if (pointer != null) {
			System.out.print(pointer.data + " ");
			preOrderTraversal(pointer.left);
			preOrderTraversal(pointer.right);
		}
	}

	public void inOrder() {
		System.out.println("--IN ORDER--");
		inOrderTraversal(root);
		System.out.println("\n----");
	}

	public void inOrderTraversal(TreeNode pointer) {
		if (pointer != null) {
			inOrderTraversal(pointer.left);
			System.out.print(pointer.data + " ");
			inOrderTraversal(pointer.right);
		}
	}

	public void postOrder() {
		System.out.println("--POST ORDER--");
		postOrderTraversal(root);
		System.out.println("\n----");
	}

	public void postOrderTraversal(TreeNode pointer) {
		if (pointer != null) {
			postOrderTraversal(pointer.left);
			postOrderTraversal(pointer.right);
			System.out.print(pointer.data + " ");
		}
	}

	public void levelOrder() {
		System.out.println("--LEVEL ORDER--");
		start = new QueueNode(root, null);
		levelOrderTraversal(start);
		System.out.println("\n----");
	}

	public void levelOrderTraversal(QueueNode start) {
		end = start;
		while (start != null) {
			enQueue(start.node.left);
			enQueue(start.node.right);
			System.out.print(start.node.data + " ");
			start = start.next;
		}
	}

	public String find(int data) {
		start = new QueueNode(root, null);
		end = start;
		while (start != null) {
			enQueue(start.node.left);
			enQueue(start.node.right);
			if (start.node.data == data) {
				return "Value Found";
			}
			start = start.next;
		}
		return "Value not found";
	}

	public String deleteNode(int data) {
		QueueNode tempEnd = end;
		if (find(data).equals("Value not found")) {
			return "Value not found";
		} else {
			start.node.data = tempEnd.node.data;
			tempEnd.node = null;
			return "deleted";
		}
	}

	public void enQueue(TreeNode tNode) {
		QueueNode qNode = new QueueNode(tNode, null);
		if (start == null) {
			start = qNode;
			end = qNode;
		} else {
			if (qNode.node != null) {
				end.next = qNode;
				end = end.next;
			}

		}
	}

	public void deQueue() {
		start = start.next;

	}
}
