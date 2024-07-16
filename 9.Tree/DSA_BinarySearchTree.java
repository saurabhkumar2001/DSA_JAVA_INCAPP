class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null;
	}

	void insertNode(int data) {
		Node newNode = new Node(data);
		// If the tree is empty return a new node
		if (root == null) {
			root = newNode;
		} else {
			insertRecursion(root, newNode);
		}
	}

	void insertRecursion(Node currentNode, Node newNode) {
		if (newNode.data < currentNode.data) {
			if (currentNode.left == null) {
				currentNode.left = newNode;
			} else {
				insertRecursion(currentNode.left, newNode);
			}
		} else {
			if (currentNode.right == null) {
				currentNode.right = newNode;
			} else {
				insertRecursion(currentNode.right, newNode);
			}
		}
	}

	void searchNode(int data) {
		if (root == null) {
			System.out.println("Tree is Empty");
		} else {
			searchrecursion(root, data);
		}
	}

	void searchrecursion(Node currentNode, int data) {
		if (data == currentNode.data) {
			System.out.println("Data Exist!");
		} else if (data < currentNode.data) {
			if (currentNode.left == null) {
				System.out.println("Data does not Exist!");
			} else {
				searchrecursion(currentNode.left, data);
			}
		} else {
			if (currentNode.right == null) {
				System.out.println("Data does not Exist!");
			} else {
				searchrecursion(currentNode.right, data);
			}
		}
	}
	
	void searchNodeAndLevel(int data) {
		//Your Logic
	}

	// Traverse Inorder
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}

	// Traverse Postorder
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.data);
		}
	}

	// Traverse Preorder
	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.data);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
}

public class DSA_BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insertNode(10);
		tree.insertNode(6);
		tree.insertNode(3);
		tree.insertNode(7);
		tree.insertNode(5);
		tree.insertNode(12);

		tree.searchNode(12);
		tree.searchNodeAndLevel(12);

		System.out.print("Pre order Traversal: ");
		tree.traversePreOrder(tree.root);
		System.out.print("\nIn order Traversal: ");
		tree.traverseInOrder(tree.root);
		System.out.print("\nPost order Traversal: ");
		tree.traversePostOrder(tree.root);

	}
}