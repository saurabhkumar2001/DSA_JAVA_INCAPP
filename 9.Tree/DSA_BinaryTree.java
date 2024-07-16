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

class BinaryTree {

	TreeNode root;

	BinaryTree() {
		root = null;
	}


	// Traverse Inorder
	public void traverseInOrder(TreeNode node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}

	// Traverse Postorder
	public void traversePostOrder(TreeNode node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.data);
		}
	}

	// Traverse Preorder
	public void traversePreOrder(TreeNode node) {
		if (node != null) {
			System.out.print(" " + node.data);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
	
	//Find Height of Binary Tree
	public int height(TreeNode node) {
		if (node ==null ) {
			return 0;
		}else {
			int leftHeight=height(node.left);// return the height of left subtree
			int rightHeight=height(node.right);// return the height of right subtree
			int height= Math.max(leftHeight, rightHeight)+1;// compare the height of left and right subtree
			return height;
		}
	}
}

public class DSA_BinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root=new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);

		System.out.print("Pre order Traversal: ");
		tree.traversePreOrder(tree.root);
		System.out.print("\nIn order Traversal: ");
		tree.traverseInOrder(tree.root);
		System.out.print("\nPost order Traversal: ");
		tree.traversePostOrder(tree.root);
		
		System.out.print("\nHeight: "+tree.height(tree.root));
	}
}