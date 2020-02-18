package udemy.binarysearchtree;

public class BinarySearchTree {
	TreeNode root, left, right = null;
	public static QueueNode start = null;
	public static QueueNode end = null;

	public void createBST(int data) {
		TreeNode node = new TreeNode(data, left, right);
		root = node;
		System.out.println("Binary Search Tree Created.");
	}

	public void insertIntoBST(int data) {
		if (root == null) {
			System.out.println("Binary Search Tree Not Created.");
		} else {
			insert(root, data);
			System.out.println("Insert: Data inserted.");
		}
	}

	public TreeNode insert(TreeNode pointer, int data) {
		TreeNode node = new TreeNode(data, left, right);
		if (pointer == null) {
			pointer = node;
		} else if (pointer.data > data) {
			pointer.left = insert(pointer.left, data);
		} else {
			pointer.right = insert(pointer.right, data);
		}
		return pointer;
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
				return "Find: Value Found";
			}
			start = start.next;
		}
		return "Find: Value not found";
	}

	public void deleteNode(int n) {
		if (find(n).equals("Find: Value not found")) {
			System.out.println("Delete: Value not found");
		} else {
			delete(root, n);
			System.out.println("Delete: Node deleted");
		}
	}

	public TreeNode delete(TreeNode root, int data) {
		if (root == null)
			return null;
		if (root.data > data)
			root.left = delete(root.left, data);
		else if (root.data < data)
			root.right = delete(root.right, data);
		else {
			if (root.left == null && root.right == null)
				root = null;
			else if (root.left == null)
				root = root.right;
			else if (root.right == null)
				root = root.left;
			else {
				if(root.right.left == null){
					root.data = root.right.data;
					root.right = root.right.right;
				} else{
					TreeNode temp = getMinimum(root.right);
					root.data = temp.data;
					delete(root.right, temp.data);
				}
					
			}
		}
		return root;

	}

	public TreeNode getMinimum(TreeNode root){
		if(root.left == null){
			TreeNode temp = root;
			root = null;
			return temp;
		} else{
			return getMinimum(root.left);
		}
	}
	
	public void deleteBinarySearchTree() {
		root = null;
		System.out.println("Binary Search Tree Deleted.");
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
