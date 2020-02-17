package udemy.binarytree;

public class QueueNode {
	public TreeNode node;
	public QueueNode next;
	public QueueNode(TreeNode node, QueueNode next) {
		this.node = node;
		this.next = next;
	}
}
