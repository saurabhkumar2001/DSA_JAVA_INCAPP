// singly Linked List: All Operations

class LinkedList {
	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtEnd(int data) {
		// Create a new node
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addNodeAtBegin(int data) {
		// Create a new node
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		// Create a new node
		Node newNode = new Node(data);

		Node currentNode = head;
		Node locationNode = null;
		while (currentNode != null) {
			int value = currentNode.data;
			if (value == locationValue) {
				locationNode = currentNode;
				break;
			}
			currentNode = currentNode.next;
		}
		if (locationNode == null) {
			System.out.println("Location Value does not exist.");
		} else {
			newNode.next = locationNode.next;
			locationNode.next = newNode;
		}
	}

	public void addNodeBeforeSpecificNodeValue(int locationValue, int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		Node locationNode = null;
		if (head.data == locationValue) {
			newNode.next = head;
			head = newNode;

		}
		while (currentNode.next != null) {
			int value = currentNode.next.data;
			if (value == locationValue) {
				locationNode = currentNode;
				break;
			}
			currentNode = currentNode.next;
		}
		if (locationNode == null) {
			System.out.println("location doesnot exist");
		} else {
			newNode.next = locationNode.next;
			locationNode.next = newNode;
		}
	}

	public void deleteNodeFromBeginning() {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
	}

	public void deleteNodeFromEnd() {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head == tail) {
			head = tail = null;
		} else {
			Node currentNode = head;
			while (currentNode.next != tail) {
				currentNode = currentNode.next;
			}
			tail = currentNode;
			currentNode.next = null;
		}
	}

	public void deleteSpecificNode(int locationValue) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head.data == locationValue) {
			head = head.next;
		} else {
			Node currentNode = head;

			Node locationNode = null;
			Node previousNode = null;
			while (currentNode != null) {
				if (currentNode.data == locationValue) {
					locationNode = currentNode;
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			if (locationNode == null) {
				System.out.println("Location Value does not exist.");
			} else {
				previousNode.next = locationNode.next;
				if (locationNode == tail) {
					tail = previousNode;
				}
			}
		}
	}

	
	public void deleteAllSpecificNode(int locationValue) {
		if (head == null) {
			System.out.println("Nothing to delete.");
		}
		 else {
			Node currentNode = head;
			Node previousNode = null;
			while(currentNode!=null){
				if(currentNode.data == locationValue){
					if(currentNode == head){
						head = head.next;
						if(head == null){
							tail = null;
						}
					}
					else{
						previousNode.next = currentNode.next;
						if(currentNode == tail){
							tail = previousNode;
						}
					}
				}
				else{
					previousNode = currentNode;
				}
				currentNode = currentNode.next;
			}
			if(head == null){
				System.out.println("nothing to delete");
			}

			}
		}

	public void printList() {
		// currentNode will point to head
		Node currentNode = head;

		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.println("Nodes of singly linked list: ");
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
}

public class linklistoperations {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(4);
		list.addNodeAtBegin(23);
		list.addNodeAtBegin(13);
		list.addNodeAtBegin(56);
		list.addNodeAfterSpecificNodeValue(9, 3);
		list.printList();
		list.deleteNodeFromEnd();
		list.deleteNodeFromBeginning();
		list.deleteSpecificNode(6);
		list.deleteSpecificNode(13);
		list.deleteSpecificNode(23);
		list.printList();
	}

}