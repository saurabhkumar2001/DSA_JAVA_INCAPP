
class CompleteBinaryTree {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	TreeNode root;

	public void addNode(int data) {
		//your Logic
	}
	

	// Traverse Inorder
	public void traverseInOrder(TreeNode node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}
}

public class DSA_Complete_BinaryTree {

	public static void main(String[] args) {
		CompleteBinaryTree tree = new CompleteBinaryTree();

		tree.addNode(5);
		tree.addNode(8);
		tree.addNode(3);
		tree.addNode(4);
		tree.addNode(12);
		tree.addNode(9);

		System.out.print("\nIn order Traversal: ");
		tree.traverseInOrder(tree.root);
	}
}